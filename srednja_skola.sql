drop database if exists srednja_skola;
create database srednja_skola;
use srednja_skola;

create table ucenik(
    sifra int not null primary key auto_increment,
    ime varchar(50),
    prezime varchar(50),
    oib varchar(11),
    razred int
);

create table razred(
    sifra int not null primary key auto_increment,
    naziv varchar(50),
    br_ucenika int
);

create table profesor(
    sifra int not null primary key auto_increment,
    ime varchar(50),
    prezime varchar(50),
    oib varchar(11)
);


create table termin(
    razred int,
    profesor int
);


alter table ucenik add foreign key(razred) references razred(sifra);
alter table termin add foreign key(razred) references razred(sifra);
alter table termin add foreign key(profesor) references profesor(sifra);