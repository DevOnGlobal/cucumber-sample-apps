#!groovy
pipeline {
  agent { docker 'maven' }
  stages {
    stage('Build') {
      withSonarQubeEnv('default') {
        sh "mvn -B clean package sonar:sonar"
        junit 'target/surefire-reports/*.xml'
      }
    }    
  }
  post {
    success {
      slackSend color: 'good', message: "Build success: ${env.JOB_NAME}!"
    }
    failure {
      slackSend color: 'danger', message: "Build failed: ${env.JOB_NAME}!"
    }
  }
}
