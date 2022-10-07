package Week3.Homework.Ödev1;

public class CustomerManager {
	private Customer _customer;
	ICreditManager _creditManager;

	public CustomerManager(Customer customer, ICreditManager creditManager) {
		_customer = customer;
		_creditManager = creditManager;
	}

	public void Save() {
		System.out.println("Müsteri kaydedildi: ");

	}

	public void Delete() {
		System.out.println("Müsteri silindi: ");

	}

	public void GiveCredit() {
		_creditManager.Calculate();
		System.out.println("Kredi verildi.");
	}
}
