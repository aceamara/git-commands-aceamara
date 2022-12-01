CREATE DATABASE webApp

DROP DATABASE webApp;

USE webApp;

select * from webApp.appUsers;

CREATE TABLE IF NOT EXISTS appUsers(
accountId INT PRIMARY KEY NOT NULL UNIQUE,
customerPasscode varchar(10)NOT NULL,
customerName VARCHAR (20) NOT NULL, 
address VARCHAR(200) NOT NULL UNIQUE,
phoneNumber INT (10) NOT NULL UNIQUE,
bankBalance INT (10)DEFAULT "0");

INSERT INTO appUsers
VALUES 
(10101,"garfieldLasagne","Garfield Cat","Pabo Lane, Llangwstenin, Llandudno Junction LL31 9JF",0773542918,2000000),
(10102,"pirate123","Jack Sparrow","52-54 Guildford Street, Chertsey, GB KT16 9BE",0773453291,600),
(10103,"santaClaus25","Santa Claus","Arctic Circle 96930 Arctic Circle Finland",0776549872,50000000);

ALTER TABLE appUsers MODIFY COLUMN address VARCHAR(200);
ALTER TABLE appUsers MODIFY COLUMN customerPasscode VARCHAR (25);
