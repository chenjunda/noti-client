pipeline {
  agent {
    label 'aep-builder'
  }
  stages {
    stage('clean') {
      steps {
        sh 'mvn clean'
      }
    }
    stage('deploy snapshot') {
      when {
        branch 'develop'
      }
      steps {
        sh 'mvn -Dmaven.test.skip=true deploy'
      }
    }
    stage('deploy release') {
      when {
        branch 'master'
      }
      steps {
        sh 'mvn -Dmaven.test.skip=true deploy -P release'
      }
    }
  }
  tools {
    maven 'maven-3.5.0'
  }
}