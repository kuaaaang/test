package E8_�迭8_��ȭ������Ʈ;

import java.util.Random;
import java.util.Scanner;

public class �迭8_������Ʈ_��Ʈ���� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Random ran = new Random();
		Scanner scan = new Scanner(System.in);
		
		int sy = 20;
		int sx = 10;
		int [][] map = new int[sy][sx];
		int tList [][][] = {
				{
					{0,2,0},
				    {0,2,0},	
				    {0,2,0},
				},
				{				
				    {3,3},	
				    {0,3},				
				},
				{				
				    {4,0},	
				    {4,4},
				},
				{				
				    {5,5},	
				    {5,5},				
				},										
		};			
		int [][] tetris = 
				{
				 {0,0,0},
			     {0,0,0},	
			     {0,0,0}
				};	
		boolean blockNew = true;
		int y = 0;
		int x = 4;
		int size = 0;
		
		
		
	}
}
