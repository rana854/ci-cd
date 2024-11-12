# CI/CD Pipeline for Django Application with Docker and Minikube

This project demonstrates a Continuous Integration and Continuous Deployment (CI/CD) pipeline for deploying a Django application using Jenkins, Docker, and Minikube. The pipeline includes building a Docker image, pushing it to Docker Hub, and deploying it to a Minikube Kubernetes cluster.

## Prerequisites

Before setting up this pipeline, ensure that you have the following tools installed and configured:

- **Jenkins**: Ensure Jenkins is installed and running.
- **Docker**: Docker should be installed to build and push images.
- **Minikube**: Set up a local Kubernetes cluster with Minikube.
- **Kubernetes (kubectl)**: Ensure `kubectl` is installed to interact with your Kubernetes cluster.
- **Docker Hub Account**: A Docker Hub account is required to push and pull Docker images.
- **GitHub Repository**: This pipeline pulls code from a GitHub repository.

## Setup
### Clone this repository to your local machine:

```
git clone https://github.com/rana854/ci-cd.git
```

### Jenkins Setup

1. **Create a new Jenkins pipeline job in your Jenkins instance.**
2. **Set Up Credentials in Jenkins:**
In Jenkins, go to Manage Jenkins > Manage Credentials > (global) > Add Credentials.
Add Docker Hub credentials with the ID docker_1_Hub (username and password or access token).
3. **Configure Docker on Jenkins:**
Ensure Docker is installed on the Jenkins agent.
Verify Docker is accessible on the agent using the docker --version command.
4. **Configure Kubernetes (Minikube):**
Ensure kubectl is installed and Minikube is running.
Set the path to your Minikube kubeconfig in the bat commands (C:\\Users\\\\.kube\\config).

