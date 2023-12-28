package in.ashokit.security;

import java.util.Base64;
import java.util.Base64.Encoder;

public class PwdSecurityService {
  public String encode(String text) {
	Encoder encoder=Base64.getEncoder();
	String encodeToString=encoder.encodeToString(text.getBytes());
     return encodeToString;
//after clean package goal it will create jar file under target folder then we will go
//through maven install  through run as then jar file will store into maven 
// local repository. then its install snapashot then after editing realease version u can add that dependancy in pom.xml file.
//shared librry concept->right click on project-maven build- write clean package-mvn install.
//follow this concept again in other projects.
  
  }
}
