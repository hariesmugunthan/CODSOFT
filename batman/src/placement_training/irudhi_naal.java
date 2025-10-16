package placement_training;

public class irudhi_naal {

	public static void main(String[] args) {
		A o1=new A();
		B o2=new B();
		o1.method(8);
		o2.method(5.454);
		o2.method(54);
		A o3=new B();
		o3.method(9878);
		
		
	}
}
class A{
	void method(int i) {
		System.out.println("dei thambi: "+i);
	}
}
class B extends A{
	void method(double d) {
		System.out.println("koranga mariruvom sir: "+d);
	}
	void method(int i) {
		System.out.println("bomberdino crocadilooo: "+i);
	}
}
