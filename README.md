# project-spring-docker-terraform-aws
Projeto agenda de cadastro

## [Spring initializr](https://start.spring.io/#!type=maven-project&language=java&platformVersion=3.1.7&packaging=jar&jvmVersion=17&groupId=com.jnslabs&artifactId=contactbook&name=contactbook&description=Api%20cadastro%20de%20contatos&packageName=com.jnslabs.contactbook&dependencies=web,devtools,cloud-config-client,postgresql,data-jpa,h2)

## **Tutorial ContactBook**

Um projeto para ensinar como provisionar uma infraestrutura AWS e implantar um SpringBoot
Aplicação em máquina Amazon EC2 utilizando Terraform e Docker.

**Level 1**
<img src=diagram/tutorial-diagram-level-1.jpg>

Este nível irá ensiná-lo a:
- Execute um contêiner Docker com Postgres usando um arquivo docker-compose
- Conecte seu aplicativo springboot ao contêiner de banco de dados Postgres.