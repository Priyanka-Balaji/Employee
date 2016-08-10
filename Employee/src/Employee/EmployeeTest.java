package Employee;

public class EmployeeTest {
	public static void main(String[] args) {
		double i,j;
		Employee emp1=new Employee();
		Employee emp2=new Employee();
		emp1.setFirstName();
		emp1.setLastName();
		emp1.setSalary();
		emp2.setFirstName();
		emp2.setLastName();
		emp2.setSalary();
		emp1.employeeTest(emp1);
		emp2.employeeTest(emp2);
		i=emp1.getSalary();
		emp1.rise(i,emp1);
		i=emp2.getSalary();
		emp2.rise(i,emp2);
		System.out.printf("\nAFTER RISE : ");
		emp1.employeeTest(emp1);
		emp2.employeeTest(emp2);

	}

}
