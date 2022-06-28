package E_배열_과제;

import java.util.Arrays;
import java.util.Random;

public class _0802_과제_4조_이윤희 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*	
	 	철수는 회사홍보를 위해 굿즈나눠주는행사를하고있다.
	 	goods 배열은 오늘 나눠줄 행사 상품 개수이다. 
	 	people 배열은 오늘 상품을 받기위해 줄서있는 사람들이다.
	 	
	 	상품은 왼쪽에서 부터 순차적으로 나눠주고
	 	줄선사람들을 다나눠주고난후에 뒤에 상품들을 전부 한칸씩 앞으로 옮겨서 나눠준다.
	 	사람들도 전부 한칸씩 앞으로 이동한다.
	 	상품을 전부 나눠준후에 goods 배열의 변화과정을 출력하시오.
	 	
	 	[예시]
	 		{39,43,27,19} 에서 30을제외하면 {9,43,27,19} 이 된다. 
	 		{9,43,27,19} 에서 9는 남은상품이므로 다음인덱스의 값인 43에 합쳐진다. {52,27,19,0}	 		 		
	 		{52,27,19,0} 에서 30을 제외하면 {22,27,19,0} 이 된다.
	 		{22,27,19,0} 에서 22는 남은상품이므로 다음인덱스의 값인 27에 합쳐진다. {49,19,0,0}
	 		{49,19,0,0} 에서 30을 제외하면 {19,19,0,0} 이 된다.
	 		{19,19,0,0} 에서 19는 남은상품이므로 다음인덱스의 값인 19와 합쳐진다. {38,0,0,0}
	 		{38,0,0,0} 에서 30을 제외하면 {8,0,0,0} 이된다.
	   */
		Random ran = new Random();
		
		int goods[] = {39,43,27,19};	
		int people[] = {30,30,30,30};
		
		for(int i = 0; i<goods.length; i+=1) {
			System.out.println(Arrays.toString(goods));
			
			if(goods[0]>=people[i]) {
				goods[0] -= people[i];
				System.out.println(Arrays.toString(goods));
				goods[1] += goods[0];
				goods[0] = 0;
				for(int j = 0; j<goods.length-1; j+=1) {
					int temp = goods[j];
					goods[j] = goods[j+1];
					goods[j+1] = temp;
				}
			}
		}
	}
}
