--  criando tabela para nossa api

create table tbcliente(
id int not null auto_increment primary key,
nome varchar(50) not null,
cpf char(14) not null,
email varchar(100));


-- inserindo registros na tabela
insert into tbcliente
(nome, cpf, email)
values
('Bianca', 12345678951974, 'bianca@mail.com'),
('Fabio', 95175678941567, 'fbo@mail.com');	