pipeline {
    agent any
    tools { 
        maven 'maven' 
        jdk 'jdk8' 
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
        bat 'cd ../shop-assistant-mvn-repo && git init'
        bat 'cd ../shop-assistant-mvn-repo && git remote add origin git@git.e-science.pl:wwojcik235621/81e_WWojcik_Maven.git'
        bat 'cd ../shop-assistant-mvn-repo && git fetch -p'
        bat 'cd ../shop-assistant-mvn-repo && git checkout jenkins'
		bat 'cd ../shop-assistant-mvn-repo && git add -A'
		bat 'cd ../shop-assistant-mvn-repo && git commit -m "jenkins realise"'
		bat 'echo "git push origin jenkins"'
		bat 'cd ../shop-assistant-mvn-repo && git push origin jenkins'
            }
        }
    }
}