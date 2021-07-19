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
	
	//학생이 수강하는 과목을 과목 리스트에 하나씩 추가하는 메서드
	public void addSubject(String name, int score) {
		
		Subject subject = new Subject(); //과목 생성
		subject.setSubjectName(name); // 과목이름 설정
		subject.setSubjectScore(score); // 과목점수 설정
		subjectList.add(subject); // 과목 리스트에 1개의 과목 추가
	}
	
	public void showStudentInfo() {
		for(Subject subject : subjectList) {
			System.out.println(studentID + "학생 (" + studentName + ")의 " + subject.getSubjectName() + " 과목의 성적은 " + subject.getSubjectScore() + "점입니다. ");
				sum += subject.getSubjectScore();
		}
		System.out.println(studentID + "학생 (" + studentName + ")의 총점은 " + sum + "점 입니다. ");
	}
	
}
