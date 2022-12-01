drop database if exists nakladnik;
create database nakladnik;
use nakladnik;


create table djelo(
    sifra int not null primary key auto_increment,
    naziv varchar(50),
    autor varchar(50),
    brojstranica int

);

create table nakladnik (
    sifra int not null primary key auto_increment,
    naziv varchar(50),
    mjesto int
);

create table nakladnik_djelo(
    nakladnik int,
    djelo int

);

create table mjesto (
    sifra int not null primary key  auto_increment,
    naziv varchar(50),
    zupanija varchar (50)

);


alter table nakladnik_djelo add foreign key (nakladnik) references nakladnik(sifra);
alter table nakladnik_djelo add foreign key (djelo) references djelo (sifra);
alter table nakladnik add foreign key (mjesto) references mjesto (sifra);