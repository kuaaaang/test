package F1_���ڿ�1_�⺻�̷�;

public class ���ڿ�1_�˰���_ä��_���� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		  ��ä���� �Ʒ��� ���� ����ϴµ� ,
		  ö���� �������� ,
		  ����� ���������ķ� ����غ���. 
		*/	
		String wordList [][]= {
				{"ö��", "����� �ȳ�"} , 
				{"����", "ö���� �ȳ�"} ,  
				{"ö��", "���� ���ɰ��� ������?"}, 
				{"����", "�ƴ� ����־�. ������ ����."} , 
				{"ö��", "�׷� ������ ����."}
			};
			
		/*
		  "����� �ȳ�"
		 			        "ö���� �ȳ�"
		  "���� ���ɰ��� ������?"
		        "�ƴ� ����־�. ������ ����."
		  "�׷� ������ ����."
	   */
		for(int i = 0; i<wordList.length; i+=1) {
			if(wordList[i][0] == "ö��") {
				System.out.printf("\"%-25s" , wordList[i][1] + "\"");
			}
			else if(wordList[i][0] == "����") {
				wordList[i][1] = "\"" + wordList[i][1];
				System.out.printf("%25s\"" , wordList[i][1]);
			}
			System.out.println();
		}
	}
}
