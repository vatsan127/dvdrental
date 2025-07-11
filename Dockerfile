FROM eclipse-temurin:17-jre

# Create group and user correctly for Debian-based images
RUN addgroup --system srivatsan && adduser --system --ingroup srivatsan srivatsan

# Copy dependencies before switching user
ARG DEPENDENCY=target/dependency
COPY ${DEPENDENCY}/BOOT-INF/lib /app/lib
COPY ${DEPENDENCY}/META-INF /app/META-INF
COPY ${DEPENDENCY}/BOOT-INF/classes /app

# Switch to non-root user
USER srivatsan

ENTRYPOINT ["java", "-cp", "/app:/app/lib/*", "dev.srivatsan.dvdrental.DvdrentalApplication"]
