CREATE DATABASE db; 
USE db;

CREATE TABLE film(
    film_id SMALLINT PRIMARY KEY AUTO_INCREMENT,
    title VARCHAR(225),
    release_year VARCHAR(4),
    LENGTH SMALLINT
)