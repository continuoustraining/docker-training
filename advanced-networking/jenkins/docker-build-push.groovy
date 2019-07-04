pipeline {
  environment {
    registry = "rschumacher13/demo"
    registryCredential = 'dockerhub'
    DB_PASSWORD = credentials('psql_password')
  }
  agent any
  stages {
    stage('Cloning Git') {
      steps {
        git 'https://github.com/continuoustraining/dockerized-app.git'
      }
    }
    stage('Building image') {
      steps{
        script {
          docker.build registry + ":$BUILD_NUMBER"
        }
      }
    }
  }
}

