node{
  stage ('Clean') {

    git credentialsId: 'Github', url: 'https://github.com/ashwinizanzad31/demo.git'

    withMaven(
        maven: 'maven-3') {
      sh "mvn clean"

    } 
  }
  stage('Build'){
      withMaven(
        maven: 'maven-3') {
      sh "mvn test"

    } 
  }
  
   stage('Test'){
 echo('Testing Code') 
 }
  
   stage('Deploy'){
      echo('Deploying Code') 
  }
}
