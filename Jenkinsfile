pipeline {
    agent any

    stages {

        stage('Checkout') {
            steps {
                echo 'Code has been checked out by Jenkins.'
            }
        }

        stage('Build') {
            steps {
                echo 'Compiling Java code...'

                bat 'if not exist build mkdir build'
                bat 'javac -d build src\\Calculator.java src\\CalculatorTest.java'
            }
        }

        stage('Test') {
            steps {
                echo 'Running tests...'

                bat 'java -cp build CalculatorTest'
            }
        }

        stage('Deploy') {
            steps {
                echo 'Deploying application...'
            }
        }
    }
}
