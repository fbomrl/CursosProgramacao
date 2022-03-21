-- ATIVIDADE -- 

-- 1º) Criar uma tabela de correntista com os 6 campos abaixo: Ag, Conta, Nome, Email, Telefone, Saldo
create database atividade_revisao;

create table correntistas(
id_correntista int not null auto_increment primary key,
agencia int not null,
conta int not null,
nome varchar(50) not null,
email varchar(80) not null,
telefone varchar(15) not null,
saldo  double(8,2) not null);

-- 2º) Inserir 4 registros nesta tabela.
insert into correntistas
(agencia, conta, nome, email, telefone, saldo)
values
(5586, 091528, 'Maxim Tsigalko', 'maxtisgalko@mail.com', '(11) 91111-1111', 987.44),
(1192, 987451, 'Julius Agahowa', 'agahowa@mail.com', '(11) 91111-1111', 999.99),
(0762, 753951, 'Cristiano Ronaldo', 'cronaldo@mail.com', '(11) 91111-1111', 988.99),
(3409, 456159, 'Lionel Messi', 'messileo@mail.com', '(11) 91111-1111', 988.99);

-- 3º) Mostra através do select somente os campos Ag, Conta e Nome.
select agencia, conta, nome from correntistas;

-- 4º) Mostrando somente a soma de todos os saldos dos correntistas.
select sum(saldo) as total_geral from correntistas;


