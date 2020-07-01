package day03;

public class Exam06 {
/*크기가 10인 배열을 만들고
 * 0에서 50 사이 난수를 발생하여 
 * 0이 아닌값을 배열에 넣으세요
 * 중복허용
 */
	public static void main(String[] args) {
		
      int[]arr=new int[10];
    int n=0;
    while(n<arr.length) {//배열크기 10번 반복
    	int r=(int)(Math.random()*50);//난수 발생
    	if(r==0) {//난수가 0인지 판단
           continue;		
        } {//난수가 0아님 //else 써도 안써도 상관없음
    		arr[n]=r; //arr{n++]=r; 로 두줄대신 한줄로 써도 됨
            n++;
    }
    }	
    	for(int i=0;i<arr.length;i++) {
    		System.out.print(arr[i]+"\t");
    	}
    	System.out.print("----");
    	for(int i:arr) {
    		System.out.print(i+"\t");
    	
    	}
    	System.out.print("\n----------");
         for(int i:arr) {//for each	
        	 System.out.print(i+"\t");
        }
         
         String[]str = {"one,two,three,four"};
         //for-each
         for(String s:str) {
        	 System.out.print(s);
         }
	}  
}
	

