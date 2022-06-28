package F3_문자열3_알고리즘;

import java.util.Arrays;

public class 문자열3_프로젝트_도서연체 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String rentalData = "";		
		rentalData += "책번호/책제목/대여날짜/회원번호\n";
		rentalData += "20122/연필로쓰기/2020-11-25/1001\n";
		rentalData += "40143/외국어 공부의 감각/2020-11-27/1003\n";
		rentalData += "54321/컴퓨터활용능력/2020-11-27/1041\n";
		rentalData += "26543/아무튼,외국어/2020-12-01/1034";

		String userData = "";
		userData += "회원번호/책번호/대여일수(day)\n";
		userData += "1001/20122/10\n";
		userData += "1003/40143/8\n";
		userData += "1041/54321/5\n";
		userData += "1034/26543/2";
		
		// 위 데이터는 도서관 책 대여 데이터이다.
		// 오늘은 12월4일 이라고했을때 연체한 회원번호 출력
		
		System.out.println(rentalData);
		System.out.println("-------------------------------------------------");
		
		String u[] = userData.split("\n");
		String r[] = rentalData.split("\n");
		String id = "";
		String startday = "";
		String endday = "";
		
		for(int i = 1; i<r.length; i+=1) {
			String rent[] = r[i].split("/");
			String user[] = u[i].split("/");
			startday += rent[2] + "/";
			endday += user[2] + "/";
			id += rent[3] + "/";
		}
		String start[] = startday.split("/");
		String end[] = endday.split("/");
		String idid[] = id.split("/");
		
//		System.out.println(Arrays.toString(start));
//		System.out.println(Arrays.toString(end));
		
		int sday[][] = new int [start.length][2];
		int eday[] = new int[end.length];
		
		for(int i = 0; i<start.length; i+=1) {
			String d[] = start[i].split("-");
			sday[i][0] = Integer.parseInt(d[1]);
			sday[i][1] = Integer.parseInt(d[2]);
			eday[i] = Integer.parseInt(end[i]);
//			System.out.println(Arrays.toString(sday[i]));
		}
//		System.out.println(Arrays.toString(eday));
		
		for(int i = 0; i<start.length; i+=1) {
			if(sday[i][1] + eday[i]>30) {
				sday[i][1] = sday[i][1] + eday[i] -30;
				sday[i][0] += 1;
			}
			else {sday[i][1] += eday[i];}
//			System.out.println(Arrays.toString(sday[i]));
		}
		
		for(int i = 0; i<start.length; i+=1) {
			if(sday[i][1]>4) {
				System.out.println(idid[i] + " 연체");
			}
		}
	}
}
