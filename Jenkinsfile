pipeline {

  stages {

    stage("build") {
      steps {
        dir('bar') {
          sh "./gradlew :clean :build"
        }
      }
    }

  }

}