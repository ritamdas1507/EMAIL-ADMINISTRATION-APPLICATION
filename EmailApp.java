package Email.Application;

import java.util.*;

public class EmailApp {
	private String firstName;
	private String lastName;
	private String password;
	private String department;
	private int mailCapacityBox=550;
	private String alternateEmail;
	private int defaultPasswordLength=10 ;
	private String email;
	
	//Constructor to define the firstName and lastName
	
	public EmailApp(String firstName,String lastName)
	{
		this.firstName=firstName;
		this.lastName=lastName;
		System.out.println("email created: " + this.firstName + this.lastName);
		
		this.department=setDepartment();
		System.out.println("DEPARTMENT: " + this.department);
		
		this.password=generatePassword(defaultPasswordLength);
		System.out.println("YOUR PASSWORD IS " + this.password);
		
		email=firstName.toLowerCase() + "." + lastName.toLowerCase() + "." + "@" + "department" + "." + "xyzcompany.com";
		System.out.println("your EMAILID IS:" + this.email);
	}
	
	public void setMailBoxCapacity(int capacity)
	{
		this.mailCapacityBox=capacity;
	}
	
	public void setAlternateEmail(String altEmail)
	{
		this.alternateEmail=altEmail;
	}
	
	public void changePassword(String password)
	{
		this.password=password;
	}
	
	private String setDepartment()
	{
		System.out.print("NEW WORKER:" + firstName + ".DEPARTMENTAL CODES\n1 for sales\n2 for Development\n3 for Accounting\n0 for none\nEnter the department code:");
		Scanner sc=new Scanner(System.in);
		int dept=sc.nextInt();
		if(dept==1)
		{
			return "sales";
		}
		else if(dept==2)
		{
			return "dev";
		}
		else if(dept==3)
		{
			return "acc";
		}
		else
		{
			return "";
		}
	}
	
	private String generatePassword(int length)
	{
		String PasswordSet="ABCDEFGHIJKLMNOPQRSTUVWXYZ123456789@#$*";
		char password[]=new char[length];
		for(int i=0;i<length;i++)
		{
			int rand=(int)(Math.random() * PasswordSet.length());
			password[i]=PasswordSet.charAt(rand);
		}
		return new String(password);
	}
	
	public int getMailboxCapacity()
	{
		return mailCapacityBox;
	}
	public String getAlternateEmail()
	{
		return alternateEmail;
	}
	public String getPassword()
	{
		return password;
	}
	public String showInfo()
	{
		return "DISPLAY NAME: " + firstName + " " + lastName + 
				"\nCompany EMAILID:" + email +
				"\nMailBoxCapacity: " + mailCapacityBox + "mb";
	}
	
	

}

	