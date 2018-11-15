/*
 * PTra18_03.java
 *   作成	LIKEIT	2017
 *------------------------------------------------------------
 * Copyright(c) Rhizome Inc. All Rights Reserved.
 */
package practice18;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class PTra18_03 {

	/*
	 * PTra19_02で作成したPlayerクラスを使用します
	 */
		/*
		 * ①
		 * ★ file/BestElevenCandidate.csvの内容を取得し、１行毎にPlayerインスタンスに情報を格納してください
		 * ★ ArrayListを作成して、Playerインスタンスを格納してください
		 */
		// ★ ①のArrayListの中から"レアル・マドリード", "バルセロナ"の選手を除外してください
		// ★ 削除後のArrayListの中身を全件出力してください
	public static void main(String[] args) {

		ArrayList<Player> array = new ArrayList<>();
		try (Scanner scanner = new Scanner(new File("file/BestElevenCandidate.csv"))) {
			while (scanner.hasNext()) {
				String line = scanner.nextLine();
				Player player = new Player();
				String[] list = line.split(",");

				if(list[3] == "レアル・マドリード" || list[3] == "バルセロナ") {
					continue;
				}

				player.setPosition(list[0]);
				player.setName(list[1]);
				player.setCountry(list[2]);
				player.setTeam(list[3]);

				array.add(player);

			}
		} catch (FileNotFoundException e) {
			System.out.println("ファイルが見つかりません");
		}
		for (Player Arraylist : array) {
			System.out.println(Arraylist);

		}



	}
}
