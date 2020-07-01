package day03;

public class Exam02 {

	public static void main(String[] args) {
		
		for(int i=1; i<=100; i+=10) 
		{
			int sum=0;
			int j;
			for(j=i; j<=i+9; j++)
			{
				sum +=j; //1, 11, 21, 31...
			}
			System.out.println(i+"부터"+(j-1)+"까지의 합: "+sum);
		}
	}	   
}
