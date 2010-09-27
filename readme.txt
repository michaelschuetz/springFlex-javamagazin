				springFlex-javamagazin
				======================

Source Code for Spring3 Flex4 article in JavaMagazin.

* Spring 3
* Flex 4
* Maven 3

Build successful with Maven 2.2 and 3.beta2.

Deployable against Apache Tomcat 6 web container.

Build application:
1) git checkout sources or download zip
2) Go to project root and run "mvn clean install"

Run application:
1) Download apache-tomcat-6.0.29 here: http://tomcat.apache.org/download-60.cgi
2) Extract archive
3) Copy \\springFlex-javamagazin\jm-war\target\springFlex-javamagazin.war
3) Paste war-file to \\apache-tomcat-6.0.29\webapps
4) Run \\apache-tomcat-6.0.29\bin\startup (.bat for Windows, .sh for Unix)
5) Point browser to http://localhost:8080/springFlex-javamagazin

############

TODO:
* add Spring JUnit test case
* try updating Spring-flex(blazeds) version
* test if all listed repos are required (see TODO's)
* test usage of Apache 7