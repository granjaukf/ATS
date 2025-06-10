# Software Analysis and Testing

(Academic Year 2024/2025)

University of Minho

##### Final Grade: 17/20 

## Project Overview

This project was developed in the context of the "Análise e Teste de Software" course, supervised by **João Saraiva** and **José Nuno Macedo**.

The aim is to apply various software testing techniques to object-oriented software systems, specifically solutions provided by students from the *Programação Orientada a Objetos* (POO) course of 2023/2024. The project involves analyzing, extending, and automatically generating tests to assess and improve the overall test quality and code reliability.

---

## Goals

- Analyze the complexity and structure of the provided object-oriented projects.
- Design and implement **unit tests** using *JUnit* for the selected systems.
- Automatically generate test cases using **EvoSuite**.
- Measure and report **test coverage** and **test quality**.
- Apply **mutation testing** using *PIT* to assess the effectiveness of the test suites.
- Implement **property-based testing** using *QuickCheck*, *Hypothesis*, or similar tools.

---

## Tasks Performed

1.  **JUnit Tests**  
   Developed unit tests to cover core functionalities of the selected POO project(s). When existing tests were present, the test suite was complemented with additional edge cases and boundary condition tests.

2.  **EvoSuite Integration**  
   Integrated EvoSuite to automatically generate JUnit-compatible tests, increasing baseline coverage and identifying untested paths.

3.  **Coverage & Quality Analysis**  
   Used tools such as *JaCoCo* to measure the code coverage (instruction, branch, line, and method coverage). Analyzed the relevance and redundancy of test cases.

4.  **Mutation Testing with PIT**  
   Executed mutation testing via *PIT* to simulate potential bugs and evaluate whether the test suite detects these introduced faults (mutation score).

5.  **Property-Based Testing**  
   Developed JUnit tests using property-based approaches via *QuickCheck* (for Java) and *Hypothesis* (for Python) to generate a wide range of test inputs and validate core properties of the application logic.

6.  **Report with Visual Insights**  
   Generated charts and summaries for coverage, mutation scores, and test effectiveness using graphical tools. The report includes comparisons between manually written tests and automatically generated ones.

---

## Extra Work

In addition to the core tasks, the following optional goals were also addressed:

- ⚙️ **Automation with Maven**:  
  The test workflows (compilation, test execution, mutation testing, and report generation) were automated using Maven plugins for EvoSuite and PIT.

- 🤖 **LLMs for Test Generation**:  
  Leveraged tools like ChatGPT and GitHub Copilot to generate exploratory unit tests. A critical analysis of their quality, correctness, and coverage was included.

- 🧪 **Java-based Property Testing Tools**:  
  Experimented with Java libraries for property-based testing (e.g., *jqwik*, *QuickTheories*) to test invariants in a structured and automated way.

---

## Deliverables

-  JUnit Test Suites (Manual + EvoSuite)
-  Coverage Reports (JaCoCo)
-  Mutation Testing Reports (PIT)
-  Property-Based Test Classes
-  Full Technical Report with Visual Analysis

---

## Authors

- **Supervisors**: João Saraiva, José Nuno Macedo  
- **Students**: Rodrigo Ferreira, Tomás Melo, Jorge Fernandes