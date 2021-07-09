# Controle de Ponto e Acesso de Usuários

Neste projeto foi desenvolvida uma API Rest para controle de ponto e acesso dos usuários de uma empresa.

Foram utilizadas as tecnologias: Java, Spring Boot, Gradle, Hibernate Envers, H2 Database e lombok, além da documentação de toda a API com Swagger.

###### Autor: `Vinicius Veroneze dos Reis Costa`

###### E-mail: `veroneze@gmail.com`

### Detalhes da implementação
* Foi criada uma nova classe para as chaves com annotation `@Embeddable`, melhorando a documentação da API gerada e melhorando a interação com a mesma.
* A opção pela utilização de `@ManyToOne(cascade= CascadeType.PERSIST)` deu-se ao fato de facilitar a integração com testes, tais como swagger e Postman.

### Execução
* Após o download desse projeto, confira se tem o JDK instalado (versão 11 ou superior).
* Execute na pasta onde o projeto se encontra:

#### Windows
`gradlew.bat build`

`gradlew.bat bootRun`

#### Linux
`./gradlew build`

`./gradlew bootRun`

* Acesse `https://localhost:8081/swagger-ui.html` para visualizar a documentação da API.
