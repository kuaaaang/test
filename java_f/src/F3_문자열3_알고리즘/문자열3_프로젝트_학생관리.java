package F3_문자열3_알고리즘;

import java.util.Arrays;
import java.util.Scanner;

public class 문자열3_프로젝트_학생관리 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		int max = 100;
		String[][] dataList = new String[max][5];

        // 번호 , 아이디 , 비밀번호  , 이름 , 점수 
		String sample[][] = { 
				{ "1001", "qwer", "1234", "김철수", "10" }, 
				{ "1002", "asdf", "2345", "이영희", "30" }, };

		// 이차원 배열을 이용해서 crud 구현
		int size = 0;
		for (int i = 0; i < sample.length; i++) {
			for (int j = 0; j < sample[i].length; j++) {
				dataList[i][j] = sample[i][j];
			}
			size += 1;
		}

		while (true) {
			System.out.println(" [0]종료 [1]가입 [2]탈퇴 [3]수정 [4]검색 [5] 전체출력");
			int sel = scan.nextInt();
			if (sel == 0) {
				break;
			} else if (sel == 1) { // 가입
				System.out.println("아이디를 입력하세요.");
				String id = scan.next();
				System.out.println("비밀번호를 입력하세요.");
				String pw = scan.next();
				System.out.println("이름을 입력하세요.");
				String name = scan.next();
				System.out.println("점수를 입력하세요.");
				String score = scan.next();
				
				int count = 0;
				
				for(int i = 0; i<size; i++) {
					if(id.equals(dataList[i][1])) {
						count += 1;
					}
				}
				if(count == 0) {
					dataList[size][0] = (1000+size+1) + "";
					dataList[size][1] = id;
					dataList[size][2] = pw;
					dataList[size][3] = name;
					dataList[size][4] = score;
					size += 1;
				}
				else {System.out.println("중복! 다시 입력하세요.");}

			}else if (sel == 2) { // 탈퇴
				System.out.println("아이디를 입력하세요.");
				String id = scan.next();
				System.out.println("비밀번호를 입력하세요.");
				String pw = scan.next();
				
				int count = 0;
				for(int i = 0; i<size; i++) {
					if(id.equals(dataList[i][1])) {
						if(pw.equals(dataList[i][2])) {
							System.out.println(Arrays.toString(dataList[i]));
							System.out.println("데이터를 삭제합니다.");
							dataList[i][1] = "";
							dataList[i][2] = "";
							dataList[i][3] = "";
							dataList[i][4] = "";
								
							for(int j = i; j<size-1; j++) { // 중간 삭제 시, 정렬
								String temp[] = dataList[j];
								dataList[j] = dataList[j+1];
								dataList[j+1] = temp;
							}
							size -= 1;
						}
					}
					else {count += 1;}
				}
				if(count == size) {System.out.println("존재하지 않는 아이디 입니다.");}

				for(int i = 0; i<size; i++) {
					dataList[i][0] = (1000+i+1) + "";
				}

			}else if (sel == 3) { // 수정
				System.out.println("아이디를 입력하세요.");
				String id = scan.next();
				System.out.println("비밀번호를 입력하세요.");
				String pw = scan.next();
				
				int count = 0;
				for(int i = 0; i<size; i++) {
					if(id.equals(dataList[i][1])) {
						if(pw.equals(dataList[i][2])) {
							System.out.println(Arrays.toString(dataList[i]));
							while(true) {
								System.out.println("수정할 데이터를 골라주세요.");
								System.out.println("[1]아이디  [2]비밀번호  [3]이름  [4]점수");
								int n = scan.nextInt();
								if(n==1) {
									System.out.println("변경할 아이디를 입력하세요.");
									String newid = scan.next();
									
									int c = 0;
									
									for(int j = 0; j<size; j++) {
										if(dataList[j][1].equals(newid)) {
											c += 1;
										}
										else {continue;}
									}
									if(c > 0) {
										System.out.println("중복");
										System.out.println("다시하세요.");
									}
									else if(c == 0) {
										dataList[i][1] = newid;
										System.out.println("변경완료");
										break;
									}
								}
								else if(n==2) {
									System.out.println("변경할 비밀번호를 입력하세요.");
									String newpw = scan.next();
									dataList[i][2] = newpw;
									System.out.println("변경완료");
									break;
								}
								else if(n==3) {
									System.out.println("변경할 이름을 입력하세요.");
									String newname = scan.next();
									dataList[i][3] = newname;
									System.out.println("변경완료");
									break;
								}
								else if(n==4) {
									System.out.println("변경할 점수를 입력하세요.");
									String newscore = scan.next();
									dataList[i][4] = newscore;
									System.out.println("변경완료");
									break;
								}
								else {System.out.println("다시 입력해주세요.");}
							}
						}
					}
					else {count += 1;}
				}
				if(count == size) {System.out.println("존재하지 않는 아이디 입니다.");}

			}else if (sel == 4) { // 검색
				System.out.println("아이디를 입력하세요.");
				String id = scan.next();
				int count = 0;
				for (int i = 0; i<size; i++) {
					if(dataList[i][1].equals(id)) {
						System.out.println(Arrays.toString(dataList[i]));
					}
					else {count += 1;}
				}
				if(count == size) {System.out.println("존재하지 않는 아이디 입니다.");}

			} else if (sel == 5) {
				for (int i = 0; i<size; i++) {
					for (int j = 0; j<dataList[i].length; j++) {
						System.out.print(dataList[i][j]+ " ");
					}
					System.out.println();
				}
			}
		}
		
		scan.close(); 
	}
}
