package E2_�迭2_�⺻�̷�;

import java.util.Scanner;
import java.util.Arrays;

public class �迭2_�˰���_ȸ������_���� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		  [ȸ������] ���������� ����
		*/
		Scanner scan = new Scanner(System.in);	
		int[] arr = {0, 0, 0, 0, 0};	
		int count = 0;
		while(true) {
			System.out.println("===[ȸ������]===");
			System.out.println(Arrays.toString(arr));
			System.out.println("1.�߰�");
			System.out.println("2.����");
			System.out.println("3.����(�ε���)");
			System.out.println("4.����(��)");
			System.out.println("5.����");
			System.out.println("0.�Ϸ�");
			int sel = scan.nextInt();
			if(sel == 1) {
				if(count == 5) {
					System.out.println("������ �����ϴ�.");}
				else {
					System.out.println("�߰��Է� : ");
					int data = scan.nextInt();
					
					boolean check = false;
					for(int i = 0; i<count; i+=1){
						if(data == arr[i]) {
							check = true;
							break;
						}
					}
					if(check == true) {
						System.out.println("�ߺ�");
					}else {
						arr[count] = data;
						count+=1;
						System.out.println("�߰�����!");
					}	
				}
				
			}else if(sel == 2) {
				System.out.println("���� ������ �Է��ϼ���.");
				int data = scan.nextInt();
				boolean check = false;
				int index = -1;
				for(int i = 0; i<count; i+=1) {
					if(data == arr[i]) {
						check = true;
						index = i;
					}
				}
				if(check == true) {
					System.out.println("��ü�� ������ �Է��ϼ���.");
					data = scan.nextInt();
					check = false;
					for(int i = 0; i<count; i+=1) {
						if(data == arr[i]) {
							check = true;
							break;
						}
					}
					if(check == true) {
						System.out.println("�ߺ�");
				    }
					else {
						arr[index] = data;
						System.out.println("�����Ϸ�");
					}
				}
				else{System.out.println("��ϵ� ���������� �����ϴ�.");}
				
			}else if(sel == 3) {
				if(count == 0) {
					System.out.println("������ ����");
					continue;
				}
				System.out.println("������[�ε���] �Է�");
				int index = scan.nextInt();
				
				if(index < 0 || index >= count) {
					System.out.println("�Է¿���");
					continue;
				}
				for(int i = index; i < count-1; i+=1) {
					arr[i] = arr[i+1];
				}
				arr[count-1] = 0;
				count -= 1;
				System.out.println("�����Ϸ�");
			
			}else if(sel == 4) {
				if(count == 0) {
					System.out.println("����� 0�Դϴ�.");
					continue;
				}
				System.out.println("������[��] �Է�");
				int data = scan.nextInt();
				boolean check = false;
				int index = -1;
				
				for(int i = 0; i < count; i+=1) {
					if(data == arr[i]) {
						check = true;
						index = i;
					}
				}
				if(check == true) {
					for(int i = index; i<count-1; i+=1) {
						arr[i] = arr[i+1];
					}
					arr[count-1] = 0;
					count -= 1;
					System.out.println("�����Ϸ�");
				}
				else {System.out.println("������ ����");}	
			
			}else if(sel == 5) {
				if(count == 5) {
					System.out.println("������ �����ϴ�.");
					continue;
				}
				System.out.println("����[�ε���] �Է�");
				int index = scan.nextInt();
				if(index < 0 || index > count) {
					System.out.println("�ε��� ����");
					continue;
				}
				System.out.println("����[��] �Է�");
				int data = scan.nextInt();
				
				boolean check = false;
				for(int i = 0; i < count; i+=1) {
					if(data == arr[i]) {
						check = true;
					}
				}
				if(check == true) {
					System.out.println("�ߺ�");
					continue;
				}
				int lastindex = count;
				for(int i = index; i < count; i+=1) {
					arr[lastindex] = arr[lastindex-1];
					lastindex -=1;
				}
				arr[index] = data;
				count =+1;
				System.out.println("���ԿϷ�");
			}
			else if(sel == 0) {
				System.out.println("ȸ������ �Ϸ�");
				break;
			}
		}
		scan.close();
	}
}
