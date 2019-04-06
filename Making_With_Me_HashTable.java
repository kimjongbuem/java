import java.util.LinkedList;

//import CollectionFrameWork.HashTable;

//import CollectionFrameWork.HashTable.Node;

//import CollectionFrameWork.HashTable.Node;
public class Making_With_Me_HashTable {

	public static void main(String[] args) throws AgeException {
		HashTable2 h = new HashTable2(3);
		h.put("sung","110-123",24);
		h.put("yoon","122-123",48);
		h.put("palco","465-123",12);
		h.put("zentle","100-012123",90);

		h.put("sung","87897-789",24);
		h.put("sung","110-123",-1);
		System.out.println(h.get("sung",24));
		System.out.println(h.get("yoon",48));
		System.out.println(h.get("zentle",90));
		System.out.println(h.get("palco",12));
		System.out.println(h.get("zin",78));
		System.out.println(h.get("zentle",78));
	}
	
}
class AgeException extends Exception{
	
	AgeException(int age){
		super(age+"는 0보다 작습니다");
	}
}
class HashTable2{
	LinkedList<Node> [] table;
	HashTable2(int size){
		table = new LinkedList[size];
	}
	int getHashCode(String name,  int age) {
		int hashCode = 0;
		for(char c : name.toCharArray()) {
			hashCode +=c;
		}
		hashCode = hashCode + age;
		return hashCode;
	}
	int convertIdx(int hashCode) {
		int hashIdx = hashCode % table.length;
		return hashIdx;
	}
	void put(String name, String address, int age) throws AgeException {
		int hashCode = getHashCode(name, age);
		int idx = convertIdx(hashCode);
		
		LinkedList<Node> list = table[idx];
		if(list == null) {
			list = new LinkedList<Node>();
			table[idx] = list;
		}
		Node node = searchKey(list, name, age);
		
		if(node == null) {
			list.addLast(new Node(name, address, age));
			System.out.println("hashCode : "+hashCode+" index: "+hashCode % table.length);
		}else {
			node.update(address);
		}
		
	}
	String get(String name, int age) {
		int hashCode = getHashCode(name ,age);
		int idx = convertIdx(hashCode);
		LinkedList<Node> list = table[idx];
		Node node = searchKey(list,name,age);
		return node==null?"Not Found":node.toString();
	}
	Node searchKey(LinkedList<Node> list,String name, int age) {
		if(list == null) return null;
		for(Node node : list) {
			if(node.equals(name, age)) {
				return node;
			}
		}
		return null;
	}
	class Node{
		private String name;
		private String address;
		private int age;
		
		Node(String name, String address, int age)throws AgeException{
			try
			{
				checkAge(age);
				this.age = age;
				this.name = name;
				this.address = address;
			}
			catch(AgeException e){
				System.out.println(e.getMessage());
			}
			
		}
		public void checkAge(int age)throws AgeException {
			if(age < 0)
				throw new AgeException(age);
		}
		public boolean equals(String name, int age) {
			if(this.name.equals(name)&&this.age==age) return true;
			return false;
		}
		public String toString() {
			return "이름 : "+name+" 주소: "+address+" 나이 : " +age;
		}
		public void update(String address) {
				this.address = address;
		}
	}
	
}