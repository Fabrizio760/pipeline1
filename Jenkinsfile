pipeline {
    agent any
    stages {
        stage('Compilar') {
            steps {
                withMaven(maven : 'maven3.6'){
                	sh 'mvn clean compile'
                }
            }
        }
        stage('Testing') {
            steps {
                withMaven(maven : 'maven3.6'){
                	sh 'mvn test'
            }
        }
        stage('Deployar') {
            steps {
                withMaven(maven : 'maven3.6'){
                	sh 'mvn deploy'
            }
        }
    }
}