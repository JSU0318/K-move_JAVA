package singleton;

public class Company {
	private static Company instance = new Company();
	
	private Company() {}
	
	public static Company getInstance() {
		if(instance == null ) {
			instance = new Company();
			
		}
			System.out.println(company1);
			System.out.println(company2);//외부 클래스에서는 생성할 수 없도록 접근 제어자를 private으로 설정
		
	}
	
	
}
