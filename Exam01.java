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
	  
	  
	  
	  for(char i='I';i>='A';i-=1) {//���ڴ�char��
			for(char j='A';j<=i;j++) {
				System.out.print((char)(j+1));//j+1 ���ϸ� a�� �νĸ��ϹǷ� char�� ��ȣ�� ������ ���ϴ°� ���� j�ϸ� A���� j+1�ϸ� B����
			}//j
			System.out.println("("+i+")");
		}//i 
	 
	
            }
	
	  
}
  
	  
	  
	  
	  
	  
	  
	  
	  
	  


	  
	  
	 
