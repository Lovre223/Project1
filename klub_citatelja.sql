drop database if exists klub_citatelja;
create database klub_citatelja;
use klub_citatelja;


create table knjiga(
    sifra int not null primary key auto_increment,
    naslov varchar(50),
    autor varchar(50)
);

create table vlasnik(
    sifra int not null primary key auto_increment,
    ime varchar(50),
    prezime varchar(50),
    oib varchar(11)
);

create table posudba(
    vlasnik int,
    knjiga int
);

alter table posudba add foreign key(knjiga) references knjiga(sifra);
alter table posudba add foreign key(vlasnik) references vlasnik(sifra);