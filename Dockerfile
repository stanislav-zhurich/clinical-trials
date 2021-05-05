FROM openjdk:12-jdk-alpine
ARG JAR_FILE=build/libs/*.jar
COPY ${JAR_FILE} app.jar
EXPOSE 8080
ENV SPRING_PROFILE=dev
ENTRYPOINT ["java","-Dspring.profiles.active=${SPRING_PROFILE}","-jar","/app.jar"]