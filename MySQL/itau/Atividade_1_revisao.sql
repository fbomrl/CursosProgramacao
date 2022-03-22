-- ATIVIDADE 01 -- 

-- 1º) Criar uma tabela de correntista com os 6 campos abaixo: Ag, Conta, Nome, Email, Telefone, Saldo
create database atividade_revisao;

create table correntistas(
agencia int not null,
conta int not null,
nome varchar(50) not null,
email varchar(80) not null,
telefone varchar(15) not null,
saldo  double(8,2) not null,
primary key (agencia,conta));

-- 2º) Inserir 4 registros nesta tabela.
insert into correntistas
(agencia, conta, nome, email, telefone, saldo)
values
(0191, 07228,'Peter Parker', 'kbcaaa@mail.com', '(11) 91111-1111', 2000.00),
(5586, 091528, 'Maxim Tsigalko', 'maxtisgalko@mail.com', '(11) 91111-1111', 987.44),
(1192, 987451, 'Julius Agahowa', 'agahowa@mail.com', '(11) 91111-1111', 999.99),
(0762, 753951, 'Cristiano Ronaldo', 'cronaldo@mail.com', '(11) 91111-1111', 988.99),
(3409, 456159, 'Lionel Messi', 'messileo@mail.com', '(11) 91111-1111', 988.99);

-- 3º) Mostra através do select somente os campos Ag, Conta e Nome.
select agencia, conta, nome from correntistas;

-- 4º) Mostrando somente a soma de todos os saldos dos correntistas.
select sum(saldo) as total_geral from correntistas;
-- ---------------------------------------------------
create table fluxo_caixa(
agencia int not null,
conta int not null,
fluxo int not null,
entrada decimal(8,2) not null,
saida decimal(8,2) not null);

insert into fluxo_caixa
( agencia ,conta ,fluxo,entrada ,saida )
values 
(5586, 091528,12,1000,10),
(5586, 091528,12,1000,10),
(1192, 987451,12,1000,10),
(1192, 987451,12,1000,10),
(0762, 753951,12,1000,10),
(0762, 753951,12,1000,10),
(0762, 753951,12,1000,10),
(1192, 07228,12,1000,10),
(5586, 091528,12,1000,10),
(3409, 07228,12,1000,10),
(0191, 07228,10,1000,0),
(0191, 07228,11,1000,0),
(0191, 07228,12,1000,10),
(0191, 07228,13,1000,200);

-- Criando um relacionamento entre tabelas;
select c.agencia,c.nome, f.entrada, f.saida
from correntistas as c,
fluxo_caixa as f
where (c.agencia=f.agencia) and (c.conta=f.conta);

select c.agencia,c.nome, f.entrada, f.saida
from correntistas as c
inner join fluxo_caixa as f
on (c.agencia=f.agencia) and (c.conta=f.conta);

-- ATIVIDADE 02 -- 

