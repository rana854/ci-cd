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

### Clone the Repository

Clone this repository to your local machine:

```
git clone https://github.com/rana854/ci-cd.git
```
