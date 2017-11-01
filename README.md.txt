So for my integration with an existing application from a classmate, I chose Java based application located at the following repo : https://github.com/basoltanifarWVUMix/program1

I chose this project because 1) it uses Java so it was easy for me to integrate and also because it uses a POM based project structure which makes it really easy for me to add this 
project as a dependency to my existing project. In order to run the application, you will have to clone the application in your local repository and then use Eclipse to import the 
project as a Maven project . Then, simply navigate to the com.mohit.calculator.App.java main file and run it as a plain java application. I have not had time to compile this project 
as an executable jar file so you will not be able to run this application in the command line using the java -cp command. 

In terms of integrating this application , my experience was fairly pleasant. All I had to do was create a POM based java project and add the existing project as a dependency to in 
my POM file. Once I run the Maven Clean Install command , I was able to download all the Jars file that were required for me and I was able to access the necessary APIs. 

In terms of writing the test for the application, it was little hard understanding the code as it was not very readable and there was no clear documentation on how to test the application.
I used black box reuse and simply invoked the external APIs for this program. 