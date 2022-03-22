create database revisao;

create table clientes(
id_cliente int not null auto_increment primary key,
nome_cliente varchar(50) not null, 
idade_cliente int not null,
email_cliente varchar(80) not null);

insert into clientes
(nome_cliente, idade_cliente, email_cliente)
values
('Maria Antonia', 60, 'tonia@mail.com'),
('Fabio Silva', 32, 'fsilva@mail.com');

select * from clientes order by nome_cliente;
select * from clientes where idade_cliente=20;
select * from clientes where idade_cliente>=20 and idade_cliente <=30 order by idade_cliente;
select * from clientes where idade_cliente between 20 and 30 order by idade_cliente;
select count(*) from clientes where idade_cliente between 20 and 30;
select * from clientes where nome_cliente like "Aaron%";
select * from clientes where nome_cliente like "%Abraham";
select * from clientes where nome_cliente like "%V.%";

-- agrupamento de registros desejados no banco de dados junto a contagem de registro;
select  count(*) as total_clientes, idade_cliente from clientes where idade_cliente  between 20 and 30 group by idade_cliente order by idade_cliente;

-- utilizando a função max;
select max(idade_cliente) from clientes;
select * from clientes where idade_cliente=100;

-- utilizando a função min;
select min(idade_cliente) from clientes;
select * from clientes where idade_cliente=18;

-- criando sub-selects;
select * from clientes where idade_cliente =(select max(idade_cliente) from clientes) order by nome_cliente;

-- criar uma tabela de produtos;
create table produtos(
id_produto int not null auto_increment primary key,
nome_produto varchar(40) not null,
qntd_produto int not null,
valor_unid_produto double(8,2) not null);

insert into produtos
(nome_produto, qntd_produto,valor_unid_produto)
values
('Mouse', 20, 35.99),
('Teclado', 50, 50.75),
('Monitor', 5 , 450.00);
 
select * from produtos;
-- Calculando campos no banco de dados;
select nome_produto, qntd_produto, valor_unid_produto, ( qntd_produto * valor_unid_produto) as Total from produtos;
-- função sum, permite somar os valores atribuidos, campos a função;
select sum(qntd_produto * valor_unid_produto) as total_geral from produtos;

describe clientes;

-- Adicionando novos campos na nossa tabela;
alter table clientes add cpf char(11) not null;

-- Atualizando um registro na nossa tabela;
select * from clientes where id_cliente = 3;
select * from clientes where nome_cliente = 'Ciara%';
update clientes set cpf ="25510855844" where id_cliente = 3;
update clientes set nome_cliente ='Ciara Harper' where id_cliente  = 3;

-- Modificando campos da nossa tabela;
	alter table clientes modify email_cliente varchar(60) not null ;

-- Atualizando mais de um campo de registro na nossa tabela;
update clientes set nome_cliente = 'Paula de Souza', cpf='12345698744' where id_cliente =5;

update clientes set cpf = "Atualizar" where cpf = "";

-- Atualizando nome da planilha
alter table clientes rename column  cpf to cpf_cliente;

-- Criando um sistema de backup das tabelas;
create table clientes_bck select * from clientes;

-- Deletando..
delete from clientes where cpf_cliente='Atualizar';

-- Recuperando registros através de uma tabela de backup 
insert into clientes
(id_cliente, nome_cliente, idade_cliente, email_cliente, cpf_cliente)
select id_cliente, nome_cliente, idade_cliente, email_cliente, cpf_cliente from clientes_bck where cpf_cliente='Atualizar';



INSERT INTO `clientes` (`nome_cliente`,`idade_cliente`,`email_cliente`)
VALUES
  ("Ciara Y. Hooper",54,"enim.nec@icloud.net"),
  ("Chaim S. Banks",27,"ornare.elit@icloud.edu"),
  ("Deanna Y. Holland",21,"sem.ut@icloud.org"),
  ("Hedy G. Mendez",57,"eu.dui@yahoo.edu"),
  ("Ira Tanner",86,"eu.sem@google.org"),
  ("Hoyt Mathews",19,"nunc.sit@hotmail.ca"),
  ("Megan Doyle",86,"auctor.odio@google.ca"),
  ("Ferris Paul",50,"tincidunt.neque@protonmail.net"),
  ("Neil B. Miles",88,"nullam.enim@yahoo.org"),
  ("Travis Morales",54,"penatibus@icloud.edu");
INSERT INTO `clientes` (`nome_cliente`,`idade_cliente`,`email_cliente`)
VALUES
  ("Carter E. Sandoval",99,"lectus.pede@protonmail.couk"),
  ("Gil Z. Maddox",95,"vulputate.velit.eu@hotmail.com"),
  ("Octavia O. Horne",62,"condimentum.eget.volutpat@yahoo.net"),
  ("Flynn Shepard",44,"cras@hotmail.net"),
  ("Pandora Woodward",39,"ultricies.ornare@outlook.org"),
  ("Alfonso Hicks",40,"morbi.metus.vivamus@protonmail.edu"),
  ("Ocean Gallagher",51,"at.nisi.cum@protonmail.ca"),
  ("Patience Velasquez",95,"dolor.tempus.non@google.couk"),
  ("Naomi Reynolds",77,"ut.erat.sed@aol.com"),
  ("Acton S. Bonner",91,"arcu.vestibulum@hotmail.net");
INSERT INTO `clientes` (`nome_cliente`,`idade_cliente`,`email_cliente`)
VALUES
  ("Garth K. Wynn",47,"proin.ultrices@protonmail.org"),
  ("Moana L. Kim",18,"fusce@yahoo.net"),
  ("Malachi Mayo",80,"massa.quisque@aol.ca"),
  ("Lars Nolan",34,"fusce@google.org"),
  ("Tamekah O. Estrada",19,"interdum.sed@outlook.net"),
  ("Jada Newton",97,"dui.quis@protonmail.org"),
  ("Cally Q. Cote",41,"lacinia.at@outlook.ca"),
  ("Adena Dyer",79,"cursus@icloud.org"),
  ("Salvador A. Cooper",87,"mauris@google.couk"),
  ("Abdul Y. Blevins",18,"metus@protonmail.ca");
INSERT INTO `clientes` (`nome_cliente`,`idade_cliente`,`email_cliente`)
VALUES
  ("Evelyn Joyner",37,"nullam.feugiat@outlook.couk"),
  ("Dalton U. Knight",100,"libero.morbi@protonmail.net"),
  ("Colton X. Moss",30,"quisque.ac.libero@google.net"),
  ("Keaton C. Miller",62,"id.erat.etiam@aol.com"),
  ("Vernon Park",21,"sed.auctor@yahoo.org"),
  ("Megan Maldonado",98,"lacus.quisque@icloud.couk"),
  ("Martha X. Burgess",42,"nulla.interdum.curabitur@icloud.net"),
  ("Camilla Kirkland",54,"ut.pellentesque@aol.couk"),
  ("Christine N. Frost",80,"pharetra@hotmail.couk"),
  ("Preston Stephenson",59,"lacus.ut@aol.couk");
INSERT INTO `clientes` (`nome_cliente`,`idade_cliente`,`email_cliente`)
VALUES
  ("Acton Edwards",79,"amet.diam.eu@google.org"),
  ("Stacy Finch",80,"id.risus@icloud.org"),
  ("Yvette I. Bonner",99,"lectus.sit@yahoo.edu"),
  ("Hasad Wright",53,"suspendisse@protonmail.ca"),
  ("Fulton A. Santana",65,"augue.ac@yahoo.ca"),
  ("Regan Gordon",43,"est.arcu@outlook.edu"),
  ("Sacha O. Clark",72,"ligula.donec@yahoo.net"),
  ("Libby Dixon",35,"lacus.etiam@aol.net"),
  ("Timon Wilson",96,"magna.praesent.interdum@protonmail.com"),
  ("Aiko Meadows",20,"mauris.sapien@hotmail.couk");
INSERT INTO `clientes` (`nome_cliente`,`idade_cliente`,`email_cliente`)
VALUES
  ("Sybill F. Kim",44,"enim.commodo@yahoo.org"),
  ("Graham Riddle",22,"accumsan.neque.et@aol.couk"),
  ("Hayley K. Goff",50,"arcu.ac.orci@google.net"),
  ("Harper Underwood",88,"euismod.ac.fermentum@outlook.edu"),
  ("Maite N. Brown",64,"mi.tempor.lorem@google.couk"),
  ("Lani J. Ortega",82,"ligula@yahoo.couk"),
  ("Laurel Ramos",86,"dolor.vitae.dolor@protonmail.com"),
  ("Angelica Villarreal",54,"euismod.urna@icloud.edu"),
  ("Reese Patterson",30,"sed.libero@hotmail.ca"),
  ("Tyrone O. Conner",41,"porttitor.tellus@protonmail.ca");
INSERT INTO `clientes` (`nome_cliente`,`idade_cliente`,`email_cliente`)
VALUES
  ("Malik F. Shields",37,"elementum.sem@aol.couk"),
  ("Elizabeth C. Klein",40,"cursus.in@icloud.net"),
  ("Veda S. Dillard",92,"eros.non@google.edu"),
  ("Camden David",61,"enim.nisl@icloud.net"),
  ("Cailin W. Hooper",62,"ac.urna@google.net"),
  ("Brenna F. Weber",71,"mauris.vel.turpis@icloud.net"),
  ("Fleur Sheppard",74,"nam.porttitor.scelerisque@aol.com"),
  ("Vance Lyons",21,"sem.nulla@protonmail.net"),
  ("Lev Morin",49,"tempus.non@hotmail.net"),
  ("Fallon H. Guzman",64,"dolor@outlook.net");
INSERT INTO `clientes` (`nome_cliente`,`idade_cliente`,`email_cliente`)
VALUES
  ("Wyoming A. Levy",75,"elementum.sem@aol.couk"),
  ("Gemma Mcmillan",26,"nulla.tempor.augue@yahoo.ca"),
  ("Illiana Tran",53,"proin@hotmail.edu"),
  ("Paul Blankenship",34,"at@outlook.org"),
  ("Denise N. Sellers",88,"parturient.montes@protonmail.ca"),
  ("Serena Morse",35,"et.ultrices.posuere@hotmail.org"),
  ("Aretha A. Kirkland",40,"euismod.ac.fermentum@aol.couk"),
  ("Avram York",73,"feugiat@protonmail.com"),
  ("Thaddeus C. Singleton",60,"tincidunt.neque@aol.edu"),
  ("Jaime G. Lester",69,"maecenas@aol.edu");
INSERT INTO `clientes` (`nome_cliente`,`idade_cliente`,`email_cliente`)
VALUES
  ("Regan Q. Garner",61,"lacinia@outlook.org"),
  ("Regan R. Miles",34,"dui@protonmail.net"),
  ("Melodie Sexton",95,"ullamcorper.magna.sed@google.ca"),
  ("Elmo Mejia",52,"imperdiet.ullamcorper.duis@protonmail.net"),
  ("Simone Nicholson",49,"fusce@google.edu"),
  ("MacKensie Stout",77,"lorem.ipsum@protonmail.couk"),
  ("Aaron X. Ayala",72,"tellus.imperdiet@outlook.couk"),
  ("Darius Mullen",76,"posuere.cubilia.curae@hotmail.net"),
  ("Timothy H. Mckenzie",35,"lectus@yahoo.org"),
  ("Martin S. Nolan",48,"elit.fermentum.risus@outlook.edu");
INSERT INTO `clientes` (`nome_cliente`,`idade_cliente`,`email_cliente`)
VALUES
  ("Armand H. Patterson",60,"sociis@outlook.org"),
  ("Matthew Haney",67,"nunc.ac.sem@protonmail.net"),
  ("Mufutau F. Levy",22,"pede.sagittis@aol.org"),
  ("Kitra Pugh",85,"nam.tempor.diam@google.couk"),
  ("Castor Mckenzie",49,"in.consectetuer.ipsum@hotmail.couk"),
  ("Nerea D. Davis",20,"velit.pellentesque@protonmail.ca"),
  ("Hayden P. Dodson",18,"ultrices@protonmail.net"),
  ("Imani Gilmore",54,"eget.ipsum.donec@hotmail.couk"),
  ("Shana Flores",50,"laoreet.libero@yahoo.com"),
  ("Fulton Rios",55,"nunc.ullamcorper@icloud.edu");
INSERT INTO `clientes` (`nome_cliente`,`idade_cliente`,`email_cliente`)
VALUES
  ("Wynne Montgomery",56,"auctor.ullamcorper.nisl@protonmail.ca"),
  ("Urielle K. Bright",61,"cum.sociis@icloud.org"),
  ("Callum I. Dickerson",21,"orci@google.edu"),
  ("Jillian B. Saunders",28,"pharetra.nam.ac@aol.edu"),
  ("Althea Blair",41,"pede.et@protonmail.couk"),
  ("Owen Chase",76,"proin@yahoo.org"),
  ("Garrett Noel",98,"pharetra.ut@icloud.com"),
  ("Cody Watkins",98,"pretium.et@outlook.com"),
  ("Myles M. Herman",46,"enim.curabitur@aol.edu"),
  ("Isaiah Hutchinson",48,"ac.sem@hotmail.org");
INSERT INTO `clientes` (`nome_cliente`,`idade_cliente`,`email_cliente`)
VALUES
  ("Alden Parker",58,"lectus.justo@protonmail.edu"),
  ("Ila O'Neill",99,"volutpat@yahoo.com"),
  ("Levi Hardin",56,"sit@hotmail.couk"),
  ("Callum Harper",48,"etiam.laoreet.libero@icloud.ca"),
  ("Abra F. Black",81,"rhoncus.proin@icloud.net"),
  ("Charissa F. Mercer",30,"magna@icloud.org"),
  ("Lynn Burnett",92,"porttitor.vulputate@google.net"),
  ("Colin Molina",28,"ut@aol.org"),
  ("Rhea X. Day",31,"ullamcorper.nisl.arcu@yahoo.edu"),
  ("Wilma J. Munoz",92,"morbi.metus.vivamus@aol.ca");
INSERT INTO `clientes` (`nome_cliente`,`idade_cliente`,`email_cliente`)
VALUES
  ("Russell Miller",25,"elementum.at.egestas@hotmail.org"),
  ("Darius Chavez",18,"faucibus.orci.luctus@aol.org"),
  ("Willow F. Estes",27,"eu.nibh@hotmail.edu"),
  ("TaShya Herrera",34,"nibh.quisque@yahoo.org"),
  ("Christian V. Sheppard",28,"hendrerit.neque.in@icloud.net"),
  ("Danielle O. Hunt",69,"integer@aol.couk"),
  ("Lesley M. Heath",69,"consectetuer.euismod@google.couk"),
  ("Paula L. Johns",21,"malesuada@yahoo.net"),
  ("Zorita S. Rollins",31,"quam.elementum.at@outlook.couk"),
  ("Rafael Hickman",76,"amet.diam@yahoo.edu");
INSERT INTO `clientes` (`nome_cliente`,`idade_cliente`,`email_cliente`)
VALUES
  ("Mannix O. Justice",35,"penatibus.et@protonmail.edu"),
  ("Paki D. Wilkins",48,"quam.curabitur@protonmail.couk"),
  ("Jaime B. Davenport",65,"mi.duis@aol.com"),
  ("Chester P. Dean",43,"donec.tempus@outlook.couk"),
  ("Shelly V. Knight",47,"interdum.nunc.sollicitudin@yahoo.com"),
  ("Larissa Y. Carson",53,"enim.etiam.imperdiet@yahoo.ca"),
  ("Sopoline V. Fox",77,"ante.blandit.viverra@icloud.couk"),
  ("Uriah Dominguez",40,"imperdiet.ornare.in@google.edu"),
  ("Dean Duran",90,"libero@aol.ca"),
  ("Duncan G. Guerra",84,"parturient.montes@google.org");
INSERT INTO `clientes` (`nome_cliente`,`idade_cliente`,`email_cliente`)
VALUES
  ("Reece Castaneda",44,"auctor.nunc.nulla@google.edu"),
  ("Bradley Burch",22,"non.ante@outlook.com"),
  ("Hiram L. Haney",67,"molestie.sed.id@hotmail.net"),
  ("Karleigh Bruce",36,"ut.nisi@outlook.couk"),
  ("Hector R. Foster",100,"augue.eu@outlook.net"),
  ("Stephen O. Macdonald",75,"felis.ullamcorper@protonmail.com"),
  ("Curran C. Boyd",85,"semper@yahoo.net"),
  ("Duncan U. Pacheco",43,"mauris@google.org"),
  ("Dexter C. Clay",65,"posuere.cubilia.curae@aol.edu"),
  ("William Suarez",79,"aenean.eget@google.ca");
INSERT INTO `clientes` (`nome_cliente`,`idade_cliente`,`email_cliente`)
VALUES
  ("Lawrence Olson",25,"montes@aol.net"),
  ("Maile V. Potter",77,"et.magnis.dis@icloud.net"),
  ("Kato Edwards",61,"at.nisi.cum@icloud.edu"),
  ("Zeus Hyde",81,"id.risus@yahoo.ca"),
  ("Jael Reese",71,"nulla.tincidunt@protonmail.org"),
  ("Melissa K. Dalton",50,"tortor.nibh@outlook.net"),
  ("Ivan Pope",79,"fusce.mi@protonmail.net"),
  ("Quynn X. Thomas",63,"nunc@google.couk"),
  ("Noah Copeland",54,"risus.a.ultricies@hotmail.edu"),
  ("Emmanuel I. O'connor",91,"vitae.mauris@aol.edu");
INSERT INTO `clientes` (`nome_cliente`,`idade_cliente`,`email_cliente`)
VALUES
  ("Lee R. Faulkner",96,"tellus.justo@aol.org"),
  ("Hoyt B. Payne",94,"dolor.nonummy.ac@google.org"),
  ("Dolan P. Puckett",36,"elementum.at@aol.ca"),
  ("Jordan Maxwell",87,"nulla.aliquet@google.ca"),
  ("Joan Frost",70,"mauris.blandit@protonmail.net"),
  ("Brielle Palmer",83,"at@icloud.couk"),
  ("Alexis R. Carson",35,"aliquam.eu@icloud.couk"),
  ("Mona Clayton",73,"urna.ut@protonmail.couk"),
  ("Meredith Wade",45,"velit.pellentesque.ultricies@icloud.ca"),
  ("Chaney Ortega",55,"sapien.gravida.non@google.net");
INSERT INTO `clientes` (`nome_cliente`,`idade_cliente`,`email_cliente`)
VALUES
  ("Linus N. Potter",24,"suspendisse.sed@icloud.couk"),
  ("Callum Gay",88,"sociis.natoque@yahoo.net"),
  ("Acton C. Bates",29,"nunc@icloud.edu"),
  ("Isaiah V. Hickman",83,"neque.morbi.quis@yahoo.couk"),
  ("Jerry E. Wallace",96,"risus.quis@icloud.couk"),
  ("Conan Z. Reyes",27,"ipsum.sodales.purus@yahoo.ca"),
  ("Maite E. Stafford",63,"velit@outlook.com"),
  ("Davis Small",29,"maecenas.iaculis@icloud.ca"),
  ("Quentin Evans",18,"ultricies.sem.magna@hotmail.ca"),
  ("Ivana Hartman",21,"mi.lorem@protonmail.ca");
INSERT INTO `clientes` (`nome_cliente`,`idade_cliente`,`email_cliente`)
VALUES
  ("Declan Turner",94,"metus@google.edu"),
  ("Vladimir P. Mcknight",30,"ultrices.duis@aol.edu"),
  ("Reece Lindsey",74,"nec@aol.org"),
  ("Thane F. Bolton",32,"nascetur@yahoo.net"),
  ("Emerson Wynn",86,"ipsum.sodales.purus@icloud.ca"),
  ("Alice Day",43,"consequat.purus@icloud.org"),
  ("Garrison Z. Baker",27,"curabitur.vel.lectus@icloud.net"),
  ("Kirby B. Prince",72,"nibh.quisque@icloud.net"),
  ("Isabelle Nash",68,"phasellus.in@aol.ca"),
  ("Reed B. Hampton",88,"vulputate.posuere.vulputate@aol.ca");
INSERT INTO `clientes` (`nome_cliente`,`idade_cliente`,`email_cliente`)
VALUES
  ("Ezra Woods",66,"auctor.non@hotmail.org"),
  ("Cheyenne Golden",62,"porttitor.eros.nec@icloud.com"),
  ("Sopoline Osborn",94,"cum.sociis@hotmail.edu"),
  ("Kirsten Pearson",75,"purus.maecenas@aol.com"),
  ("Harper Joyce",89,"eget.metus@icloud.org"),
  ("Yetta Mcdowell",43,"adipiscing.ligula@icloud.couk"),
  ("Lunea G. Contreras",54,"dui.fusce@hotmail.ca"),
  ("Blaze Flowers",92,"fermentum.arcu@outlook.ca"),
  ("Ulric C. Hodges",63,"proin.eget@icloud.net"),
  ("Vivien Charles",94,"sed.pede@protonmail.org");
INSERT INTO `clientes` (`nome_cliente`,`idade_cliente`,`email_cliente`)
VALUES
  ("Chancellor Blake",42,"egestas@hotmail.couk"),
  ("Joan Finley",89,"natoque.penatibus@hotmail.org"),
  ("Tana Hanson",95,"magna.cras.convallis@protonmail.org"),
  ("Gretchen O. Bowers",25,"fusce.aliquam@aol.ca"),
  ("Lucas Stanley",91,"nunc.ullamcorper@outlook.org"),
  ("Jasper H. Keller",76,"dui.fusce@google.org"),
  ("Leonard Lancaster",49,"pharetra@icloud.net"),
  ("Cara Gentry",83,"montes.nascetur@protonmail.com"),
  ("Stacy Church",49,"id@yahoo.com"),
  ("Kyle Mcmillan",45,"mauris.nulla.integer@hotmail.com");
INSERT INTO `clientes` (`nome_cliente`,`idade_cliente`,`email_cliente`)
VALUES
  ("Yoshio Dennis",39,"dis@google.ca"),
  ("Jeanette N. Chen",39,"nunc.sit.amet@outlook.edu"),
  ("Rebecca L. Robles",65,"aliquam@icloud.ca"),
  ("Maxwell I. Greer",52,"adipiscing.elit.aliquam@icloud.ca"),
  ("Austin Salinas",84,"non.massa@icloud.edu"),
  ("Vincent R. Alston",84,"nunc.mauris@google.com"),
  ("Austin G. Nicholson",81,"duis.risus@outlook.edu"),
  ("Colton K. Mcguire",53,"interdum@hotmail.com"),
  ("Bradley Hoffman",99,"quam.vel@google.com"),
  ("Micah X. Conrad",49,"sodales.mauris.blandit@hotmail.com");
INSERT INTO `clientes` (`nome_cliente`,`idade_cliente`,`email_cliente`)
VALUES
  ("Stephanie S. Burgess",76,"nec.quam@outlook.couk"),
  ("Oscar F. Stephenson",81,"viverra.maecenas.iaculis@protonmail.edu"),
  ("Sawyer A. Murphy",50,"lectus.a.sollicitudin@outlook.com"),
  ("Naida Vinson",29,"ante.bibendum@google.net"),
  ("Kirk Finley",54,"mauris.suspendisse@icloud.ca"),
  ("Driscoll S. Everett",21,"elit.fermentum.risus@google.ca"),
  ("Nina Craft",64,"metus.in@aol.org"),
  ("Raya Banks",36,"dictum@google.org"),
  ("Alisa Kennedy",75,"magna.nam@icloud.net"),
  ("Jolie Barton",41,"risus@google.net");
INSERT INTO `clientes` (`nome_cliente`,`idade_cliente`,`email_cliente`)
VALUES
  ("Teagan M. Foster",19,"amet.nulla@hotmail.com"),
  ("Dante Le",88,"dolor.donec@protonmail.edu"),
  ("Chandler Giles",67,"tempor.arcu@google.com"),
  ("Deacon Steele",91,"phasellus@icloud.couk"),
  ("Christian Q. Chapman",20,"ut.sem.nulla@outlook.ca"),
  ("Quentin Boyer",54,"ipsum.porta.elit@hotmail.com"),
  ("Maxwell B. Bruce",18,"lorem.tristique@hotmail.net"),
  ("Raymond F. Rogers",64,"consectetuer.euismod@protonmail.edu"),
  ("Sade D. Barnett",47,"eleifend.egestas@outlook.net"),
  ("Evangeline W. Harding",60,"auctor.non.feugiat@hotmail.org");
INSERT INTO `clientes` (`nome_cliente`,`idade_cliente`,`email_cliente`)
VALUES
  ("Burke T. Hays",69,"mauris.sagittis.placerat@google.edu"),
  ("Hakeem G. Puckett",79,"diam@outlook.ca"),
  ("Aline Ramirez",76,"cubilia@protonmail.couk"),
  ("Amir F. Ross",57,"sociis@aol.edu"),
  ("Xanthus Roth",56,"fermentum.metus@yahoo.edu"),
  ("Rylee V. Mckee",26,"nostra.per@aol.com"),
  ("Moana L. England",58,"enim@protonmail.edu"),
  ("Summer K. Wolfe",85,"dictum.magna.ut@outlook.com"),
  ("Barclay O. Bass",59,"pulvinar.arcu@aol.ca"),
  ("Owen B. Frederick",30,"vel.mauris.integer@google.com");
INSERT INTO `clientes` (`nome_cliente`,`idade_cliente`,`email_cliente`)
VALUES
  ("Cain M. Gilbert",89,"a.felis.ullamcorper@protonmail.edu"),
  ("Xenos White",96,"sed@icloud.net"),
  ("Madaline I. Jennings",30,"feugiat.non@outlook.edu"),
  ("Katell Dixon",49,"ut.quam@icloud.org"),
  ("Octavius Thompson",80,"bibendum.ullamcorper@aol.org"),
  ("Mannix Lindsey",51,"cras.sed@icloud.net"),
  ("Colby Glass",41,"sed.nulla@icloud.ca"),
  ("Baxter Mccall",99,"velit@yahoo.ca"),
  ("Kiayada Travis",45,"nullam.vitae@outlook.net"),
  ("Dominic Harrison",36,"eleifend@google.com");
INSERT INTO `clientes` (`nome_cliente`,`idade_cliente`,`email_cliente`)
VALUES
  ("Jackson Perez",46,"nam@hotmail.couk"),
  ("Xaviera Z. Mcknight",54,"luctus.et@outlook.edu"),
  ("Xaviera B. Cantu",75,"cum.sociis@outlook.ca"),
  ("Daryl H. Dunlap",76,"libero.proin@hotmail.edu"),
  ("Blake R. Nielsen",77,"dolor.tempus@yahoo.net"),
  ("Kai Rosales",32,"purus.ac@icloud.edu"),
  ("Amery T. Holcomb",58,"ligula.donec@icloud.org"),
  ("Ashton X. Mullen",80,"egestas.hendrerit.neque@protonmail.edu"),
  ("Hayden Santana",22,"aliquet@aol.com"),
  ("Nissim F. Lang",39,"ipsum.dolor@icloud.net");
INSERT INTO `clientes` (`nome_cliente`,`idade_cliente`,`email_cliente`)
VALUES
  ("Howard D. Stevenson",53,"ullamcorper.magna@google.com"),
  ("Kimberly Horton",70,"mauris.vestibulum@hotmail.net"),
  ("Hamilton Hooper",79,"neque.in.ornare@aol.com"),
  ("Fuller Potts",59,"tempor.bibendum@icloud.edu"),
  ("Irma Talley",74,"sed.neque@aol.net"),
  ("Uriel R. Morrow",24,"natoque.penatibus.et@protonmail.com"),
  ("Ingrid Robertson",88,"ultrices.a@icloud.couk"),
  ("Naida V. Slater",79,"dui.in.sodales@aol.couk"),
  ("Thor J. Nielsen",40,"vel.faucibus@yahoo.net"),
  ("Chelsea Booth",35,"fusce.fermentum@outlook.ca");
INSERT INTO `clientes` (`nome_cliente`,`idade_cliente`,`email_cliente`)
VALUES
  ("Evan Banks",59,"cras.dolor@aol.couk"),
  ("Selma Cain",81,"eu@icloud.com"),
  ("Nicholas S. Robinson",54,"nullam@icloud.org"),
  ("Christopher Austin",97,"nonummy.fusce.fermentum@hotmail.org"),
  ("Chase G. Bush",98,"a.ultricies.adipiscing@outlook.com"),
  ("Simon S. Simpson",65,"ridiculus.mus.aenean@yahoo.edu"),
  ("Ethan T. Hurley",57,"tincidunt.congue.turpis@aol.ca"),
  ("Erin Nguyen",31,"nec@yahoo.edu"),
  ("Brady Talley",79,"ultrices@google.org"),
  ("Jorden Hudson",25,"consectetuer@aol.ca");
INSERT INTO `clientes` (`nome_cliente`,`idade_cliente`,`email_cliente`)
VALUES
  ("Vanna Hammond",28,"integer@outlook.com"),
  ("Felix Bass",88,"ultricies.dignissim@icloud.ca"),
  ("Barclay Wagner",89,"dui@outlook.couk"),
  ("Murphy Blake",92,"cum.sociis@hotmail.org"),
  ("Lee H. Lane",22,"dolor.sit@yahoo.ca"),
  ("Francis Mendoza",30,"sed.eu.nibh@icloud.net"),
  ("Thane Mcintosh",40,"accumsan@aol.com"),
  ("Ferdinand Blanchard",52,"morbi.sit.amet@yahoo.org"),
  ("Lars N. Farmer",70,"purus.accumsan@aol.edu"),
  ("Brett Sloan",27,"pellentesque.eget.dictum@aol.org");
INSERT INTO `clientes` (`nome_cliente`,`idade_cliente`,`email_cliente`)
VALUES
  ("Lacey Walker",29,"vel@google.net"),
  ("Tiger Z. Baker",35,"orci@icloud.edu"),
  ("Hyacinth J. Kent",69,"mauris.vel@outlook.org"),
  ("Allistair Chang",99,"molestie.tortor@google.couk"),
  ("Harper Bullock",30,"fusce.mollis.duis@google.org"),
  ("Duncan X. Butler",88,"convallis@yahoo.edu"),
  ("Rinah Munoz",26,"orci.ut.semper@google.edu"),
  ("Bevis Leblanc",32,"felis.nulla@hotmail.com"),
  ("Karleigh Fox",46,"metus.urna@yahoo.couk"),
  ("Kirsten H. Leon",98,"nibh@aol.com");
INSERT INTO `clientes` (`nome_cliente`,`idade_cliente`,`email_cliente`)
VALUES
  ("Kenyon G. Park",99,"velit.sed@outlook.com"),
  ("Wylie F. Chaney",64,"gravida@aol.net"),
  ("Indira U. Schneider",33,"curabitur.vel@yahoo.ca"),
  ("Jeanette Dudley",77,"nam.ac@outlook.ca"),
  ("Lucas K. Paul",55,"sem@google.com"),
  ("Candice Hancock",57,"vitae@icloud.edu"),
  ("Moana Q. Larson",78,"mauris.ipsum.porta@google.ca"),
  ("Benedict G. Burgess",47,"purus.nullam@outlook.com"),
  ("Tamekah Hart",33,"posuere.cubilia@protonmail.ca"),
  ("Armand F. Maxwell",41,"id.nunc@hotmail.org");
INSERT INTO `clientes` (`nome_cliente`,`idade_cliente`,`email_cliente`)
VALUES
  ("Uriah Vaughan",53,"malesuada.malesuada@google.org"),
  ("William Stuart",53,"in.nec.orci@yahoo.ca"),
  ("Ralph Dudley",84,"vitae.diam.proin@aol.net"),
  ("Hayfa S. Kline",38,"metus.aliquam@hotmail.org"),
  ("Bertha X. May",99,"placerat@aol.couk"),
  ("Bruce Parks",82,"nec.urna@protonmail.couk"),
  ("Timothy Gibbs",67,"bibendum@yahoo.couk"),
  ("Quintessa Holt",30,"diam.pellentesque.habitant@yahoo.couk"),
  ("Ross Ochoa",63,"nec.tempus@google.com"),
  ("Vivien R. Erickson",20,"tellus.phasellus.elit@aol.couk");
INSERT INTO `clientes` (`nome_cliente`,`idade_cliente`,`email_cliente`)
VALUES
  ("Kenyon Mcpherson",55,"vitae.odio@icloud.ca"),
  ("Priscilla Landry",50,"tincidunt.dui.augue@icloud.edu"),
  ("Tatyana Donovan",71,"duis.cursus@protonmail.ca"),
  ("Angela Lang",45,"nunc@aol.couk"),
  ("Regina T. Hurley",90,"vestibulum.nec@aol.couk"),
  ("Ray Kirkland",40,"risus.nulla@outlook.couk"),
  ("Irma Hess",63,"mauris.integer.sem@hotmail.edu"),
  ("Malachi Wynn",60,"in.tincidunt.congue@google.ca"),
  ("Nita Bell",69,"euismod.urna@yahoo.edu"),
  ("Todd D. Mosley",87,"ornare.facilisis@protonmail.edu");
INSERT INTO `clientes` (`nome_cliente`,`idade_cliente`,`email_cliente`)
VALUES
  ("Laura L. Sellers",24,"nonummy.fusce@protonmail.ca"),
  ("Deacon Benton",63,"adipiscing@icloud.ca"),
  ("Ronan Kirkland",25,"vehicula@outlook.org"),
  ("Anika N. Alvarado",79,"libero.proin@icloud.edu"),
  ("Mohammad Knowles",97,"lacinia.mattis@yahoo.net"),
  ("Cole Robinson",41,"nunc.ac@outlook.com"),
  ("Jeanette Carrillo",41,"ut@google.net"),
  ("Sigourney Vang",88,"elementum.lorem.ut@google.couk"),
  ("Bertha S. Solomon",96,"suspendisse.sed@hotmail.couk"),
  ("Jenna V. Mcintyre",55,"phasellus.ornare.fusce@icloud.edu");
INSERT INTO `clientes` (`nome_cliente`,`idade_cliente`,`email_cliente`)
VALUES
  ("Medge O. Rowland",86,"ultricies.dignissim.lacus@outlook.ca"),
  ("Mara Rodriguez",87,"nulla.at@icloud.couk"),
  ("Lareina White",49,"vulputate.eu@google.couk"),
  ("Hillary R. Sherman",22,"scelerisque@outlook.ca"),
  ("Hayes J. Craft",49,"in.consequat@yahoo.edu"),
  ("Calvin Christensen",65,"sodales.purus@outlook.net"),
  ("Fleur Woodward",46,"porttitor.vulputate@hotmail.ca"),
  ("Ursula G. Mcfarland",86,"gravida@outlook.com"),
  ("Morgan X. Petty",64,"ipsum.nunc@protonmail.net"),
  ("Lael Barrera",21,"rhoncus@outlook.com");
INSERT INTO `clientes` (`nome_cliente`,`idade_cliente`,`email_cliente`)
VALUES
  ("Hyacinth Bowman",63,"facilisi.sed@hotmail.edu"),
  ("Ali Lopez",99,"integer.sem.elit@hotmail.net"),
  ("Summer R. Arnold",53,"dui.in@outlook.couk"),
  ("Dillon F. Rasmussen",53,"neque.vitae.semper@google.com"),
  ("Dillon J. Woods",40,"ut.quam@outlook.org"),
  ("Branden Johns",46,"massa@aol.edu"),
  ("MacKenzie Wyatt",31,"arcu.vestibulum@aol.ca"),
  ("Buckminster Gross",97,"nec.quam@hotmail.ca"),
  ("Lillian S. Phillips",94,"tellus.faucibus@google.com"),
  ("Samuel D. Estes",63,"phasellus.dolor@hotmail.ca");
INSERT INTO `clientes` (`nome_cliente`,`idade_cliente`,`email_cliente`)
VALUES
  ("Logan Flores",83,"enim.diam@aol.com"),
  ("Colin H. Wall",44,"enim.etiam@google.net"),
  ("Scarlet G. Eaton",72,"sed.hendrerit@outlook.couk"),
  ("Chase Y. Dean",71,"dictum.eu.placerat@yahoo.com"),
  ("Chantale J. Bradley",42,"sem.semper@aol.net"),
  ("Akeem Mcintyre",39,"metus.in@aol.couk"),
  ("Molly Y. Frank",57,"tempor.est@icloud.net"),
  ("Jerome Petersen",92,"accumsan@hotmail.com"),
  ("Sacha Kennedy",56,"ac@icloud.org"),
  ("Anastasia Z. Maxwell",93,"fusce@google.edu");
INSERT INTO `clientes` (`nome_cliente`,`idade_cliente`,`email_cliente`)
VALUES
  ("Guinevere Mathews",22,"suspendisse.aliquet@hotmail.ca"),
  ("Myra K. Galloway",66,"elit.aliquam@hotmail.couk"),
  ("Lareina R. Salinas",60,"commodo.hendrerit@yahoo.net"),
  ("Gwendolyn K. Gomez",95,"placerat.velit@outlook.net"),
  ("Vernon S. Ayers",46,"vivamus.rhoncus.donec@outlook.net"),
  ("Orlando L. Osborn",45,"vel.convallis@icloud.org"),
  ("Nigel Barnett",37,"scelerisque.scelerisque@google.com"),
  ("Merrill V. Beasley",47,"in.felis@yahoo.net"),
  ("Zia W. Ray",91,"non.sapien@yahoo.edu"),
  ("Amity Moran",48,"dolor.fusce.mi@outlook.couk");
INSERT INTO `clientes` (`nome_cliente`,`idade_cliente`,`email_cliente`)
VALUES
  ("Thomas V. Huff",21,"duis.gravida@outlook.ca"),
  ("Halla N. Cook",61,"aliquet.molestie.tellus@yahoo.edu"),
  ("Malachi Reilly",20,"per.conubia@hotmail.org"),
  ("Ingrid Hammond",28,"amet.ornare@outlook.net"),
  ("Kato House",47,"sit.amet.ante@icloud.ca"),
  ("Gannon Henson",99,"phasellus.dolor@protonmail.net"),
  ("Medge J. Mcbride",49,"elit.curabitur@aol.couk"),
  ("Lenore C. Valentine",42,"cursus@outlook.ca"),
  ("Ciaran S. Clemons",83,"ornare.facilisis@yahoo.org"),
  ("Noelani X. Brennan",57,"fermentum.fermentum.arcu@yahoo.net");
INSERT INTO `clientes` (`nome_cliente`,`idade_cliente`,`email_cliente`)
VALUES
  ("Adrienne A. Workman",74,"diam.proin@google.org"),
  ("Sigourney N. Stephenson",76,"condimentum.donec.at@outlook.net"),
  ("Jasmine D. Mason",87,"bibendum.sed@aol.couk"),
  ("Samuel Robles",73,"fringilla@protonmail.edu"),
  ("Aurora Barnett",73,"quis@aol.com"),
  ("Honorato Blanchard",67,"vestibulum.lorem.sit@yahoo.com"),
  ("Warren W. Levine",43,"per@aol.edu"),
  ("Murphy Gay",48,"enim.commodo.hendrerit@icloud.net"),
  ("Phoebe Knight",92,"ut.aliquam.iaculis@hotmail.edu"),
  ("Leslie G. Pratt",47,"semper@yahoo.couk");
INSERT INTO `clientes` (`nome_cliente`,`idade_cliente`,`email_cliente`)
VALUES
  ("Elliott Abbott",29,"fermentum.vel.mauris@yahoo.ca"),
  ("Adam Bray",54,"in.lorem@hotmail.couk"),
  ("Abraham V. Holman",72,"curabitur@hotmail.edu"),
  ("Aquila I. Moran",31,"adipiscing@yahoo.edu"),
  ("Hannah Rowe",95,"aliquet.odio@icloud.couk"),
  ("Zelenia Mcleod",54,"arcu.imperdiet.ullamcorper@yahoo.net"),
  ("Wang X. Gross",95,"non.massa@aol.ca"),
  ("Emerald Y. Hubbard",56,"ut.eros.non@protonmail.com"),
  ("Shad Bruce",26,"ornare.lectus@aol.com"),
  ("Jonas Rosa",25,"donec@icloud.net");
INSERT INTO `clientes` (`nome_cliente`,`idade_cliente`,`email_cliente`)
VALUES
  ("Dacey X. Snow",30,"id.ante@outlook.couk"),
  ("Kimberley Y. O'brien",45,"faucibus@yahoo.ca"),
  ("Judah Salas",65,"ultrices.vivamus@icloud.org"),
  ("Amos Wyatt",93,"mollis.nec@icloud.ca"),
  ("Paloma Lyons",29,"tellus.id@aol.edu"),
  ("Jordan E. Bush",37,"in.condimentum@hotmail.net"),
  ("Juliet J. Barrera",32,"vulputate.mauris@aol.net"),
  ("Abraham Olson",53,"egestas.a.scelerisque@icloud.ca"),
  ("Tamekah V. Powell",72,"tincidunt.orci@protonmail.com"),
  ("Rahim C. Rocha",92,"nulla.dignissim.maecenas@aol.couk");
INSERT INTO `clientes` (`nome_cliente`,`idade_cliente`,`email_cliente`)
VALUES
  ("Wayne S. Dillard",90,"nunc.ullamcorper@protonmail.com"),
  ("Kane L. Gilbert",55,"accumsan@outlook.net"),
  ("Kelly Hebert",44,"phasellus@protonmail.net"),
  ("Keith I. Montoya",70,"convallis.ante.lectus@protonmail.com"),
  ("Jada Callahan",29,"a.sollicitudin.orci@aol.couk"),
  ("Miriam S. French",54,"sit.amet.diam@hotmail.net"),
  ("Joel Romero",94,"quisque.imperdiet@aol.org"),
  ("Lucius Bright",62,"tellus.lorem@google.edu"),
  ("Price Morse",72,"eu.tellus@aol.ca"),
  ("Mikayla Lang",55,"vulputate.eu@outlook.ca");
INSERT INTO `clientes` (`nome_cliente`,`idade_cliente`,`email_cliente`)
VALUES
  ("Miriam Z. Potts",67,"velit.justo@yahoo.com"),
  ("Maris Reese",74,"tempor.lorem.eget@google.com"),
  ("Fay E. Landry",29,"convallis.convallis@icloud.couk"),
  ("Macon May",82,"fusce.dolor@google.org"),
  ("TaShya Hughes",89,"est.ac@aol.edu"),
  ("Ciaran Cote",78,"nunc.mauris@protonmail.ca"),
  ("Piper Blackburn",68,"enim@yahoo.com"),
  ("Brody Y. Blair",94,"id.risus@aol.com"),
  ("Raja O. Kaufman",67,"nulla.tincidunt@hotmail.edu"),
  ("Jin Glover",100,"vel@hotmail.com");
INSERT INTO `clientes` (`nome_cliente`,`idade_cliente`,`email_cliente`)
VALUES
  ("Ferdinand Mann",60,"luctus.lobortis.class@aol.net"),
  ("Evangeline A. Dennis",44,"augue@hotmail.ca"),
  ("Raja Sheppard",84,"eleifend.vitae@hotmail.com"),
  ("Ria Hinton",23,"vitae.sodales@outlook.ca"),
  ("Ray B. Barlow",48,"ut.pharetra@google.couk"),
  ("Illana I. Burton",35,"neque.nullam@aol.edu"),
  ("Elaine N. Cannon",47,"at.sem@icloud.edu"),
  ("Shelly Q. Ruiz",73,"bibendum@icloud.net"),
  ("Hasad G. Sanford",23,"justo.faucibus@protonmail.edu"),
  ("Fletcher Galloway",55,"morbi.accumsan@aol.couk");
INSERT INTO `clientes` (`nome_cliente`,`idade_cliente`,`email_cliente`)
VALUES
  ("Gavin H. Sheppard",40,"felis.nulla@outlook.com"),
  ("Yuri Allen",27,"eu.lacus@icloud.com"),
  ("Dacey T. Erickson",72,"vitae.erat@protonmail.org"),
  ("Alika M. Bradshaw",85,"cursus.et@outlook.couk"),
  ("Shelby Malone",92,"auctor.quis@hotmail.com"),
  ("Carly Y. Hull",39,"sed.facilisis@google.ca"),
  ("Scarlett Jackson",70,"vivamus.nisi@google.couk"),
  ("Oprah Larsen",68,"a.magna@hotmail.net"),
  ("Natalie Everett",43,"adipiscing@google.couk"),
  ("Lee Y. Camacho",31,"non.sollicitudin@icloud.edu");
INSERT INTO `clientes` (`nome_cliente`,`idade_cliente`,`email_cliente`)
VALUES
  ("Wanda Ratliff",50,"cursus.integer@yahoo.edu"),
  ("Laurel W. Rodgers",95,"orci.ut@icloud.edu"),
  ("Tamekah Petersen",96,"arcu@protonmail.org"),
  ("Reece E. Finch",92,"semper@hotmail.ca"),
  ("Brandon Schwartz",22,"orci.tincidunt.adipiscing@protonmail.ca"),
  ("Anthony N. Stuart",56,"eu.ligula.aenean@aol.ca"),
  ("Lacota Livingston",40,"dolor.sit@protonmail.couk"),
  ("Quinn I. Austin",89,"tincidunt@aol.org"),
  ("Allegra O. Dudley",94,"eu.euismod@hotmail.org"),
  ("Julian Neal",92,"risus.morbi@hotmail.org");
INSERT INTO `clientes` (`nome_cliente`,`idade_cliente`,`email_cliente`)
VALUES
  ("Xanthus Berry",20,"imperdiet.dictum.magna@yahoo.net"),
  ("Thane Hyde",77,"vulputate.ullamcorper.magna@hotmail.net"),
  ("Jordan K. Quinn",59,"sed.facilisis@yahoo.org"),
  ("Deanna Collier",45,"ultricies.ornare@aol.edu"),
  ("Colt Booker",43,"eget.lacus@google.com"),
  ("Lucian Q. Hebert",75,"nisi.aenean.eget@outlook.edu"),
  ("Wendy W. Camacho",28,"venenatis.lacus.etiam@outlook.org"),
  ("Summer F. Talley",68,"posuere@yahoo.edu"),
  ("Indira Tyler",18,"aenean.eget@hotmail.com"),
  ("Honorato Q. Fuentes",88,"dictum.magna.ut@google.edu");
INSERT INTO `clientes` (`nome_cliente`,`idade_cliente`,`email_cliente`)
VALUES
  ("Murphy W. Hutchinson",84,"accumsan.neque.et@yahoo.edu"),
  ("Jermaine M. Reynolds",48,"vitae.aliquam.eros@aol.org"),
  ("MacKensie A. Slater",34,"vulputate.lacus@hotmail.couk"),
  ("Macaulay F. Poole",40,"nec.malesuada.ut@outlook.net"),
  ("Kellie S. Martin",30,"sociis.natoque.penatibus@aol.edu"),
  ("Celeste Maddox",19,"risus.varius.orci@google.ca"),
  ("Kay Villarreal",29,"orci@google.edu"),
  ("Gregory N. Forbes",97,"eget.magna.suspendisse@aol.couk"),
  ("Solomon Berg",54,"aliquam.auctor.velit@yahoo.net"),
  ("Buckminster X. Cox",71,"massa.rutrum@aol.org");
