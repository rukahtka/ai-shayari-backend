# Use a base image with Java and Maven
FROM eclipse-temurin:21-jdk

# Set working directory
WORKDIR /app

# Copy project files into container
COPY . .

# Make Maven Wrapper executable
RUN chmod +x mvnw

# Build the Spring Boot application
RUN ./mvnw clean package -DskipTests

# Run the app
CMD ["java", "-jar", "target/ai-shayari-poem-1.0.0.jar"]
