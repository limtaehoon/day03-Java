package day03;

public class Exam03 {

	public static void main(String[] args) {
	    /*배열은 같은 자료 구조를 다루는 유형
	     * 5개의 각값들을 저잘ㅇ하고 싶으면 변수5개가 필요하다.
	     * 5개의 공간을 만들면 된다   
	     */
		
		
        int[]arr=new int[5];
	       arr[0]=100;
	       arr[1]=200;
	       arr[2]=300;
	       arr[3]=400;
	       arr[4]=500;
	       System.out.println(arr[3]);		
	       
	       //배열은 반드시 크기를 지정해줘야된다 int형의 배열은 0으로 초기화 된다.
	       int[]test=new int[20]; 
           System.out.println(test[5]);	
           for(int i=0;i<test.length;i++) //배열의 길이 알려주는 함수 legth
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
	  for(int i=0; i<arr1.length;i++) { //i<5 == i<arr1.legth /i<=arr1.length / i<=arr1.length =쓰면 안된다. 배열의 길이 만큼 돈다. 해줘야해서
		  
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
