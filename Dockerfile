FROM openjdk:21-jdk-slim

LABEL author="Ana Livia"

WORKDIR /app

COPY src ./src

RUN find src -name "*.java" > sources.txt && \
    javac @sources.txt -d out

CMD ["java", "-cp", "out", "state.Main"]
