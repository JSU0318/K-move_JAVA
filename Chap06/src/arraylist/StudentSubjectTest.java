package arraylist;

public class StudentSubjectTest {

	public static void main(String[] args) {
		Student studentLee = new Student("Lee");
		studentLee.addSubject("����", 100);
		studentLee.addSubject("����", 90);
		studentLee.showStudentInfo();
		
		Student studentKim = new Student("Kim");
		studentKim.addSubject("�ڹ�", 90);
		studentKim.addSubject("�Ϻ���", 100);
		studentKim.addSubject("����", 80);
		studentKim.showStudentInfo();

	}

}
