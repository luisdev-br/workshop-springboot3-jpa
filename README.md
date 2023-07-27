# Workshop Spring Boot -> Web Services & JPA/Hibernate


[![NPM](https://img.shields.io/npm/l/react)](https://github.com/luisdev-br/workshop-springboot3-jpa/blob/main/LICENSE) 

# Sobre o projeto

O projeto em questao refere-se a um modulo de estudo: **Web Services com SpringBoot/JPA** do curso Java COMPLETO - POO + Projetos, Professor **Nelio Alves**.

Neste projeto o objetivo principal era realizar o aprendizado de desenvolvimento de uma aplicacao back end web usando o Spring, realizando a integracao de diversas funcionalidades tais como:

- CRUD de entidades
- APIs RESTful
- Persistência de Dados
- Tratamento de Exceções

## Domain Model
![Domain 1](https://github.com/luisdev-br/assets/blob/main/image.png) 

## Domain Instance
![Domain 2](https://github.com/luisdev-br/assets/blob/main/domain_instance.png)

## Logical Layers
![Modelo Conceitual](https://github.com/luisdev-br/assets/blob/main/logical_layers.png)

## Estrutura do Projeto
O projeto segue uma estrutura organizada, separando as camadas de controle, serviços e persistência. A estrutura inclui:

- src/main/java: Contém as classes Java do projeto, incluindo os controladores, serviços e entidades.
- src/main/resources: Contém arquivos de configuração, como o arquivo application.properties para configurações do Spring e o arquivo de configuração do Hibernate.
- src/test/java: Contém classes de teste para garantir o correto funcionamento das funcionalidades implementadas.

# Tecnologias utilizadas
## Back end
- Java
- Spring Boot
- JPA / Hibernate
- Maven
# Como executar o projeto

## Back end
Pré-requisitos: Java 17

```bash
# clonar repositório
git clone https://github.com/luisdev-br/workshop-springboot3-jpa

# executar o projeto
./mvnw spring-boot:run
```

## Nota Final

Este projeto foi desenvolvido com fins educacionais e para fornecer uma base sólida para entender o desenvolvimento back-end usando o Spring Web. Ele pode ser estendido e aprimorado com a adição de mais recursos, autenticação de usuários, manipulação de erros mais elaborada, entre outras funcionalidades, de acordo com as necessidades do projeto final.

# Autor

Luis Eduardo
