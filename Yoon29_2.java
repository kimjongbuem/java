package CH29_Stream1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Yoon29_2 {

	public static void main(String[] args) {
		// ��ǥ�� �߰� ���� ���͸��� ���� //
		/* ���͸�
		 * ���ٽ����� �������� �ش� �����͸� �ɷ�����! filter!
		 * 
		 * ���� 
		 * �� �ν��Ͻ��� ��ȣ�� �����Ѵ�.. 
		 * �̱浿 1��
		 * �赿�� 2��
		 * �ѵ���	3��
		 * 
		 * ���� ������ height��� �������� ���� ����.
		 * ������ ���ٽ��� �������� �������� ���� �ٲ��.
		 * �� ������ �����͸� �ٲ۴�! Change!
		 */
		// filtering //
		List<String> list = Arrays.asList("TOY", "Robot","Carfffff");
//		list.stream().filter(s -> s.length() == 3).forEach(s->System.out.print(s+"\t"));
//		System.out.println();
		list.stream().filter(s ->s.length() == 3).forEach(s -> System.out.print(s+" "));
		System.out.println();
		//Maping//
//		list.stream().mapToInt(s -> s.length()/2).forEach(s->System.out.print(s+"\t")); // �ڽ̾�ڽ� ���ҷ� //
//		System.out.println();
		list.stream().mapToInt(s -> s.length()/2).forEach(s->System.out.print(s+" ")); // ���Ͱ��ƴ� ����
		System.out.println();
		// filtering after Maping //
		List<ToyPriceInfo> dept = new ArrayList<>();
		dept.add(new ToyPriceInfo("AfricaHunter",300000));
		dept.add(new ToyPriceInfo("Special Aquarium",2500000));
		dept.add(new ToyPriceInfo("Exford Kin",110000));
		dept.add(new ToyPriceInfo("Returning of king",1000000));
		int sum = dept.stream().filter(toyprice -> toyprice.getModelName().contains("Special")).mapToInt(toyModel -> toyModel.getPrice()).sum();
				//dept.stream().filter(toy-> toy.getPrice()>=1000000).mapToInt(toy -> toy.getPrice()).sum();
		System.out.println(sum);
	}

}
class ToyPriceInfo{
	private String modelName;
	int price;
	
	public ToyPriceInfo(String name, int price) {
		this.modelName = name; this.price = price;
	}
	int getPrice() {
		return price;
	}
	String getModelName() {
		return modelName;
	}
}