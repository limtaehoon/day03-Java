package day03;

import java.util.Scanner;

public class Exam05 {

	public static void main(String[] args) {
		int[] data={10,5,90,100,250,30,77};
	
		//�ִ밪
        //�ִ밪��ġ
		// �迭 �հ�
	int max= data[0];//10
	int maxpos=0;	
	int sum=0;
	for(int i=0;i<data.length;i++) {
		sum+=data[i];	
		
		if(max<data[i]) {
			   max = data[i];
			   maxpos=i+1;
			   
			
			}	
	 }
	    System.out.println("�ִ밪:"+max);
		//�ִ밪��ġ
		System.out.println("�ִ밪 ��ġ:"+maxpos);//i�� ���� �ٵ��� ���� 7�� ����
		System.out.println("�迭 �հ�:"+sum);
		System.out.println("�迭 ���:"+sum/data.length);
	    System.out.println("�迭 ���:"+(float)sum/data.length);
		/*ã�¼�>> 100
		 * ã�¼� 100:4��°
		 * ã�¼�>>33
		 * ã�¼� 300 �����ϴ�
		 */
		 Scanner sc =new Scanner(System.in);
		 System.out.println("ã�¼�>>");
		 int n1=sc.nextInt();
		 boolean flag= false;
		 for(int i=0;i<data.length;i++) {
			 if(n1==data[i]) {
				 System.out.println("ã�¼�"+n1+":"+(i+1));
	             flag=true;	
			}
		 }//for
			if(flag==false) {
		       System.out.println("ã�¼�"+n1+"����");
		}
	  }	
	}
		
		 
	
	
	
	
	
	



