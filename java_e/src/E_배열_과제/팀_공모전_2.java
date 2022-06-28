package E_배열_과제;

import java.util.Random;
import java.util.Scanner;

public class 팀_공모전_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 중복검사할때
		// 첫번째 for문은 세로 / 두번째 for문은 가로 ===> i의j번째가 0이 아닐때
				//==> 랜덤두개  0~9 [r1][r2] ==> 0인지 아닌지 !=
// TODO Auto-generated method stub

  Scanner scan=new Scanner(System.in);
  Random ran=new Random();
  
 //지도만들기
  int map[][]= {
		  
		  {1,0,0,0,4,0,0,0,0,0,},
		  {0,0,0,0,4,0,0,0,0,0,},
		  {0,0,0,0,0,0,0,0,0,4,},
		  {4,4,0,3,0,0,3,0,0,4,},
		  {0,0,0,4,4,4,0,0,0,4,},
		  {3,0,3,0,3,0,3,0,3,0,},
		  {4,0,0,3,0,0,3,0,0,0,},
		  {4,0,0,0,0,0,0,0,4,4,},
		  {0,0,0,0,0,4,0,0,0,0,},
		  {0,0,0,3,0,4,3,0,0,2,},
  };
		for(int i=0; i<map.length; i++) {
			System.out.println();
			for(int j=0; j<map[i].length; j++) {
				System.out.print("["+map[i][j]+"]");
			}
		}
		
		System.out.println();
		int y1=0;//p1 열 
		int x1=0;//p1 행
		int y2=9;//p2 열
		int x2=9;//p2 행
		int k=0;
		
while(k==0) {
	
	System.out.println("---------------------------------");
	//집랜덤돌리기
	int r1=ran.nextInt(7)+2;//집의 위치를 랜덤으로 돌려서 정한다
	int r2=ran.nextInt(7)+2;
	//map[r1][r2]>p1집
	//map[r2][r1]>p1집
	int move=1;//p1,p2차례
	
	//랜덤으로 돌린 집의 위치가 길이 아닌 경우 다시!
	boolean check=false;
	if(map[r1][r2]!=0 || map[r2][r1]!=0 || r1==r2 ) {//0이 아니거나 r1,r2의 값이 같아 집이 같은경우
		check=true;
	}
	System.out.println();
	System.out.println("r1:"+r1+" r2:"+r2);
	
	//p1,p2 집이 위치를 잡은 후
	while(check==false) {
			
	System.out.println("------------------------------");
	for(int i=0; i<map.length; i++) {
		System.out.println();
	
		for(int j=0; j<map.length; j++) {
			
		if(i%3==0 && j%3==0 && i/3>=1 && j/3>=1 && j!=9) {//아이템 달리는 구간 
				System.out.print("♪♬♪");
				}
		else if(i==5 && j%2==0) {//함정 넘어지는 구간 
			System.out.print("※※※");
		}
		else if(map[i][j]==0) {//길,집위치표시
			if(r1==i && r2==j) {//p1집
				System.out.print("★■★");
			}
			else if(r2==i && r1==j) {//p2집
				System.out.print("★■★");
			}
			else {//길
			System.out.print("   ");
			}
		}else if(map[i][j]==4) {//벽
			System.out.print("▦▦▦");
		}else if(map[i][j]==1) {//player1
			System.out.print("|♠|");
		}else if(map[i][j]==2) {//player2
			System.out.print("|♣|");
		
		}
	}
		
	}
	System.out.println();
	System.out.println("------------------------------");
	//player1
	if(move%2==1) {
		System.out.println("p1이동:"+"1.left  2.right 3.up 4.down");
		int sel = scan.nextInt();//이동위치
		
		if(sel==1) {//왼쪽으로 이동
			
			if(x1>0) {//x1 0보다 커야지 가능
			if(map[y1][x1-1]!=4) {//벽이아닐경우
				map[y1][x1]=0;//원래있던자리
				map[y1][x1-1]=1;//옮긴자리
				x1=x1-1;
				if( y1==5 && x1%2==0) {//5열 짝수행 넘어지는구간
					System.out.println("뒤로넘어졌습니다");
					map[y1][x1]=0;//옮겨진자리에서 다시 뒤로간다
					x1=x1+1;
					map[y1][x1]=1;
				}
			}
			}
		}else if(sel==2) {//오른쪽이동
			
			if(x1<map.length-1) {
			if(map[y1][x1+1]!=4) {
				map[y1][x1]=0;
				map[y1][x1+1]=1;
				x1=x1+1;
				if(y1==5 && x1%2==0) {
					System.out.println("뒤로넘어졌습니다");
					map[y1][x1]=0;
					x1=x1-1;
					map[y1][x1]=1;
					
				}
			}
			}
		}else if(sel==3) {//위로이동
			
			if(y1>0) {
			if(map[y1-1][x1]!=4) {
				map[y1][x1]=0;
				map[y1-1][x1]=1;
				y1=y1-1;
				if(y1==5 && x1%2==0) {
					System.out.println("뒤로넘어졌습니다");
					map[y1][x1]=0;
					y1=y1+1;
					map[y1][x1]=1;
				}
			}
			}
		}else if(sel==4) {//아래로이동
			
			if(y1<map.length-1) {
			if(map[y1+1][x1]!=4) {
				map[y1][x1]=0;
				map[y1+1][x1]=1;
				y1=y1+1;
				if(y1==5 && x1%2==0) {
					System.out.println("뒤로넘어졌습니다");
					map[y1][x1]=0;
					y1=y1-1;
					map[y1][x1]=1;
				}
			}
			}
		}move+=1;//다음턴
		//달리는 구간
		if(y1%3==0 && x1%3==0 && y1/3>=1 && x1/3>=1 && x1!=9 ) {
			move+=1;//한번더
			System.out.println("~~~~~~~~~~~~~p1달리는중~~~~~~~~~~~~~~");
			}
		//2번짝수
	}else {
		System.out.println("p2이동: "+"1.left  2.right 3.up 4.down");
		int sel = scan.nextInt();
		if(sel==1) {//왼쪽이동
			
			if(x2>0) {//x1 0보다 커야지 가능
			if(map[y2][x2-1]!=4) {//벽이아닐경우
				map[y2][x2]=0;
				map[y2][x2-1]=2;
				x2=x2-1;
				if(x2==5 && y2%2==0) {
					System.out.println("뒤로넘어졌습니다");
					map[y2][x2]=0;
					x2=x2+1;
					map[y2][x2]=2;
				}
			}
			}
		}else if(sel==2) {//오른쪽이동
		
			if(x2<map.length-1) {
			if(map[y2][x2+1]!=4) {
				map[y2][x2]=0;
				map[y2][x2+1]=2;
				x2=x2+1;
				if(y2==5 && x2%2==0) {
					System.out.println("뒤로넘어졌습니다");
					map[y2][x2]=0;
					x2=x2-1;
					map[y2][x2]=2;
				}
			}
			}
		}else if(sel==3) {//위로이동
			
			if(y2>0) {
			if(map[y2-1][x2]!=4) {
				map[y2][x2]=0;
				map[y2-1][x2]=2;
				y2=y2-1;
				if(y2==5 && x2%2==0) {
					System.out.println("뒤로넘어졌습니다");
					map[y2][x2]=0;
					y2=y2+1;
					map[y2][x2]=2;
				}
			}
			}
		}else if(sel==4) {//아래로이동
			
			if(y2<map.length-1) {
			if(map[y2+1][x2]!=4) {
				map[y2][x2]=0;
				map[y2+1][x2]=2;
				y2=y2+1;
				if( y2==5 && x2%2==0) {
					System.out.println("뒤로넘어졌습니다");
					map[y2][x2]=0;
					y2=y2-1;
					map[y2][x2]=2;
				}
			} 
			}
		}move+=1;
		//달리는구간
		if(y2%3==0 && x2%3==0 && y2/3>=1 && x2/3>=1 && x2!=9) {
			move+=1;//한번더
			System.out.println("~~~~~~~~~~~~~p1달리는중~~~~~~~~~~~~~~");
			}
	}//종료, 플레이어원위치
	if(y1==r1 && x1==r2) {//map[r1][r2]>p1집
		System.out.println("p1집도착");
		System.out.println("p1승!게임종료");
		
		k=-1;//종료
		break;
	}else if(y1==r2 && x1==r1) {//p2집에도착
		System.out.println("!!!p1이 p2집 도착!!!");//되돌려놓기
		System.out.println("p1은 출발지점으로 다시 돌아가기");
		map[y1][x1]=0;
		x1=0;
		y1=0;
		map[y1][x1]=1;
	
		}
	else if(y2==r2 && x2==r1) {//map[r2][r1]>p2집
			System.out.println("!!!!p2집도착!!!!");
			System.out.println("p2승!게임종료");
		    k=-1;//종료
			break;
		}else if(y2==r1 && x2==r2) {//p1집에도착
			System.out.println("!!!!p2가 p1집 도착!!!!");
			System.out.println("p2는 출발지점으로 다시 돌아가기");
			map[y2][x2]=0;//집위치
			y2=9;
			x2=9;
			map[y2][x2]=2;//원위치
			
		}
		}
		}	
	}

}
