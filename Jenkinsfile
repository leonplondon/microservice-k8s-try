pipeline {

  agent any

  parameters {
    string name: 'image_name', defaultValue: 'ms-bar', description: 'Name of image to push to registry'
    string name: 'image_tag', defaultValue: "${env.BRANCH_NAME}", description: 'Tag revision'
  }

  stages {
    stage('Build project') {
      agent {
        docker 'openjdk:8'
      }
      stages {
        stage('Build bar') {
          steps {
            dir('bar') {
              sh './gradlew --no-daemon clean build'
            }
          }
        }
        stage('Build JAR') {
          steps {
            dir('bar') {
              sh './gradlew --no-daemon jar'
            }
          }
        }
      }
      post {
        always {
          archiveArtifacts allowEmptyArchive: true,
                           artifacts: 'bar/build/libs/**/*.jar,bar/build/reports/**/*.*',
                           fingerprint: true
          junit allowEmptyResults: true,
                healthScaleFactor: 0.5,
                testResults: 'bar/build/test-results/**/*.xml'
        }
      }
    }
    stage('Build docker image and push to registry') {
      agent any
      steps {
        dir('bar') {
          sh "echo 'Vamos a crear imagen de docker'"
          sh "./gradlew --no-daemon jibDockerBuild --image=${params.image_name}:${params.image_tag}"
          sh "echo 'Image successfully tagged, now we can push it to registry'"
        }
      }
    }
  }
}