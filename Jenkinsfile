pipeline {
    agent any
    tools{
    maven 'maven3.6'
    jdk 'jdk11'
    }
    stages {
        stage('Compilar') {
            steps {
                	bat 'mvn clean compile'
                }
            }
        
        stage('Testing') {
            steps {
                	bat 'mvn test'
            }
          }
        
        stage('Deployar') {
            steps {
                	bat 'mvn deploy'
            }
        }
    }
  }
