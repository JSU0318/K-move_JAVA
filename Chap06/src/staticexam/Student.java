package staticexam;

public class Student {
	private static int serialNum = 10000; //인스턴스의 생성과 무관한 클래스 변수, 외부에서 함부로 접근 불가
	private int studentID;
	private String studentName;
	
	public Student( ) {
		serialNum++;
		this.studentID = serialNum;
		
	}
	//외부 클래스에서 공유할 수 있도록 클래스 메서드를 추가
	
	//학번은 수정할 수 없는 읽기전용 (메소드)
	
	public static int getSerialNum() {
		int a = 100;
		a += 100;
		System.out.println("a : " + a);
		studentName = "이름 없음"; // 멤버변수, 인스턴스 변수, 속성, property, attribute 값은 정적 메서드
		return serialNum; // 클래스 변수, static 변수, 정적 변수, 공유 변수
	}
	public int getStudentID() {
		return studentID;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	
}
