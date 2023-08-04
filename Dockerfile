FROM openjdk:8-jdk-alpine
COPY target/apachecamel-awsxray-0.0.1-SNAPSHOT.jar apachecamel-awsxray-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java", "-jar", "/apachecamel-awsxray-0.0.1-SNAPSHOT.jar"]
