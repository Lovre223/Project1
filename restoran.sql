drop database if exists restoran;
create database restoran;
use restoran;


create table jelovnik(
    sifra int not null primary key auto_increment,
    br_stranica int
    
);

create table kategorija(
    sifra int not null primary key auto_increment,
    jelovnik int

);

create table jelo(
    sifra int not null primary key auto_increment,
    naziv varchar(50),
    cijena decimal(18,2),
    kategorija int
);


create table pice(
    sifra int not null primary key auto_increment,
    naziv varchar(50),
    cijena decimal(18,2)
);

create table obrok(
    pice int,
    jelo int
);

alter table obrok add foreign key(pice) references pice(sifra);
alter table obrok add foreign key(jelo) references jelo(sifra);
alter table kategorija add foreign key(jelovnik) references jelovnik(sifra);
alter table jelo add foreign key(kategorija) references kategorija(sifra);