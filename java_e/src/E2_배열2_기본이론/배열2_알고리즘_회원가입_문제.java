package E2_배열2_기본이론;

import java.util.Scanner;
import java.util.Arrays;

public class 배열2_알고리즘_회원가입_문제 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		  [회원가입] 동영상으로 설명
		*/
		Scanner scan = new Scanner(System.in);	
		int[] arr = {0, 0, 0, 0, 0};	
		int count = 0;
		while(true) {
			System.out.println("===[회원가입]===");
			System.out.println(Arrays.toString(arr));
			System.out.println("1.추가");
			System.out.println("2.수정");
			System.out.println("3.삭제(인덱스)");
			System.out.println("4.삭제(값)");
			System.out.println("5.삽입");
			System.out.println("0.완료");
			int sel = scan.nextInt();
			if(sel == 1) {
				if(count == 5) {
					System.out.println("공간이 없습니다.");}
				else {
					System.out.println("추가입력 : ");
					int data = scan.nextInt();
					
					boolean check = false;
					for(int i = 0; i<count; i+=1){
						if(data == arr[i]) {
							check = true;
							break;
						}
					}
					if(check == true) {
						System.out.println("중복");
					}else {
						arr[count] = data;
						count+=1;
						System.out.println("추가성공!");
					}	
				}
				
			}else if(sel == 2) {
				System.out.println("수정 내용을 입력하세요.");
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
					System.out.println("교체할 내용을 입력하세요.");
					data = scan.nextInt();
					check = false;
					for(int i = 0; i<count; i+=1) {
						if(data == arr[i]) {
							check = true;
							break;
						}
					}
					if(check == true) {
						System.out.println("중복");
				    }
					else {
						arr[index] = data;
						System.out.println("수정완료");
					}
				}
				else{System.out.println("등록된 수정내용이 없습니다.");}
				
			}else if(sel == 3) {
				if(count == 0) {
					System.out.println("삭제값 없음");
					continue;
				}
				System.out.println("삭제값[인덱스] 입력");
				int index = scan.nextInt();
				
				if(index < 0 || index >= count) {
					System.out.println("입력오류");
					continue;
				}
				for(int i = index; i < count-1; i+=1) {
					arr[i] = arr[i+1];
				}
				arr[count-1] = 0;
				count -= 1;
				System.out.println("삭제완료");
			
			}else if(sel == 4) {
				if(count == 0) {
					System.out.println("사이즈가 0입니다.");
					continue;
				}
				System.out.println("삭제값[값] 입력");
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
					System.out.println("삭제완료");
				}
				else {System.out.println("삭제값 없음");}	
			
			}else if(sel == 5) {
				if(count == 5) {
					System.out.println("공간이 없습니다.");
					continue;
				}
				System.out.println("삽입[인덱스] 입력");
				int index = scan.nextInt();
				if(index < 0 || index > count) {
					System.out.println("인덱스 오류");
					continue;
				}
				System.out.println("삽입[값] 입력");
				int data = scan.nextInt();
				
				boolean check = false;
				for(int i = 0; i < count; i+=1) {
					if(data == arr[i]) {
						check = true;
					}
				}
				if(check == true) {
					System.out.println("중복");
					continue;
				}
				int lastindex = count;
				for(int i = index; i < count; i+=1) {
					arr[lastindex] = arr[lastindex-1];
					lastindex -=1;
				}
				arr[index] = data;
				count =+1;
				System.out.println("삽입완료");
			}
			else if(sel == 0) {
				System.out.println("회원가입 완료");
				break;
			}
		}
		scan.close();
	}
}
