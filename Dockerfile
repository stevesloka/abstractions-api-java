FROM java:8-jdk
MAINTAINER Steve Sloka

WORKDIR /app

EXPOSE 8080

RUN mkdir -p /app
RUN mkdir -p /data/logs
COPY ./ /app
RUN chmod +x /app/gradlew
RUN ./gradlew build

VOLUME ["/app"]
VOLUME ["/data/logs"]
WORKDIR /app
CMD ["java", "-jar", "/app/build/libs/pixelcorp-api-java.jar"]
