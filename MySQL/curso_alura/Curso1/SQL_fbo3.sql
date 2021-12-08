
ALTER TABLE tbproduto ADD PRIMARY KEY (PRODUTO);

INSERT INTO tbproduto (
PRODUTO,	
NOME,
EMBALAGEM,
TAMANHO,
SABOR,
PRECO_LISTA) VALUES	(
'1078680','Frescor do Verão - 470 ml - Manga','Garrafa','470 ml','Manga', 5.18);

SELECT * FROM tbproduto;