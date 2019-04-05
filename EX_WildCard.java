package generic;
import java.util.Arrays;
public class EX_WildCard {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EX_WildCard card = new EX_WildCard();
		Course<Person> personCourse = new Course<>("�Ϲ��� ����",5);
		personCourse.add(new Person("�Ϲ���"));
		personCourse.add(new Worker("������"));
		personCourse.add(new Student("���л�"));
		personCourse.add(new HighStudent("���"));
		
		Course<Worker> workerCourse = new Course<>("������ ����",5);
		workerCourse.add(new Worker("������"));
		
		Course<Student> studentCourse = new Course<>("�л� ����",5);
		studentCourse .add(new Student("���л�"));
		studentCourse .add(new HighStudent("���"));
		
		Course<HighStudent> highStudentCourse = new Course<>("����л� ����", 5);
        highStudentCourse.add(new HighStudent("����л�"));
        
        registerCourse(personCourse);
        registerCourse(workerCourse);
        registerCourse(studentCourse);
        registerCourse(highStudentCourse);

        
        System.out.println();
        
        registerCourseStudent(studentCourse);
        registerCourseStudent(highStudentCourse);
 
        System.out.println();
 
        registerCourseWorker(workerCourse);
        registerCourseWorker(personCourse);


	}
	public static void registerCourse(Course<?> course) {
		System.out.println(course.getName()+"������ : "+Arrays.toString(course.getStudents()));
	}
	public static void registerCourseStudent(Course<? extends Student> course) {
		System.out.println(course.getName()+"������ : "+Arrays.toString(course.getStudents()));
	}
	public static void registerCourseWorker(Course<? super Worker> course) {
		System.out.println(course.getName()+"������ : "+Arrays.toString(course.getStudents()));
	}
	
}
class Person{
	String name;
	Person(String s){
		this.name = s;
	}
	public String toString() {
		return this.name;
	}
}
class Student extends Person{
	Student(String s){
		super(s);
	}
}
class Worker extends Person{
	Worker(String s){
		super(s);
	}
}
class HighStudent extends Student {
	HighStudent(String s){
		super(s);
	}
}
class Course<T>{
	private String name;
	private T[ ]students;
	
	public Course(String s, int capacity) {
		this.name =s;
		this.students = (T[])(new Object[capacity]); // ��������ȯ
	}
	public String getName() {
		return this.name;
	}
	public void setName(String s) {
		this.name = s;
	}
	public T[] getStudents() {
		return this.students;
	}
	public void setStudents(T[] students) {
		this.students = students;
	}
	public void add(T t) {
		for(int i = 0;i<students.length;i++) {
			if(students[i] == null) {
				students[i] =t;
				break;
		}
		}
	}
}