# Java 17 사용 (필요 시 다른 버전으로 변경)
FROM openjdk:17-jdk-slim

# 작업 디렉토리 설정
WORKDIR /app

# 빌드된 JAR 파일을 도커 이미지에 복사
COPY build/libs/*.jar app.jar

# 애플리케이션 바로 실행
ENTRYPOINT ["java", "-jar", "app.jar"]
