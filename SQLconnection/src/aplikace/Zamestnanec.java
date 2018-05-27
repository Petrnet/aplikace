package aplikace;
import java.util.*;


public class Zamestnanec 
	{	
    private final String EID;
	private final String name;
	private final String username;
	private final String surname;
	private final String password;
	
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

public String getEID()  {
	return EID;
}
	public String getUsername()  {
		return username;
	}	
		public String getSurname()  {
			return surname;
		}
			
public String getPassword()  {
				return password;

}
}