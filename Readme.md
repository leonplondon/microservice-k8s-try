## Tools used

- Jib: build docker images without a `Dockerfile`
- Gradle
- Minikube: nice tool to start a testing-ready k8s cluster

## Useful commands

### Run application locally

```shell
DB_PORT=5432 DB_HOST=localhost ./gradlew :bootRun
```

### Build docker container to docker daemon

```java
./gradlew :jibDockerBuild
```

## Author
Darío Peña Londoño

## References
[Configuring Spring Boot on Kubernetes with Secrets](https://developers.redhat.com/blog/2017/10/04/configuring-spring-boot-kubernetes-secrets/)