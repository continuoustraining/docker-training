<a href="http://continuous.lu">
  <img src="https://app.continuousphp.com/assets/logos/continuousphp.svg" alt="ContinuousPHP" width="250px" align="right"/>
</a>

<p align="left">
    Continuous S.A. We promote Agile and DevOps best practices to accelerate your digital transformation
</p>

# Docker Training Center - Module 4

The four module of the docker training series will deep dive on the usage of docker stack and swarm cluster using `docker-machine`

## Exercises

1. Create the docker stack using `docker-stack.yml`
2. List the services running
3. Access to the visualizer app using the docker-machine ip on the port 8080
4. Connect on the second docker-machine to confirm `myapp_php` container are present
5. Leave the swarm cluster (container will switch on master by themself)

### BONNUS

1. Start by using only 1 vm. (the swarm manager)
2. Create the docker stack
3. Create second vm and make it join the swarm cluster as worker
4. Update your stack in order to load balancer app to the worker vm
