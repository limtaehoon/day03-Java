package day03;

public class Exam06 {
/*ũ�Ⱑ 10�� �迭�� �����
 * 0���� 50 ���� ������ �߻��Ͽ� 
 * 0�� �ƴѰ��� �迭�� ��������
 * �ߺ����
 */
	public static void main(String[] args) {
		
      int[]arr=new int[10];
    int n=0;
    while(n<arr.length) {//�迭ũ�� 10�� �ݺ�
    	int r=(int)(Math.random()*50);//���� �߻�
    	if(r==0) {//������ 0���� �Ǵ�
           continue;		
        } {//������ 0�ƴ� //else �ᵵ �Ƚᵵ �������
    		arr[n]=r; //arr{n++]=r; �� ���ٴ�� ���ٷ� �ᵵ ��
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
	

