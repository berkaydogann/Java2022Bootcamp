package Week3.Homework.Ödev1;

public class Main {

	public static void main(String[] args) {
		CustomerManager customerManager = new CustomerManager(new Customer(), new CarCreditManager());
		customerManager.GiveCredit();
		customerManager.Save();

		TeacherCreditManager teacherCreditManager = new TeacherCreditManager();
		teacherCreditManager.Save();
	}

}
