package E_�迭_����;

import java.util.Random;
import java.util.Scanner;

public class ��_������_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// �ߺ��˻��Ҷ�
		// ù��° for���� ���� / �ι�° for���� ���� ===> i��j��°�� 0�� �ƴҶ�
				//==> �����ΰ�  0~9 [r1][r2] ==> 0���� �ƴ��� !=
// TODO Auto-generated method stub

  Scanner scan=new Scanner(System.in);
  Random ran=new Random();
  
 //���������
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
		int y1=0;//p1 �� 
		int x1=0;//p1 ��
		int y2=9;//p2 ��
		int x2=9;//p2 ��
		int k=0;
		
while(k==0) {
	
	System.out.println("---------------------------------");
	//������������
	int r1=ran.nextInt(7)+2;//���� ��ġ�� �������� ������ ���Ѵ�
	int r2=ran.nextInt(7)+2;
	//map[r1][r2]>p1��
	//map[r2][r1]>p1��
	int move=1;//p1,p2����
	
	//�������� ���� ���� ��ġ�� ���� �ƴ� ��� �ٽ�!
	boolean check=false;
	if(map[r1][r2]!=0 || map[r2][r1]!=0 || r1==r2 ) {//0�� �ƴϰų� r1,r2�� ���� ���� ���� �������
		check=true;
	}
	System.out.println();
	System.out.println("r1:"+r1+" r2:"+r2);
	
	//p1,p2 ���� ��ġ�� ���� ��
	while(check==false) {
			
	System.out.println("------------------------------");
	for(int i=0; i<map.length; i++) {
		System.out.println();
	
		for(int j=0; j<map.length; j++) {
			
		if(i%3==0 && j%3==0 && i/3>=1 && j/3>=1 && j!=9) {//������ �޸��� ���� 
				System.out.print("�ܢݢ�");
				}
		else if(i==5 && j%2==0) {//���� �Ѿ����� ���� 
			System.out.print("�ءء�");
		}
		else if(map[i][j]==0) {//��,����ġǥ��
			if(r1==i && r2==j) {//p1��
				System.out.print("�ڡ��");
			}
			else if(r2==i && r1==j) {//p2��
				System.out.print("�ڡ��");
			}
			else {//��
			System.out.print("   ");
			}
		}else if(map[i][j]==4) {//��
			System.out.print("�ˢˢ�");
		}else if(map[i][j]==1) {//player1
			System.out.print("|��|");
		}else if(map[i][j]==2) {//player2
			System.out.print("|��|");
		
		}
	}
		
	}
	System.out.println();
	System.out.println("------------------------------");
	//player1
	if(move%2==1) {
		System.out.println("p1�̵�:"+"1.left  2.right 3.up 4.down");
		int sel = scan.nextInt();//�̵���ġ
		
		if(sel==1) {//�������� �̵�
			
			if(x1>0) {//x1 0���� Ŀ���� ����
			if(map[y1][x1-1]!=4) {//���̾ƴҰ��
				map[y1][x1]=0;//�����ִ��ڸ�
				map[y1][x1-1]=1;//�ű��ڸ�
				x1=x1-1;
				if( y1==5 && x1%2==0) {//5�� ¦���� �Ѿ����±���
					System.out.println("�ڷγѾ������ϴ�");
					map[y1][x1]=0;//�Ű����ڸ����� �ٽ� �ڷΰ���
					x1=x1+1;
					map[y1][x1]=1;
				}
			}
			}
		}else if(sel==2) {//�������̵�
			
			if(x1<map.length-1) {
			if(map[y1][x1+1]!=4) {
				map[y1][x1]=0;
				map[y1][x1+1]=1;
				x1=x1+1;
				if(y1==5 && x1%2==0) {
					System.out.println("�ڷγѾ������ϴ�");
					map[y1][x1]=0;
					x1=x1-1;
					map[y1][x1]=1;
					
				}
			}
			}
		}else if(sel==3) {//�����̵�
			
			if(y1>0) {
			if(map[y1-1][x1]!=4) {
				map[y1][x1]=0;
				map[y1-1][x1]=1;
				y1=y1-1;
				if(y1==5 && x1%2==0) {
					System.out.println("�ڷγѾ������ϴ�");
					map[y1][x1]=0;
					y1=y1+1;
					map[y1][x1]=1;
				}
			}
			}
		}else if(sel==4) {//�Ʒ����̵�
			
			if(y1<map.length-1) {
			if(map[y1+1][x1]!=4) {
				map[y1][x1]=0;
				map[y1+1][x1]=1;
				y1=y1+1;
				if(y1==5 && x1%2==0) {
					System.out.println("�ڷγѾ������ϴ�");
					map[y1][x1]=0;
					y1=y1-1;
					map[y1][x1]=1;
				}
			}
			}
		}move+=1;//������
		//�޸��� ����
		if(y1%3==0 && x1%3==0 && y1/3>=1 && x1/3>=1 && x1!=9 ) {
			move+=1;//�ѹ���
			System.out.println("~~~~~~~~~~~~~p1�޸�����~~~~~~~~~~~~~~");
			}
		//2��¦��
	}else {
		System.out.println("p2�̵�: "+"1.left  2.right 3.up 4.down");
		int sel = scan.nextInt();
		if(sel==1) {//�����̵�
			
			if(x2>0) {//x1 0���� Ŀ���� ����
			if(map[y2][x2-1]!=4) {//���̾ƴҰ��
				map[y2][x2]=0;
				map[y2][x2-1]=2;
				x2=x2-1;
				if(x2==5 && y2%2==0) {
					System.out.println("�ڷγѾ������ϴ�");
					map[y2][x2]=0;
					x2=x2+1;
					map[y2][x2]=2;
				}
			}
			}
		}else if(sel==2) {//�������̵�
		
			if(x2<map.length-1) {
			if(map[y2][x2+1]!=4) {
				map[y2][x2]=0;
				map[y2][x2+1]=2;
				x2=x2+1;
				if(y2==5 && x2%2==0) {
					System.out.println("�ڷγѾ������ϴ�");
					map[y2][x2]=0;
					x2=x2-1;
					map[y2][x2]=2;
				}
			}
			}
		}else if(sel==3) {//�����̵�
			
			if(y2>0) {
			if(map[y2-1][x2]!=4) {
				map[y2][x2]=0;
				map[y2-1][x2]=2;
				y2=y2-1;
				if(y2==5 && x2%2==0) {
					System.out.println("�ڷγѾ������ϴ�");
					map[y2][x2]=0;
					y2=y2+1;
					map[y2][x2]=2;
				}
			}
			}
		}else if(sel==4) {//�Ʒ����̵�
			
			if(y2<map.length-1) {
			if(map[y2+1][x2]!=4) {
				map[y2][x2]=0;
				map[y2+1][x2]=2;
				y2=y2+1;
				if( y2==5 && x2%2==0) {
					System.out.println("�ڷγѾ������ϴ�");
					map[y2][x2]=0;
					y2=y2-1;
					map[y2][x2]=2;
				}
			} 
			}
		}move+=1;
		//�޸��±���
		if(y2%3==0 && x2%3==0 && y2/3>=1 && x2/3>=1 && x2!=9) {
			move+=1;//�ѹ���
			System.out.println("~~~~~~~~~~~~~p1�޸�����~~~~~~~~~~~~~~");
			}
	}//����, �÷��̾����ġ
	if(y1==r1 && x1==r2) {//map[r1][r2]>p1��
		System.out.println("p1������");
		System.out.println("p1��!��������");
		
		k=-1;//����
		break;
	}else if(y1==r2 && x1==r1) {//p2��������
		System.out.println("!!!p1�� p2�� ����!!!");//�ǵ�������
		System.out.println("p1�� ����������� �ٽ� ���ư���");
		map[y1][x1]=0;
		x1=0;
		y1=0;
		map[y1][x1]=1;
	
		}
	else if(y2==r2 && x2==r1) {//map[r2][r1]>p2��
			System.out.println("!!!!p2������!!!!");
			System.out.println("p2��!��������");
		    k=-1;//����
			break;
		}else if(y2==r1 && x2==r2) {//p1��������
			System.out.println("!!!!p2�� p1�� ����!!!!");
			System.out.println("p2�� ����������� �ٽ� ���ư���");
			map[y2][x2]=0;//����ġ
			y2=9;
			x2=9;
			map[y2][x2]=2;//����ġ
			
		}
		}
		}	
	}

}
