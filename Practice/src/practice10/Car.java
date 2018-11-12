package practice10;

public class Car {

	//フィールド
	int serialNo;
	String color;
	int gasoline;

	//メソッド
	int run() {      //戻り値(int)、メソッド名(run)、引数(なし)
	 gasoline -= 1;  //ガソリンを1消費

	 //ランダムな距離(1～15)進む（戻り値が進んだ距離）
	 int random = new java.util.Random().nextInt(14);
	 int move = random+1;

	 //ガソリンが負の数になった場合（もう進めない）は-1を返す
	 if (gasoline < 0) {
	 return -1;
	 }else return move;
	}



}
