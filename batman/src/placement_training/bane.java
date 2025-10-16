package placement_training;

public class bane {

	public static void main(String[] args) {
//		car c=new car(120000,"hellcat",230);
//		c.speed();
//		c.speed(300);
//		c.speed();
//		car d2=new car();
//		System.out.println(car.a);
//		d2.speed=9;
//		car c2=new car(120000);
//		String a=new String();
//		car v=car.cons();
//		System.out.println(v.model);
	/*	book b1=new book("jungle book","ruthyard klipling");
		book b2=new book("soccerss book");
		b1.dosp();
		b2.dosp();
		
*/
		char[][] a = {
			    {' ', ' ', ' '},
			    {' ', ' ', ' '},
			    {' ', ' ', ' '}
			};

		math m=new math();
		m.add(5, 5);
		math.mul(1, 20);
		
		

	}
	
}
class box{
	int l,b,h;
	box(int i,int j,int k){
		this.l=i;
		this.b=j;
		this.h=k;
		
	}
	box(){
		this.l=1;
		this.b=1;
		this.h=1;
		
	}
	

	
}
class math{
	void add(int a,int b) {
		System.out.println(a+b);
	}
	static void mul(int a,int b) {
		System.out.println(a*b);
	}
}

class book{
	private String title;
	private String author;
	book(String t,String a){
		this.author=a;
		this.title=t;
	}
	book(String t){
		this.title=t;
		this.author="unknown";
	}
	void dosp() {
		System.out.println("title: "+title+"\nauthor: "+author);
		
	}
	
}
class car{
	 static final int a=9;
	int price;
	String model;
	int speed;
	 
	car(){
		
	}
	private car(int price,String model,int speed){
		this.price=price;
		this.model=model;
		this.speed=speed;
	}
	  car(int speed){
		this.speed=speed;
		
	}
	
	void speed() {
		System.out.println(model+":"+speed);
	}
	void speed(int s) {
		this.speed=s;
	}
	static car cons() {
		car g=new car(12,"3sd",3);
		return g;
	}
}
