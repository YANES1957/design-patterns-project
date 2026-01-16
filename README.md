# Design Patterns Project 🟡

🟡 **Sobre o projeto**  
Este projeto é uma implementação prática de **Design Patterns em Java com Spring Boot**, baseado no laboratório da Digital Innovation One (`lab-padroes-projeto-java`).  
Ele tem como objetivo demonstrar a aplicação de padrões como **Strategy, Facade, Model e Controller**, com testes unitários e estrutura organizada seguindo boas práticas.

---

## 🟡 Estrutura do projeto

design-patterns
├─ src
│ ├─ main
│ │ ├─ java
│ │ │ └─ br/com/dio/designpatterns
│ │ │ ├─ controller // Controllers REST
│ │ │ ├─ facade // Facades de integração entre padrões
│ │ │ ├─ model // Classes de modelo
│ │ │ ├─ strategy // Estratégias do Strategy Pattern
│ │ │ └─ DesignPatternsApplication.java
│ │ └─ resources
│ │ └─ application.properties
│ └─ test
│ └─ java
│ └─ br/com/dio/designpatterns
│ └─ DesignPatternsApplicationTests.java
└─ pom.xml

yaml
Copiar código

---

## 🟡 Tecnologias utilizadas

- Java 21  
- Spring Boot 3.5.9  
- Maven 3.9.11  
- JUnit 5 para testes  
- IntelliJ IDEA (IDE recomendada)  

---

## 🟡 Funcionalidades implementadas

- Estrutura básica de **Spring Boot Application**  
- Implementação do **Strategy Pattern**  
- Organização de pacotes **Facade, Model, Strategy e Controller**  
- Testes unitários carregando o contexto do Spring Boot  
- Aplicação pronta para execução local e testes automatizados  

---

## 🟡 Como rodar o projeto

1. Clonar o repositório:

```bash
git clone https://github.com/YANES1957/design-patterns-project.git
cd design-patterns-project
Build e execução:

bash
Copiar código
mvn clean install
mvn spring-boot:run
Rodar testes:

bash
Copiar código
mvn test
🟡 Sobre mim
🟡 Desenvolvedor com experiência em Java backend e QA, migrando para projetos full-stack e Spring Boot, buscando aplicar boas práticas de design de software e testes automatizados
