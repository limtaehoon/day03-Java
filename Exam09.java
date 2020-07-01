package day03;

import java.util.Scanner;

public class Exam09 {

	public static void main(String[] args) {
		/*(10,20,30,40,50,60,70,15,25)
		 * 최대값
		 * 최대값 배열순서
		 * 배열들 합계
		 * 배열평균
		 * 숫자 입력 받아 확인 없으면 없음 띄우기
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
    System.out.println("최대값:"+max);
    System.out.println("최대값위치:"+num);
    System.out.println("배열합계:"+hap);
    System.out.println("배열평균:"+hap/a.length);
    System.out.println("배열평균:"+(float)hap/a.length);
		
	
	
	
		


	Scanner sc= new Scanner(System.in);
	System.out.println("찾는수>>");
	int n1=sc.nextInt();
	boolean flag=false;
	for(int i=0;i<a.length;i++) {
		if(n1==a[i]) {
			System.out.println("찾는수" +(i+1)+"번째 수");
			flag=true;
		}
	}
	   if(flag==false) {
		   System.out.println(n1+"없음");
	   }
	
	}
}
	
		

















		