pipeline {
    agent any
    tools { 
        maven 'mvn' 
        jdk 'jdk' 
    }	
    
    stages {
        stage('Build') {
            steps {
                bat 'mvn --version'
            }
        }
    }
}