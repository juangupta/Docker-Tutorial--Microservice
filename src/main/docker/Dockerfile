FROM artifactory.apps.bancolombia.com/devops/openjdk8-openj9:x86_64-alpine-jdk8u212-b03_openj9-0.14.0-slim
VOLUME /tmp
ADD *.jar app.jar
RUN sh -c 'touch /app.jar'
ENTRYPOINT [ "sh", "-c", "java -XX:MaxRAMPercentage=75 -Djava.security.egd=file:/dev/./urandom -jar /app.jar" ]
