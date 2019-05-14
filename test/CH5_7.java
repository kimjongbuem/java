package test;

public class CH5_7 {

	public static void main(String[] args) {
		Complex c1 = new Complex(10);
		Complex c2 = new Complex(10,20);
		System.out.println(c1+"\t"+c2);
		c1.addComplex(c2);
		System.out.println(c1);
		c1.mulComplex(c2);
		System.out.println(c1);
	}

}
class Complex{
	public double real; //실수부
	public double image; //허수부
	
	Complex(double value){
		this.real = value;
		this.image= value;
	}
	Complex(double real, double image){
		this.real = real;
		this.image = image;
	}
	public String toString() {
		return "real : "+this.real+"\timage : "+this.image;
	}
	public void addComplex(Complex com) {
		this.real +=com.real;
		this.image += com.image;
	}
	public void mulComplex(Complex com) {
		double tempReal = this.real;
		double tempImage = this.image;
		this.real = this.real*com.real - this.image*com.image;
		this.image = tempReal*com.image + tempImage*com.real;
	}
}