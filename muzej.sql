drop database if exists muzej;
create database muzej;
use muzej;

create table izlozba(
    sifra int not null primary key auto_increment,
    naziv varchar(50)
);

create table djelo(
    sifra int not null primary key auto_increment,
    naziv varchar(50),
    autor varchar(50),
    izlozba int
);

create table kustos(
    sifra int not null primary key auto_increment,
    ime varchar(50),
    prezime varchar(50),
    oib varchar(50),
    izlozba int
);


create table sponzor(
    sifra int not null primary key auto_increment,
    naziv varchar(50),
    izlozba int
);


alter table sponzor add foreign key(izlozba) references izlozba(sifra);
alter table kustos add foreign key(izlozba) references izlozba(sifra);
alter table djelo add foreign key(izlozba) references izlozba(sifra);