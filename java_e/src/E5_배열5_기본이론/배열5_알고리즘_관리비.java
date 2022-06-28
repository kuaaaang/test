package E5_�迭5_�⺻�̷�;

import java.util.Scanner;
import java.util.Arrays;

public class �迭5_�˰���_������ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 /*	
		 ���� 1) ������ ������ �� ���
		 ���� 1) 4400, 7100, 5400		
		 ���� 2) ȣ�� �Է��ϸ� ������ ���
		 ���� 2) �Է� : 202	������ ��� : 2000	
		 ���� 3) ������ ���� ���� ���� ��, ���� ���� �� ���
		 ���� 3) ���� ���� ���� ��(201), ���� ���� ���� ��(303)		
		 ���� 4) ȣ 2���� �Է��ϸ� ������ ��ü (101 , 102) ==>  (2100, 1000)		
		 ���� 5) ������ ���� ���¼������ ������� ȣ�� ��� (����)
		 */
		Scanner scan = new Scanner(System.in);
		
		int[][] apt = {
				{101, 102, 103},	
				{201, 202, 203},	
				{301, 302, 303}	
			};
			
		int[][] pay = {
				{1000, 2100, 1300},	
				{4100, 2000, 1000},	
				{3000, 1600,  800}
			};
		
		//����1
		
		for(int i = 0; i<pay.length; i+=1) {
			int total = 0;
			for(int j = 0; j<pay[i].length; j+=1) {
				total += pay[i][j];
			}
			System.out.println((i+1) + "�� �Ѱ����� : " + total);
		}
		System.out.println("--------------------------------");
		
		//����2
		
		System.out.println("ȣ �� �Է��ϼ���.");
		int n = scan.nextInt();
		
		int i1 = 0;
		int i2 = 0;
		for(int i = 0; i<apt.length; i+=1) {
			for(int j = 0; j<apt[i].length; j+=1) {
				if(n == apt[i][j]) {
					i1 = i;
					i2 = j;
				}
			}
		}	
		System.out.println(n + "ȣ ������ : " + pay[i1][i2] + "��");
		System.out.println("--------------------------------");
		
		//����3
		
		int max = 0;
		int a = 0;
		int b = 0;
		for(int i = 0; i<pay.length; i+=1) {
			for(int j = 0; j<pay[i].length; j+=1) {
				if(max<pay[i][j]) {
					max = pay[i][j];
					a = i;
					b = j;
				}
			}
		}
		System.out.println("������ ���� ���� ���� �� : " + apt[a][b]);
		
		int min = max;
		for(int i = 0; i<pay.length; i+=1) {
			for(int j = 0; j<pay[i].length; j+=1) {
				if(min>pay[i][j]) {
					min = pay[i][j];
					a = i;
					b = j;
				}
			}
		}		
		System.out.println("������ ���� ���� ���� �� : " + apt[a][b]);	
		System.out.println("--------------------------------");
		
		//����5
		
		int arr1[] = new int[9];
		int arr2[] = new int[9];
		
		int k = 0;
		for(int i = 0; i<apt.length; i+=1) {
			for(int j = 0; j<apt[i].length; j+=1) {
				arr1[k] = apt[i][j];
				arr2[k] = pay[i][j];
				k += 1;
			}
		}
		System.out.println(Arrays.toString(arr1));
		System.out.println(Arrays.toString(arr2));
		
		for(int i = 1; i<arr1.length; i+=1) {
			for(int j = 0; j<i; j+=1) {
				if(arr2[i]<arr2[j]) {
					int num2 = arr2[i];
					arr2[i] = arr2[j];
					arr2[j] = num2;
					
					int num1 = arr1[i];
					arr1[i] = arr1[j];
					arr1[j] = num1;
				}
			}
		}
		System.out.println(Arrays.toString(arr1));
		System.out.println(Arrays.toString(arr2));
		
		System.out.println("--------------------------------");
		
		//����4
		
		System.out.println("��ü�� ù��° ȣ�� �Է��ϼ���.");
		int n1 = scan.nextInt();
		System.out.println("��ü�� �ι�° ȣ�� �Է��ϼ���.");
		int n2 = scan.nextInt();
		
		int _1 = 0;
		int _2 = 0;
		int _3 = 0;
		int _4 = 0;
		
		for(int i = 0; i<apt.length; i+=1) {
			for(int j = 0; j<apt[i].length; j+=1) {
				if(n1 == apt[i][j]) {
					_1 = i;
					_2 = j;
				}
				if(n2 == apt[i][j]) {
					_3 = i;
					_4 = j;
				}
			}
		}
		int temp = pay[_1][_2];
		pay[_1][_2] = pay[_3][_4];
		pay[_3][_4] = temp;
		
		for(int i = 0; i<apt.length; i+=1) {
			for(int j = 0; j<pay[i].length; j+=1){
				System.out.printf("[%4d]" , pay[i][j]);
			}
			System.out.println();
		}
		
		scan.close();
	}
}
