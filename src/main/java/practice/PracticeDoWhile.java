package practice;

public class PracticeDoWhile {

	public static void main(String[] args) {
		int num = 100;
		do {
			System.out.println(num);
			//繰り返しの中で実行される処理
			--num;
		} while (num >= 0);

	}

}
