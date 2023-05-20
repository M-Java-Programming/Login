package Main;

import java.util.HashMap;

public class LoginID {
	
	HashMap <String, String> loginId = new HashMap <String, String>();
	
	LoginID(){
		
		loginId.put("Mutiu", "1234");
		loginId.put("Miq", "Miqsource");
		loginId.put("SourceCode", "KeepMoving");
		
	}
	protected HashMap <String,String> getloginId(){
		
		return loginId;
	}
	
	public void setloginId(String Username, String Password) {
		
		loginId.put(Username, Password);
		
	}

}
