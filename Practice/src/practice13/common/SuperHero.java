package practice13.common;

public class SuperHero extends Hero {

	private Item equipment;         //フィールド



	public int attack() {           //オーバーライド
		return super.attack() + equipment.getAdditionalDamage();
	}

	public Item getEquipment() {               //アクセサ
		return this.equipment;
	}
	public void setEquipment(Item equipment) {
		this.equipment = equipment;
	}
}


/*
 * ★ common.Heroクラスを継承した、common.SuperHeroクラスを作成してください
 * 	●HP, POWER, ENDURANCEはそれぞれ、（25, 10, 7）
 *
 * フィールド
 * 		equipment	:	common.Item
 * メソッド
 * 		attackメソッドをオーバーライド(子クラス側でメソッドの実装を上書きすること）し、
 * 		powerに加えて、additionalDamage分を加算した値としてください
 *
 * 		equipmentのアクセサ
 */