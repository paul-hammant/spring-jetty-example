Spring MVC Embedded Jetty Example
=================================

Basic Spring MVC 4 application using embedded Jetty 9 server for an Integration Test (Rest Assured). No-xml configuration.

Includes API REST service, but no HTML

Note: The spring app in this FORK has been pared down to a minimal helloworld interface versus ORIGIN (fernandospr/spring-jetty-example). 
That one has pages too and a bunch of sophisticated features I did not need in order to be able to demonstrate RestAssured.

There's also an Ant script for running the test from there (a team I work with uses Ant not Maven). A Python script (below)
gets the deps from Maven Central and organizes them into a libs/ folder, which is checked in.

Requirements
------------
JDK 8 and Maven 3

Requirements for running `mavdl.py`
-----------------------------------
Python3, Pip3 and ...

```
pip3 install sh
```