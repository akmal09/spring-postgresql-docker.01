FROM adoptopenjdk/openjdk11:latest
WORKDIR /opt
COPY target/*.jar /opt/application.jar
CMD apt-get update -y
# ENTRYPOINT ["java", "-Xmx2048M", "-jar", "/application.jar"]
ENTRYPOINT ["java", "-jar", "/opt/application.jar"]
