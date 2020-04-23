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
            dir("foo") {
              sh "./gradlew :clean :build"
            }
          }
        }

      }
    }
  }
}