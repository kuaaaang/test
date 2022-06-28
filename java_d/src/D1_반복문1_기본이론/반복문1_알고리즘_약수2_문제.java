package D1_반복문1_기본이론;

public class 반복문1_알고리즘_약수2_문제 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 [문제]
		   18의 약수의 갯수 더하기 21의 약수의 갯수를 출력하시오.
		*/
		int i1 = 1;
		int i2 = 1;
		int count1 = 0;
		int count2 = 0;
		
		while(i1<=18){if(18%i1 == 0) {System.out.println(i1);
                                      count1 = count1 + 1;}
                      i1 = i1 + 1;
                      }

		System.out.println("----------------------------------------");	
		
	    while(i2<=21){if(21%i2 == 0) {System.out.println(i2);
	    	                          count2 = count2 + 1;}
	                  i2 = i2 + 1;
                      }
	    System.out.println("----------------------------------------");	
	    System.out.println("18의 약수 : " + count1 + " 개");
	    System.out.println("21의 약수 : " + count2 + " 개");
	    System.out.println(count1 + count2);
	}
}