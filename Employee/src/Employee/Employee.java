package Employee;
import java.util.Scanner;
public class Employee {
	String firstName;
	String lastName;
	double salary;
	public Employee() {
		firstName=null;
		lastName=null;
		salary=0.0;// TODO Auto-generated constructor stub
	}
	Scanner input=new Scanner(System.in);
	public void setFirstName()
	{
			System.out.printf("\nEnter first name : ");
			firstName=input.next();
			
	}
	public void setLastName()
	{
			System.out.printf("\nEnter last name : ");
			lastName=input.next();
			
	}
	public void setSalary()
	{
			System.out.printf("\nEnter salary : ");
			int a=input.nextInt();
			if(a>0)
				salary=a;
	}
	String getFirstName()
	{
			return firstName;
	}
	String getLastName()
	{
		return lastName;
	}
	double getSalary()
	{
		return salary;
	}
	public void rise(double s,Employee e)
	{
		e.salary=s+s*0.1;
	}
	public void employeeTest(Employee e)
	{
			System.out.printf("\nEmployee: \nFirst Name : %s \nLast Name : %s\nSalary : %.2f",e.getFirstName(),e.getLastName(),
					e.getSalary()*365);

	}
	}

