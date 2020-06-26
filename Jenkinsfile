pipeline {
    agent any
    
    tools{
	maven 'maven3.6'
	jdk 'jdk11'
	
	} 

    stages {
        stage ('Compile Stage') {

            steps {
                    bat 'mvn compile'
                }
            }
        

        stage ('Testing Stage') {

            steps {
                    bat 'mvn test'
                }
            }
        


        stage ('Deployment Stage') {
            steps {
                    bat 'mvn deploy'
                }
            
        }
    }
}