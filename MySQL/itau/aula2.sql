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










