#!/bin/bash

# Caminhos absolutos para os binários do Java
JAVA8="/usr/lib/jvm/java-8-openjdk-amd64/bin/java"
JAVAC8="/usr/lib/jvm/java-8-openjdk-amd64/bin/javac"
JAVA17="/usr/lib/jvm/java-17-openjdk-amd64/bin/java"
JAVAC17="/usr/lib/jvm/java-17-openjdk-amd64/bin/javac"

# Função para mudar versão do java
set_java() {
    export JAVA_HOME=$(dirname $(dirname "$1"))
    export PATH="$JAVA_HOME/bin:$ORIGINAL_PATH"
    echo "⚙️ Versão do Java definida para: $("$1" -version 2>&1 | head -n 1)"
}

ORIGINAL_PATH="$PATH"


echo "A correr testes JUnit manuais + cobertura JaCoCo..."
cd JUnitTests_LLM/Solucao1 || exit 1
set_java "$JAVA17"
mvn test jacoco:report || exit 1
xdg-open target/site/jacoco/index.html &
cd - > /dev/null

echo "A correr testes gerados com EvoSuite + cobertura JaCoCo (Java 8)..."
cd EvoSuiteJacoco/Solucao1 || exit 1
set_java "$JAVA8"
mvn test jacoco:report || exit 1
xdg-open target/site/jacoco/index.html &
cd - > /dev/null

echo "A correr análise de mutações com PIT (Java 17)..."
cd PIT/Solucao1 || exit 1
set_java "$JAVA17"
mvn clean test
mvn org.pitest:pitest-maven:mutationCoverage || exit 1
xdg-open target/pit-reports/index.html &
cd - > /dev/null

echo "A correr testes gerados com QuickCheck (JUnit compilado, Java 17)..."
cd QuickCheck/Solucao1 || exit 1
mvn test || exit 1
cd - > /dev/null

echo "Todos os testes e ferramentas foram executados com sucesso!"
