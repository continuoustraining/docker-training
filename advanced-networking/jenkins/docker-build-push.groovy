pipeline {
  environment {
    registry = "rschumacher13/demo"
    registryCredential = "dockerhub"
    DB_PASSWORD = credentials('psql_password')
  }
  agent any
  stages {
    stage('Cloning Git') {
        steps {
            script {
                git 'https://github.com/continuoustraining/dockerized-app.git'            }
        }
    }
    stage('Building image') {
      steps{
        script {
          app = docker.build registry + ":$BUILD_NUMBER"
        }
      }
    }
    stage('Pushing image') {
        steps{
            script {
              docker.withRegistry( '', registryCredential ) {
                app.push()
              }
            }
        }
    }
    stage('Remove Unused docker image') {
      steps{
        sh "docker rmi $registry:$BUILD_NUMBER"
      }
    }
  }
}

