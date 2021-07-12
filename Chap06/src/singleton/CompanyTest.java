package singleton;

public class CompanyTest {
	// TDD : Test Driven Development (테스트 주도 개발 방법)
	public static void main(String[] args) {
	//  Company company1 = new Company();
	//	Company company2 = new Company();
		
		//클래스 이름으로 호출이 가능한 클래스
		Company company1 = Company.getInstance();
		Company company2 = Company.getInstance();
		
		System.out.println(company1);
		System.out.println(company2);
		
		// Company company3 = new Company(); //error
		
		String result = (company1 == company2) ? "유일한 회사" : "서로 다른 회사";
		System.out.println(result);
	}

}
