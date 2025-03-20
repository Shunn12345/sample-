package takizawa_7321125_1_4;

public class Takizawa_7321125_1_4 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		int number = 13;
		int n = number / 2; //numberの素数を調べる際numberの半分の数までの約数を調べればよいため２で割る
		boolean q = true; //boolrea型の変数を用いて素数かそうでないか判定する。tureは素数、falseは素数でないとした。

		while (n > 1) { //num～2までの数がnumberの約数になっているか調べる。
			if ((number % n) == 0) { //剰余が0の場合、約数と分かるため素数でないと分かる。
				q = false;
			}
			n--;
		}
		
		System.out.print(number + "は");
		if (q == true) {
			System.out.println("素数");
		} else {
			System.out.println("素数でない");
		}
	}
}