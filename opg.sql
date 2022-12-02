drop database if exists opg;
create database opg;
use opg;

create table proizvod(
    sifra int not null primary key auto_increment,
    naziv varchar(50),
    cijena decimal(18,2),
    djelatnik int
);


create table sirovina(
    sifra int not null primary key auto_increment,
    naziv varchar(50),
    lokacija varchar(50),
    cijena decimal(18,2)
);


create table djelatnik(
    sifra int not null primary key auto_increment,
    ime varchar(50),
    prezime varchar(50),
    oib varchar(11),
    iban varchar(16)
);



create table proizvod_sirovina(
    proizvod int,
    sirovina int
);

alter table proizvod_sirovina add foreign key(proizvod) references proizvod(sifra);
alter table proizvod_sirovina add foreign key(sirovina) references sirovina(sifra);
alter table proizvod add foreign key(djelatnik) references djelatnik(sifra);
