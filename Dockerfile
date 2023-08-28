FROM eclipse-temurin:17
COPY target/Hello-0.0.1-SNAPSHOT.jar Hello-0.0.1-SNAPSHOT.jar
CMD [ "java","-jar","Hello-0.0.1-SNAPSHOT.jar" ] 