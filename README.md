# Corona Virus Tracker Application
Java Spring Boot application to track reported data of confirmed Coronavirus infections COVID-19 (2019-nCoV) around the world.

**Data source used**: Novel Coronavirus (COVID-19) Cases, provided by [JHU CSSE](https://github.com/CSSEGISandData/COVID-19)

This application scheduled everyday to fetch latest data from above data source.

**Corona Virus Tracker preview:**

![Alt text](corona_virus_tracker_application.png?raw=true "Corona Virus Tracker UI")

**To Build app:**
```$xslt
mvn compile
```
**To install app:** 
```$xslt
mvn install
```
**To Run Tests:**
```$xslt
mvn test
```
**To Start app:**
```$xslt
mvn spring-boot:run
```