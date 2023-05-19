package model;

public class RegCustomer 
{
	private int reg_no;
	public RegCustomer()
	{
		
	}
	public RegCustomer(int reg_no)
	{
		this.reg_no=reg_no;
	}
	public double giveDiscount(double b)
	{
		return (b*0.10);
	}
}
