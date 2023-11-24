def call () {

     pipeline {
        agent {
            label 'workstation'
        }

        stages {

            stage('Compile/Build') {
                steps {
                    ehco 'compile'
                }
            }

            stage('Unit Tests') {
                steps {
                    ehco 'Unit Tests'
                }
            }

            stage('Quality Control') {
                steps {
                    ehco 'Quality Control'
                }
            }

            stage('Upload code to centralized place') {
                steps {
                    ehco 'Upload'
                }
            }
        }
    }
}