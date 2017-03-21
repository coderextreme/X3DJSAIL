javac -classpath ".;./saxon9he.jar;./jslint4java-2.0.5.jar;./json-schema-validator-2.2.6-lib.jar;./X3DJSAIL.3.3.classes.jar;./X3DJSAIL.3.3.full.jar" *.java

FOR %%i IN ("*.class") DO java -classpath ".;./saxon9he.jar;./jslint4java-2.0.5.jar;./json-schema-validator-2.2.6-lib.jar;./X3DJSAIL.3.3.classes.jar;./X3DJSAIL.3.3.full.jar" %%~ni
