drop database if exists firma;
create database firma;
use firma;


create table projekt(
    sifra int not null primary key auto_increment,
    naziv varchar(50) not null,
    cijena decimal(18,2) not null

);

create table sudjeluje(
    projekt int not null,
    programer int not null,
    datumpocetka date,
    datumkraja date
);


create table programer(
    sifra int not null primary key auto_increment,
    ime varchar(50) not null,
    prezime varchar(50) not null,
    datum_pocetka date,
    placa decimal(18,2)
);



alter table sudjeluje add foreign key(projekt) references projekt(sifra);
alter table sudjeluje add foreign key(programer) references programer(sifra);

insert into projekt(sifra, naziv,cijena)
values (null, 'Web aplikacija',345.89 );


insert into programer(sifra, ime, prezime, datum_pocetka, placa)
values (null, 'Ines', 'Grubisic','2022-12-01', 1000.99);


insert into sudjeluje(projekt, programer,datumpocetka,datumkraja)
values (1, 1,'2022-12-01', '2022-11-01' );



