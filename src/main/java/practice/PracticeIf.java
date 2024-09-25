package practice;

public class PracticeIf {

	public static void main(String[] args) {

		//1から100まで繰り返し処理
		for (int i = 1; i <= 100; i++) {
			//3の倍数且つ、5の倍数の時
			if (i % 3 == 0 && i % 5 == 0)
				System.out.println("FizzBuzz");
			//3の倍数の時
			else if (i % 3 == 0) {
				System.out.println("Fizz");
				//5の倍数の時
			} else if (i % 5 == 0) {
				System.out.println("Buzz");
				//いずれでもない場合
			} else
				System.out.println(i);
		}

	}
}