package singleton;

public class Company {
	private static Company instance = new Company();
	
	private Company() {}
	
	public static Company getInstance() {
		if(instance == null ) {
			instance = new Company();
			
		}
			System.out.println(company1);
			System.out.println(company2);//�ܺ� Ŭ���������� ������ �� ������ ���� �����ڸ� private���� ����
		
	}
	
	
}
