Fibonacci
=========

*System Environemtal Variables*
========
    JAVA_HOME=<installed JDK>
    example: JAVA_HOME="C:\Program Files\Java\jdk1.7.0_13"

    ANT_HOME=<installed Ant directory/>
    example: ANT_HOME="C:\Program Files\apache-ant-1.8.4"

    PATH
    Add the following to the end of your System PATH environmental variable
    %JAVA_HOME%\bin
    %ANT_HOME%\bin 

*Configure Ant Build.xml script*
========
The second line of the ant build.xml file needs to be modified to reflect your Tomcat instalation directory.  This is used for deployment.

    <property name="TOMCAT_HOME" location="C:/Program Files/Apache Software Foundation/Tomcat 7.0" />

*Building/deploying*
========
* ant clean 		-- cleans the last build
* ant compile 		-- compiles the source
* ant package 		-- packages the war file for deployment
* ant deploy		-- copies the war file to the Tomcat/webapps directory for deployment
* ant undeploy		-- removes the war file from Tomcat/webapps

From the command line, navigate to the /Fibonacci directory which contains the build.xml file.

Using the above commands, 

<dl><dt>To compile and generate the required .class files</dt>
<dd>ant compile</dd>

<dt>To package the files into a .war file for deployment</dt>
<dd>ant package</dd>

<dt>To deploy the files to the Tomcat/webapps web server</dt>
<dd>ant deploy</dd>

<dt>To undeploy from the Tomcat server</dt>
<dd>ant undeploy</dd></dl>

*Testing*
========
Navigate a browser to http://localhost:8080/FibonacciWS/rest/fibonacci?n=5 
This will manually show the xml file returned

A simple test.html file is also provided, this contains a web form and 
a submit button.  This accepts values of n, submits them to the webservice
using HTTP GET and then displays the xml response.

The fibElements.xsd is provided in the root directory.  