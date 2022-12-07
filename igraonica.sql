drop database if exists igraonica;
create database igraonica;
use igraonica;


create table dijete(
    sifra int not null primary key auto_increment,
    ime varchar(50),
    prezime varchar(50),
    oib varchar(11)
);

create table skupina(
    sifra int not null primary key auto_increment,
    naziv varchar(50),
    teta int
);


create table grupa(
    skupina int,
    dijete int
);

create table teta(
    sifra int not null primary key auto_increment,
    ime varchar(50),
    prezime varchar(50),
    oib varchar(11)
);

alter table grupa add foreign key (dijete) references dijete(sifra);
alter table grupa add foreign key (skupina) references skupina(sifra);
alter table skupina add foreign key (teta) references teta(sifra);