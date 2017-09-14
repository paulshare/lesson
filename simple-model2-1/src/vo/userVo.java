package vo;

public class userVo {

	private String name;
	private String email;
	private Car myCar;
	
	public userVo () {}
	
	public userVo(String name, String email, Car myCar) {
		this.name = name;
		this.email = email;
		this.myCar = myCar;
	}

	public Car getMyCar() {
		return myCar;
	}
	
	public void setMyCar(Car myCar) {
		this.myCar = myCar;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	@Override
	public String toString() {
		return "userVo [name=" + name + ", email=" + email + "]";
	}
	
	public String getType() {
		return "변수명을 중복되면 안된다. request의 변수명과 session의 변수명을 같게 작성하면 request만 출력된다. "
				+ "아니면 sessionScope를 앞에 적어줘야 된다. 이렇게 적지마! 안되안되";
	}
	
}
