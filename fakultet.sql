drop database if exists fakultet;
create database fakultet;
use fakultet;


create table student(
    sifra int not null primary key auto_increment,
    ime varchar(50),
    prezime varchar(50),
    oib varchar(11)
);


create table kolegij(
    sifra int not null primary key auto_increment,
    naziv varchar(50)
);


create table rok(
    sifra int not null primary key,
    naziv varchar(50)
);


create table termin(
    student int,
    rok int
);

create table grupa(
    student int, 
    kolegij int
);

alter table grupa add foreign key(student) references student(sifra);
alter table grupa add foreign key(kolegij) references kolegij(sifra);
alter table termin add foreign key(student) references student(sifra);
alter table termin add foreign key(rok) references rok(sifra);



