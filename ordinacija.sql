drop database if exists ordinacija;
create database ordinacija default charset utf8;
use ordinacija;


create table doktor(
    sifra int not null primary  key auto_increment,
    ime varchar(50),
    prezime varchar(50),
    specijalizacija varchar(50)

);


create table pacijent(
    sifra int not null primary key auto_increment,
    ime varchar(50),
    prezime varchar (50),
    oib varchar(11)
);


create table termin(
    pacijent int,
    doktor int

);

create table med_sestra(
    sifra int not null primary key auto_increment,
    ime varchar(50),
    prezime varchar (50),
    doktor int

);

alter table termin add foreign key (pacijent) references pacijent(sifra);
alter table termin add foreign key (doktor) references doktor(sifra);
alter table med_sestra add foreign key (doktor) references doktor(sifra);

insert into doktor(ime, prezime)
values('Marko', 'Matić'),
	  ('Ivan', 'Lukić'),
	  ('Luka','Granić');
	  
insert into med_sestra(ime, prezime, doktor)
values('Tina','Tinić', 1);

insert into pacijent(ime, prezime)
values('Ivan', 'Ivanić'),
	  ('Lovre', 'Lovrić'),
	  ('Ivana', 'Matić');
	  
insert into termin (pacijent, doktor)
values(1,1),
      (2,2),
      (3,3);
