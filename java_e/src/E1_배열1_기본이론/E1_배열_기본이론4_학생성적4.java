package E1_�迭1_�⺻�̷�;

public class E1_�迭_�⺻�̷�4_�л�����4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		   numberList = {1001, 1002, 1003, 1004, 1005};
		   scoreList  = { 87 ,  11 ,  45 ,  98 ,  23 };
		   [����] 1���л��� �й��� ���� ����Ѵ�.
		   [����] 1004��(98��)
		*/
		int numberList[] = {1001, 1002, 1003, 1004, 1005};
		int scoreList[]  = { 87 ,  11 ,  45 ,  98 ,  23 };
		
		int maxn = 0;
		int maxs = 0;
		
		for(int i = 0; i<5; i+=1) {
			if(scoreList[i]>maxs) {
				maxs = scoreList[i];
		        maxn = numberList[i];
	        }                                                
	    }
		System.out.println("1�� �л� �й� : " + maxn + " , ���� : " + maxs + "��");	
	}
}
