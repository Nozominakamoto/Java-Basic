/*
 * PTra13_07.java
 *   作成	LIKEIT	2017
 *------------------------------------------------------------
 * Copyright(c) Rhizome Inc. All Rights Reserved.
 */
package practice13.ptra13;
import practice13.common.Item;
import practice13.common.Slime;
import practice13.common.SuperHero;

public class PTra13_07 {

	/*
	 * ★ common.Item, common.SuperHero, common.Slimeを使用します
	 */

	public static void main(String[] args) {

		// ★ SuperHeroインスタンスとSlimeインスタンスを作成し、それぞれの名前に"勇者（装備あり）", "スライム"を設定してください
		SuperHero superHero = new SuperHero();
		superHero.setName("勇者（装備あり）");

		Slime slime = new Slime();
		slime.setName("スライム");

		// ★ Itemクラスのインスタンスを作成し、("こんぼう", 4）をコンストラクタの引数にしてください
		Item item = new Item("こんぼう", 4);    //こんぼうの分だけ攻撃力が４追加される


		// ★ 作成したItemインスタンスをSuperHeroに持たせてください
		superHero.setEquipment(item);

		/*
		 * ★ SuperHeroとSlimeを、どちらかが体力０になるまで戦わせます
		 *
		 * 	●SuperHeroの攻撃 -> ダメージ判定 -> Slimeの攻撃 -> ダメージ判定
		 * 上記を繰り返し行います
		 */
		while(true){
			int A = superHero.attack();
			boolean D = slime.damage(A);
				if(D == true) {
					System.out.println(superHero.getName() + "との戦闘は" + slime.getName() + "に勝利した");
					break;
				}
			int B = slime.attack();
			boolean E = superHero.damage(B);
				if(E == true) {
					System.out.println(slime.getName() + "との戦闘は" + superHero.getName() + "に勝利した");
					break;
				}

		// ★ 勝利した方の出力を行ってください。「○○は■■との戦闘に勝利した」

	}
}
}

