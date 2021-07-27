FROM gradle:6.8.3 as builder
COPY . /app
WORKDIR /app
RUN gradle clean build


FROM gradle:6.8.3
COPY --from=builder /app/build/libs/user-management-0.0.1-SNAPSHOT.jar usermanagement.jar
ENTRYPOINT java -jar usermanagement.jar

