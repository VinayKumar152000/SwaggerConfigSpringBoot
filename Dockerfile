FROM openjdk:8
EXPOSE 8080
ADD target/SpringSecuritySwagger-0.0.1-SNAPSHOT.jar SpringSecuritySwagger-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java","-jar","/SpringSecuritySwagger-0.0.1-SNAPSHOT.jar"]

