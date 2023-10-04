FROM openjdk:17
EXPOSE 7978
ADD target/project.jar project2.jar
ENTRYPOINT ["java","-jar","/project2.jar"]