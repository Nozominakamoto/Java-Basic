/*
 * PTra18_04.java
 *   作成	LIKEIT	2017
 *------------------------------------------------------------
 * Copyright(c) Rhizome Inc. All Rights Reserved.
 */
package practice18;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class PTra18_04 {

	/*
	 * PTra18_02で作成したPlayerクラスを使用します
	 */
		/*
		 * ①
		 * ★ file/BestElevenCandidate.csvの内容を取得し、１行毎にPlayerインスタンスに情報を格納してください
		 * ★ ArrayListを作成して、Playerインスタンスを格納してください
		 */
	// ★ ①のArrayListの中からGK1名、DF4名、MF4名, FW2名をランダムで出力してください
	public static void main(String[] args) {

		ArrayList<Player> array = new ArrayList<>();
		try (Scanner scanner = new Scanner(new File("file/BestElevenCandidate.csv"))) {
			while (scanner.hasNext()) {
				String line = scanner.nextLine();
				Player player = new Player();
				String[] list = line.split(",");



				player.setPosition(list[0]);
				player.setName(list[1]);
				player.setCountry(list[2]);
				player.setTeam(list[3]);

				array.add(player);



			}
		} catch (FileNotFoundException e) {
			System.out.println("ファイルが見つかりません");
		}


		for(int i = 0; i<1;i++) {
		System.out.println(array.get(0));
		}
		for(int j = 5; j<3;j++) {
		System.out.println(array.get(3));
		}
		for(int k = 25; k<3;k++) {
			System.out.println(array.get(3));
		}
		for(int l = 40; l<1;l++) {
			System.out.println(array.get(1));
		}

		}



}
