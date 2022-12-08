drop database if exists airline_booking;
create database airline_booking default charset utf8;
use airline_booking;


create table let(
    sifra int not null primary key auto_increment,
    br_leta int,
    vrijeme_polaska datetime,
    vrijeme_dolaska datetime,
    cijena decimal(18,2),
    luka_polazak varchar(50),
    luka_dolazak varchar (50),
    trajanje_leta time,
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
    oib char(11),
    adresa varchar(50),
    email varchar(50)
);




create table rezervacija(
    sifra int not null primary key auto_increment,
    let int,
    korisnik int,
    klasa varchar(50)

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

insert into avion(naziv, kapacitet)
values
	('Boeing 747', 400 ),
	('Airbus A330', 250),
	('Embraer ERJ', 120),
	('Boeing 737', 200);


insert into aviokompanija(naziv)
values
	('Croatia Airlines'),
	('British Airways'),
	('American Airlines'),
	('Air Europe');


insert into korisnik(ime, prezime, oib, adresa, email)
values
	('Marko', 'Matić','89256958381', 'Ulica kralja Zvonimira 11', 'markomatic@gmail.com'),
	('Ivana', 'Lukić','37984661287', 'Draškovićeva ulica 5', 'ivana.lukic@gmail.com'),
	('Matija', 'Grubišić','28004141906', 'Ulica Miroslava Krleže 14', 'mgrubisic@gmail.com'),
	('Ana', 'Antić','12661598116','Vodička ulica 17', 'antic.ana@gmail.com');


insert into let (br_leta, vrijeme_polaska, vrijeme_dolaska, cijena, luka_polazak, luka_dolazak, trajanje_leta, avion, aviokompanija)
values
	(111, '2022-11-11 20:00', '2022-11-11 20:40', 250.50, 'Zagreb', 'Pariz', '4000', 1, 3),
	(112, '2022-08-09 19:00', '2022-08-10 01:00', 300.20, 'Zagreb', 'Barcelona', '60000', 4, 2),
	(113, '2022-07-08 20:00', '2022-07-09 09:00', 1000, 'Split', 'Dubai', '10000', 3, 4),
	(114, '2022-06-08 15:00', '2022-06-08 21:00', 2200.50, 'Zagreb', 'Oslo', '5000', 2, 1);
	

insert into rezervacija(let, korisnik, klasa)
values
	(1, 2, 'poslovna'),
	(2, 4, 'ekonomska'),
	(3, 1, 'prva klasa'),
	(4, 3 , 'ekonomska');
	








