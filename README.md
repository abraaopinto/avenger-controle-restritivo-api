# avenger-controle-restritivo-api
API Rest - Para um sistema de controle de Restritivos (Contratos de creditos que possuem parcelas em atrasos acima das regras definidas 
e clientes impedidos de operar por outros motivos).

## Entidades
- Pessoa
- Contrato
- Parcela
- Restritivo
- Regras
- Notificacao

## Eventos a serem monitorados
- Atraso de parcela.
- Pagamento de parcela em atraso.
- Renegociação de contrato.
- Pessoas impedidas por outros motivos. [Ex. Cadastro CEIS](http://www.transparencia.gov.br/swagger-ui.html#!/Cadastro32Nacional32de32Empresas32Inid244neas32e32Suspensas3240CEIS41/ceisUsingGET_1)

### O que você precisará:
- Um editor de texto favorito ou um IDE.
- JDK 1.8 ou posterior
- Maven 3.2+
- Você também pode importar o código direto de uma IDE:
  -- Spring Tool Suite (STS)
  -- Eclipse
  -- IntelliJ IDEA