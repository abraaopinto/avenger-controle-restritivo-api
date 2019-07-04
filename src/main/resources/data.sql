DROP TABLE IF EXISTS NCR_PESSOA;
 
CREATE TABLE NCR_PESSOA (
  ID_PESSOA INT PRIMARY KEY,
  ID_FISCAL VARCHAR(14) NOT NULL,
  NOME VARCHAR(200) NOT NULL,
  TP_PESSOA VARCHAR(20) DEFAULT NULL
);
 
 INSERT INTO NCR_PESSOA (ID_PESSOA, ID_FISCAL, NOME, TP_PESSOA) VALUES
  (1,'80206131291', 'ABRAAO PINTO', 'PESSOA_FISICA'),
  (2,'80206131291', 'BILL GATES', 'PESSOA_FISICA'),
  (3,'80206131291', 'TONY STARK', 'PESSOA_FISICA'),
  (4,'80206131291', 'STEVE JOBS', 'PESSOA_FISICA'),
  (5,'80206131291', 'JONH WICK', 'PESSOA_FISICA');