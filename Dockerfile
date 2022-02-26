FROM openjdk:8-jre-alpine3.7
EXPOSE 8083
Add target/techblog-0.0.1-SNAPSHOT.jar  techblog-0.0.1-SNAPSHOT.jar 

ENTRYPOINT ["java", "-jar", "./techblog-0.0.1-SNAPSHOT.jar "]
