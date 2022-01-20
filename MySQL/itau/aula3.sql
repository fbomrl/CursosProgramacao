select * from gama.contatos;
-- Inclusão de idade e email na tabela contato
alter table gama.contatos 
add idade int not null;
alter table gama.contatos 
add email varchar(20);

UPDATE gama.contatos SET idade = 30, email = 'dsahdhau@email.com' WHERE id_contatos = 16;
update gama.contatos set nome_contatos='Petrolina Dragon', email='.d@gama.com.br'where id_contatos=80;
update gama.contatos set nome_contatos='Petrolina Dragon', email='.d@gama.com.br', idade=80 where id_contatos=17;
update gama.contatos set nome_contatos = 'Fabio Meireles' where id_contatos = 1;


