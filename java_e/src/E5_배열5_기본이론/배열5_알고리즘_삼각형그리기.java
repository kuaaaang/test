package E5_�迭5_�⺻�̷�;

public class �迭5_�˰���_�ﰢ���׸��� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		  ���� 1)
		  #
		  ##
		  ###
		*/
		for(int i=0; i<3; i++) {
			for(int j=0; j<=i; j++) {
				System.out.print("#");
			}
			System.out.println();
		}

		System.out.println("-------------------------");


		/*
		  ���� 2)
		  ###
		  ##
		  #
	    */
		
		for(int i = 3; i>0; i-=1) {
			for(int j = 1; j<=i; j+=1) {
				System.out.print("#");
			}
			System.out.println();
		}
		
		System.out.println("--------or---------");
		
		for(int i = 0; i<3; i+=1) {
			for(int j = 3; j>0; j-=1) {
				if(i<j) {System.out.print("#");}
			}
			System.out.println();
		}
		
		System.out.println("-------------------------");

		/*
		  ���� 3)
		  @##
		  @@#
		  @@@
		*/
		
		for(int i = 1; i<4; i+=1) {
			for(int j = 0; j<i; j +=1) {
				System.out.print("@");
			}
			for(int k = 3; k>i; k-=1) {
				System.out.print("#");
			}
			System.out.println();
		}
		
		System.out.println("-------------------------");

		/*
		  ���� 4)
		    #
		   ###
		  #####
		*/
		
		for(int i = 1; i<4; i+=1) {
			for(int j = 3-i; j>0; j-=1) {
				System.out.print(" ");
			}
			for(int k = 1; k<=i*2-1; k+=1) {
				System.out.print("#");
			}
			System.out.println();
		}
		
		System.out.println("-------------------------");

		/*
		  ���� 5)
		  #####
		   ###
		    #
		*/
		
		for(int i = 0; i<3; i+=1) {
			for(int j = 0; j < i; j +=1) {
				System.out.print(" ");
			}
			for(int k = (3-i)*2-1; k>0; k-=1) {
				System.out.print("#");
			}
			System.out.println();
		}
	}
}
