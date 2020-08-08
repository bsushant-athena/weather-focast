pipeline {
    agent {
        docker {
            image 'maven:3-alpine'
        }
    }
    stages {
        stage('Build') {
            steps {
                sh 'mvn -B -DskipTests clean install'
            }
        }
        stage('Test') {
            steps {
                sh 'mvn test'
            }
            post {
                always {
                    junit 'target/surefire-reports/*.xml'
                }
            }
        }
        stage('Deliver') {
            steps {
                sh './jenkins/scripts/deliver.sh'
            }
        }
        //this stage is not working
        // stage('Docker: Build Image') {
        //     steps {
        //         dir('docker') {
        //              withDockerRegistry([ credentialsId: "docker-hub-credentials", url: "https://sam91265.hub.docker.com/" ]) {
        //                 sh 'chmod +x build.sh'
        //                 sh './build.sh' 
        //                 sh 'docker tag weatherapp-local sam91265/test:weatherapp-local'
        //                 sh 'docker push sam91265/test:weatherapp-local'
        //             }
        //         }
        //     }
        // }
    }
}