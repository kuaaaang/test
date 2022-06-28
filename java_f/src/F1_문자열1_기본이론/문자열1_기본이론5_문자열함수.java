package F1_문자열1_기본이론;

import java.util.Arrays;

public class 문자열1_기본이론5_문자열함수 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		  # 문자열함수
		  [1] 문자의 길이 : length()  // 공백 포함
		  
		  [2] 문자 한개 추출(인덱싱) : charAt(index)
		  
		  [3] 문자 여러개 추출(슬라이싱)
		  	1) substring(min , max-1)  ==> 범위
		  	2) substring(min)          ==> 끝까지
		  
		  [4] 구분자로 잘라내 배열에 담기 
		      String str = "hello,java,android";
		      String[] ar = str.split(",");
		      ar[0] = hello
		      ar[1] = java
		      ar[2] = android   
		*/

			//			  012345
			String str1 = "megait";
			String str2 = "hello java";
			
			// [1] 문자의 길이 : length()  // 공백 포함
			int size = str1.length();
			int sizes = str2.length();
			System.out.println(size);					// 6
			System.out.println(sizes);                  // 10
			
			System.out.println("--------------------");
			
			// [2] 문자 한개 추출(인덱싱) : charAt(index)
			char ch = str1.charAt(0); // 첫번째글자
			System.out.println(ch);						// m
			ch = str1.charAt(size - 1); //마지막글자
			System.out.println(ch);						// t
			
			System.out.println("--------------------");
			
			// [3] 문자 여러개 추출(슬라이싱)
			//     1) substring(index1, index2)
			//        마지막은 포함하지 않는다. (index1부터 index2 미만까지)
			       String rs1 = str1.substring(4, 6);
			       System.out.println(rs1);		        // it
			       String rs2 = str2.substring(0,5);    // 0부터 5미만까지(=0부터 4까지)
			       System.out.println(rs2);
			
			System.out.println();       
			       
			//     2) substring(index)
			//        index부터 문자열 끝까지
			       rs1 = str1.substring(4);
			       System.out.println(rs1);				// it
			       
			System.out.println("--------------------");	
			
			// [4] split(구분자) 
			// 구분자로 잘라내서 배열에 담기
			String str3 = "hello,java,android";
			String[] arr = str3.split(",");
			System.out.println(Arrays.toString(arr));
			System.out.println(arr.length);				// 3
			System.out.println(arr[0]);					// hello
			System.out.println(arr[1]);					// java
			System.out.println(arr[2]);					// android
			
			System.out.println("--------------------");
			
			// [5] trim
			// 공백 문자열을 제거 한 문자열 출력
			String str4 = "  Hello  World  ";  
			System.out.println(str4);
	        System.out.println(str4.trim()); //앞뒤 공백만 제거, 가운데 공백 제거 X
	        
	        System.out.println("--------------------");
	       
	        // [6] replaceAll
	        // str5 문자열의 "Hello"를 "A"로 변경
	        String str5 = "HelloHelloHello";      
	        System.out.println(str5.replaceAll("Hello","A"));   
	        
	        System.out.println("--------------------");
	        
	        // 변형
	        // str6 문자열의 공백 문자 제거
	        String str6 = " Hello Hello Hello ";    
	        System.out.println(str6.replaceAll(" ",""));
	}
}
