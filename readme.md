testing the loadrunner jenkins. postman for token. then run java script. the file generated is run on loadrunner for analysis. in jenkins downloaded NodeJS (newman). downloaded node js locally. and nvm https://github.com/coreybutler/nvm-windows/blob/master/README.md

javac not reconigzed for Jenkins Windows batch command

In Jenkins goto Manage Jenkins -> Configure System , scroll down to JDK installations and click the ADD JDK button.

I recommend trying the Install Automatically option, and let it install a fresh copy and give it a name you can recognize in project setting like jdk8_update51, and agree to the license.

In each project check that the JDK Setting is the correct version.

In windows batch command text box, you may want to add

echo "PATH is:" echo %PATH%

echo "JAVA_HOME is:" echo %JAVA_HOME%

javac -version

If this fails as above, try :

eg.

set PATH="C:\Program Files\Java\jdk1.8.0_31\bin"

javac -version

should print the following in Console Output:

javac 1.8.0_31

Note: "C:\Program Files\Java\jdk1.8.0_31\bin" should have the file javac.exe in it.

Caused: java.io.IOException: Cannot run program "sh" (in directory "C:\ProgramData\Jenkins.jenkins\workspace\Test101"): CreateProcess error=2, The system cannot find the file specified https://stackoverflow.com/questions/15135771/hudson-on-windows-error-java-io-ioexception-cannot-run-program-sh

After vscode had eclispe dependency for java, downloaded Buckminster plugin for eclipse ------ https://stackoverflow.com/questions/7247344/can-jenkins-build-eclipse-projects

https://wiki.jenkins.io/JENKINS/Setting-up-Eclipse-to-build-Jenkins.html

Environment Injector for setting environment variable

Maven inegration needed along with setting the install automatically in global config mention settings.sml for seetinf path (Maven)

javac -cp .;org.example.jar mysource.java

javac -cp C:\Users...\com.sap.mcm.perf.loadrunner-1.0.jar C:\Users....\Actions.java

Environmental variable / paramater input https://stackoverflow.com/questions/39617067/jenkins-displaying-echo-command-in-console-output-page
