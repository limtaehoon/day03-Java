package day03;

import java.util.Scanner;

public class Exam05 {

	public static void main(String[] args) {
		int[] data={10,5,90,100,250,30,77};
	
		//최대값
        //최대값위치
		// 배열 합계
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
	    System.out.println("최대값:"+max);
		//최대값위치
		System.out.println("최대값 위치:"+maxpos);//i를 쓰면 다돌고 값음 7로 나옴
		System.out.println("배열 합계:"+sum);
		System.out.println("배열 평균:"+sum/data.length);
	    System.out.println("배열 평균:"+(float)sum/data.length);
		/*찾는수>> 100
		 * 찾는수 100:4번째
		 * 찾는수>>33
		 * 찾는수 300 없습니다
		 */
		 Scanner sc =new Scanner(System.in);
		 System.out.println("찾는수>>");
		 int n1=sc.nextInt();
		 boolean flag= false;
		 for(int i=0;i<data.length;i++) {
			 if(n1==data[i]) {
				 System.out.println("찾는수"+n1+":"+(i+1));
	             flag=true;	
			}
		 }//for
			if(flag==false) {
		       System.out.println("찾는수"+n1+"없음");
		}
	  }	
	}
		
		 
	
	
	
	
	
	



