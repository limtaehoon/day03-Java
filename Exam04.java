package day03;

import java.util.Scanner;

public class Exam04 {

	public static void main(String[] args) {
     /*�Է°��� 5
      * �������Է�
      * �հ�150
      * �Էµ�����:10 20 30 40 50   
      */
		Scanner sc=new Scanner(System.in);{
			System.out.println("�Է��� ���� �Է�>>");
			 int cnt =sc.nextInt();
			 
			 System.out.println("������ �հ�>>");
			 
			 int su =0;
			 int[]arr=new int[cnt];
			 
			 for(int i=0 ; i<cnt ; i++) {
			  
			   //int inputDate= sc.nextInt();
			   //arr[i]=inputDate;
			   //su += inputDate;
			 arr[i]=sc.nextInt();
			 su += arr[i];
			}
			System.out.println("�հ�:"+su);
            for(int i=0;i<cnt;i++) {
            	System.out.println("�Էµ�����:"+arr[i]);
            }
		
		
		}
	}

}
