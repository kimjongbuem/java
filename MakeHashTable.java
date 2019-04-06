package CollectionFrameWork;
import java.util.LinkedList;
import java.util.ArrayList;

public class MakeHashTable {

	public static void main(String[] args) {
		HashTable h = new HashTable(3);
		h.put("sung","She is pretty");
		h.put("jin","She is pretty");
		h.put("hee","he is angel");
		h.put("yoon","he is gentle");
		System.out.println(h.get("sung"));
		System.out.println(h.get("yoon"));
		System.out.println(h.get("jin"));
		System.out.println(h.get("hee"));
		System.out.println(h.get("Yoon"));
	}
	
}
 class HashTable{
	LinkedList<Node>[] data;
	HashTable(int size){
		this.data = new LinkedList[size];
	}
	int getHashCode(String key) {
		int hashCode = 0;
		for(char c : key.toCharArray()) {
			hashCode += c;
		}
		return hashCode;
	}
	int convertToIndex(int hashCode) {
		
		return hashCode % data.length;
	}
	Node searchKey(LinkedList<Node> list, String key) {
		if(list == null) return null;
		for(Node node : list) {
			if(node.key.equals(key)) {
				return node;
			}
		}
		return null;
	}
	void put(String key, String value) {
		int hashCode = getHashCode(key);
		int idx = convertToIndex(hashCode);
		System.out.println("hashCode : "+hashCode+" index: "+hashCode % data.length);
		LinkedList<Node> list = data[idx];
		if(list == null) {
			list = new LinkedList<Node>();
			data[idx] = list;
		}
		Node node = searchKey(list, key);
		if(node == null) {
			list.addLast(new Node(key, value));
		}else {
			node.value = value;
		}
	}
	String get(String key) {
		int hashCode = getHashCode(key);
		int idx = convertToIndex(hashCode);
		LinkedList<Node> list = data[idx];
		Node node = searchKey(list, key);
		return node == null?"Not Found": node.getVaule();
	}
		class Node{
		String key; // 검색할 키
		String value; //검색결과 값
		public Node(String key, String value) {
			this.key = key;
			this.value = value;
		}
		String getVaule() {
			return this.value;
		}
		void setValue(String value) {
			this.value = value;
		}
		}
}