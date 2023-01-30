
drop database if exists vjezba1;
create database vjezba1;
use vjezba1;



create table sestra(
    sifra int not null primary key auto_increment,
    introvertno bit,
    haljina varchar(31) not null,
    maraka decimal(16,6),
    hlace varchar(46) not null,
    narukvica int not null

);

create table zena(
    sifra int not null primary key auto_increment,
    treciputa datetime,
    hlace varchar(46),
    kratkamajica varchar(31) not null,
    jmbag char(11) not null,
    bojaociju varchar(39) not null,
    haljina varchar(44),
    sestra int not null
);


create table muskarac(
    sifra int not null primary key auto_increment,
    bojaociju varchar(50) not null,
    hlace varchar(30),
    modelnaocala varchar(43),
    maraka decimal(14,5) not null,
    zena int not null
);

create table mladic(
    sifra int not null primary key auto_increment,
    suknja varchar(50) not null,
    kuna decimal (16,8) not null,
    drugiputa datetime,
    asocijalno bit,
    ekstrovertno bit not null,
    dukserica varchar(48) not null,
    muskarac int 
);


create table sestra_svekar(
    sifra int not null primary key auto_increment,
    sestra int not null,
    svekar int not null

);


create table svekar(
    sifra int not null primary key auto_increment,
    bojaociju varchar(40) not null,
    prstena int,
    dukserica varchar(41),
    lipa decimal(13,8),
    eura decimal(12,7),
    majica varchar(35)
);


create table punac(
    sifra int not null  primary key auto_increment,
    ogrlica int,
    gustoca decimal(14,9),
    hlace varchar(41) not null
);


create table cura(
    sifra int not null primary key auto_increment,
    novcica decimal(16,5) not null,
    gustoca decimal(18,6) not null,
    lipa decimal(13,10),
    ogrlica int not null,
    bojakose varchar(38),
    suknja varchar(36),
    punac int 
);


alter table cura add foreign key(punac) references punac(sifra);
alter table zena add foreign key(sestra) references sestra(sifra);
alter table muskarac add foreign key(zena) references zena(sifra);
alter table mladic add foreign key(muskarac) references muskarac(sifra);
alter table sestra_svekar add foreign key(sestra) references sestra(sifra);
alter table sestra_svekar add foreign key(svekar) references svekar(sifra);



insert into muskarac(bojaociju, hlace,modelnaocala,maraka,zena)
values
	('plava', 'kratke','police',200.80,1),
	('zelena', 'duge', 'Ray Ban', 300.20, 2),
	('smeđe', 'široke', 'Diesel', 300.80, 3);
	


insert into sestra(introvertno, haljina, maraka, hlace, narukvica)
values
	(1, 'crvena', 20.50, 'bijele', 1),
	(1, 'crna', 80.30, 'duge',2),
	(0, 'plava', 10.50, 'kratke',3);
	

insert into zena(treciputa, hlace, kratkamajica, jmbag, bojaociju, haljina, sestra)
values 
	('2022-10-08 20:00', 'bijele', 'replay','09739952735', 'plava', 'crvena', 1),
	('2022-11-11 21:00', 'crne', 'Versace','35244876330', 'smeđa', 'duga', 2),
	('2022-10-10 22:00', 'kratke', 'Gucci','71298742476', 'zelena', 'crna', 3);
	


insert into svekar (bojaociju, prstena, dukserica, lipa, eura, majica)
values
	('crna',22, 'zelena',222.34, 567.89, 'duga'),
	('smeđa', 33, 'žuta',578.43, 527.90, 'plava'),
	('plava', 432, 'crna', 789.98, 763.67, 'crna');
	

insert into sestra_svekar(sestra, svekar)
values
	(1,1),
	(3,2),
	(3,3);



update cura set gustoca = 15.77
where sifra is not null;


delete from mladic where kuna > 15.78;

select kratkamajica from zena 
where hlace like '%ana%';


select f.dukserica, a.asocijalno , b.hlace
from mladic a 
inner join muskarac b on a.muskarac = b.sifra 
inner join zena c on b.zena = c.sifra
inner join sestra d on c.sestra = d.sifra 
inner join sestra_svekar e on d.sifra = e.sestra 
inner join svekar f on e.svekar = f.sifra
where 
c.hlace like 'a%' and d.haljina like '%ba%'
order by b.hlace desc;


select a.haljina, a.maraka
from sestra a
left join sestra_svekar b on a.sifra = b.sestra
where b.sestra is null;













