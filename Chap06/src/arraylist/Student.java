package arraylist;

import java.util.ArrayList

public class Student {

	private static int serialNo = 1000;
	private int studentID;
	private String studentName;
	ArrayList<Subject> subjectList;
	
	public Student(String studentName) {
		this.studentID = ++serialNo;
		this.studentName = studentName;
		this.studentID = new ArrayList<Subject>();
	}
	
	//�л��� �����ϴ� ������ ���� ����Ʈ�� �ϳ��� �߰��ϴ� �޼���
	public void addSubject(String name, int score) {
		
		Subject subject = new Subject(); //���� ����
		subject.setSubjectName(name); // �����̸� ����
		subject.setSubjectScore(score); // �������� ����
		subjectList.add(subject); // ���� ����Ʈ�� 1���� ���� �߰�
	}
	
	public void showStudentInfo() {
		for(Subject subject : subjectList) {
			System.out.println(studentID + "�л� (" + studentName + ")�� " + subject.getSubjectName() + " ������ ������ " + subject.getSubjectScore() + "���Դϴ�. ");
				sum += subject.getSubjectScore();
		}
		System.out.println(studentID + "�л� (" + studentName + ")�� ������ " + sum + "�� �Դϴ�. ");
	}
	
}
