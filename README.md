Para testar endpoint

POST http://localhost:8080/payments
Content-Type: application/json

Exemplo de body
{
"amount": 100.50,
"method": "PIX"
}