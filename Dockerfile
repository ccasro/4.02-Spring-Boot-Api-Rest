# ==============================
# ETAPA 1: Build
# ==============================
FROM maven:3.9.6-eclipse-temurin-21 AS build

# Estableix el directori de treball dins del contenidor
WORKDIR /app

# Copiem només els fitxers necessaris per a resoldre les dependències
COPY pom.xml .
COPY src ./src

# Compila l'aplicació i genera el .jar, sense executar els tests (per agilitzar)
RUN mvn clean package -DskipTests

# ==============================
# ETAPA 2: Producció
# ==============================
FROM eclipse-temurin:21-jre-jammy AS prod

# Directori de treball a l'entorn de producció
WORKDIR /app

# Copiem només el .jar generat a l'etapa anterior
COPY --from=build /app/target/*.jar app.jar

# Exposem el port on l'aplicació s'executarà
EXPOSE 8080

# Comanda per executar l'aplicació
ENTRYPOINT ["java", "-jar", "app.jar"]