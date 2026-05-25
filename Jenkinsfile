pipeline {

    agent any

    stages {
        stage('Dependencies') {
            steps {
                build job: 'product', wait: true
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