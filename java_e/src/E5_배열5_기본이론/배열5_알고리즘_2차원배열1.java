package E5_�迭5_�⺻�̷�;

public class �迭5_�˰���_2�����迭1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// ���� 1) ��ü �� ���
		// ���� 1) 450

		// ���� 2) 4�� ����� ���
	    // ���� 2) 20 40 60 80

		// ���� 3) 4�� ����� �� ���
		// ���� 3) 200

		// ���� 4) 4�� ����� ���� ���
		// ���� 4) 4
		
		int[][] arr = new int[3][3];

		int k = 1;
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				arr[i][j] = 10 * k;
				k += 1;
			}
		}
		
		for(int i = 0; i<arr.length; i+=1) {
			for(int j = 0; j<arr[i].length; j+=1) {
				System.out.print(arr[i][j] + "  ");
			}
			System.out.println();
		}
		
		System.out.println();
		
		// ����1
		
		int total = 0;
		for(int i = 0; i<arr.length; i+=1) {
			for(int j = 0; j<arr[i].length; j+=1) {
				total += arr[i][j];
			}
		}
		System.out.println(total);
		System.out.println();
		
		// ����2
		
		for(int i = 0; i<arr.length; i+=1) {
			for(int j = 0; j<arr[i].length; j+=1) {
				if(arr[i][j] % 4 == 0) {
					System.out.print(arr[i][j] + "  ");
				}
			}
		}
		System.out.println();
		System.out.println();
		
		// ����3
		
		int total4 = 0;
		for(int i = 0; i<arr.length; i+=1) {
			for(int j = 0; j<arr[i].length; j+=1) {
				if(arr[i][j] % 4 == 0) {
					total4 += arr[i][j];
				}
			}
		}
		System.out.println(total4);
		System.out.println();
		
		// ����4
		
		int count = 0;
		for(int i = 0; i<arr.length; i+=1) {
			for(int j = 0; j<arr[i].length; j+=1) {
				if(arr[i][j] % 4 == 0) {
					count += 1;
				}
			}
		}
		System.out.println(count);
		
		
	}
}
