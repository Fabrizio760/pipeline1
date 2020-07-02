pipeline {
    agent any
    
    tools{
	maven 'maven3.6'
	jdk 'jdk11'
	
	} 

    stages {
        stage ('Compile Stage') {

            steps {
            		echo 'Compilando el proyecto'
                    bat 'mvn clean compile'
                }
            }
        

        stage ('Testing Stage') {

            steps {
            		echo 'Ejecutando los tests'
                    bat 'mvn clean test'
                }
            }
        


        stage ('Deployment Stage') {
            steps {
            		echo 'Deployando proyecto'
                    bat 'mvn clean deploy'
                }
            
        }
    }
}