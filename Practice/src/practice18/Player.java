package practice18;

public class Player {

	//フィールド
	private String position;
	private String name;
	private String country;
	private String team;

	//メソッド

	//アクセサ
	public String getPosition() {
		return position;
	}
	public void setPosition(String position) {
		this.position = position;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getTeam() {
		return team;
	}
	public void setTeam(String team) {
		this.team = position;
	}

	public String toString() {

		String A = getPosition();
		String B = getName();
		String C = getCountry();
		String D = getTeam();

		String[] array = {A,B,C,D};
		String X = String.join(",",array);   //String#join(CharSequence, Iterable) API
		return X;
	}
}

/* BestElevenCandidate.csvの情報を保持するためのクラス、entity.Playerクラスを作成してください
 * フィールド
 * 		position	：	String
 * 		name		：	String
 * 		country		：	String
 * 		team		：	String
 * メソッド
 * 		各アクセサ
 * 		toString()	：	Objectクラスのオーバーライド
 * 		各フィールドの値を、カンマ区切りの文字列で取得する
 */