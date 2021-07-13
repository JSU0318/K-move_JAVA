package array.alone.id;

public class StudentArray {

	Student[] students = new Student[3];
	
	student[0] = new Student("James");
	student[1] = new Student("Tomas");
	student[2] = new Student("Edward");
	
	for (int i = 0; i < students.length; i++) {
		students[i].showStudentInfo();
	}
}
