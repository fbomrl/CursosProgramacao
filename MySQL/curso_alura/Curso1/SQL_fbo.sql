
INSERT INTO tbproduto (
PRODUTO,	
NOME,
EMBALAGEM,
TAMANHO,
SABOR,
PRECO_LISTA) VALUES	(
'1037797','Clean - 2 Litros - Laranja','PET
','2 Litros','Laranja', 16.01);

INSERT INTO tbproduto (
PRODUTO,	
NOME,
EMBALAGEM,
TAMANHO,
SABOR,
PRECO_LISTA) VALUES	(
'1000889','Sabor da Montanha - 700 ml - Uva','Garrafa','700 ml','Uva', 6.31);

INSERT INTO tbproduto (
PRODUTO,	
NOME,
EMBALAGEM,
TAMANHO,
SABOR,
PRECO_LISTA) VALUES	(
'1004327','Videira do Campo - 1,5 Litros - Melância','PET','1,5 Litros','Melância', 19.51);

SELECT * FROM tbproduto;

INSERT INTO tbtabela_de_vendedores (
MATRICULA, NOME, PERCENTUAL_COMISSAO) VALUES ('00235','Márcio Almeida Silva','0.08');
INSERT INTO tbtabela_de_vendedores (
MATRICULA, NOME, PERCENTUAL_COMISSAO) VALUES ('00236','Cláudia Morais','0.08');

SELECT * FROM tbtabela_de_vendedores;

