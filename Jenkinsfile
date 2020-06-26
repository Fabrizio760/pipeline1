pipeline {
    agent any
    tools{
    maven 'maven3.6'
    jdk 'jdk11'
    }
    stages {
        stage('Compilar') {
            steps {
                	sh 'mvn clean compile'
                }
            }
        
        stage('Testing') {
            steps {
                	sh 'mvn test'
            }
          }
        
        stage('Deployar') {
            steps {
                	sh 'mvn deploy'
            }
        }
    }
  }
