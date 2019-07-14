package git_demo_20190711;

import java.util.ArrayList;
import java.util.List;

public class ArrayDemo {
	public static void main(String[] args) {
		List<Student> studentList = new ArrayList<Student>();
		Student student1 = new Student("dema",100);
		Student student2 = new Student("manzi",200);
		studentList.add(student1);
		studentList.add(student2);
		System.out.println(studentList);
	}
}
