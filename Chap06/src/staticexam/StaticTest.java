package staticexam;

public class StaticTest {
//�ν��Ͻ� ���� �� �� serialNum Ȯ��
	
	public static void main(String[] args) {
		System.out.println(Student.getSerialNum()); //�ν��Ͻ� ������ �����ϰ� ��� ������ ���� ����
		
		Student std1 = new Student();
		std1.setStudentName("�迬��");
		System.out.println(std1.getStudentName() + " �л� �й� : " + std1.getStudentID());
		System.out.println(std1.serialNum);
		
		Student std2 = new Student();
		std2.setStudentName("�����");
		System.out.println(std2.getStudentName() + " �л� �й� : " + std2.getStudentID());
	//	System.out.println(std2.serialNum);
		System.out.println(Student.serialNum); //�ν��Ͻ� ������ �����ϴ� ���� �ƴ϶� Ŭ���� �̸����� ���������� �����ؼ� ����ؾ߸� �Ѵ�.
	}

}
