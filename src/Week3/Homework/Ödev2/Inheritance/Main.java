package Week3.Homework.Ödev2.Inheritance;

public class Main {

	public static void main(String[] args) {
		Customer customer = new Customer();
		Employee employee = new Employee();
		EmployeeManager employeeManager = new EmployeeManager();
		CustomerManager customerManager = new CustomerManager();
		customerManager.List();
		employeeManager.BestEmployee();

	}

}
