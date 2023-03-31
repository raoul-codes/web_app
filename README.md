# web_app


Web Application development

Raoul Nzoda Fongang : 580888

 




My Website:     Web Application.
Contents:
I-	Introduction
II-	Tools and Technologies used
1-	Back end Side
2-	Front end Side
3-	Tools
III-	Implementation / developing
1-	Implementation of sprintboot back end application.
2-	Implementation of databases
3-	Implementation of Angular Front end application.
IV-	Demo of complete full stack application
V-	Conclusion
VI-	References







I-	INTRODUCTION:

Internet in general and exchanging information online, in particular, have been essential objects in the human technical era. This is the reason why myriad social media platforms appeared to become one of the best connection ways for human interaction as well as exchanging information. Most of the popular enterprises, especially Facebook, are using web applications to build their social media platforms, because of many advantages such as reducing business costs, zero-install, or quick and easy updates.
Furthermore, there are diverse options in the platform and programming language in order to construct a web application due to the constant development of technology. The Java technologies support to web application robustly with Java EE, JVM, Servlet, JSP, or JDBC. The reason why many firms were con vinced in choosing Java technologies for their web applications is strong and stable language programming. In web application development, there are a lot of advantages of Java: complied and interpreted, independent and portable platform, object-oriented programming language, strong and secure, distributed, simple and small, multithreaded and interactive, high performance, dynamic and scalable. Besides that, Java is a long-standing programming language with high popularity and familiar with many programmers, especially junior programmers who are the beginners in programming.
The goal of this project is to know how to build web applications in Java and deeply understand Java knowledge of web applications. The project created a sample login form using Java technologies. This connection allows end users to connect using Servlet, JSP and Apache Tomcat server. Data is requested and stored in the POSTGERSQL database via JDBC, which is an API for connecting and executing a query with the POSTGRESQL database.
In this project, we are going to develop a web application using Angular 15 as front-end and Spring boot as back-end.














II-	Tools and Technologies used

1-	Back end side
Spring Boot is a very popular Java framework for building Restful Webservices and Microservices. 
to develop this application I used :
	Spring boot : Spring Boot CLI V3.0.4
	JDK 18.0.1 and JRE 17
	PostgreSQL 
	Spring Boot Framework

2-	Front end side
Angular is a platform and framework for building single-page client applications using HTML and TypeScript. Angular is written in TypeScript.
to develop this application I used :
	Angular CLI 15.2.4
	Node 18.12.1
	Npm 8.19.2
3-	Tools
to develop this application I used :
	Maven
	IDE Spring Boot Tool Suite (STS)
	Angular CLI






III-	Implementation / developing

1-	Develop Spring Boot Application

a-	Creation of a Spring boot App 
I create my Spring boot Projet with Spring Initializer 
this method create a complete maven project with dependencies.

b-	I create JPA Entity user.java inside a new package :
 

c-	I create a Spring data Repository BasicRepositoryUser.java :

 



d-	I create a Spring controller UserController.java and userService.java :

 
 

e-	 run the application and test it :

 



2-	Database side

a-	Add dependency in pom.xml:
<dependency>
			<groupId>org.postgresql</groupId>
			<artifactId>postgresql</artifactId>
			<scope>runtime</scope>
		</dependency>
b-	In  application.properties i connaceted my database with my Web App :

 


C -  i can finally create my database.

 
3-	Develop Angular Application

a-	I create an Angular App using Angular CLI with the command: 
Ng new name

b-	Now i can open it with STS .
I need to import some modules to perform my Front end App :
-	BrowserModule,
-	     HttpClientModule,
-	     ReactiveFormsModule,
-	     BrowserAnimationsModule,
-	     MatTableModule,
-	     MatButtonModule,
-	     MatDialogModule,
-	     MatInputModule
-	
I import these modules in App.module.ts. 
c-	I write my html code in app.component.html


 
	
d-	I write my css code in app.component.css

 

e-	I create user-dialog component :
It is used te create and handle a new user from database. 
 

 

f-	And finally i can run my Angular App with command:
Ng serve -o
















IV-	Demo of complete full stack application

in this part I present what looks like the demonstration or the execution of my web application.
Make sure that both (Spring boot and Angular) applications are up and running.

Hit http://localhost:4200 link in a browser that will host this Angular app.






Users List Page:
 














Add User Page:
 

Edit User Page:
 



Empty page:
 













V-	Conlusion

Since the introduction of 4G mobile networks, the majority of people have the internet on their
mobile devices as well as on PCs. This has created an always online culture. Business and
society have taken advantage of this and therefore require fast, secure, and maintainable
solutions to their development needs. Web frameworks achieve this by allowing developers with only intermediate knowledge and experience to cater for these needs. Thanks to libraries, helper functions, the MVC pattern, URI segment schemes, and active record pattern, making a web application is faster, easier, more maintainable, and more secure when developing using a web framework, but it’s worth noting it is not a complete solution. There are still major parts of the application it will not help with, such as object modelling, database design, responsive design, styling, and front-end scripting. Thankfully, there are tools and methodologies that can ease that burden. The author acknowledges UML, MySQL Workbench, Bootstrap and jQuery technologies, which helped migrate these difficulties.
The full prototype application has been successfully built, but it's not perfect yet there is still a lot to do. This was for brevity and to avoid repeating code that basically does the same thing.








VI-	References

-	https://www.diva-portal.org/smash/get/diva2:1617604/FULLTEXT01.pdf
-	https://www.bezkoder.com/spring-boot-angular-13-postgresql/
-	https://www.javaguides.net/2021/08/spring-boot-postgresql-crud-example.html
-	https://www.theseus.fi/bitstream/handle/10024/344768/Hoang_Cuong.pdf?sequence=2&isAllowed=y
-	https://www.youtube.com/watch?v=V4m7to1GoRs
-	https://www.udemy.com/course/intro-db-app-dev-springboot-angular/?utm_source=adwords&utm_medium=udemyads&utm_campaign=LongTail_la.EN_cc.ROW&utm_content=deal4584&utm_term=_._ag_77879423894_._ad_535397279517_._kw__._de_c_._dm__._pl__._ti_dsa-1007766171032_._li_9061136_._pd__._&matchtype=&gclid=CjwKCAjw5pShBhB_EiwAvmnNVy64CaGwCq6TVEO7rSR8heEFz5CMXNt6lRlyDuT-tlo72FoBFxVDhhoCv5kQAvD_BwE
-	https://devpress.csdn.net/postgresql/62f228b6c6770329307f612c.html

