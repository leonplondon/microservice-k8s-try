pipeline {

  stage {
    node {
        dir('bar') {
          sh build: "./gradlew :clean :build"
        }

        dir('bar') {
          sh build: "./gradlew :clean :build"
        }
      }
  }
}