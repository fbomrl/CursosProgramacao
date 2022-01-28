create table tbcliente(
id integer not null auto_increment primary key,
nome varchar(100),
cpf varchar(14) unique,
telefone varchar(15),
email varchar(100));
create table tbconta(
numero integer primary key,
agencia integer,
tipo integer,
saldo double,
id_titular integer not null,constraint titular foreign key(id_titular) references tbcliente(id));

select * from tbcliente;
select * from tbconta;
describe tbcliente;
describe tbconta;

insert into tbcliente (nome, cpf, telefone, email) values 
('Fabio Silva', '111111111-33', '91234-4511', 'fabios@gmail.com'),
('Maria Antonia Silva', '012345678-01', '998765-4321', 'mariaasilva@gmai.com'), 
('Erick Souza', '222222222-44', '97531-2468','ericks@gmail.com'),
('José Francisco','035792467-89','945678-3216','josef@gmail.com'),
('Frederico Tesouro','564564758-13','999999-7894','fredtesouro@gmai.com'),
('Florinda Amancio','564561238-13','98974-5012','floramancio@gmail.com'),
('Maxim Tsigalko', '1231214785-11', '99999-9999', 'maxtsigalko@gmail.com'),
('Julius Aghahowa', '456237894-44', '98745-2255','jaghahowa@gmail.com'),
('Lionel Messi', '333456711-12','94561-2278','messilionel@gmail.com'),
('Robert Lewandowski', '354868444-21','94014-2277', 'rlewandowski@gmail.com');

insert into tbconta (numero, agencia, tipo, saldo,id_titular) 
values 
(123456, 5586, 1, 400.00,11);
insert into tbconta (numero, agencia, tipo, saldo,id_titular) 
values 
(090528,5586,0,1500,12 ),
(789411,1192,0,13000,13),
(000354,0763,0,500,14),
(147850,9182,1,2000,15),
(987654,5586,0,9000,16),
(456781,1192,1,500,17),
(456171,0763,0,13000,18),
(753241,1192,2,99999,19),
(00587,5586,2,99999,20);


select tbcliente.nome, tbcliente.cpf, tbcliente.telefone, tbcliente.email, tbconta.numero, tbconta.agencia,
tbconta.tipo, tbconta.saldo
from tbcliente
inner join tbconta 
on (tbcliente.id = tbconta.id_titular);

select * from clientes;

