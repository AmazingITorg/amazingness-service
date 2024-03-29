# Amazingness Service
![example workflow](https://github.com/AmazingITorg/amazingness-service/actions/workflows/build_and_test.yml/badge.svg)

A service that checks if a person is amazing.
It uses a very fancy and complicated algorithm that 
uses the name of 
a person to perform an amazingness check.


<div>
<img src="https://github.com/plantuml-stdlib/gilbarbara-plantuml-sprites/blob/master/pngs/quarkus-icon.png" title="NodeJS" alt="NodeJS"/>
<img src="https://github.com/devicons/devicon/blob/master/icons/java/java-original.svg" title="NodeJS" alt="NodeJS" width="70" height="70"/>
<img src="https://github.com/devicons/devicon/blob/master/icons/docker/docker-original.svg" title="NodeJS" alt="NodeJS" width="70" height="70"/>
<img src="https://github.com/plantuml-stdlib/gilbarbara-plantuml-sprites/blob/master/pngs/helm.png" title="NodeJS" alt="NodeJS" width="70" height="70"/>
</div>

## Quarkus-specific documentation part

This project uses Quarkus, the Supersonic Subatomic Java Framework.

If you want to learn more about Quarkus, please visit its website: https://quarkus.io/ .

### Running the application in dev mode

You can run your application in dev mode that enables live coding using:
```shell script
./mvnw compile quarkus:dev
```

> **_NOTE:_**  Quarkus now ships with a Dev UI, which is available in dev mode only at http://localhost:8080/q/dev/.

### Packaging and running the application

The application can be packaged using:
```shell script
./mvnw package
```
It produces the `quarkus-run.jar` file in the `target/quarkus-app/` directory.
Be aware that it’s not an _über-jar_ as the dependencies are copied into the `target/quarkus-app/lib/` directory.

The application is now runnable using `java -jar target/quarkus-app/quarkus-run.jar`.

If you want to build an _über-jar_, execute the following command:
```shell script
./mvnw package -Dquarkus.package.type=uber-jar
```

The application, packaged as an _über-jar_, is now runnable using `java -jar target/*-runner.jar`.

### Creating a native executable

You can create a native executable using: 
```shell script
./mvnw package -Pnative
```

Or, if you don't have GraalVM installed, you can run the native executable build in a container using: 
```shell script
./mvnw package -Pnative -Dquarkus.native.container-build=true
```

You can then execute your native executable with: `./target/amazingness-service-1.0.0-SNAPSHOT-runner`

If you want to learn more about building native executables, please consult https://quarkus.io/guides/maven-tooling.

### Related Guides

- RESTEasy Classic ([guide](https://quarkus.io/guides/resteasy)): REST endpoint framework implementing JAX-RS and more

## Provided Code

#### RESTEasy JAX-RS

Easily start your RESTful Web Services

[Related guide section...](https://quarkus.io/guides/getting-started#the-jax-rs-resources)
