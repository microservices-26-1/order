pipeline {

    agent any

    stages {
        stage('Dependecies') {
            steps {
                build job: 'product', wait: true
            }
            steps {
                build job: 'exchange', wait: true
            }
        }
        stage('Build') {
            steps {
                sh 'mvn -B -DskipTests clean install'
            }
        }
    }

}