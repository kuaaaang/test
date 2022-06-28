package D1_반복문1_기본이론;

public class 반복문1_기본이론1_증감연산자 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 증감식 종류 (아래 4종류전부 같은뜻이다)
		// 미세한 차이가 있는데 추후에 다시 살펴보겠다.
		// 1) i = i + 1;
		// 2) i += 1;
		// 3) i++;
		// 4) ++i;
		
			int i = 0;
			i = i + 1;
			System.out.println(i);
			System.out.println();
			i  += 1;
			System.out.println(i);
			System.out.println();
			i++;
			System.out.println(i);
			System.out.println();
			++i;
			System.out.println(i);
			System.out.println();
	}
}
