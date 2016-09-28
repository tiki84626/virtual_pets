# _Virtual Pets_

#### _Virtual Pets is a web app that allows users to "adopt" digital creatures, 9/28/16_

#### By _**Andrew Malkin**_

## Description

_Virtual Pets is a basic database-backed Spark application that allows users to adopt a digital pet. It includes methods for different interactions users have with their pets, such as feeding them, putting them to bed, or playing with them._

## Setup/Installation Requirements

* _Clone the virtual_pets repository [here](https://github.com/tiki84626/virtual_pets)._
* _Set up necessary Database and Tables:_
    * _make sure Postgres Server is running:_ `postgres`,
    * _open new terminal tab/window and connect to Postgres:_ `psql`,
    * _create database virtual_pets (in sql):_ `CREATE DATABASE virtual_pets;`,
    * _navigate to project directory in terminal and load tables:_ `psql virtual_pets < media.sql`.
* _Brew or Scoop install gradle._
* _Navigate to project directory compolie and run:_ `gradle run`.

## Known Bugs

_There are no known bugs._

## Technologies Used

_Virtual Pets was created using Java, PostgreSQL, Spark, Velocity, and Gradle._

### License

*This software is licensed under MIT license.*

Copyright (c) 2016 **_Andrew P. Malkin_**
