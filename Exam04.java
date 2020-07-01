package day03;

import java.util.Scanner;

public class Exam04 {

	public static void main(String[] args) {
     /*입력갯수 5
      * 데이터입력
      * 합계150
      * 입력데이터:10 20 30 40 50   
      */
		Scanner sc=new Scanner(System.in);{
			System.out.println("입력할 갯수 입력>>");
			 int cnt =sc.nextInt();
			 
			 System.out.println("데이터 합계>>");
			 
			 int su =0;
			 int[]arr=new int[cnt];
			 
			 for(int i=0 ; i<cnt ; i++) {
			  
			   //int inputDate= sc.nextInt();
			   //arr[i]=inputDate;
			   //su += inputDate;
			 arr[i]=sc.nextInt();
			 su += arr[i];
			}
			System.out.println("합계:"+su);
            for(int i=0;i<cnt;i++) {
            	System.out.println("입력데이터:"+arr[i]);
            }
		
		
		}
	}

}
