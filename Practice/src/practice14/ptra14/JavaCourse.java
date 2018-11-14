package practice14.ptra14;
import  practice14.common.Course;

public class JavaCourse implements Course{

	public String getCourseName() {
		return ("【Eラーニング】Java");
	}

	String[]array = {"式と演算","制御構文","メソッド","配列","オブジェクト思考","継承","高度な継承"};

	public String[] getCourseUnit() {
		return array;
	}
}
/*
 * ★ common.Courseを実装した、JavaCourseクラスを作成してください
 *
 * コース名称
 * 		「【Eラーニング】Java」
 * 単元
 * 		式と演算
 * 		制御構文
 * 		メソッド
 * 		配列
 * 		オブジェクト指向
 * 		継承
 * 		高度な継承
 */
