
-- sintaxe para criar a database
create database itau;

-- sintaxe para abrir a sessão da database
use itau;

-- sintaxa para criação de tabela de funcionários
create table itau.funcionarios(
id int not null auto_increment primary key, nome_funcionarios varchar(50) not null, idade_funcionarios int not null,
email_funcionarios varchar(80) not null);

-- sintaxe para excluir tabela 
drop table itau.funcionarios;

-- sintaxe para monstrar estrutura da tabela
describe itau.funcionarios;

-- sintaxe para inserir registros na tabela
insert into itau.funcionarios (
nome_funcionarios, idade_funcionarios, email_funcionarios) 
values ('Fabio Meireles',30, 'fabio.m@itau.com.br'),
("Danilo Trindade", 26, "danilo.t@itau.com.br"),
("Ana Duarte", 20, "anaduarte@itau.com.br"),
("Ciro Franco", 39, "ciro.f@itau.com.br"),
("Bruno Rodrigues", 20, "bruno.r@itau.com.br");

-- sintaxe utilizada para consultar os registros da tabela
select * from itau.funcionarios;

-- sintaxe utilizada para consultar somente alguns campos
select nome_funcionarios,email_funcionarios from itau.funcionarios;

-- sintaxe para consultar registros por ordem alfabatica, númerica, crescente ou decrescente
select * from itau.funcionarios order by nome_funcionarios;
select * from itau.funcionarios order by idade_funcionarios desc;

-- sintaxe para consulta direcionada
select * from itau.funcionarios where nome_funcionarios='Felipe';

-- sintaxe de busca de consulta de registros
select * from itau.funcionarios where idade_funcionarios = 18;
select *from itau.funcionarios where idade_funcionarios  >=18 and idade_funcionarios<=19 order by idade_funcionarios asc;
select *from itau.funcionarios where idade_funcionarios  between 18 and 19;

-- sintaxe para obter o funcionario mais velho da nossa tabela
select max(idade_funcionarios) as Maior_idade from itau.funcionarios;
select * from itau.funcionarios where idade_funcionarios = 100;

-- sintaxe para obter o funcionario mais novo da nossa tabela
select min(idade_funcionarios) as Menor_idade from itau.funcionarios;

-- sintaxe para obter dados de um sub-select
select * from itau.funcionarios where idade_funcionarios = (select max(idade_funcionarios) from itau.funcionarios);
select * from itau.funcionarios where idade_funcionarios = (select min(idade_funcionarios) from itau.funcionarios);

-- sintaxe para consulta de dados tipo texto
select * from itau.funcionarios where nome_funcionarios like 'ana%';
select * from itau.funcionarios where nome_funcionarios like '%meireles';
select * from itau.funcionarios where email_funcionarios like '%duarte';

-- sintaxe para fazer a contagem de registros
select count(*) as Total_Registros from itau.funcionarios;
select count(*) as Total_Registros from itau.funcionarios where idade_funcionarios = 18;

-- sintaxe para fazer consulta por quebra de faixa etária
select count(*) as Total_por_Idade, idade_funcionarios from itau.funcionarios where idade_funcionarios group by idade_funcionarios;

-- -------------------------------
use itau;
describe itau.funcionarios;

-- sintaxe utilizada para criar backup
create table itau.bck_funcionarios select * from itau.funcionarios;

select * from itau.bck_funcionarios;
select count(*) from itau.bck_funcionarios;
select count(*) from itau.funcionarios;

-- sintaxe de como renomear um registro
alter table itau.funcionarios rename column id to id_funcionarios;

-- sintaxe para renomear a tabela de um banco de dados
rename table funcionario to funcionarios;

-- sintaxe para fazer a exclusão de registros da tabela
delete from itau.funcionarios where idade_funcionarios <20;
delete from itau.funcionarios where idade_funcionarios <70;
-- verificação
select * from itau.funcionarios where idade_funcionarios <20;

create table itau.marcas( id_marca int not null auto_increment primary key, nome_marca varchar(40) not null);
describe itau.marcas;

create table itau.produtos( id_produto int not null auto_increment, nome_produto varchar (50) not null,
quantidade_produto int not null, valor_produto decimal(8,2) not null, cod_marca_produto int not null, 
primary key (id_produto), foreign key(cod_marca_produto) references marcas(id_marca));

select * from itau.marcas;

insert into itau.marcas (nome_marca) values ('Brastemp'),('Sony'),('Samsung');



select p.nome_produto, p.quantidade_produto, p.valor_produto, m.nome_marca
from itau.marcas as m
inner join itau.produtos as p
on(m.id_marca=p.cod_marca_produto);

insert into itau.produtos (nome_produto, quantidade_produto, valor_produto,cod_marca_produto)
values ('Geladeira', 10, 4999.99, 1);

INSERT INTO `funcionarios` (`nome_funcionarios`,`idade_funcionarios`,`email_funcionarios`)
VALUES
  ("Yvonne Henson",47,"commodo.ipsum.suspendisse@aol.ca"),
  ("Kasper Rogers",28,"magna.tellus.faucibus@yahoo.couk"),
  ("Audrey Morgan",62,"quam.vel@yahoo.couk"),
  ("Mason Small",66,"sapien.cras@outlook.com"),
  ("Jakeem Rivas",67,"sollicitudin@outlook.couk"),
  ("Katelyn Sweet",82,"lacinia.at@hotmail.net"),
  ("Zeph Barron",24,"sit@yahoo.com"),
  ("Driscoll Middleton",75,"arcu@yahoo.org"),
  ("Lucian Nolan",45,"molestie.pharetra.nibh@hotmail.org"),
  ("Cole Short",69,"morbi.quis.urna@hotmail.org");
INSERT INTO `funcionarios` (`nome_funcionarios`,`idade_funcionarios`,`email_funcionarios`)
VALUES
  ("Jescie Barber",21,"est.nunc@aol.edu"),
  ("Eliana Lynch",48,"aliquam.auctor@aol.net"),
  ("Chloe Lindsey",98,"morbi.quis.urna@outlook.ca"),
  ("September Gibson",78,"dui@outlook.ca"),
  ("Ulric Oliver",65,"vel@protonmail.net"),
  ("Reese Dale",21,"ut@google.org"),
  ("Brielle Lambert",43,"scelerisque.mollis@aol.org"),
  ("Kyla Frazier",55,"faucibus.lectus@yahoo.couk"),
  ("Laura Austin",87,"elit.elit@outlook.com"),
  ("Veda Cash",30,"ut.mi@protonmail.com");
INSERT INTO `funcionarios` (`nome_funcionarios`,`idade_funcionarios`,`email_funcionarios`)
VALUES
  ("Ocean Frazier",35,"augue.sed.molestie@outlook.ca"),
  ("Salvador Dillard",56,"lorem.ac.risus@google.org"),
  ("Nicole Hampton",54,"phasellus.elit@aol.edu"),
  ("Travis Potts",37,"arcu.curabitur@hotmail.edu"),
  ("Summer Cline",43,"ligula.nullam.enim@protonmail.ca"),
  ("Simone Morris",86,"faucibus@yahoo.org"),
  ("Lacy Rojas",59,"elit.etiam@hotmail.edu"),
  ("Jarrod Walker",45,"porta.elit@outlook.ca"),
  ("Demetrius Chang",53,"ullamcorper.eu.euismod@outlook.couk"),
  ("Stephen Wooten",94,"enim.suspendisse@protonmail.couk");
INSERT INTO `funcionarios` (`nome_funcionarios`,`idade_funcionarios`,`email_funcionarios`)
VALUES
  ("Louis Mueller",46,"magna.malesuada.vel@icloud.org"),
  ("Beatrice Sheppard",84,"ridiculus.mus@protonmail.org"),
  ("Jael Rios",90,"vitae.posuere.at@aol.couk"),
  ("Jarrod Chandler",39,"proin.eget@google.net"),
  ("Curran Combs",63,"in.magna@aol.edu"),
  ("Clayton Conner",56,"urna.suscipit@icloud.net"),
  ("Emi Ford",47,"fusce.dolor@protonmail.net"),
  ("Isabella Watson",26,"felis.purus@hotmail.com"),
  ("Maisie Berg",43,"molestie@hotmail.edu"),
  ("Teegan Best",40,"nulla.facilisis@yahoo.ca");
INSERT INTO `funcionarios` (`nome_funcionarios`,`idade_funcionarios`,`email_funcionarios`)
VALUES
  ("Unity Graves",30,"ipsum.suspendisse@icloud.couk"),
  ("Yvette Bright",89,"eu@icloud.net"),
  ("Ashely Floyd",88,"nam@protonmail.edu"),
  ("Stephanie Davis",93,"interdum.nunc.sollicitudin@yahoo.couk"),
  ("Leah Hunt",23,"a.sollicitudin.orci@aol.org"),
  ("Ivan Conway",60,"dignissim.maecenas@google.com"),
  ("Graham Wagner",88,"donec@protonmail.couk"),
  ("Clarke Campos",71,"sed@hotmail.edu"),
  ("Rosalyn Cox",33,"mauris.rhoncus@hotmail.net"),
  ("Norman Miles",72,"vestibulum.ut@hotmail.couk");
INSERT INTO `funcionarios` (`nome_funcionarios`,`idade_funcionarios`,`email_funcionarios`)
VALUES
  ("Steven Francis",81,"pharetra.quisque.ac@yahoo.com"),
  ("Uriel Hill",65,"nec.tempus@protonmail.edu"),
  ("Melodie Keller",38,"dolor.quam@icloud.couk"),
  ("Preston Shepard",81,"sit.amet@outlook.com"),
  ("Barclay Bowen",55,"ac@aol.org"),
  ("Linda Pate",29,"at@yahoo.ca"),
  ("Karly Garza",71,"proin@protonmail.org"),
  ("Evan Phelps",22,"erat.neque@aol.net"),
  ("Bree Lamb",82,"egestas@yahoo.net"),
  ("Rinah Merritt",89,"diam.luctus.lobortis@yahoo.ca");
INSERT INTO `funcionarios` (`nome_funcionarios`,`idade_funcionarios`,`email_funcionarios`)
VALUES
  ("Lysandra Kirby",18,"ipsum@hotmail.couk"),
  ("Lani England",30,"donec.egestas@hotmail.couk"),
  ("Megan Irwin",92,"nibh.dolor@icloud.org"),
  ("Marvin Cortez",63,"convallis@aol.org"),
  ("Tanek Haynes",43,"et@outlook.org"),
  ("Denton Guthrie",86,"congue.turpis@protonmail.org"),
  ("Ivan Molina",85,"duis@yahoo.org"),
  ("Giselle Goodman",92,"tincidunt@outlook.couk"),
  ("Raya Willis",24,"et@google.org"),
  ("Riley Cooley",85,"enim.sed.nulla@icloud.net");
INSERT INTO `funcionarios` (`nome_funcionarios`,`idade_funcionarios`,`email_funcionarios`)
VALUES
  ("Odysseus Weber",96,"eget@hotmail.com"),
  ("Mercedes Moran",77,"enim.sit.amet@aol.ca"),
  ("Sean Rodriguez",71,"diam.sed@aol.edu"),
  ("Carlos Blankenship",47,"facilisis.vitae@google.edu"),
  ("Thomas Fletcher",45,"sem.eget.massa@aol.ca"),
  ("Wallace Heath",69,"lacinia.vitae@protonmail.org"),
  ("Jaden Murphy",85,"egestas.duis.ac@aol.edu"),
  ("Oleg Salas",91,"risus.odio@icloud.com"),
  ("Idona Sims",93,"lorem.eu@icloud.ca"),
  ("Dexter Christian",95,"urna@google.com");
INSERT INTO `funcionarios` (`nome_funcionarios`,`idade_funcionarios`,`email_funcionarios`)
VALUES
  ("Anne Floyd",73,"dignissim.maecenas@aol.net"),
  ("Quentin Weiss",75,"condimentum.donec@outlook.com"),
  ("Orlando Combs",60,"vel@google.couk"),
  ("Mona Holmes",53,"nec.luctus.felis@aol.ca"),
  ("Jemima Bruce",67,"purus.mauris@google.org"),
  ("Nichole Reid",98,"litora.torquent.per@google.net"),
  ("Chaim Koch",89,"facilisis.eget@aol.org"),
  ("Colorado Cain",93,"facilisis.vitae.orci@hotmail.edu"),
  ("Micah Shepherd",97,"sit@yahoo.couk"),
  ("Prescott Lloyd",23,"ut.molestie@protonmail.com");
INSERT INTO `funcionarios` (`nome_funcionarios`,`idade_funcionarios`,`email_funcionarios`)
VALUES
  ("Phillip Morin",79,"ullamcorper@icloud.couk"),
  ("Abbot Wilkinson",42,"faucibus.ut@outlook.ca"),
  ("Indira Wilder",86,"eu.placerat@google.edu"),
  ("Penelope Stokes",55,"maecenas.libero@icloud.com"),
  ("Nero Rush",99,"ultrices@yahoo.com"),
  ("Tanek Burch",40,"mi.enim@yahoo.org"),
  ("Halee Rivas",57,"euismod@yahoo.ca"),
  ("Ross Alvarado",61,"nulla.at@icloud.net"),
  ("Vladimir Lester",23,"suspendisse.commodo@google.couk"),
  ("Declan Morrow",21,"nam@protonmail.net");
INSERT INTO `funcionarios` (`nome_funcionarios`,`idade_funcionarios`,`email_funcionarios`)
VALUES
  ("Hedda Reese",28,"aliquet.phasellus@icloud.com"),
  ("Ulla Howell",28,"in.consectetuer@protonmail.org"),
  ("Jarrod Rogers",84,"elementum@protonmail.org"),
  ("Erich Hudson",83,"sollicitudin@yahoo.couk"),
  ("Lacota Page",73,"mi.eleifend@yahoo.edu"),
  ("Thane Bell",47,"pede.cras.vulputate@yahoo.com"),
  ("Georgia Kane",49,"accumsan.sed@aol.net"),
  ("Jaquelyn Browning",54,"vitae.dolor@google.org"),
  ("Castor Hawkins",38,"pellentesque.a.facilisis@aol.com"),
  ("Lesley Wise",62,"aliquet.magna@icloud.edu");
INSERT INTO `funcionarios` (`nome_funcionarios`,`idade_funcionarios`,`email_funcionarios`)
VALUES
  ("Bradley Wilkinson",82,"magna.lorem.ipsum@google.ca"),
  ("Benjamin Short",88,"leo@outlook.couk"),
  ("Drake Richards",100,"orci.luctus@hotmail.couk"),
  ("Hope Diaz",55,"nunc.quisque@icloud.org"),
  ("Wendy Gibbs",97,"inceptos.hymenaeos@aol.edu"),
  ("Xandra West",55,"lobortis.quis@icloud.couk"),
  ("Zane Mendez",96,"libero.mauris@yahoo.org"),
  ("Kessie Myers",57,"non.ante@outlook.net"),
  ("Sierra Park",93,"arcu.eu.odio@hotmail.ca"),
  ("David Pugh",57,"duis.at@icloud.couk");
INSERT INTO `funcionarios` (`nome_funcionarios`,`idade_funcionarios`,`email_funcionarios`)
VALUES
  ("Clare Gregory",42,"fusce.fermentum.fermentum@outlook.org"),
  ("Christopher Middleton",33,"ornare.in@hotmail.couk"),
  ("Jolene Stein",54,"dui@protonmail.org"),
  ("Melinda Bennett",99,"faucibus.lectus@outlook.net"),
  ("Emmanuel Taylor",84,"diam.sed@outlook.edu"),
  ("Madaline Gaines",89,"non.cursus@protonmail.edu"),
  ("Jada Oneil",40,"mi@yahoo.edu"),
  ("Catherine Hoffman",43,"eget.metus@google.ca"),
  ("Bethany Hull",96,"viverra.maecenas@aol.edu"),
  ("Isaac Mccormick",95,"malesuada@protonmail.edu");
INSERT INTO `funcionarios` (`nome_funcionarios`,`idade_funcionarios`,`email_funcionarios`)
VALUES
  ("Porter Emerson",65,"dolor@protonmail.com"),
  ("Keiko Harper",77,"at.velit.cras@outlook.edu"),
  ("Jameson Jensen",100,"eros.non@protonmail.couk"),
  ("Camille Copeland",82,"gravida.nunc.sed@outlook.edu"),
  ("Hilda Ayers",93,"et.arcu@protonmail.org"),
  ("Fay Simmons",58,"enim.condimentum.eget@outlook.edu"),
  ("Thaddeus Bowman",100,"ultricies.dignissim@yahoo.net"),
  ("Alexis Petersen",86,"leo.morbi.neque@icloud.couk"),
  ("Graham Gill",49,"at.arcu@google.couk"),
  ("Eliana Rosales",46,"ad.litora@google.edu");
INSERT INTO `funcionarios` (`nome_funcionarios`,`idade_funcionarios`,`email_funcionarios`)
VALUES
  ("Elton Leon",48,"curabitur@outlook.couk"),
  ("Tallulah Santana",43,"aliquet.odio@google.com"),
  ("Idola Lindsay",25,"tincidunt.nibh@protonmail.com"),
  ("Dane Wall",20,"vel.quam@google.com"),
  ("Kay Foley",73,"lacinia.at@protonmail.edu"),
  ("Ori Bradford",40,"quisque.libero@yahoo.com"),
  ("Germane Buckley",19,"luctus@outlook.net"),
  ("Ian Murphy",52,"donec@icloud.org"),
  ("Felix Klein",34,"aliquam.ultrices@yahoo.edu"),
  ("Yael Pearson",97,"blandit.enim@yahoo.edu");
INSERT INTO `funcionarios` (`nome_funcionarios`,`idade_funcionarios`,`email_funcionarios`)
VALUES
  ("Eliana Nunez",21,"interdum.ligula@hotmail.com"),
  ("Channing Hobbs",93,"rutrum.urna.nec@aol.edu"),
  ("Ifeoma Patton",28,"fringilla@outlook.com"),
  ("William Cotton",90,"malesuada.integer.id@hotmail.org"),
  ("Burton Robles",85,"dapibus@outlook.com"),
  ("Ivor Hampton",79,"magna.a.neque@hotmail.edu"),
  ("Tanya Hurley",57,"nec.ligula@hotmail.net"),
  ("Cathleen Rhodes",50,"nulla.magna@aol.com"),
  ("Mollie Brown",48,"nunc.mauris@yahoo.ca"),
  ("Knox Ware",23,"ut.cursus@icloud.org");
INSERT INTO `funcionarios` (`nome_funcionarios`,`idade_funcionarios`,`email_funcionarios`)
VALUES
  ("Allegra French",69,"ultricies@yahoo.edu"),
  ("Jocelyn Osborn",43,"gravida.mauris@google.net"),
  ("Keith Rutledge",89,"sit@icloud.org"),
  ("Lacota Wells",19,"diam.nunc@hotmail.ca"),
  ("Otto Conner",26,"cursus@protonmail.ca"),
  ("Dillon Mathews",85,"aliquam@yahoo.org"),
  ("Calista Herman",89,"quam@hotmail.ca"),
  ("Arden Nichols",87,"diam.sed.diam@icloud.com"),
  ("Signe Nichols",21,"nunc@yahoo.org"),
  ("Myra Wilcox",33,"commodo@aol.couk");
INSERT INTO `funcionarios` (`nome_funcionarios`,`idade_funcionarios`,`email_funcionarios`)
VALUES
  ("Castor Brock",66,"curabitur.consequat.lectus@hotmail.ca"),
  ("Kiona Bullock",54,"libero.lacus.varius@yahoo.org"),
  ("Priscilla Hansen",35,"mauris.quis@aol.org"),
  ("Kyra Rivers",68,"praesent@google.edu"),
  ("Rachel Grimes",59,"ac.urna.ut@protonmail.com"),
  ("Leila Rich",60,"pharetra.nam.ac@aol.org"),
  ("Judah Morgan",72,"feugiat.sed@yahoo.net"),
  ("Ivor Collins",57,"tempus.non@hotmail.net"),
  ("Oprah Joyner",39,"venenatis.lacus.etiam@yahoo.ca"),
  ("Kylee Lowery",45,"ultrices.vivamus.rhoncus@protonmail.com");
INSERT INTO `funcionarios` (`nome_funcionarios`,`idade_funcionarios`,`email_funcionarios`)
VALUES
  ("Jenette Henry",93,"tincidunt.aliquam@icloud.org"),
  ("Shelly Shannon",96,"donec@icloud.com"),
  ("Tad Holloway",80,"at.velit@protonmail.com"),
  ("Nita Garrett",28,"primis.in@yahoo.edu"),
  ("Neil Russo",94,"orci.adipiscing@outlook.couk"),
  ("Thor Dawson",82,"ut.quam.vel@google.edu"),
  ("Marny Norris",87,"malesuada@google.com"),
  ("Ariana Roy",60,"amet.luctus.vulputate@icloud.org"),
  ("Giselle Gibbs",62,"duis.sit.amet@protonmail.org"),
  ("Patrick Johnston",99,"lorem@google.com");
INSERT INTO `funcionarios` (`nome_funcionarios`,`idade_funcionarios`,`email_funcionarios`)
VALUES
  ("Philip Hardin",29,"ultricies.dignissim.lacus@protonmail.org"),
  ("Carissa Vaughn",24,"vestibulum.ut.eros@protonmail.edu"),
  ("Erich White",75,"libero.dui@protonmail.ca"),
  ("Thaddeus Skinner",66,"ac.libero.nec@aol.org"),
  ("Amanda Kinney",97,"in.sodales.elit@icloud.edu"),
  ("Ira Daniels",58,"primis@icloud.couk"),
  ("Charissa Fernandez",37,"nulla.integer@yahoo.ca"),
  ("Ocean Stevens",55,"ac@protonmail.net"),
  ("Hunter Clay",29,"quisque.porttitor@protonmail.org"),
  ("Eric Pace",85,"est.mauris@aol.edu");
INSERT INTO `funcionarios` (`nome_funcionarios`,`idade_funcionarios`,`email_funcionarios`)
VALUES
  ("Matthew Newman",28,"duis.elementum@protonmail.net"),
  ("Walker Alston",75,"egestas@outlook.edu"),
  ("Isabella Harris",47,"eu.neque@hotmail.com"),
  ("Cheryl Kennedy",92,"nunc.pulvinar.arcu@yahoo.org"),
  ("Kennedy Rodriquez",99,"sapien.gravida.non@google.ca"),
  ("Arthur Schmidt",82,"nulla.vulputate@google.org"),
  ("Catherine Lindsey",51,"sed.dui.fusce@protonmail.org"),
  ("Hashim Waters",99,"pharetra.nibh@yahoo.com"),
  ("Nola Lucas",77,"libero.donec@icloud.org"),
  ("Nehru Knowles",46,"primis.in.faucibus@hotmail.com");
INSERT INTO `funcionarios` (`nome_funcionarios`,`idade_funcionarios`,`email_funcionarios`)
VALUES
  ("Lillian Holcomb",75,"lacinia@hotmail.couk"),
  ("Destiny Richmond",84,"quisque.libero@hotmail.org"),
  ("Abdul Walls",19,"enim.curabitur@icloud.edu"),
  ("Donovan Ward",44,"tellus.sem@aol.edu"),
  ("Medge Vinson",87,"sodales.nisi.magna@google.net"),
  ("Yoko Randolph",21,"amet@aol.edu"),
  ("Uma Carey",50,"consectetuer@protonmail.edu"),
  ("Prescott Coffey",56,"lectus.quis@aol.com"),
  ("Arthur Kidd",26,"nullam@icloud.org"),
  ("Candice Prince",26,"erat.vivamus@outlook.edu");
INSERT INTO `funcionarios` (`nome_funcionarios`,`idade_funcionarios`,`email_funcionarios`)
VALUES
  ("Brian Sweeney",89,"convallis@outlook.edu"),
  ("Felix Lara",21,"ut.nisi.a@hotmail.net"),
  ("Hayden Cross",98,"egestas@google.net"),
  ("Avram Medina",57,"proin.vel@google.ca"),
  ("Oscar Reid",54,"magna@protonmail.edu"),
  ("Christopher Stanton",82,"neque.vitae.semper@yahoo.org"),
  ("Maya Slater",36,"cras.vehicula.aliquet@aol.com"),
  ("Britanney Armstrong",58,"rhoncus.proin@icloud.edu"),
  ("Ivor Wolf",95,"ultrices.sit.amet@hotmail.ca"),
  ("Leroy Kennedy",43,"sagittis@hotmail.edu");
INSERT INTO `funcionarios` (`nome_funcionarios`,`idade_funcionarios`,`email_funcionarios`)
VALUES
  ("Nigel Kane",73,"neque.vitae.semper@protonmail.org"),
  ("Arthur Lindsay",96,"hendrerit.donec.porttitor@icloud.org"),
  ("Amity Alston",60,"dictum.sapien.aenean@outlook.edu"),
  ("Christen Gentry",93,"ut.molestie.in@yahoo.com"),
  ("Noelani Baker",31,"libero@aol.org"),
  ("Emi Whitney",38,"pede.praesent.eu@protonmail.net"),
  ("Allen Rowland",23,"ullamcorper.eu@google.com"),
  ("Todd Jacobs",60,"dictum.mi@outlook.org"),
  ("Isaac Sosa",70,"feugiat.metus@icloud.edu"),
  ("Rogan Clemons",75,"pede.cras@icloud.edu");
INSERT INTO `funcionarios` (`nome_funcionarios`,`idade_funcionarios`,`email_funcionarios`)
VALUES
  ("Remedios Parks",64,"gravida.non@google.com"),
  ("Kyla Stuart",30,"laoreet.libero@hotmail.org"),
  ("Amy Crosby",90,"cursus.et.magna@hotmail.org"),
  ("Dale Sloan",95,"eros.nam@icloud.com"),
  ("Bruno Ferrell",21,"parturient.montes.nascetur@protonmail.net"),
  ("Barrett Watts",92,"in.molestie.tortor@google.ca"),
  ("Whoopi Buckner",88,"at@yahoo.org"),
  ("Ralph Benjamin",24,"est.mollis.non@icloud.edu"),
  ("Phelan Hatfield",28,"magna.a@hotmail.com"),
  ("Timothy Kramer",97,"a.scelerisque@google.ca");
INSERT INTO `funcionarios` (`nome_funcionarios`,`idade_funcionarios`,`email_funcionarios`)
VALUES
  ("Gage Dudley",32,"dapibus.rutrum@hotmail.net"),
  ("Ivy Hamilton",75,"ac@outlook.couk"),
  ("Kasper Snyder",31,"cum.sociis@yahoo.net"),
  ("Madonna Griffin",91,"non.magna@google.ca"),
  ("Alisa Hart",76,"eu.placerat@protonmail.edu"),
  ("Faith Eaton",58,"proin.nisl@icloud.net"),
  ("Darrel Forbes",90,"a.tortor.nunc@yahoo.edu"),
  ("Tashya Rodgers",36,"placerat.eget@yahoo.com"),
  ("Edan Brady",93,"eget.metus@hotmail.org"),
  ("Yoshio Leblanc",85,"cursus@aol.net");
INSERT INTO `funcionarios` (`nome_funcionarios`,`idade_funcionarios`,`email_funcionarios`)
VALUES
  ("Kasimir Carson",24,"ac.turpis@yahoo.net"),
  ("Vivien Pennington",55,"iaculis.enim.sit@aol.ca"),
  ("Timon Cole",97,"risus.duis.a@icloud.net"),
  ("Alexander Battle",81,"mauris@yahoo.edu"),
  ("Kenyon Spencer",49,"laoreet@hotmail.ca"),
  ("David Estrada",78,"vestibulum.lorem@protonmail.net"),
  ("Nina Nguyen",71,"nulla.donec@google.com"),
  ("Ulysses Pittman",90,"tristique.senectus.et@yahoo.org"),
  ("Gisela Jacobs",55,"etiam@outlook.net"),
  ("Dahlia Sharpe",22,"donec.tempor@aol.org");
INSERT INTO `funcionarios` (`nome_funcionarios`,`idade_funcionarios`,`email_funcionarios`)
VALUES
  ("Chaim Huff",48,"cursus.purus@yahoo.net"),
  ("Keelie Albert",40,"vitae.semper@outlook.edu"),
  ("Francis O'donnell",95,"accumsan@google.org"),
  ("Ila Heath",26,"parturient.montes@icloud.ca"),
  ("Desiree Coffey",60,"aliquet@google.ca"),
  ("Madeson Wolf",36,"ornare.fusce.mollis@aol.com"),
  ("Jaquelyn Walsh",44,"eget.magna@protonmail.couk"),
  ("Carolyn Doyle",93,"non.sapien.molestie@icloud.net"),
  ("Alvin Velazquez",45,"ut.ipsum@hotmail.couk"),
  ("Tatyana Meadows",58,"ut.nec@protonmail.couk");
INSERT INTO `funcionarios` (`nome_funcionarios`,`idade_funcionarios`,`email_funcionarios`)
VALUES
  ("Vera Dickerson",42,"ut@aol.org"),
  ("Cailin Vinson",62,"nec.ante.maecenas@icloud.couk"),
  ("Nicholas Pacheco",73,"mollis@yahoo.net"),
  ("Lila Langley",59,"nam.porttitor@outlook.couk"),
  ("Kyla Roy",71,"mi.felis@outlook.org"),
  ("Ava Espinoza",21,"ipsum.dolor.sit@aol.net"),
  ("Nigel Mccray",60,"sed.turpis@protonmail.edu"),
  ("Wyatt Tucker",55,"lectus.pede@yahoo.org"),
  ("Lavinia Lyons",34,"donec.est.mauris@icloud.net"),
  ("Colton Dudley",26,"vitae.odio@protonmail.edu");
INSERT INTO `funcionarios` (`nome_funcionarios`,`idade_funcionarios`,`email_funcionarios`)
VALUES
  ("Raya Vang",67,"mauris.sapien.cursus@outlook.couk"),
  ("Beatrice Ayers",77,"mollis.vitae.posuere@aol.net"),
  ("Steel Walter",51,"ut.tincidunt@outlook.couk"),
  ("Noelani Gill",71,"eget.ipsum.suspendisse@icloud.ca"),
  ("Michelle Boyer",73,"nulla.facilisi@google.org"),
  ("Charles Cooke",94,"vitae.aliquam@aol.ca"),
  ("Naida Hewitt",26,"duis.dignissim@hotmail.org"),
  ("Sierra Moss",36,"magna.tellus@hotmail.edu"),
  ("David Warren",57,"convallis@yahoo.net"),
  ("Alexandra Elliott",57,"justo.sit@google.org");
INSERT INTO `funcionarios` (`nome_funcionarios`,`idade_funcionarios`,`email_funcionarios`)
VALUES
  ("Alyssa Terrell",29,"dui@hotmail.ca"),
  ("Ishmael Padilla",78,"sit.amet.luctus@hotmail.ca"),
  ("Elliott Mckenzie",61,"phasellus.in.felis@outlook.org"),
  ("Baker Maldonado",98,"non.feugiat@icloud.edu"),
  ("Clayton Cross",59,"a.enim@outlook.com"),
  ("Kimberly Roman",74,"ac.turpis.egestas@aol.org"),
  ("Kamal Vinson",94,"nunc.sed@outlook.org"),
  ("Hollee Robles",98,"dolor@google.org"),
  ("Dennis Schmidt",36,"quisque.tincidunt.pede@google.ca"),
  ("Emerald Rosario",70,"arcu.eu@google.ca");
INSERT INTO `funcionarios` (`nome_funcionarios`,`idade_funcionarios`,`email_funcionarios`)
VALUES
  ("Hamish Rowe",21,"nec.metus.facilisis@outlook.org"),
  ("Samantha Berger",90,"pellentesque.a@aol.com"),
  ("Galvin Lang",18,"nunc.laoreet.lectus@yahoo.edu"),
  ("Helen Colon",30,"massa.lobortis@outlook.edu"),
  ("Basil Snyder",64,"pharetra@outlook.couk"),
  ("Plato Velez",61,"ac.arcu@google.couk"),
  ("Craig Patrick",80,"turpis.egestas.fusce@icloud.couk"),
  ("Lester Newton",27,"ante.bibendum@google.org"),
  ("Portia Waters",25,"magna@google.com"),
  ("September Christian",19,"lobortis.class@yahoo.edu");
INSERT INTO `funcionarios` (`nome_funcionarios`,`idade_funcionarios`,`email_funcionarios`)
VALUES
  ("Jaime Vasquez",37,"praesent.eu.nulla@icloud.edu"),
  ("Zorita Rocha",50,"velit.egestas@outlook.net"),
  ("Ginger Melton",66,"ac.libero@hotmail.couk"),
  ("Christen Shields",28,"aliquet.odio@outlook.com"),
  ("Sylvia Burnett",50,"arcu.vestibulum@yahoo.com"),
  ("Haley Farley",37,"tempor.est.ac@hotmail.ca"),
  ("Colby Mathis",63,"sapien.cursus@aol.org"),
  ("Serina Carey",42,"molestie@google.com"),
  ("Oren Chavez",32,"dis.parturient@hotmail.ca"),
  ("Inga Christensen",71,"aliquet.proin@google.ca");
INSERT INTO `funcionarios` (`nome_funcionarios`,`idade_funcionarios`,`email_funcionarios`)
VALUES
  ("Callum Clemons",28,"euismod.et.commodo@hotmail.org"),
  ("Ronan Casey",89,"consectetuer@protonmail.ca"),
  ("Ulla Hood",67,"tellus.eu@outlook.ca"),
  ("Hamish Pollard",25,"hymenaeos.mauris@google.org"),
  ("Nita Hardy",44,"odio.semper.cursus@hotmail.net"),
  ("Driscoll Berger",38,"faucibus.morbi@aol.couk"),
  ("Candace Mercado",30,"elementum@hotmail.couk"),
  ("Kylynn Cannon",90,"metus.vitae@aol.org"),
  ("Maxwell Jackson",54,"est@outlook.couk"),
  ("Theodore Holman",68,"diam.vel.arcu@hotmail.ca");
INSERT INTO `funcionarios` (`nome_funcionarios`,`idade_funcionarios`,`email_funcionarios`)
VALUES
  ("Colette Sandoval",33,"semper.tellus.id@hotmail.org"),
  ("Nola Robinson",76,"et.rutrum@google.org"),
  ("Pandora Gould",32,"bibendum.fermentum.metus@yahoo.net"),
  ("Carly Peterson",58,"sed.congue@google.couk"),
  ("Todd Gentry",31,"elit@hotmail.com"),
  ("Kyle Bowen",93,"mauris@outlook.ca"),
  ("Rashad Bird",18,"phasellus@aol.couk"),
  ("Robert Beard",40,"sagittis@icloud.net"),
  ("Denise Powers",81,"mauris.ipsum@outlook.couk"),
  ("Kylee Sawyer",99,"eu.elit@google.ca");
INSERT INTO `funcionarios` (`nome_funcionarios`,`idade_funcionarios`,`email_funcionarios`)
VALUES
  ("Oscar Vega",54,"nunc.ullamcorper@yahoo.org"),
  ("Neil Munoz",80,"erat.eget@google.edu"),
  ("Imogene Ballard",53,"cubilia.curae@yahoo.com"),
  ("Chloe Weaver",74,"cras.sed@hotmail.couk"),
  ("Zahir Soto",38,"lorem.vitae.odio@outlook.edu"),
  ("Carlos Haley",35,"auctor@google.org"),
  ("Colin Myers",27,"nunc.mauris@outlook.edu"),
  ("Gage Berger",99,"vitae.sodales@hotmail.couk"),
  ("Samantha Rodriguez",75,"iaculis@protonmail.com"),
  ("Kiona Mcgee",69,"donec.sollicitudin.adipiscing@protonmail.org");
INSERT INTO `funcionarios` (`nome_funcionarios`,`idade_funcionarios`,`email_funcionarios`)
VALUES
  ("Aristotle Flores",27,"volutpat.ornare@outlook.com"),
  ("Simone Snider",19,"suscipit@yahoo.org"),
  ("Abdul Fernandez",59,"cursus@icloud.edu"),
  ("Lydia Berry",39,"erat.volutpat.nulla@hotmail.couk"),
  ("Fitzgerald Fleming",88,"mollis@yahoo.net"),
  ("Hadley Hurst",74,"sem@google.net"),
  ("Justin Bryant",30,"sit@protonmail.com"),
  ("Prescott Schultz",71,"est.nunc.ullamcorper@yahoo.net"),
  ("Nina Hodge",66,"in.consequat@hotmail.org"),
  ("Vanna Patton",81,"volutpat@aol.net");
INSERT INTO `funcionarios` (`nome_funcionarios`,`idade_funcionarios`,`email_funcionarios`)
VALUES
  ("Rashad Grimes",50,"non.ante@google.edu"),
  ("Eagan Salas",80,"bibendum.donec@protonmail.edu"),
  ("Vernon Sandoval",63,"vel.pede@aol.org"),
  ("Edan Lindsay",30,"justo@yahoo.ca"),
  ("Thane Walton",98,"lacus@aol.org"),
  ("Vanna Pugh",87,"quam.vel@aol.couk"),
  ("Cameron Ballard",92,"ultricies.ornare@outlook.net"),
  ("Kato Chase",19,"rutrum.magna.cras@protonmail.edu"),
  ("Freya Mcgee",61,"non@yahoo.couk"),
  ("Thane Craig",41,"est.mollis.non@outlook.edu");
INSERT INTO `funcionarios` (`nome_funcionarios`,`idade_funcionarios`,`email_funcionarios`)
VALUES
  ("Yardley Berger",38,"donec.est@hotmail.org"),
  ("Lavinia Santiago",64,"aenean.eget@google.org"),
  ("Ori Rollins",91,"scelerisque.lorem@aol.net"),
  ("Doris Rogers",49,"mollis@protonmail.edu"),
  ("Nehru Murphy",94,"id.mollis.nec@protonmail.net"),
  ("Jenette Wolf",67,"quisque.imperdiet@hotmail.ca"),
  ("Dorothy Jarvis",79,"fusce@outlook.com"),
  ("Hall Mcmahon",52,"nisl.nulla.eu@hotmail.edu"),
  ("Flavia Williamson",51,"consectetuer.ipsum@hotmail.couk"),
  ("Erich Contreras",86,"et@hotmail.org");
INSERT INTO `funcionarios` (`nome_funcionarios`,`idade_funcionarios`,`email_funcionarios`)
VALUES
  ("Calvin Cain",99,"donec@icloud.couk"),
  ("Noel Albert",58,"dis.parturient.montes@protonmail.edu"),
  ("Yoshio Grant",86,"donec.felis.orci@icloud.edu"),
  ("Cassandra Brooks",71,"cras@protonmail.couk"),
  ("Oscar O'donnell",33,"dui@aol.couk"),
  ("Hasad Pierce",68,"iaculis.aliquet.diam@protonmail.org"),
  ("Kyle Burke",46,"ullamcorper.viverra@outlook.com"),
  ("Rudyard Guzman",98,"dui@protonmail.org"),
  ("Drew Guthrie",85,"odio.vel.est@yahoo.com"),
  ("Sydney Ramsey",33,"primis.in@aol.edu");
INSERT INTO `funcionarios` (`nome_funcionarios`,`idade_funcionarios`,`email_funcionarios`)
VALUES
  ("Davis Small",37,"bibendum.donec@outlook.com"),
  ("Rafael Sherman",23,"mollis@aol.org"),
  ("Michelle Myers",26,"ut@yahoo.com"),
  ("Shoshana Paul",60,"ipsum@aol.edu"),
  ("Lewis Ratliff",81,"dolor.quisque@protonmail.org"),
  ("Todd Miller",58,"fermentum.arcu@yahoo.org"),
  ("Quemby Shaw",84,"mauris.vestibulum@yahoo.com"),
  ("Dorothy Merrill",74,"orci.adipiscing@icloud.couk"),
  ("Dorothy Castro",68,"lobortis.quam.a@outlook.net"),
  ("Maxwell Finley",60,"eu.eros@icloud.couk");
INSERT INTO `funcionarios` (`nome_funcionarios`,`idade_funcionarios`,`email_funcionarios`)
VALUES
  ("Jaquelyn Cain",50,"diam.luctus@protonmail.org"),
  ("Sydney Snyder",33,"arcu.ac.orci@icloud.ca"),
  ("Byron Guerrero",88,"lorem.luctus.ut@protonmail.ca"),
  ("Shoshana Sharpe",41,"sed@protonmail.com"),
  ("Quinn Dalton",31,"dictum.magna@yahoo.edu"),
  ("Ora Jordan",96,"fermentum@aol.com"),
  ("Colleen Simon",32,"urna.nunc@yahoo.net"),
  ("Neve Hunter",35,"tortor@protonmail.ca"),
  ("Roth Vega",84,"odio@icloud.com"),
  ("Vielka Workman",28,"luctus.et@google.ca");
INSERT INTO `funcionarios` (`nome_funcionarios`,`idade_funcionarios`,`email_funcionarios`)
VALUES
  ("Caryn Guy",95,"in.lorem.donec@outlook.net"),
  ("Declan Buckley",95,"facilisis.non@outlook.couk"),
  ("Ulla Hanson",66,"et.commodo@hotmail.net"),
  ("Althea Christian",52,"nec.mollis@google.com"),
  ("Germaine Hatfield",92,"eget.ipsum.suspendisse@icloud.couk"),
  ("Hope Osborn",93,"luctus.curabitur@yahoo.net"),
  ("Vaughan Morin",95,"adipiscing.lacus@aol.net"),
  ("Thor Booker",24,"arcu.vestibulum@yahoo.couk"),
  ("Jakeem Sweet",26,"nec@hotmail.couk"),
  ("Cairo Kinney",94,"maecenas@google.edu");
INSERT INTO `funcionarios` (`nome_funcionarios`,`idade_funcionarios`,`email_funcionarios`)
VALUES
  ("Isaiah Huffman",72,"sit.amet.nulla@protonmail.com"),
  ("Mallory Prince",38,"feugiat.tellus.lorem@protonmail.com"),
  ("Remedios Ryan",99,"id.sapien.cras@icloud.couk"),
  ("Drew Pitts",76,"tellus.id.nunc@icloud.ca"),
  ("Travis Walsh",40,"nulla.tincidunt@hotmail.couk"),
  ("Levi Kemp",98,"aliquet.odio@aol.edu"),
  ("Nash Mejia",64,"sem.consequat.nec@hotmail.org"),
  ("Kamal Wheeler",77,"eu.odio@aol.edu"),
  ("Cade Baird",49,"integer.sem@icloud.net"),
  ("Lev Puckett",47,"integer@outlook.com");
INSERT INTO `funcionarios` (`nome_funcionarios`,`idade_funcionarios`,`email_funcionarios`)
VALUES
  ("Sopoline Williamson",54,"cursus.in@protonmail.ca"),
  ("Amaya Mccoy",37,"sociosqu@google.org"),
  ("Maggy Lane",26,"lorem.semper@hotmail.net"),
  ("Rylee Robbins",91,"vel.vulputate@icloud.net"),
  ("Harding Durham",65,"euismod.et.commodo@icloud.edu"),
  ("Brian Best",58,"sit.amet@aol.edu"),
  ("Kelly Mcintosh",48,"aliquet.proin.velit@outlook.couk"),
  ("Felicia Knight",99,"sollicitudin@google.ca"),
  ("Lester Vaughn",92,"a.magna@protonmail.net"),
  ("Hiram Herrera",39,"dignissim.lacus@aol.ca");
INSERT INTO `funcionarios` (`nome_funcionarios`,`idade_funcionarios`,`email_funcionarios`)
VALUES
  ("Lester Torres",64,"rhoncus.donec@icloud.edu"),
  ("Christian Acevedo",79,"a@icloud.ca"),
  ("Alika Spencer",67,"pede@icloud.net"),
  ("Ulla Fletcher",65,"ac.metus@icloud.com"),
  ("Jordan Reeves",51,"sed@hotmail.ca"),
  ("Isaiah Stuart",63,"donec.feugiat.metus@outlook.edu"),
  ("Vernon Stafford",86,"eget.dictum@yahoo.org"),
  ("Basia Campos",95,"nunc.commodo@icloud.com"),
  ("Maggie Clark",80,"convallis.erat@protonmail.edu"),
  ("Kadeem Garner",63,"duis.cursus@protonmail.edu");
INSERT INTO `funcionarios` (`nome_funcionarios`,`idade_funcionarios`,`email_funcionarios`)
VALUES
  ("Whoopi Daniel",88,"massa@yahoo.ca"),
  ("William Marquez",95,"sit.amet@aol.com"),
  ("Kaseem Pearson",83,"vitae.risus@google.couk"),
  ("Moana Livingston",57,"erat.etiam.vestibulum@aol.org"),
  ("Miranda Morrison",35,"tempus@outlook.net"),
  ("Inez Pratt",83,"nunc@aol.ca"),
  ("Hope Bowman",99,"adipiscing.fringilla@outlook.net"),
  ("Faith Newman",27,"augue.ac@protonmail.net"),
  ("Giacomo Petty",36,"molestie.tortor.nibh@protonmail.couk"),
  ("Linda Chaney",38,"ultrices@hotmail.com");
INSERT INTO `funcionarios` (`nome_funcionarios`,`idade_funcionarios`,`email_funcionarios`)
VALUES
  ("Azalia Mendoza",60,"proin@protonmail.ca"),
  ("Kermit Foster",82,"nisl.elementum@aol.couk"),
  ("Lynn Lott",66,"ut.semper@outlook.net"),
  ("Fiona Cunningham",38,"in.consectetuer@yahoo.couk"),
  ("Kai Mullen",93,"aenean.massa.integer@icloud.net"),
  ("Keaton Glenn",52,"nibh.dolor.nonummy@google.ca"),
  ("Inga Pratt",67,"luctus.felis@hotmail.net"),
  ("Miranda Ratliff",96,"nulla.tincidunt@icloud.ca"),
  ("Macon Patton",88,"vulputate@aol.net"),
  ("Hector Fuentes",50,"nec.mauris@hotmail.ca");
INSERT INTO `funcionarios` (`nome_funcionarios`,`idade_funcionarios`,`email_funcionarios`)
VALUES
  ("Bertha Cunningham",27,"elementum.dui@outlook.edu"),
  ("Raphael Mayer",97,"elit@icloud.com"),
  ("Courtney Barnes",99,"odio.semper@google.com"),
  ("Mara Gibson",22,"ornare.placerat@protonmail.net"),
  ("Xanthus Michael",47,"sit.amet@outlook.ca"),
  ("Fiona Emerson",59,"massa.quisque.porttitor@hotmail.org"),
  ("Cameran Craig",66,"nunc.mauris@outlook.org"),
  ("Aphrodite Hardin",97,"gravida.praesent.eu@outlook.edu"),
  ("Richard Howe",89,"molestie@protonmail.org"),
  ("Leilani Goff",96,"aliquet.diam.sed@yahoo.net");
INSERT INTO `funcionarios` (`nome_funcionarios`,`idade_funcionarios`,`email_funcionarios`)
VALUES
  ("Trevor Lester",80,"semper.pretium@google.org"),
  ("Xena Pennington",91,"lectus.justo@hotmail.net"),
  ("Derek Durham",81,"ut@hotmail.ca"),
  ("Cody Mcdonald",89,"mollis.duis@aol.org"),
  ("Cruz Pate",74,"metus.in.nec@google.org"),
  ("Hadley Finch",71,"iaculis.nec@icloud.couk"),
  ("Ayanna Reed",39,"adipiscing.ligula.aenean@hotmail.ca"),
  ("Abel Schmidt",52,"nulla.integer@icloud.org"),
  ("Colt Mercado",68,"turpis.aliquam@hotmail.couk"),
  ("Adrian Morse",41,"donec@aol.org");





 