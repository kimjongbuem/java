
public class Ch_5_10_4 {

	public static void main(String[] args) {
		Sort qSort = new Sort();
		int []a= new int[]{5,9,78,23,45,1,2,44,88};
		qSort.Qsort(a,0,a.length - 1);
		for(int i : a) {
			System.out.print(i+"\t");
		}
	}

}
class Sort{
	void Swap(int v[], int i , int j) {
		int temp;
		temp = v[i];
		v[i] = v[j];
		v[j] = temp;
	}
	public void Qsort(int a[], int left, int right) {
		int pe;
		int i, last;
		if(left >= right) return;
		pe = (left + right) / 2;
		Swap(a,left,pe);
		last = left;
		for(i = left + 1;i<=right;i++)
			if(a[i] < a[left]) Swap(a, ++last, i);
		Swap(a, left, last);
		Qsort(a, left, last - 1);
		Qsort(a, left + 1, right);
	}
}
