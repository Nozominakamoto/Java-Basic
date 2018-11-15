/*
 * PTra17_04.java
 *   作成	LIKEIT	2017
 *------------------------------------------------------------
 * Copyright(c) Rhizome Inc. All Rights Reserved.
 */
package practice17.ptra17;

public class PTra17_04 {
	public static void main(String[] args) {

		String str = "スッキリわかるJava入門";
		char[]x = str.toCharArray();  //strを文字配列に変換
		int y = x.length;  //x配列の要素数
		for(int i=0; i<=y; i++) {
			try {
				Thread.sleep(100);  //100ミリ秒間停止
				System.out.print(x[i]);
			}catch(InterruptedException e){  //割り込まれた場合にスローする
			}
		}
		/*
		 * ★ strに入っている文字列を1文字ずつゆっくり表示させるプログラムを完成させてください
		 * ※ Thread.sleep を使用すること
		 */

	}
}
