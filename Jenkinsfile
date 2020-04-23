pipeline {

  stages {

    stage("build") {
      steps {
        dir('bar') {
          sh build: "./gradlew :clean :build"
        }
      }
    }

  }

}