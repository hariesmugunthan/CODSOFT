package placement_training;

import java.util.Scanner;

public class bruce {

	static Scanner o=new Scanner(System.in);
	public static void main(String[] args) {
//		 double num1 = Double.parseDouble(args[0]);
//         String operator = args[1];
//         double num2 = Double.parseDouble(args[2]);
//         double result;
//         switch (operator) {
//             case "+":
//                 result = num1 + num2;
//                 break;
//
//             case "-":
//                 result = num1 - num2;
//                 break;
//
//             case "*":
//                 result = num1 * num2;
//                 break;
//
//             case "/":
//                 
//                 result = num1 / num2;
//                 break;
//
//             case "%":
//                 result = num1 % num2;
//                 break;
//
//             default:
//                 System.out.println("Error");
//                 return;
//         }
//
//	     System.out.println("Result: " + result);
//		int n=o.nextInt();
//		System.out.println("fact is: "+fact(n));
//		double a=o.nextDouble();
//		double b=o.nextDouble();
//		System.out.println(area(a));
//		System.out.println(area(a,b));
//		System.out.println(areac(a));
		sum(1,2,3,4,5,6,7,8,9);
	
	}
	static int fact(int n) {
		
		
		
		if(n==0||n==1) {
			return 1;
		}
		else {
			n=n*fact(n-1);
			return n;
		}
	}
	static double area(double a) {
		return a*a;
	}
	static double area(double l,double b) {
		return l*b;
	}
	static double areac(double r) {
		return 3.14*r*r;
	}
	static void sum(int...a) {
		int t=0;
		for(int e:a) {
			t=t+e;
		}
		System.out.println(t);
	}
	
}
