package test;

import java.util.Arrays;

class INum{
	private int num;
	public INum(int num) {
		this.num = num;
	}
	public boolean equals(Object o) {
		INum temp = (INum)o;
		if(this.num == temp.num)
			return true;
		else
			return false;
	}
}
public class Yoon_20_4_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// �ν��Ͻ� ���� �迭�� �� ��
		INum[] ar1 = new INum[3];
		INum[] ar2 = new INum[3];
		INum[] ar3 = new INum[3];
		ar1[0] = new INum(1); ar2[0] = new INum(1); // ���� ���귺Ʈ �������޼ҵ� ������ �����ش�? ������ �񱳷� false ��ȯ�ȴ��Ӹ�
		ar1[1] = new INum(2); ar2[1] = new INum(2); // arrays equals vs object euqals
		ar1[2] = new INum(3); ar2[2] = new INum(3);
		System.out.println(Arrays.deepEquals(ar1, ar2));
	}

}
