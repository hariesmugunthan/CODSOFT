package placement_training;

import java.util.Scanner;

public class avalodhan {
	int a=23;

	static final int b=100;
	static void disp() {
		avalodhan o=new avalodhan();
		System.out.println(o.a);
	}
	public static void main(String[] args) {
		
		/*b b= new b();
		b.test();
		new b().test();*/
		//error e=new error(4);
		//System.out.println(e.a);
		//System.out.println(avalodhan.b);
		user o1=user.add("hello");
		user o2=user.add("jgj");
		if(o1==o2) {
			System.out.println("true");
		}

	}

}
class user{
	String name;
	static user obj;
	
	private user(String i) {
		name=i;
	}
	public static user add(String i) {
		if(obj==null) {
			obj=new user(i);
			return obj;
		}
		return obj;
	}
	void disp() {
		System.out.println(name);
	}
}
class a{
	void who() {
		System.out.println("parent");
	}
}
class b extends a{
	void who() {
		System.out.println("na or alien");
	}
	void test() {
		this.who();
		super.who();
	}
}
class error{
	final int a;
	error(int i){
		Scanner o=new Scanner(System.in);
		a=o.nextInt();
	}

}
