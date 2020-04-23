pipeline {

  agent any

  stages {

    stage("Build projects") {
      stages {
        stage("Build bar") {
          steps {
            dir("bar") {
              sh "./gradlew :clean :build"
            }
          }
        }
        stage("Build foo") {
          steps {
            dir("for") {
              sh "./gradlew :clean :build"
            }
          }
        }
      }
    }
  }
}