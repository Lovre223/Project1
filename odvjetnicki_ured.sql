drop database if exists odvjetnicki_ured;
create database odvjetnicki_ured;
use odvjetnicki_ured;

create table odvjetnik(
    sifra int not null primary key auto_increment,
    ime varchar(50),
    prezime varchar(50),
    oib varchar(50)
);

create table klijent(
    sifra int not null primary key auto_increment,
    ime varchar(50),
    prezime varchar(50),
    oib varchar(50)
);

create table obrana (
    sifra int not null primary key auto_increment,
    naziv varchar(50),
    tuzitelj varchar(50),
    sudac varchar(50)
);

create table suradnik(
    sifra int not null primary key auto_increment,
    ime varchar(50),
    prezime varchar(50),
    oib varchar(11)
);

create table termin(
    obrana int,
    suradnik int
);

create table slucaj(
    klijent int,
    odvjetnik int
);

alter table termin add foreign key(obrana) references obrana(sifra);
alter table termin add foreign key (suradnik) references suradnik(sifra);
alter table slucaj add foreign key (klijent) references klijent(sifra);
alter table slucaj add foreign key (odvjetnik) references odvjetnik(sifra);