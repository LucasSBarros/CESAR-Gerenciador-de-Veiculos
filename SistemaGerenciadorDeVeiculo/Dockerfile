FROM openjdk:17

WORKDIR /app

# Copie o JAR da aplicação para o diretório de trabalho no contêiner
ADD target/SistemaGerenciadorDeVeiculo-0.0.1-SNAPSHOT.jar /app/SistemaGerenciadorDeVeiculo-0.0.1-SNAPSHOT.jar

# Copie o script wait-for-it.sh para o diretório de trabalho no contêiner
COPY wait-for-it.sh /app/wait-for-it.sh

# Dê permissão de execução ao script wait-for-it.sh
RUN chmod +x /app/wait-for-it.sh

# Defina o ponto de entrada para usar o script wait-for-it.sh
ENTRYPOINT ["/app/wait-for-it.sh", "db:5432", "--", "java", "-jar", "/app/SistemaGerenciadorDeVeiculo-0.0.1-SNAPSHOT.jar"]