FROM openjdk:21

MAINTAINER vaibhav

COPY target/accounts-0.0.1-SNAPSHOT.jar   accounts-0.0.1-SNAPSHOT.jar

ENTRYPOINT ["java", "-jar", "accounts-0.0.1-SNAPSHOT.jar"]