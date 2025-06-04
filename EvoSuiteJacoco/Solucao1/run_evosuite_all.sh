#!/bin/bash

# Ajusta estes caminhos conforme o teu ambiente
EVOSUITE_JAR=~/LEI/3ANO/2SEM/ATS/ATS/EvoSuite/evosuite.jar
PROJECT_CP=target/classes
GENERATED_TESTS_DIR=target/generated-tests
REPORT_DIR=target/evosuite-report
SEARCH_BUDGET=30   # segundos por classe

# Criar diretórios caso não existam
mkdir -p $GENERATED_TESTS_DIR
mkdir -p $REPORT_DIR

while read -r class; do
  echo "Gerando testes para $class"
  
  java -jar $EVOSUITE_JAR \
    -class $class \
    -projectCP $PROJECT_CP \
    -Dsearch_budget=$SEARCH_BUDGET \
    -Dtest_dir=$GENERATED_TESTS_DIR \
    -Dreport_dir=$REPORT_DIR \
    -Djava.net.preferIPv4Stack=true \
    -Djava.awt.headless=true

done < classes.txt
