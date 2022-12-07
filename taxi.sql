drop database if exists taxi;
create database taxi;
use taxi;

create table vozilo(
    sifra int not null primary key auto_increment,
    marka varchar(50),
    model varchar(50),
    vozac int
);

create table vozac(
    sifra int not null primary key auto_increment,
    ime varchar(50),
    prezime varchar(50),
    oib varchar(11)
);

create table putnik(
    sifra int not null primary key auto_increment,
    ime varchar(50),
    prezime varchar(50)
);

create table voznja(
    sifra int not null primary key auto_increment,
    cijena decimal(18,2),
    trajanje time,
    destinacija varchar(50)
);

create table termin(
    voznja int,
    putnik int
);


alter table termin add foreign key (voznja) references voznja(sifra);
alter table termin add foreign key(putnik) references putnik(sifra);
alter table vozilo add foreign key(vozac) references vozac(sifra);