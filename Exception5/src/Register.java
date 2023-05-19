
public class Register 
{
	private String username;
	private String country;
	
	public Register(String username, String country) 
	{
		
		this.username = username;
		this.country = country;
	}
	public boolean validateCountry()
	{
		boolean flag=false;
		if(country.equals("India")||country.equals("INDIA")||country.equals("india"))
		{
			flag=true;
		}
		return flag;
	}
	
	
	

}
