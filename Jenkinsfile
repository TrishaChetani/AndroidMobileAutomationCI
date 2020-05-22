pipeline {
    agent {
        label 'master'
    }
    tools {
        maven 'maven'
        jdk 'java'
    }
    stages {

        stage(CleanAll) {
            steps {
                cleanWs();
                sh 'echo test'
                git 'https://github.com/TrishaChetani/AndroidMobileAutomationCI.git'
            }
        }
        stage(MavenBuild) {
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