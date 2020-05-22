pipeline {
    agent {
        label 'master'
    }
    tools {
        maven 'maven'
        jdk 'java'
    }
    stages {

        stage(CleanCheckout) {
            steps {
                cleanWs();
                sh 'echo test'
                git 'https://github.com/TrishaChetani/AndroidMobileAutomationCI.git'
            }
        }
        stage(RunTest) {
            steps {
                sh "mvn test -P local"
            }
        }
    }
    post {
        always {
            sh 'echo Success'
        }
        failure {
            sh 'echo Failure'
        }
    }
}