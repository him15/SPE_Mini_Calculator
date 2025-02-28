FROM maven as build

WORKDIR /app

COPY pom.xml .
COPY src ./src

RUN mvn clean package && ls -l /app/target


FROM openjdk:17

WORKDIR /app

COPY --from=build /app/target/SPE_Calculator-1.0-SNAPSHOT.jar .

CMD ["java", "-cp", "/app/SPE_Calculator-1.0-SNAPSHOT.jar", "com.himanshu.Calculator"]