CREATE DATABASE wildlife_tracker;
\c wildlife_tracker;
CREATE TABLE animals (id SERIAL PRIMARY KEY, name VARCHAR,age VARCHAR, endangered VARCHAR, healthy VARCHAR);
--CREATE TABLE sightings (id SERIAL PRIMARY KEY, name VARCHAR);
CREATE DATABASE wildlife_tracker_test WITH TEMPLATE wildlife_tracker_test;