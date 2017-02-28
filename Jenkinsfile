#!groovy
pipeline {
  agent { docker 'maven' }
  stages {
    stage('Build') {
      withSonarQubeEnv {
        sh "mvn -B clean package sonar:sonar"
        junit 'target/surefire-reports/*.xml'
      }
    }    
  }
  post {
    success {
      slackSend color: 'good', message: "Build success: ${env.JOB_NAME}!"
    }
    fail {
      slackSend color: 'danger', message: "Build failed: ${env.JOB_NAME}!"
    }
  }
}
