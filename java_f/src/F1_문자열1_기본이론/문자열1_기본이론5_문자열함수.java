package F1_���ڿ�1_�⺻�̷�;

import java.util.Arrays;

public class ���ڿ�1_�⺻�̷�5_���ڿ��Լ� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		  # ���ڿ��Լ�
		  [1] ������ ���� : length()  // ���� ����
		  
		  [2] ���� �Ѱ� ����(�ε���) : charAt(index)
		  
		  [3] ���� ������ ����(�����̽�)
		  	1) substring(min , max-1)  ==> ����
		  	2) substring(min)          ==> ������
		  
		  [4] �����ڷ� �߶� �迭�� ��� 
		      String str = "hello,java,android";
		      String[] ar = str.split(",");
		      ar[0] = hello
		      ar[1] = java
		      ar[2] = android   
		*/

			//			  012345
			String str1 = "megait";
			String str2 = "hello java";
			
			// [1] ������ ���� : length()  // ���� ����
			int size = str1.length();
			int sizes = str2.length();
			System.out.println(size);					// 6
			System.out.println(sizes);                  // 10
			
			System.out.println("--------------------");
			
			// [2] ���� �Ѱ� ����(�ε���) : charAt(index)
			char ch = str1.charAt(0); // ù��°����
			System.out.println(ch);						// m
			ch = str1.charAt(size - 1); //����������
			System.out.println(ch);						// t
			
			System.out.println("--------------------");
			
			// [3] ���� ������ ����(�����̽�)
			//     1) substring(index1, index2)
			//        �������� �������� �ʴ´�. (index1���� index2 �̸�����)
			       String rs1 = str1.substring(4, 6);
			       System.out.println(rs1);		        // it
			       String rs2 = str2.substring(0,5);    // 0���� 5�̸�����(=0���� 4����)
			       System.out.println(rs2);
			
			System.out.println();       
			       
			//     2) substring(index)
			//        index���� ���ڿ� ������
			       rs1 = str1.substring(4);
			       System.out.println(rs1);				// it
			       
			System.out.println("--------------------");	
			
			// [4] split(������) 
			// �����ڷ� �߶󳻼� �迭�� ���
			String str3 = "hello,java,android";
			String[] arr = str3.split(",");
			System.out.println(Arrays.toString(arr));
			System.out.println(arr.length);				// 3
			System.out.println(arr[0]);					// hello
			System.out.println(arr[1]);					// java
			System.out.println(arr[2]);					// android
			
			System.out.println("--------------------");
			
			// [5] trim
			// ���� ���ڿ��� ���� �� ���ڿ� ���
			String str4 = "  Hello  World  ";  
			System.out.println(str4);
	        System.out.println(str4.trim()); //�յ� ���鸸 ����, ��� ���� ���� X
	        
	        System.out.println("--------------------");
	       
	        // [6] replaceAll
	        // str5 ���ڿ��� "Hello"�� "A"�� ����
	        String str5 = "HelloHelloHello";      
	        System.out.println(str5.replaceAll("Hello","A"));   
	        
	        System.out.println("--------------------");
	        
	        // ����
	        // str6 ���ڿ��� ���� ���� ����
	        String str6 = " Hello Hello Hello ";    
	        System.out.println(str6.replaceAll(" ",""));
	}
}
