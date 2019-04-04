package test;

import java.util.Arrays;

public class Yoon20_Sort {

	public static void main(String[] args) {
		Person[] ar= new Person[4];
		ar[0] = new Person("goo", 23);
		ar[1] = new Person("chan", 42);
		ar[2]= new Person("moon", 35);
		ar[3] = new Person("lee", 23);
		Arrays.sort(ar); // 정렬함수.
		for(Person p : ar) {
			System.out.println(p);
		}
		String a ="123"; String b = new String("123");
		if(a==b)
			System.out.println("true");
		if(a.equals(b))
			System.out.println("equals  true"); // 객체 ㄴㄴ
		
		System.out.println(ar[Arrays.binarySearch(ar, new Person("who are you?",23))]);
	}

}
class Person implements Comparable{
	private String name;
	private int age;

	Person(String st, int age){
		this.name = st;
		this.age = age;
	}
	public String toString() {
		return this.name+": "+age;
	}
	@Override
	public int compareTo(Object o) {
		Person p = (Person)o;
		return this.age- p.age;
	}
}