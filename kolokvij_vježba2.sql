drop database if exists vjezba2;
create database vjezba2;
use vjezba2;


create table cura(
    sifra int not null primary key auto_increment,
    haljina varchar(33) not null,
    drugi_puta datetime not null,
    suknja varchar(38),
    narukvica int,
    introverttno bit,
    majica varchar(40), 
    decko int



);


create table decko(
    sifra int not null primary key auto_increment,
    indiferentno bit,
    vesta varchar(34),
    asocijalno bit not null

);


create table prijatelj(
    sifra int not null primary key auto_increment,
    modelnaocala varchar(37),
    treciputa datetime not null,
    ekstrovertno bit not null,
    prviputa datetime,
    svekar int

);


create table svekar(
    sifra int not null primary key auto_increment,
    stilfrizura varchar(43),
    ogrlica int not null,
    asocijalno bit not null




);

create table decko_zarucnica(
    sifra int not null primary key auto_increment,
    decko int not null,
    zarucnica int not null

);

create table zarucnica(
    sifra int not null primary key auto_increment,
    narukvica int,
    bojakose varchar(37) not null,
    novcica decimal(13,9),
    lipa decimal(15,8) not null,
    indiferentno bit not null




);

create table neprijatelj(
    sifra int not null primary key auto_increment,
    majice varchar(32),
    haljina varchar(43) not null,
    lipa decimal(16,6),
    modelnaocala varchar(49) not null,
    kuna decimal(12,6) not null,
    jmbag char(11),
    cura int

);



create table brat(
    sifra int not null,
    suknja varchar(47),
    ogrlica int not null,
    asocijalno bit,
    neprijatelj int

);



alter table cura add foreign key(decko) references decko(sifra);
alter table brat add foreign key(neprijatelj) references neprijatelj(sifra);
alter table neprijatelj add foreign key(cura) references cura(sifra);
alter table decko_zarucnica add foreign key(decko) references decko(sifra);
alter table decko_zarucnica add foreign key(zarucnica) references zarucnica(sifra);
alter table prijatelj add foreign key(svekar) references svekar(sifra);



select * from cura;

insert into cura(haljina, drugi_puta)
values
      ('plava', '2022-08-10 20:00'),
      ('crvena', '2022-09-09 19:00'),
      ('ljubicasta', '2022-09-10 18:00');
     

select  * from neprijatelj;
     
insert into neprijatelj(haljina, modelnaocala, kuna)
values
	('plava', 'Ray-ban', 12.32),
	('zelena', 'Police', 13.33),
	('žuta', 'Diesel', 14.23);
	

insert into decko(asocijalno)
values
	(1),
	(1),
	(2);

insert into zarucnica(bojakose, lipa, indiferentno)
values
	('plava',15.6,1),
    ('crvena',11.4,2),
	('zuta',20.0,1);


insert into decko_zarucnica(decko, zarucnica)
values
	(1,2),
	(1,1),
	(2,2);

update prijatelj
set treciputa = '2020-04-30'
where sifra is not null;


delete from brat 
where ogrlica !=14;

select suknja from cura
where drugiputa is null;


select a.novcica, f.neprijatelj, e.haljina 
from zarucnica a
inner join decko_zarucnica b on a.sifra = b.zarucnica 
inner join decko c on b.decko = c.sifra 
inner join cura d on c.sifra = d.decko 
inner join neprijatelj e on d.sifra = e.cura 
inner join brat f on e.sifra = f.neprijatelj
where d.drugi_puta is not null and c.vesta like '%ba%'
order by 3 desc;


select a.vesta, a.asocijalno 
from decko a
left join decko_zarucnica b on a.sifra =b.decko 
where b.sifra is null;





