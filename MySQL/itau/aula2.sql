create database gama; 
use gama;

CREATE TABLE `cargo` (
	`codigo_cargo` int NOT NULL AUTO_INCREMENT,
	`nome_cargo` varchar(40) NOT NULL,
	PRIMARY KEY (`codigo_cargo`)
);

CREATE TABLE `funcionarios` (
	`matricula` int NOT NULL AUTO_INCREMENT,
	`nome_funcionario` varchar(50) NOT NULL,
	`idade_funcionario` int NOT NULL,
	`codigo_cargo` int NOT NULL,
	PRIMARY KEY (`matricula`)
);

ALTER TABLE `funcionarios` ADD CONSTRAINT `funcionarios_fk0` FOREIGN KEY (`codigo_cargo`) REFERENCES `cargo`(`codigo_cargo`);

-- sintaxe para inserir registros na tabela de cargos
insert into gama.cargo (nome_cargo) values ('Analista de Sistemas'), ('Gerente de CPD'), ('Auxiliar Administrativo'), ('Contador');
-- sintaxe para inserir registros na tabela de Funcionários
describe funcionarios;
insert into gama.funcionarios (nome_funcionario, idade_funcionario, codigo_cargo)
values ('Paulo', 26, 2), 
('Nicole',30,1),
('Paulo',32,3),
('Antônio',45,1);
select * from gama.funcionarios;

-- Sintaxe para atualizar um registro
update gama.funcionarios set nome_funcionario='Paulo César' where matricula=3;

select f.nome_funcionario, f.idade_funcionario, c.nome_cargo
from cargo as c
inner join funcionarios as f
on (f.codigo_cargo = c.codigo_cargo);

use gama;
-- Tabela de contatos
create table gama.contatos(id_contatos int not null auto_increment primary key, nome_contatos varchar(40) not null);
describe gama.contatos; 
insert into gama.contatos (nome_contatos) value ('Fabio Meireles'), ('Ana Duarte'), ('Ciro Franco'), ('Danilo Trindade'),
('Eduardo Galvão'), ('Flávia Jesus'), ('Heriton'), ('Ivanildo dias Rocha'), ('Jefferson Augusto'),('Jefferson Menezes'),
('Patrick Gaspar'), ('Rafael Niccioli'), ('Rosana'), ('Willian Bonaventura'), ('Bruno'), ('Willian Santos');

select * from gama.contatos;


-- Atividade Banco de dados
create table gama.produtos (id_produto int not null auto_increment primary key, nome_produto varchar(20), marca_produto varchar(20),
Quantidade_produto int, valor_produto decimal(8,2), cod_produto int);

insert into gama.produtos(nome_produto, marca_produto, Quantidade_produto, valor_produto, cod_produto) 
value ('Smartphone', 'Samsung', 57, 2999.99, 1), ('Smarttv', 'LG', 14, 4999.99,2), ('Liquidificador', 'Mondial', 33, 499.99, 3),
('Monitor LCD', 'Samsung', 11, 1499.99,1), ('Teclado Gamer', 'Dragons', 117, 199.99,4),
('Headphone','JBL', 114, 299.99, 5 );
-- 1º SELECT
select nome_produto, Quantidade_produto, valor_produto, (Quantidade_produto * valor_produto) as Total from gama.produtos;

-- 2º SELECT
select count(*) as Total, marca_produto  from gama.produtos group by marca_produto;

