package day03;

import java.util.Scanner;

public class Exam09 {

	public static void main(String[] args) {
		/*(10,20,30,40,50,60,70,15,25)
		 * �ִ밪
		 * �ִ밪 �迭����
		 * �迭�� �հ�
		 * �迭���
		 * ���� �Է� �޾� Ȯ�� ������ ���� ����
		 */
   int[]a={10,20,110,40000000,50,60,70,15,25};
   int max=a[0];
   int num=0;
   int hap=0;
   for(int i=0;i<a.length;i++) {
      hap+=a[i];
      	
      if(max<a[i]) {
    	  max=a[i];
    	  num=i+1;
    			  
      }
   
   }
    System.out.println("�ִ밪:"+max);
    System.out.println("�ִ밪��ġ:"+num);
    System.out.println("�迭�հ�:"+hap);
    System.out.println("�迭���:"+hap/a.length);
    System.out.println("�迭���:"+(float)hap/a.length);
		
	
	
	
		


	Scanner sc= new Scanner(System.in);
	System.out.println("ã�¼�>>");
	int n1=sc.nextInt();
	boolean flag=false;
	for(int i=0;i<a.length;i++) {
		if(n1==a[i]) {
			System.out.println("ã�¼�" +(i+1)+"��° ��");
			flag=true;
		}
	}
	   if(flag==false) {
		   System.out.println(n1+"����");
	   }
	
	}
}
	
		

















		