drop database if exists uprava;
create database uprava;
use uprava;


create table zupanija(
    sifra int not null primary key auto_increment,
    naziv varchar(20),
    zupan varchar(20)
);


create table opcina(
    sifra int not null primary key auto_increment,
    naziv varchar(50),
    zupanija int
);


3

alter table opcina add foreign key (zupanija) references zupanija(sifra);

insert into opcina (sifra, naziv,zupanija)
values (null, 'Vrpolje', 1);

insert into zupanija (sifra, naziv, zupan)
values (null, 'Sibensko-kninska', 'Zeljko Buric');