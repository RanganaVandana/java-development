package Taskss2;


import java.util.*;
public class StudentGradess {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the number of subjects: ");
		int s=sc.nextInt();
		int total=0;
		
		System.out.println("Enter the marks obtained in "+s+" subjects: ");
		
		for(int i=0;i<s;i++) {
			int marks=sc.nextInt();
			total+=marks;
		}
		double avr=(double)total/s;
		
		String Grade;
		
		if(avr>=90) {
			Grade="A+";
		}
		
		else if(avr>=80) {
			Grade="A";
		}
		
		else if(avr>=70) {
			Grade="B";
		}
		
		else if(avr>=60) {
			Grade="C";
		}
		
		else if(avr>=50) {
			Grade="D";
		}
		
		else if(avr>=40) {
			Grade="E";
		}
		
		else {
			Grade="Fail(F)";
		}
		
		
		System.out.println("The Total Marks Obtained : "+total);
		System.out.println("The average :"+avr);
		System.out.println("The final Grade :"+Grade);
		
		sc.close();
	}

}
