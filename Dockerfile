FROM openjdk:11
ADD target/dbstore-mysql.jar dbstore-mysql.jar
EXPOSE 9091
ENTRYPOINT ["java", "-jar", "dbstore-mysql.jar"]
