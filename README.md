To launch with Maven:

mvn -Dtest = packageWefox. ** test

To launch from command line or Jenkins job:

It would be necessary to change in the Script the Geckodriver path, it may not work if it is not done and:
Create folder, inside: testng.xml, lib folder.
  inside lib folder: selenium JAR, testng JAR, script JAR, java-client JAR, geckodriver.
cmd line: java -cp lib / * ;. org.testng.TestNG testng.xml

Or just go down to Eclipse and run it from there.
