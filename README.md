API Produtos - Postman

Base URL:
http://localhost:8080/api/produtos

POST /

{
  "nome": "Produto",
  "descricao": "Desc",
  "preco": 100.0,
  "status": "DISPONIVEL"
}

GET /

GET /{id}

PUT /{id}

{
  "nome": "Atualizado",
  "descricao": "Desc",
  "preco": 150.0,
  "status": "DISPONIVEL"
}

DELETE /{id}

Status:
DISPONIVEL | ESGOTADO | INATIVO
