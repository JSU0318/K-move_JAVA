package staticexam;

public class Student {
	private static int serialNum = 10000; //�ν��Ͻ��� ������ ������ Ŭ���� ����, �ܺο��� �Ժη� ���� �Ұ�
	private int studentID;
	private String studentName;
	
	public Student( ) {
		serialNum++;
		this.studentID = serialNum;
		
	}
	//�ܺ� Ŭ�������� ������ �� �ֵ��� Ŭ���� �޼��带 �߰�
	
	//�й��� ������ �� ���� �б����� (�޼ҵ�)
	
	public static int getSerialNum() {
		int a = 100;
		a += 100;
		System.out.println("a : " + a);
		studentName = "�̸� ����"; // �������, �ν��Ͻ� ����, �Ӽ�, property, attribute ���� ���� �޼���
		return serialNum; // Ŭ���� ����, static ����, ���� ����, ���� ����
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
