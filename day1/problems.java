package day1;
import java.math.*;
import java.util.Scanner;

public class problems {

	static Scanner o=new Scanner(System.in);
	public static void main(String[] args) {
		
		//q1();
		//q2();
		//q3();
		//q4();
		q5();
	}
	public static void q1() {

		String a=o.nextLine();
		String b=o.nextLine();
		String c=o.nextLine();
		BigInteger a1=new BigInteger(a);
		BigInteger b1=new BigInteger(a);
		BigInteger c1=new BigInteger(a);
		BigInteger sum=a1.add(b1).add(c1);
		
		
		System.out.println("population: "+a1+b1+c1);
	}
	public static void q2() {
		String s=o.nextLine();
		String[] arr=s.split(",");
		String pn=arr[0];
		double price=Double.parseDouble(arr[1]);
		int qty=Integer.parseInt(arr[2]);
		System.out.printf("product name: %s\tprice: %.2f\tqty: %d",pn,price,qty);
		
	}
	public static void q3() {
		String s=o.nextLine();
		BigDecimal bd=new BigDecimal(s);
		System.out.println(bd.toPlainString());
	}
	public static void q4() {
		String s1=o.nextLine();
		String[] arr1=s1.split(":");
		int h1=Integer.parseInt(arr1[0]);
		int m1=Integer.parseInt(arr1[1]);
		int se1=Integer.parseInt(arr1[2]);
		
		String s2=o.nextLine();
		String[] arr2=s2.split(":");
		int h2=Integer.parseInt(arr2[0]);
		int m2=Integer.parseInt(arr2[1]);
		int se2=Integer.parseInt(arr2[2]);
		
//		int hr=(h2-h1)*3600;
//		int min=(m2-m1)*60;
//		int sec=se2-se1;
//		System.out.println(hr+min+sec);
		int ts1=(h1*3600)+(m1*60)+se1;
		int ts2=(h2*3600)+(m2*60)+se2;
		System.out.println(Math.abs(ts2-ts1));
		
		
	}
	public static void q5() {
		int n=o.nextInt();
		BigDecimal t= BigDecimal.ZERO;
		for(int i=0;i<n;i++) {
			String s=o.next();
			BigDecimal bg=new BigDecimal(s);
			t=t.add(bg);
		}
		BigDecimal avg=t.divide(BigDecimal.valueOf(n));
		//System.out.printf("%.10f",avg);
		System.out.println(avg.toPlainString());
		
	}
	
}
