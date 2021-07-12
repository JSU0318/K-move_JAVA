package singleton;

public class CompanyTest {
	// TDD : Test Driven Development (�׽�Ʈ �ֵ� ���� ���)
	public static void main(String[] args) {
	//  Company company1 = new Company();
	//	Company company2 = new Company();
		
		//Ŭ���� �̸����� ȣ���� ������ Ŭ����
		Company company1 = Company.getInstance();
		Company company2 = Company.getInstance();
		
		System.out.println(company1);
		System.out.println(company2);
		
		// Company company3 = new Company(); //error
		
		String result = (company1 == company2) ? "������ ȸ��" : "���� �ٸ� ȸ��";
		System.out.println(result);
	}

}
