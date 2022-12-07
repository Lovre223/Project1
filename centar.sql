drop database if exists centar;
create database centar;
use centar;


create table trgovina(
    sifra int not null primary key auto_increment,
    naziv varchar(50),
    sef int

);


create table djelatnik(
    sifra int not null primary key auto_increment,
    ime varchar(50),
    prezime varchar(50),
    oib varchar(11)
);

create table odjel(
    trgovina int,
    djelatnik int
);


create table sef(
    sifra int not null primary key auto_increment,
    ime varchar(50),
    prezime varchar(50),
    oib varchar(11)
);


alter table odjel add foreign key(trgovina) references trgovina(sifra);
alter table odjel add foreign key(djelatnik) references djelatnik(sifra);
alter table trgovina add foreign key(sef) references sef(sifra); 