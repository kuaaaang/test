package E1_�迭1_�⺻�̷�;

public class �迭1_�˰���_�������� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		  [����1] a�� ���� b�� ���� �����ư��鼭 c�� �����Ѵ�.
		  [��] 
		  	c = {10,40,20,50,30,60}
		   
		  [����2] d�� ���� �����ư��鼭 e, f �� ���� ���� 
		  [��]
		  	e = {10,30,50}
		  	f = {20,40,60};
		  
		*/
		int a[] = {10,20,30};
		int b[] = {40,50,60};
		int c[] = {0,0,0,0,0,0};
			
		int d[] = {10,20,30,40,50,60};
		int e[] = {0,0,0};
		int f[] = {0,0,0};
		
		int count = 0;
		for(int i = 0; i<3; i+=1) {
			c[count] = a[i];
			count +=1;
			c[count] = b[i];
			count +=1;
		}
		for(int i = 0; i<6; i+=1) {
			System.out.println(c[i]);
		}
		
		System.out.println("----------------------------------");
		
		int count2 = 0;
		for(int i = 0; i<3; i+=1) { // count�� 6����, i�� 3����
			e[i] = d[count2];
			count2 +=1;
			f[i] = d[count2];
			count2 +=1;
		}
		for(int i = 0; i<3; i+=1) {
			System.out.println(e[i]);
		}
		System.out.println("---------------------------------");
		for(int i = 0; i<3; i+=1) {
			System.out.println(f[i]);
		}
		
	}
}
