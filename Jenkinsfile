pipeline {
    agent any
    tools { 
        maven 'mvn' 
        jdk 'jdk' 
    }	

    stages {
        stage('Build') {
            steps {
		bat 'echo "Cleaning ..."'
		bat 'mvn -B -DskipTests clean package'
            }
        }
        stage('Deploy') {
            steps {
		bat 'mvn deploy'
        bat 'echo "Deploying ..."'
            }
        }
	stage('Update') {
            steps {
		bat 'cd 'c:\Users\wojtasiq\.jenkins\workspace\shop-assistant-mvn-repo\' && git add .'
		bat 'cd 'c:\Users\wojtasiq\.jenkins\workspace\shop-assistant-mvn-repo\' && git commit -m "realise 1.0"'
		bat 'echo "git push origin jenkins"'
		bat 'cd 'c:\Users\wojtasiq\.jenkins\workspace\shop-assistant-mvn-repo\' && git push origin jenkins'
            }
        }
    }
}
