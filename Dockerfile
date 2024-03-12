FROM openjdk:11
EXPOSE 8080
COPY target/spring-boot-docker-compose.jar spring-boot-docker-compose.jar
ENTRYPOINT ["java","-jar","/spring-boot-docker-compose.jar"]