create table CAR (
  id integer primary key,
  brand VARCHAR2(150),
  model VARCHAR2(200),
  power DOUBLE,
  year_of_issue YEAR,
  assessed_value DEC(20)
);

create table AIRPLANE (
  id integer primary key,
  brand VARCHAR2(150),
  model VARCHAR2(200),
  manufacturer VARCHAR2(500),
  year_of_issue YEAR,
  fuelCapacity INT,
  seats INT
);

create table ASSESSED_VALUE(
 id integer primary key,
 assessed_value DEC(20),
 itemId INTEGER,
 date_of_value DATE
 );