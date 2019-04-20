package idontstudyJAVA;
import java.util.*;
public class HashSetEquality {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<Person> hSet = new HashSet<>();
		hSet.add(new Person("����ȣ",10));
		hSet.add(new Person("����ȣ",20));
		hSet.add(new Person("���ȣ",10));
		hSet.add(new Person("������",30));
		hSet.add(new Person("����ȣ",20));
		hSet.add(new Person("������",30));
		System.out.println("����� ������ ��: "+hSet.size());
		Iterator<Person> iter = hSet.iterator();
		while(iter.hasNext())
			System.out.println(iter.next());
	}

}
class Person{
	String name;
	int age;
	
	public Person(String name, int age) {
		this.name = name;
		this.age =age;
	}
	public String toString() {
		return name+" ����"+age;
	}
	public int hashCode() {
		return name.hashCode();
	}
	public boolean equals(Object obj) {
		Person p = (Person)obj;
		if(p.name.equals(name)&&p.age == age)
			return true;
		else
			return false;
	}
}