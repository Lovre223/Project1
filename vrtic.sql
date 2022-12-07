drop database if exists vrtic;
create database vrtic;
use vrtic;

create table skupina(
    sifra int not null primary key auto_increment,
    naziv varchar(50),
    odgajateljica int
);


create table dijete(
    sifra int not null primary key auto_increment,
    ime varchar(50),
    prezime varchar(50),
    oib varchar(50),
    skupina int
);

create table odgajateljica(
    sifra int not null primary key auto_increment,
    ime varchar(50),
    prezime varchar(50),
    strucna_sprema int
);


create table strucna_sprema(
    sifra int not null primary key auto_increment,
    naziv varchar(50)
);

alter table odgajateljica add foreign key(strucna_sprema) references strucna_sprema(sifra);
alter table dijete add foreign key(skupina) references skupina(sifra);
alter table skupina add foreign key(odgajateljica) references odgajateljica(sifra);