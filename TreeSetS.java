package CollectionFrameWork;
import java.util.Comparator;
import java.util.Iterator;
import java.util.TreeSet;
public class TreeSetS {

	public static void main(String[] args) {
		TreeSet<Integer> tree = new TreeSet<Integer>();
		tree.add(1); tree.add(12);
		tree.add(1);tree.add(5);tree.add(4);	
		System.out.println(tree.size()+"\n");
		for(Integer n : tree) {
			System.out.println(n.toString());
		}
		for(Iterator iter = tree.iterator();iter.hasNext();) {
			System.out.print(iter.next()+"\t");
		}
		System.out.println();
		TreeSet<Person> tree2 = new TreeSet<>(new PersonComparator());
		tree2.add(new Person("Yoon", 32));
		tree2.add(new Person("Hong", 24));
		tree2.add(new Person("Park", 96));
		for(Person p : tree2)
			System.out.println(p);
	}

}
class Person implements Comparable<Person>{
	String name;
	int age;
	public Person(String name, int age) {
		this.name = name; this.age =age;
	}
	public int compareTo(Person p) {
		return this.age - p.age;
	}
	public String toString() {
		return "이름 : "+this.name+" 나이 : "+this.age;
	}
}
class PersonComparator implements Comparator<Person>{
	public int compare(Person p1, Person p2) {
		return p2.age - p1.age;
	}
}