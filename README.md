# project-spring-docker-terraform-aws  [![Continuos Integrations](https://github.com/jnslabs/project-spring-docker-terraform-aws/actions/workflows/continuos-integrations.yml/badge.svg)](https://github.com/jnslabs/project-spring-docker-terraform-aws/actions/workflows/continuos-integrations.yml)
[![Create terraform plan](https://github.com/jnslabs/project-spring-docker-terraform-aws/actions/workflows/tf_plan.yml/badge.svg)](https://github.com/jnslabs/project-spring-docker-terraform-aws/actions/workflows/tf_plan.yml)

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

**Level 2**
<img src=diagram/tutorial-diagram-level-2.jpg>

Este nível irá ensiná-lo a:
- execute um Docker para construir a imagem do seu aplicativo
- configure sua imagem para o arquivo docker-compose
- execute sua imagem em um contêiner docker
- Acesse seu aplicativo usando swagger e carteiro
- Faça upload da sua imagem API para o dockerhub

**Level 3**
<img src=diagram/tutorial-diagram-level-3.jpg>

Este nível irá te ensinar:
- Compreendendo a infraestrutura básica da AWS
- Criar usuário IAM
- Configurar perfil aws cli
- Crie os arquivos terraform necessários:
  - provider
  - main
- Criar par de chaves ssh
- Configurar arquivo de modelo userdata
- Comandos do Terraform
- Acesse o host ec2 da máquina local
- Acesse sua API rodando em ec2 usando swagger e postman