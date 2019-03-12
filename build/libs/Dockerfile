FROM artifactory.bancolombia.corp/devops/openjdk8-openj9
VOLUME /tmp
ADD *.jar app.jar
RUN sh -c 'touch /app.jar'
ENTRYPOINT [ "sh", "-c", "java -Djava.security.egd=file:/dev/./urandom -jar /app.jar" ]