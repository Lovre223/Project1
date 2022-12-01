drop database if exists airline_booking;
create database airline_booking;
use airline_booking;


create table let(
    sifra int not null primary key auto_increment,
    vrijeme_polaska datetime,
    vrijeme_dolaska datetime,
    cijena decimal(18,2),
    luka_polazak varchar(50),
    luka_dolazak varchar (50),
    trajanje_leta time,
    klasa varchar(50),
    avion int,
    aviokompanija int
);



create table aviokompanija(
    sifra int not null primary key auto_increment,
    naziv varchar(50)
);



create table korisnik (
    sifra int not null primary key auto_increment,
    ime varchar(50),
    prezime varchar(50),
    broj_kartice varchar(18),
    oib char(11),
    adresa varchar(50),
    email varchar(50)
);




create table rezervacija(
    sifra int not null primary key auto_increment,
    let int,
    korisnik int,
    aviokompanija int

);


create table avion(
    sifra int not null primary key auto_increment,
    naziv varchar(50),
    kapacitet int
);


alter table rezervacija add foreign key(let) references let(sifra);
alter table rezervacija add foreign key(korisnik) references korisnik(sifra); 
alter table let add foreign key(avion) references avion(sifra);
alter table let add foreign key (aviokompanija) references aviokompanija(sifra);

