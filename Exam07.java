package day03;

public class Exam07 {

	public static void main(String[] args) {
		int[][]arr=new int [3][4];
		arr[0][0]=1;
		arr[0][1]=2;
		int[][]a= {{1,2,3},{11,22,33},{111,222,333}};
		System.out.println(a[1][2]);//33
	    for(int i=0;i<a.length;i++) {
	    	for(int j=0;j<a[i].length;j++) {
	    		System.out.println(a[i][j]+"\t");//숫자가 늘어나도 계속 변하게 출력하려면 a[i].length (a안에 i값의 길이)로 적어준다 
	    		
	    	}
	    	System.out.println();
	    }
	    
	

	}

}
