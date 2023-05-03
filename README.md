# DISCIPLINA WEBSERVICES & RESTFUL - MÓDULO DE CONTROLE DE ESTUDANTES

Trabalho final da disciplina Webservices e Restful
Prof: EDUARDO FERREIRA GALEGO

-Desenvolvido por:
<ul>
  <li>Murillo Lopes Fernandes</li>
  <li>Eduardo Freire Cotrim</li>
  <li>Ana Carolina Alves Cola</li>
  <li>Marco Antonio da Paz Couzin</li>
</ul>

Este módulo consiste em:
<ul>
   <li> Cadastrar, alterar, consultar e excluir alunos.</li>
   <li> Validar o token de acesso (JWT) antes da chamada de cada serviço.</li>
   <li> A validação do token será feita através de uma chamada de um endpoint no serviço de autenticação.</li>
</ul>


### Os endpoints para gestão dos alunos são:
1. Listar todos os alunos (id, nome e curso);

   GET /students
   ![img_1.png](img_1.png)

2. Listar todos os alunos por curso (id, nome e curso);

   GET /students?course=3SCJR
   ![img_2.png](img_2.png)

3. Consulta aluno por ID (Mostra todos os campos);

   GET /students/3
   ![img_3.png](img_3.png)

4. Atualiza o status do aluno;

   PATCH /students/8
   ![img_4.png](img_4.png)

5. Cria um novo aluno;

   POST /students
   ![img.png](img.png)

6. Atualiza os dados do aluno (menos id e status);

   PUT /students/3
   ![img_5.png](img_5.png)

7. Apaga aluno por id.

   DELETE /students/3
   ![img_6.png](img_6.png)




## INSTRUÇÕES

1. Não subir esta aplicação antes de executar o projeto "hw-acquirer-auth"
2. Configurar as variáveis de ambiente do banco de dados, porta e URL do serviço de autenticação conforme os nomes que estão no application.yaml.

   #### Exemplo:
         JDBC_DATABASE_URL=jdbc:mysql://localhost:3306/acquirerdb
         JDBC_DATABASE_PASSWORD=senhadobanco
         JDBC_DATABASE_USERNAME=usuariodobanco
         PORT=8083
         URL_AUTH=<url_servico_autenticacao>

3. O JWT deve sempre ser passado como "Authorization", no parâmetro "Bearer Token".


### Repositório
> https://github.com/marcocouzin/hw-acquirer-students.git



## DETALHES DA SOLUÇÃO
<ul>
   <li>Para este projeto foi utilizada o Java como linguagem de programação</li>
   <li>O Spring Boot foi o framework para construção das APIs</li>
   <li>Para o gerenciamento das dependências, utilizou-se o Maven</li>
</ul>


### TESTES e VALIDAÇÃO
#### A aplicação está hospedada no Heroku. Para testes utilize o caminho abaixo:
1. Import os arquivos Acquirer_PROD.postman_environment.json e FIAP - Home Work - Webservice-Restful.postman_collection.json
2. Execute os serviços na ordem citada acima
3. Para os demais endpoints, veja o REDME do projeto hw-acquirer-students
