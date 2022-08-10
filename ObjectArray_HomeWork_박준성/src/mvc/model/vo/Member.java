package mvc.model.vo;

public class Member {
	private String userId;
	private String userPwd;
	private String name;
	private int age;
	private char gender;
	private String email;
	
	public Member() {}
	
	public Member(String userId, String userPwd, String name, int age, char gender, String email) {
		this.userId = userId;
		this.userPwd = userPwd;
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.email = email;
	}
	
	public String information() {
		return	"아이디[" + this.userId + "], " +
				"패스워드[" + this.userPwd + "], " +
				"이름[" + this.name + "], " +
				"나이[" + this.age + "], " +
				"성별[" + this.gender + "], " +
				"이메일[" + this.email + "]";
	}

	public String getUserId() {
		return userId;
	}

	public String getUserPwd() {
		return userPwd;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public char getGender() {
		return gender;
	}

	public String getEmail() {
		return email;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public void setUserPwd(String userPwd) {
		this.userPwd = userPwd;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public void setGender(char gender) {
		this.gender = gender;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	
}
