FROM amazoncorretto:17

ADD target/pokmonAPI-0.0.1.jar pokmonAPI-0.0.1.jar

ENTRYPOINT ["java", "-jar", "/pokmonAPI-0.0.1.jar"]