package Week3.Homework.Ödev2.abstractDemo;

public class Main {

	public static void main(String[] args) {
		CustomerManager customerManager = new CustomerManager();
		customerManager.baseDatabaseManager = new MysqlDatabaseManager();
		customerManager.getCustomers();
	}

}
