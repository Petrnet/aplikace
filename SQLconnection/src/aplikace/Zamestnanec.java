package aplikace;
import java.util.*;


public class Zamestnanec 
	{	
    private String EID;
	private String name;
	private String username;
	private String surname;
	private String password;
	
	public Zamestnanec(String EID, String name, String username, String surname, String password)
	 {
		super();
		this.EID = EID;
		this.name = name;
		this.username = username;
		this.surname = surname;
		this.password = password;
	 }


public String getName()  {
	return name;
}

public String setName()  {
	return name;
}

public String getEID()  {
	return EID;
}
public String setEID()  {
	return EID;
}
	public String getUsername()  {
		return username;
	}	
	public String setUsername()  {
		return username;
	}	
	
		public String getSurname()  {
			return surname;
		}
		
		public String setSurname()  {
			return surname;
		}
			
public String getPassword()  {
				return password;
}
				public String setPassword() {
					return password;
				}

}