package day03;

public class Exam03 {

	public static void main(String[] args) {
	    /*�迭�� ���� �ڷ� ������ �ٷ�� ����
	     * 5���� �������� ���ߤ��ϰ� ������ ����5���� �ʿ��ϴ�.
	     * 5���� ������ ����� �ȴ�   
	     */
		
		
        int[]arr=new int[5];
	       arr[0]=100;
	       arr[1]=200;
	       arr[2]=300;
	       arr[3]=400;
	       arr[4]=500;
	       System.out.println(arr[3]);		
	       
	       //�迭�� �ݵ�� ũ�⸦ ��������ߵȴ� int���� �迭�� 0���� �ʱ�ȭ �ȴ�.
	       int[]test=new int[20]; 
           System.out.println(test[5]);	
           for(int i=0;i<test.length;i++) //�迭�� ���� �˷��ִ� �Լ� legth
           {
		    test[i]=i;
	       }
	       System.out.println("test[5]:"+test[5]);
	       test[5]=50000;
	       System.out.println("test[5]:"+test[5]);
	       /*int[]arr=new int[5];  //00000
	        * 1 2 3 4 5
	        */
	
	  
	  int[]arr1=new int [5];
	  for(int i=0; i<arr1.length;i++) { //i<5 == i<arr1.legth /i<=arr1.length / i<=arr1.length =���� �ȵȴ�. �迭�� ���� ��ŭ ����. ������ؼ�
		  
		  arr1[i]=i+1;
	  }
	for(int i=0; i<arr1.length;i++) {
		System.out.println("arr1["+i+"]:"+arr1[i]);
		
	}

	int[]arr2= {1,2,3,4,5,6,7};
	for(int i=0; i<arr2.length;i++) {
		System.out.println("arr2["+i+"]:"+arr2[i]);
	}
	String []string= {"one,two,three"};
	for (int i=0; i<string.length;i++) {
		System.out.println("string["+i+"]:"+string[i]);
	}
		
	
	String[] string1=new String[3];
	string1[0]= "one";
	string1[1]= "two";
	string1[2]= "three";
	for (int i=0; i<string1.length;i++) {
		System.out.println("string1["+i+"]:"+string1[i]);
	}
	
}
}
