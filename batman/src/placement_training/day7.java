package placement_training;

import java.util.Arrays;
import java.util.Scanner;

public class day7 {
	static Scanner o=new Scanner(System.in);
	public static void main(String[] args) {
	    //q1();
	    //q2();
	    //q3();
		//q4();
		//q5();
		q6();

	}
	static void q1() {
		int  n=o.nextInt();
		StringBuilder s=new StringBuilder();
		
		for(int i=1;i<=n;i++) {
			s.append(i);
		}
		System.out.println(s);
	}
	static void q2() {
		String s=o.nextLine();
//		StringBuilder sb=new StringBuilder(s);
//		sb.reverse();
		String r="";
		for(int i=s.length()-1;i>=0;i--) {
			r+=s.charAt(i);
		}
		
		System.out.println(r);
		
	}
	static void q3() {
		String s=o.nextLine();
		//StringBuilder sb=new StringBuilder(s);
		char[] s1=new char[s.length()];
		int idx=0;
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)=='a'||s.charAt(i)=='e'||s.charAt(i)=='i'||s.charAt(i)=='o'||s.charAt(i)=='u'||
					s.charAt(i)=='A'||s.charAt(i)=='E'||s.charAt(i)=='I'||s.charAt(i)=='O'||s.charAt(i)=='U') {//sb.deletecharAt(i);				continue;
			}
			else {
				s1[idx++]=s.charAt(i);
			}
		}
		System.out.println(s1);
	}
	static void q4() {
		String s1=o.nextLine();
		String s2=o.nextLine();
		int n=o.nextInt();
		StringBuilder sb=new StringBuilder(s1);
		sb.insert(n, s2);
		System.out.println(sb);
				
	}
	static void q5() {
		String base=o.nextLine();
		String target=o.nextLine();
		String replacement=o.nextLine();
	//	while(target.indexOf(i)!=1) {
		 String result =base.replace(target, replacement);
	        System.out.println(result);
			
		}
	static void q6() {
		String s=o.nextLine();
		StringBuilder s1=new StringBuilder(s);
		s1.reverse();
		if(s.equals(s1.toString())) {
			System.out.println("pali");
		}
		else {
			System.out.println("vaipu ila raja");
		}
	}
	}


