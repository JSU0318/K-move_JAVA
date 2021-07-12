package singleton.tdd;

public class Company {
	Company static company = new Company();
	
	private Company() {
		System.out.println("Company");
	}
	
	public static Company getCompany() {
		return company;
	}
}
