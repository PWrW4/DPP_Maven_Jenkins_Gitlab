pipeline {
    agent any
    tools { 
        maven 'mvn' 
        jdk 'jdk' 
    }	

    stages {
        stage('Build') {
            steps {
		sh 'echo "Cleaning ..."'
		sh 'mvn -B -DskipTests clean package'
            }
        }
        stage('Deploy') {
            steps {
		sh 'mvn deploy'
                sh 'echo "Deploying ..."'
            }
        }
	stage('Update') {
            steps {
		sh 'cd \'c:\Users\wojtasiq\.jenkins\workspace\shop-assistant-mvn-repo\' && git add .'
		sh 'cd \'c:\Users\wojtasiq\.jenkins\workspace\shop-assistant-mvn-repo\' && git commit -m "realise 1.0"'
		sh 'echo "git push origin jenkins"'
		sh 'cd \'c:\Users\wojtasiq\.jenkins\workspace\shop-assistant-mvn-repo\' && git push origin jenkins'
            }
        }
    }
}
