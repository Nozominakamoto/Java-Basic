package practice10;
/*
 * PTra10_06.java
 *   作成	LIKEIT	2017
 *------------------------------------------------------------
 * Copyright(c) Rhizome Inc. All Rights Reserved.
 */

public class PTra10_06 {

	/*
	 * PTra10_05で作成したCarクラスを使用します
	 */

	public static void main(String[] args) {

		/*
		 * carインスタンスを3件作成し、それぞれの色、ガソリンを入力して決定してください
		 * 各carインスタンスのrunメソッドを実行して、それぞれ「目的地にまでn時間かかりました。残りのガソリンは、xリットルです」を出力してください。
		 */

	Car car = new Car();

	car.serialNo = 3333;
	car.color = "green";
	car.gasoline = 100;


	final int distance = 500;

	int n = 0;
	int sum = 0;
	while(true) {
		int i = car.run();
		if(i == -1) {
			break;
		}
		sum += i;
		n++;
		if(sum <= distance) {
			System.out.println("目的地にまで"+n+"時間かかりました。残りのガソリンは、"+car.gasoline+"リットルです");
			break;
		}

	}


	}
}
