package generic;
import java.util.Arrays;
public class EX_WildCard {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EX_WildCard card = new EX_WildCard();
		Course<Person> personCourse = new Course<>("일반인 과정",5);
		personCourse.add(new Person("일반인"));
		personCourse.add(new Worker("직장인"));
		personCourse.add(new Student("대학생"));
		personCourse.add(new HighStudent("고딩"));
		
		Course<Worker> workerCourse = new Course<>("직장인 과정",5);
		workerCourse.add(new Worker("직장인"));
		
		Course<Student> studentCourse = new Course<>("학생 과정",5);
		studentCourse .add(new Student("대학생"));
		studentCourse .add(new HighStudent("고딩"));
		
		Course<HighStudent> highStudentCourse = new Course<>("고등학생 과정", 5);
        highStudentCourse.add(new HighStudent("고등학생"));
        
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
		System.out.println(course.getName()+"수강생 : "+Arrays.toString(course.getStudents()));
	}
	public static void registerCourseStudent(Course<? extends Student> course) {
		System.out.println(course.getName()+"수강생 : "+Arrays.toString(course.getStudents()));
	}
	public static void registerCourseWorker(Course<? super Worker> course) {
		System.out.println(course.getName()+"수강생 : "+Arrays.toString(course.getStudents()));
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
		this.students = (T[])(new Object[capacity]); // 강제형변환
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