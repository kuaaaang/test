package E_�迭_����;

import java.util.Arrays;
import java.util.Random;

public class _0801_����_4��_������ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		[����]
			5������ �迭�� (0~9)������ ���� 5���� �������� �����Ѵ�.
			�迭�� ������ ������ Ȧ���� ��Ƽ� �ϳ��� ���ڷ�ǥ���ҷ����Ѵ�. 
			�ϳ��� ���ڷ�ǥ�� �� �׼��� �ι踦 ���
		
		(����) 
			arr ==> { 1,4,5,4,0 } ==> ���� Ȧ���� ������ ����15 �������ϰ�, �ι��� 30�����
		[����]
			30
		*/  
		Random ran = new Random();
		
		int arr[] = new int[5];
		int ar[] = new int[5];
		
		for(int i = 0; i<5; i+=1) {
			int r = ran.nextInt(10);
			arr[i] = r;
		}
		System.out.println(Arrays.toString(arr));
		
		int count = 0;
		int a = 0;
		for(int i = 0; i<5; i+=1) {
			if(arr[i]%2 == 1) {
				ar[count] = arr[i];
				count += 1;
			}
		}
//		System.out.println(Arrays.toString(ar));
		
		System.out.print("���� : ");
		if(count == 0) {System.out.print(0);}
		else {
			for(int i = 0; i<count; i+=1) {
				System.out.print(ar[i]);
			}
		}
		System.out.println();
		
		if(count == 0) {System.out.println(0);}
		else if(count == 1) {System.out.println(ar[0]*2);}
		else if(count > 1) {
			for(int i = 0; i<count; i+=1) {
				if(count-i-1 == 0) {a += ar[i];}
				else if(count-i-1 == 1) {a += ar[i]*10;}
				else if(count-i-1 == 2) {a += ar[i]*100;}
				else if(count-i-1 == 3) {a += ar[i]*1000;}
				else if(count-i-1 == 4) {a += ar[i]*10000;}
			}
			System.out.println(a*2);
		}
		/*
		int[] arr = new int[5];
		for (int i = 0; i < arr.length; i++) {
			int r = ran.nextInt(9);
			arr[i] = r;
		}
		System.out.println(Arrays.toString(arr));
		
		int index = arr.length-1;
		int sum = 0;
		int �ڸ��� = 1;
		for (int i = 0; i < arr.length; i++) {
			System.out.println( (i+1) +"��°");
			if (arr[index] % 2 == 1) {
				System.out.println(arr[index]);
				System.out.println(�ڸ���);
				sum = sum + ( arr[index] * �ڸ���);
				�ڸ��� = �ڸ��� * 10;
				System.out.println(sum);
			}
			System.out.println();
			index--;
		}
		System.out.println(sum);
		
		*/
	}
}
