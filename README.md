**Jenkins**:  
- Before lunching you need to add certificate to `c:\Program Files\Java\jdk1.8.0_152\jre\lib\security\cacerts`  
- Jenkins .war lunch command line: `java -Djavax.net.ssl.trustStore='c:\Program Files\Java\jdk1.8.0_152\jre\lib\security\cacerts' -Djavax.net.ssl.trustStorePassword=changeit -jar jenkins.war  --httpPort=8080 --controlPort=8001`

**Gitlab runner** - configuration uses docker images.