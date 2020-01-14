# Wildlife Tracker

## About 
- This is a java application made using the spark framework,it allows wildlife rangers keep track of animals in a pack. It also has the capability of giving them the power to classify 
## Contributor
- Elvin Omonche (Omosh Thegeek)

## BDD

|Behaviour 	           |    Input 	                 |      Output          |
|----------------------------------------------|:-----------------------------------:|-----------------------------:|       
|Web page renders     | -website url|  User redirected to a landing page.
|submit form    | -fill form|  User redirected to post successful page
|click bac home on post successful page    | -Click|  User redirected to homepage and they can see posted sightings.

## Setup Requirements
- jdk 8 and above
- gradle 6. and above

## Setup Instructions

 ###### fork and clone the project from github
###### Run the following scripts to create the postgres database;
 - CREATE DATABASE wildlife_tracker;
 - CREATE TABLE animals (id  serial PRIMARY KEY, name varchar,age varchar, healthy varchar,endangered varchar );
 - CREATE TABLE sightings (id serial PRIMARY KEY, location varchar ,ranger varchar);
 - CREATE DATABASE wildlife_tracker_test WITH TEMPLATE wildlife_tracker;
 
    -run the command "gradle run" from the root project folder
- 

## Technologies Used

* Java
* Spark
* HTML5, CSS3 and Bootstrap
* JUnit



## License and Copyright information

This project is licensed under the MIT License.

The MIT License (MIT)

Copyright (c) 2020, Omosh Thegeek.

Permission is hereby granted, free of charge, to any person obtaining a copy of this software and associated documentation files (the "Software"), to deal in the Software without restriction, including without limitation the rights to use, copy, modify, merge, publish, distribute, sublicense, and/or sell copies of the Software, and to permit persons to whom the Software is furnished to do so, subject to the following conditions:

The above copyright notice and this permission notice shall be included in all copies or substantial portions of the Software.

THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.


## Contact information
 - For queries ,comments compliments etc ,feel free to reach out to OmoshtheGeek on the following platforms
    #### Twitter :
    * ###### @elvizoh

    #### Facebook :
    * ###### @Elvin Omoxh

    #### Telegram :
    * ###### @omoshthegeek

## Support or contribution instructions
Feel like donating to the cause??? You can send us contributions on the platforms below :
 #### Paypal :
* ###### @ omoshthegeek@gmail.com