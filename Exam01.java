package day03;

public class Exam01 {

	public static void main(String[] args) {
		/*********
		 *******
		 *****
		 ***
		 */
	for(int i=9;i>0;i-=2) {
		for(int j=1;j<=i;j++) {
			System.out.print("*");
		}
		System.out.println("("+i+")");
	}
	  System.out.println("=======");
	  
	 /*BCDEFGHIJ(I)
       BCDEFGHI(H)
       BCDEFGH(G)
       BCDEFG(F)
       BCDEF(E)
       BCDE(D)
       BCD(C)
       BC(B)
       B(A)
       */
	  
	  
	  
	  for(char i='I';i>='A';i-=1) {//문자는char로
			for(char j='A';j<=i;j++) {
				System.out.print((char)(j+1));//j+1 로하면 a를 인식못하므로 char를 괄호로 넣으면 원하는게 나옴 j하면 A부터 j+1하면 B부터
			}//j
			System.out.println("("+i+")");
		}//i 
	 
	
            }
	
	  
}
  
	  
	  
	  
	  
	  
	  
	  
	  
	  


	  
	  
	 
