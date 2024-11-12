pipeline {
    agent any
    
    environment {
        DOCKER_1USERNAME = 'ranatarek'
        IMAGE_NAME = 'pipline_docker_image200'
        KUBERNETES_DEPLOYMENT_FILE = 'Django_project/myproject/deployment.yaml'
    }

    stages {
        stage('Clone Repository') {
            steps {
                git branch: 'main', url: 'https://github.com/rana854/ci-cd.git'
            }
        }

        stage('Build Docker Image') {
            steps {
                script {
                    def imageTag = "${DOCKER_1USERNAME}/${IMAGE_NAME}:latest"
                    bat "docker build -t ${imageTag}  ./Django_project "
                   
                }
            }
        }

        stage('Login to Docker Hub') {
            steps {
                    script {
                     
                    withCredentials([usernamePassword(credentialsId: 'docker_1_Hub', 
                    usernameVariable: 'DOCKER_USERNAME', passwordVariable: 'DOCKER_PASSWORD')]) {
                        bat "docker login -u %DOCKER_USERNAME% -p %DOCKER_PASSWORD%"
                    }
            }
        }
        }
        stage('Push Docker Image to Docker Hub') {
            steps {
                script {
                    def imageTag = "${DOCKER_1USERNAME}/${IMAGE_NAME}:latest"
                    bat "docker push ${imageTag}"
                }
            }
        }
        stage('Deploy to Minikube') {
            steps {
                script {
                    bat "kubectl --kubeconfig=\"C:\\Users\\AL-fares\\.kube\\config\" apply -f \"Django_project/deployment.yaml\""
                    bat "kubectl --kubeconfig=\"C:\\Users\\AL-fares\\.kube\\config\" apply -f \"Django_project/service.yaml\""
                }
            }
    }
       
    }
}