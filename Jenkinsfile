pipeline {

    agent any

    stages {
        stage('Build') {
            steps {
                build job: 'product', wait: true
            }
            steps {
                sh 'mvn -B -DskipTests clean install'
            }
        }
    }

}