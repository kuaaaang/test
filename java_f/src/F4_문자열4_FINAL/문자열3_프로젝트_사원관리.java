package F4_문자열4_FINAL;

import java.util.Arrays;

public class 문자열3_프로젝트_사원관리 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//[부서정보]
		//[부서번호,부서명,지역]
		String[][] departmentData = { 
				{ "10", "ACCOUNTING", "NEW YORK" }, 
				{ "20", "RESEARCH", "DALLAS" },
				{ "30", "SALES", "CHICAGO" }, 
				{ "40", "OPERATIONS", "BOSTON" }, 
		};
		// [사원정보]
		// [번호,이름,직책,상사번호,입사일,급여,커미션,부서번호]
		String[][] employeeData = { 
				{ "7369", "SMITH", "CLERK", "7902", "17-12-1980", "800", "0", "20" },
				{ "7499", "ALLEN", "SALESMAN", "7698", "20-2-1981", "1600", "300", "30" },
				{ "7521", "WARD", "SALESMAN", "7698", "22-2-1981", "1250", "500", "30" },
				{ "7566", "JONES", "MANAGER", "7839", "2-4-1981", "2975", "0", "20" },
				{ "7654", "MARTIN", "SALESMAN", "7698", "28-9-1981", "1250", "1400", "30" },
				{ "7698", "BLAKE", "MANAGER", "7839", "1-5-1981", "2850", "0", "30" },
				{ "7782", "CLARK", "MANAGER", "7839", "9-6-1981", "2450", "0", "10" },
				{ "7788", "SCOTT", "ANALYST", "7566", "13-7-1987", "3000", "0", "20" },
				{ "7839", "KING", "PRESIDENT", "NULL", "17-11-1981", "5000", "0", "10" },
				{ "7844", "TURNER", "SALESMAN", "7698", "8-9-1981", "1500", "0", "30" },
				{ "7876", "ADAMS", "CLERK", "7788", "13-7-1987", "1100", "0", "20" },
				{ "7900", "JAMES", "CLERK", "7698", "3-12-1981", "950", "0", "30" },
				{ "7902", "FORD", "ANALYST", "7566", "3-12-1981", "3000", "0", "20" },
				{ "7934", "MILLER", "CLERK", "7782", "23-1-1982", "1300", "0", "10" }
		};	
		
		// [월급 등급]
		// [등급 , 급여MIN , 급여MAX]
		int salaryGradeData[][] = { 
				{ 1, 700, 1200 }, // 1등급이고 급여 700~1200 사이
				{ 2, 1201, 1400 }, 
				{ 3, 1401, 2000 }, 
				{ 4, 2001, 3000 },
				{ 5, 3001, 9999 } 
		};

		// 문제) # "DALLAS"에서 근무하는 사원의 이름,직급,부서번호,부서명을 조회하시오.	
		String departMentNumber = "";		
		for(int i = 0; i < departmentData.length; i++) {
			if(departmentData[i][2].equals("DALLAS")) {
				departMentNumber = departmentData[i][0];
			}
		}
		System.out.println(departMentNumber);	
		for(int i = 0; i  < employeeData.length; i++) {
			if(departMentNumber.equals(employeeData[i][7])) {
				System.out.println(Arrays.toString(employeeData[i]));
			}
		}
		
		System.out.println("---------------------------------------------------------");
				
		// 문제) # ALLEN과 같은 부서에 근무하는 사원의 이름, 부서번호를 조회하시오.
		String depNum = "";
		for(int i=0; i<employeeData.length; i++) {
			if(employeeData[i][1].equals("ALLEN")) {
				depNum = employeeData[i][7];
			}
		}
				
		for(int i=0; i<employeeData.length; i++) {
			if(depNum.equals(employeeData[i][7])) {
				System.out.println(employeeData[i][1] + " : " + employeeData[i][7]);
			}
		}		

		System.out.println("---------------------------------------------------------");
		
		// 문제) # 사원명과 부서명을 조회하시오.
		for(int i=0; i<employeeData.length; i+=1) {
			for(int j=0; j<departmentData.length; j+=1) {
				if(employeeData[i][7].equals(departmentData[j][0])) {
					System.out.println(employeeData[i][1] + " : " + departmentData[j][1]);
				}
			}
		}
		
		System.out.println("---------------------------------------------------------");
		
		// 문제) # 이름,월급,월급등급을 조회하시오.
		for(int i=0; i<employeeData.length; i+=1) {
			int money = Integer.parseInt(employeeData[i][5]);
			for(int j=0; j<salaryGradeData.length; j+=1) {
				if(money>=salaryGradeData[j][1] && money<=salaryGradeData[j][2]) {
					System.out.print(employeeData[i][1] + " 월급 : ");
					System.out.print(employeeData[i][5] + " - ");
					System.out.print(salaryGradeData[j][0] + "등급");
					System.out.println();
				}
			}
		}

		System.out.println("---------------------------------------------------------");
		
		// 문제) # 이름,부서명,월급등급을 조회하시오.
		for(int i=0; i<employeeData.length; i+=1) {
			int money = Integer.parseInt(employeeData[i][5]);
			for(int j=0; j<departmentData.length; j+=1) {
				if(employeeData[i][7].equals(departmentData[j][0])) {
					System.out.print(employeeData[i][1] + " : " + departmentData[j][1]);
				}
			}
			for(int k=0; k<salaryGradeData.length; k+=1) {
				if(money>=salaryGradeData[k][1] && money<=salaryGradeData[k][2]) {
					System.out.print(" - " + salaryGradeData[k][0] + "등급");
					System.out.println();
				}
			}
		}

		System.out.println("---------------------------------------------------------");
		
		// 문제) # 이름,직속상사이름을 조회하시오.
		for(int i=0; i<employeeData.length; i+=1) {
			for(int j=0; j<employeeData.length; j+=1) {
				if(employeeData[i][3].equals(employeeData[j][0])) {
					System.out.println(employeeData[i][1] + " : " + employeeData[j][1]);
				}
				
			}
			if(employeeData[i][3].equals("NULL")) {
				System.out.println(employeeData[i][1] + " :  ---");
			}
		}

		System.out.println("---------------------------------------------------------");
		
		// 문제) # 이름,부서번호,부서이름을 조회하시오.
		for(int i=0; i<employeeData.length; i+=1) {
			for(int j=0; j<departmentData.length; j+=1) {
				if(employeeData[i][7].equals(departmentData[j][0])) {
					System.out.print(employeeData[i][1] + " : ");
					System.out.print(employeeData[i][7] + " : ");
					System.out.print(departmentData[j][1]);
					System.out.println();
				}
			}
		}

		System.out.println("---------------------------------------------------------");
		
		// 문제) # 부서번호가 30번인 사원들의 이름, 직급, 부서번호, 부서위치를 조회하시오.
		for(int i=0; i<employeeData.length; i+=1) {
			if(employeeData[i][7].equals("30")) {
				System.out.print(employeeData[i][1] + " , ");
				System.out.print(employeeData[i][2] + " , ");
				for(int j=0; j<departmentData.length; j+=1) {
					if(departmentData[j][0].equals("30")) {
						System.out.print(departmentData[j][2]);
						System.out.println();
					}
				}
			}
		}

		System.out.println("---------------------------------------------------------");
		
		// 문제) # 커미션을 받는 사원의 이름, 커미션, 부서이름,부서위치를 조회하시오.
		for(int i=0; i<employeeData.length; i+=1) {
			if(employeeData[i][6].equals("0") == false) {
				System.out.print(employeeData[i][1] + " , ");
				System.out.print(employeeData[i][6] + " , ");
				for(int j=0; j<departmentData.length; j+=1) {
					if(departmentData[j][0].equals(employeeData[i][7])) {
						System.out.print(departmentData[j][1] + " , ");
						System.out.print(departmentData[j][2]);
						System.out.println();
					}
				}
			}
		}

		System.out.println("---------------------------------------------------------");
		
		// 문제) # DALLAS에서 근무하는 사원의 이름,직급,부서번호,부서명을 조회하시오.
		for(int i=0; i<departmentData.length; i+=1) {
			if(departmentData[i][2].equals("DALLAS")) {
				String a = departmentData[i][0];
				for(int j=0; j<employeeData.length; j+=1) {
					if(employeeData[j][7].equals(a)) {
						System.out.print(employeeData[j][1] + " , ");
						System.out.print(employeeData[j][2] + " , ");
						System.out.print(employeeData[j][7] + " , ");
						System.out.print(departmentData[i][1]);
						System.out.println();
					}
				}
			}
		}

		System.out.println("---------------------------------------------------------");
		
		// 문제) # 이름에 A 가 들어가는 사원의 이름,부서명을 조회하시오.
		for(int i=0; i<employeeData.length; i+=1) {
			for(int j=0; j<employeeData[i][1].length(); j+=1) {
				char a = employeeData[i][1].charAt(j);
				if(a == 'A') {
					System.out.print(employeeData[i][1] + " , ");
					for(int k=0; k<departmentData.length; k+=1) {
						if(departmentData[k][0].equals(employeeData[i][7])) {
							System.out.print(departmentData[k][1]);
							System.out.println();
						}
					}
					break;
				}
			}
		}

		System.out.println("---------------------------------------------------------");
		
		// 문제) # 이름, 직급, 월급여, 월급여등급을 조회하시오.
		for(int i=0; i<employeeData.length; i+=1) {
			int money = Integer.parseInt(employeeData[i][5]);
			for(int j=0; j<salaryGradeData.length; j+=1) {
				if(money>=salaryGradeData[j][1] && money<=salaryGradeData[j][2]) {
					System.out.print(employeeData[i][1] + " , ");
					System.out.print(employeeData[i][2] + " , ");
					System.out.print(employeeData[i][5] + " - ");
					System.out.print(salaryGradeData[j][0] + "등급");
					System.out.println();
				}
			}
		}

		System.out.println("---------------------------------------------------------");
		
		// 문제) # ALLEN과 같은 부서에 근무하는 사원의 이름, 부서번호를 조회하시오.
		String num = "";
		for(int i=0; i<employeeData.length; i+=1) {
			if(employeeData[i][1].equals("ALLEN")) {
				num = employeeData[i][7];
			}
		}
		for(int i=0; i<employeeData.length; i+=1) {
			if(employeeData[i][7].equals(num) && employeeData[i][1].equals("ALLEN") == false) {
				System.out.print(employeeData[i][1] + " , ");
				System.out.print(employeeData[i][7] + " , ");
				System.out.println();
			}
		}
		
		System.out.println("---------------------------------------------------------");
		
		// 문제) # 사원명 'JONES'가 속한 부서명을 조회하시오.
		String number = "";
		for(int i=0; i<employeeData.length; i+=1) {
			if(employeeData[i][1].equals("JONES")) {
				number = employeeData[i][7];
				System.out.print(employeeData[i][1] + " : ");
			}
		}
		for(int i=0; i<departmentData.length; i+=1) {
			if(departmentData[i][0].equals(number)) {
				System.out.print(departmentData[i][1]);
				System.out.println();
			}
		}

		System.out.println("---------------------------------------------------------");
		
		// 문제) # 10번 부서에서 근무하는 사원의 이름과 10번 부서의 부서명을 조회하시오.
		String n = "";
		for(int i=0; i<departmentData.length; i+=1) {
			if(departmentData[i][0].equals("10")) {
				n = departmentData[i][1];
			}
		}
		for(int i=0; i<employeeData.length; i+=1) {
			if(employeeData[i][7].equals("10")) {
				System.out.print(employeeData[i][1] + " : ");
				System.out.print(n);
				System.out.println();
			}
		}

		System.out.println("---------------------------------------------------------");
		
		// 문제) # 평균 월급여보다 더 많은 월급여를 받은 사원의 사원번호,이름,월급여 조회하시오.
		for(int i=0; i<employeeData.length; i+=1) {
			int money = Integer.parseInt(employeeData[i][5]);
			for(int j=0; j<salaryGradeData.length; j+=1) {
				if(money>=salaryGradeData[j][1] && money<=salaryGradeData[j][2]) {
					double a = (salaryGradeData[j][1] + salaryGradeData[j][2])/2.0;
					if(money>=a) {
						System.out.print(employeeData[i][0] + " , ");
						System.out.print(employeeData[i][1] + " , ");
						System.out.print(employeeData[i][5]);
						System.out.println();
					}
				}
			}
		}

		System.out.println("---------------------------------------------------------");
		
		// 문제) # 부서번호가 20인 사원중에서 최대급여를 받는 사원과 동일한 급여를 받는 사원의 사원번호, 이름을 조회하시오.
		for(int i=0; i<employeeData.length; i+=1) {
			if(employeeData[i][7].equals("20")) {
				int money = Integer.parseInt(employeeData[i][5]);
				for(int j=0; j<salaryGradeData.length; j+=1) {
					if(money == salaryGradeData[j][2]) {
						System.out.print(employeeData[i][0] + " , ");
						System.out.print(employeeData[i][1]);
						System.out.println();
					}
				}
			}
		}

		System.out.println("---------------------------------------------------------");
		
		// 문제) # 부서 테이블과 사원테이블에서 사번, 사원명, 부서코드, 부서명을 검색하시오. ( 사원명 오름차순 정렬할 것 )
		for(int i=0; i<employeeData.length; i+=1) {
			for(int j=i; j<employeeData.length; j+=1) {
				if(employeeData[i][1].compareTo(employeeData[j][1])>0) {
					String temp[] = employeeData[i];
					employeeData[i] = employeeData[j];
					employeeData[j] = temp;
				}
			}
		}
		for(int i=0; i<employeeData.length; i+=1) {
			System.out.println(Arrays.toString(employeeData[i]));
		}

		System.out.println("---------------------------------------------------------");
		
		// 문제) # 사원 테이블과 급여 등급 테이블에서 사번, 사원명, 급여, 등급을 검색하시오. 단, 등급은 급여가 하한값과 상한값 범위에 포함되고 등급이 4이며 급여를 기준으로 내림차순정렬할 것.
		for(int i=0; i<employeeData.length; i+=1) {
			for(int j=i; j<employeeData.length; j+=1) {
				if(Integer.parseInt(employeeData[i][5])<Integer.parseInt(employeeData[j][5])) {
					String temp[] = employeeData[i];
					employeeData[i] = employeeData[j];
					employeeData[j] = temp;
				}
			}
		}
//		for(int i=0; i<employeeData.length; i+=1) {
//			System.out.println(Arrays.toString(employeeData[i]));
//		}
		
		int moneyList[] = new int[employeeData.length];
		for(int i=0; i<employeeData.length; i+=1) {
			int money = Integer.parseInt(employeeData[i][5]);
			for(int j=0; j<salaryGradeData.length; j+=1) {
				if(money>=salaryGradeData[j][1] && money<=salaryGradeData[j][2]) {
					moneyList[i] = salaryGradeData[j][0];
				}
			}
		}
		for(int i=0; i<moneyList.length; i+=1) {
			for(int j=i; j<moneyList.length; j+=1) {
				if(moneyList[i]<moneyList[j]) {
					int temp = moneyList[i];
					moneyList[i] = moneyList[j];
					moneyList[j] = temp;
					
					String t[] = employeeData[i];
					employeeData[i] = employeeData[j];
					employeeData[j] = t;
				}
			}
		}
		for(int i=0; i<moneyList.length; i+=1) {
			if(moneyList[i]<=4) {
				System.out.print(employeeData[i][0] + " , ");
				System.out.print(employeeData[i][1] + " , ");
				System.out.print(employeeData[i][5] + " , ");
				System.out.print(moneyList[i]);
				System.out.println();
			}		
		}
		
		System.out.println("---------------------------------------------------------");
		
		// 문제) # 부서 테이블, 사원 테이블, 급여등급 테이블에서 사번, 사원명, 부서명, 급여 , 등급을 검색하시오. 단, 등급은 급여가 하한값과 상한값 범위에 포함되며 등급을 기준으로 내림차순 정렬할 것.
		
		int mList[] = new int[employeeData.length];
		for(int i=0; i<employeeData.length; i+=1) {
			int money = Integer.parseInt(employeeData[i][5]);
			for(int j=0; j<salaryGradeData.length; j+=1) {
				if(money>=salaryGradeData[j][1] && money<=salaryGradeData[j][2]) {
					mList[i] = salaryGradeData[j][0];
				}
			}
		}
		for(int i=0; i<mList.length; i+=1) {
			for(int j=i; j<mList.length; j+=1) {
				if(mList[i]<mList[j]) {
					int temp = mList[i];
					mList[i] = mList[j];
					mList[j] = temp;
					
					String t[] = employeeData[i];
					employeeData[i] = employeeData[j];
					employeeData[j] = t;
				}
			}
		}
		for(int i=0; i<mList.length; i+=1) {
			System.out.print(employeeData[i][0] + " , ");
			System.out.print(employeeData[i][1] + " , ");
			for(int j=0; j<departmentData.length; j+=1) {
				if(employeeData[i][7].equals(departmentData[j][0])) {
					System.out.print(departmentData[j][1] + " , ");
				}
			}
			System.out.print(employeeData[i][5] + " , ");
			System.out.print(mList[i]);
			System.out.println();
		}
		
		System.out.println("---------------------------------------------------------");
		
		// 문제) # 사원 테이블에서 사원명과 해당 사원의 관리자명을 검색하시오
		for(int i=0; i<employeeData.length; i+=1) {
			for(int j=0; j<employeeData.length; j+=1) {
				if(employeeData[i][3].equals(employeeData[j][0])) {
					System.out.println(employeeData[i][1] + " : " + employeeData[j][1]);
				}
				
			}
			if(employeeData[i][3].equals("NULL")) {
				System.out.println(employeeData[i][1] + " :  ---");
			}
		}

		System.out.println("---------------------------------------------------------");
		
		// 문제) # 30번 부서의 이름과 그 부서에 근무하는 사원의 이름을 출력하시오.
		String name = "";
		for(int i=0; i<departmentData.length; i+=1) {
			if(departmentData[i][0].equals("30")) {
				name = departmentData[i][1];
			}
		}
		for(int i=0; i<employeeData.length; i+=1) {
			if(employeeData[i][7].equals("30")) {
				System.out.print(employeeData[i][1] + " : ");
				System.out.print(name);
				System.out.println();
			}
		}

		System.out.println("---------------------------------------------------------");
		
		// 문제) # 사원 테이블에서 MILLER 보다 늦게 입사한 사원의 사번, 이름, 입사일을 검색하시오
		String MILLER[] = new String[3];
		for(int i=0; i<employeeData.length; i+=1) {
			if(employeeData[i][1].equals("MILLER")) {
				MILLER = employeeData[i][4].split("-");
			}
		}
		for(int i=0; i<employeeData.length; i+=1) {
			String temp[] = employeeData[i][4].split("-");
			if(MILLER[2].compareTo(temp[2])<0) {
				System.out.print(employeeData[i][0] + " , ");
				System.out.print(employeeData[i][1] + " , ");
				System.out.print(employeeData[i][4]);
				System.out.println();
			}
			else if(MILLER[2].compareTo(temp[2])==0) {
				if(MILLER[1].compareTo(temp[1])<0) {
					System.out.print(employeeData[i][0] + " , ");
					System.out.print(employeeData[i][1] + " , ");
					System.out.print(employeeData[i][4]);
					System.out.println();
				}
				else if(MILLER[1].compareTo(temp[1])==0) {
					if(MILLER[0].compareTo(temp[0])<0) {
						System.out.print(employeeData[i][0] + " , ");
						System.out.print(employeeData[i][1] + " , ");
						System.out.print(employeeData[i][4]);
						System.out.println();
					}
				}
			}
		}

		System.out.println("---------------------------------------------------------");
		
		// 문제) # 사원 테이블에서 부서별 최대 급여를 받는 사원들의 사번, 이름, 부서코드, 급여를 검색하시오.
		int money[] = new int [departmentData.length];
		for(int i=0; i<employeeData.length; i+=1) {
			int m = Integer.parseInt(employeeData[i][5]);
			
			for(int j=0; j<departmentData.length; j+=1) {
				if(employeeData[i][7].equals(departmentData[j][0])) {
					if(money[j]<m) {
						money[j] = m;
					}
				}
			}
		}
//		System.out.println(Arrays.toString(money));
		for(int i=0; i<employeeData.length; i+=1) {
			for(int j=0; j<departmentData.length; j+=1) {
				if(employeeData[i][7].equals(departmentData[j][0])) {
					if(Integer.parseInt(employeeData[i][5]) == money[j]) {
						System.out.print(employeeData[i][0] + " , ");
						System.out.print(employeeData[i][1] + " , ");
						System.out.print(employeeData[i][7] + " , ");
						System.out.print(employeeData[i][5]);
						System.out.println();
					}
				}
			}
		}

		System.out.println("---------------------------------------------------------");
		
		// 문제) # Salgrade가 2등급인 사원들의 평균 급여보다 적게 받는 사원 정보를 검색하시오.
		for(int i=0; i<employeeData.length; i+=1) {
			int m = Integer.parseInt(employeeData[i][5]);
			if(m>=salaryGradeData[1][1] && m<=salaryGradeData[1][2]) {
				if(m<=((salaryGradeData[1][1]+salaryGradeData[1][2])/2.0)) {
					System.out.println(Arrays.toString(employeeData[i]));
				}
			}
		}
	}
}
