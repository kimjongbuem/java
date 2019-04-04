package test;

import java.util.Arrays;

public class Yoon20_Sort {

	public static void main(String[] args) {
		Person[] ar= new Person[6];
		ar[0] = new Person("goo", 23);
		ar[1] = new Person("chan", 42);
		ar[2] = new Person("moon", 35);
		ar[3] = new Person("lee", 23);
		ar[4] = new Person("Kim", 18);
		ar[5] = new Person("Ann", 42);
		Arrays.sort(ar); // 정렬함수.
		for(Person p : ar) {
			System.out.println(p);
		}
		String a ="123"; String b = new String("123");
		if(a==b)
			System.out.println("true");
		if(a.equals(b))
			System.out.println("equals  true"); // 객체 ㄴㄴ
		int idx =Arrays.binarySearch(ar, new Person("moon", 42));
		System.out.println(idx+"\t" + ar[Arrays.binarySearch(ar, new Person("chan",42))]);
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
		if(this.name.equals(p.name))
			return this.age- p.age;
		else
			return this.name.compareTo(p.name); // 각각의 문자열의 대한 판단도 해줘야함.
	}
}