package placement_training;

public class Main {

	public static void main(String[] args) {
	
//		animal o1=new animal();
//		o1.speak();
//		dog o2 =new dog();
//		o2.speak();
	/*	animal[] arr=new animal[3];
		arr[0]=new animal("leo");
		arr[1]=new dog("subramani");
		arr[2]=new cat("kitty");
	  for(int i=0;i<3;i++) {
		  	if(arr[i] instanceof dog) {
		  		System.out.println("type: dog ");
		  		
		  	}
		   else if (arr[i] instanceof cat) {
		  		System.out.println("type: cat ");
		  		
		  	}
		   else {
			   System.out.println("type: animal ");
		  		
		   }
		  	arr[i].speak();
			
		}*/
//		for(animal e:arr) {
//			e.speak();
//		}
		animal o=new dog("spike");
		o.speak();
		if(o instanceof dog) {
			dog o2= (dog)o;
			o2.speak();
		}
		//dog o2= (dog)new animal("subramani");
		

	}

}
class animal{
	String name;
	animal(String name){
		this.name=name;
	}
	
	void speak() {
		System.out.println("animal makes a sound");
	}

}
class dog extends animal{
	dog(String name) {
		super(name);
		//System.out.println("dog is crerated");
		
	}

	void speak() {
		
		System.out.println("bow bow");
	}
}
class cat extends animal{
	cat(String name) {
		super(name);
		
	}

	void speak() {
		
		System.out.println("meow...");
	}
}
