export CATALINA_HOME=/Developer/eInfo/apache-tomcat

$CATALINA_HOME/bin/shutdown.sh

rm -rf  /Developer/eInfo/apache-tomcat/webapps/eInfo
cp -R /Developer/eInfo/eInfoServer/eInfo/target/eInfo /Developer/eInfo/apache-tomcat/webapps/eInfo

$CATALINA_HOME/bin/startup.sh
