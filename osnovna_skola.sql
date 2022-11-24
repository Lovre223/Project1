drop database if exists osnovna_skola;
create database osnovna_skola default charset utf8;
use osnovna_skola;

create table radionica(
    sifra int not null primary key auto_increment,
    naziv varchar(50),
    broj_djece varchar(50),
    uciteljica int
);

create table uciteljica(
    sifra int not null primary key auto_increment,
    ime varchar(50),
    prezime varchar(50),
    oib varchar(11)
);

create table dijete(
    sifra int not null primary key auto_increment,
    ime varchar(50),
    prezime varchar(50),
    oib varchar(50)
);

create table termin(
    dijete int,
    radionica int
);


alter table termin add foreign key (dijete) references dijete(sifra);
alter table termin add foreign key (radionica) references radionica(sifra);
alter table radionica add foreign key (uciteljica) references uciteljica(sifra);


insert into uciteljica(ime, prezime)
values ('Ines', 'Grubišić'),
	   ('Matea', 'Matić');
	   
	  
insert into dijete (ime, prezime)
values ('Luka', 'Lukić'),
       ('Mate', 'Matić');
       
insert into radionica(naziv, broj_djece, uciteljica)
values ('Bojanje', 20, 1),
	   ('Nogomet', 17, 2);
	   
	  
insert into termin(dijete, radionica)
values (1,2),
       (2,1);