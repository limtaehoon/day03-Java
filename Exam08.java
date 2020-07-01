package day03;

import java.util.Scanner;

public class Exam08 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("금액입력>>");
		int m1= sc.nextInt();
		int unit[]= {50000,10000,1000,500,100,50,1};
		 for(int i=0;i<unit.length;i++) {
			 if(m1/unit[i]>0) {
		      System.out.println(unit[i]+":"+m1/unit[i]);
			m1=m1%unit[i];
		}
		
		}
		
		
		
		
		

	}

}
