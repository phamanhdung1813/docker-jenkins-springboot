FROM openjdk:8
EXPOSE 8080
ADD target/docker-jenkins-springboot.jar docker-jenkins-springboot.jar
ENTRYPOINT ["java","-jar","docker-jenkins-springboot.jar"]