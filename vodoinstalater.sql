drop database if exists vodoinstalater;
create database vodoinstalater;
use vodoinstalater;


create table vodoinstalater(
    sifra int not null primary key auto_increment,
    ime varchar(50),
    prezime varchar (50)
);


create table popravak (
    sifra int not null primary key,
    naziv varchar(50),
    cijena decimal(18,2),
    segrt int
);


create table kvar(
    sifra int not null primary key,
    naziv varchar(50),
    mjesto_kvara varchar(50)
);


create table termin (
    popravak int,
    kvar int
);

create table segrt(
    sifra int not null primary key auto_increment,
    ime varchar(50),
    prezime varchar(50)
);


alter table termin add foreign key (popravak) references popravak(sifra);
alter table termin add foreign key (kvar) references kvar(sifra);
alter table popravak add foreign key (segrt) references segrt(sifra);


