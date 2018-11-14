package practice13.common;

public class Employee extends Person {

	private String departmentNm;              //部署名
	private int departmentCnt;                //部署人数

	public String getDepartmentNm() {
		return this.departmentNm;
	}
	public void setDepartmentNm(String departmentNm) {
		this.departmentNm = departmentNm;
	}

	public int getDepartmentCnt() {
		return this.departmentCnt;
	}
	public void setDepartmentCnt(int departmentCnt) {
		this.departmentCnt = departmentCnt;
	}

    public Employee(String A, int B){           //コンストラクタ
	 this.departmentNm = A;
	 this.departmentCnt = B;
	}
}

/*
 * ★ common.Personクラスを継承して、common.Employeeクラスを作成してください
 *
 * フィールド
 * 		departmentNm（部署名）		:	String
 * 		departmentCnt（部署人数）	:	int
 * メソッド
 * 		各フィールドのアクセサ
 */