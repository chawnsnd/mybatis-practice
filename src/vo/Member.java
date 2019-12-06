package vo;

public class Member {

	private int member_no;
	private String member_name;
	private int member_age;
	private String member_phone;
	private String member_address;
	private String member_indate;
	
	public Member() {
	}
	
	public Member(int member_no, String member_name, int member_age, String member_phone, String member_address,
			String member_indate) {
		super();
		this.member_no = member_no;
		this.member_name = member_name;
		this.member_age = member_age;
		this.member_phone = member_phone;
		this.member_address = member_address;
		this.member_indate = member_indate;
	}

	public int getMember_no() {
		return member_no;
	}

	public void setMember_no(int member_no) {
		this.member_no = member_no;
	}

	public String getMember_name() {
		return member_name;
	}

	public void setMember_name(String member_name) {
		this.member_name = member_name;
	}

	public int getMember_age() {
		return member_age;
	}

	public void setMember_age(int member_age) {
		this.member_age = member_age;
	}

	public String getMember_phone() {
		return member_phone;
	}

	public void setMember_phone(String member_phone) {
		this.member_phone = member_phone;
	}

	public String getMember_address() {
		return member_address;
	}

	public void setMember_address(String member_address) {
		this.member_address = member_address;
	}

	public String getMember_indate() {
		return member_indate;
	}

	public void setMember_indate(String member_indate) {
		this.member_indate = member_indate;
	}

	@Override
	public String toString() {
		return "# : " + member_no + " | 이름 : " + member_name + " | 나이 : " + member_age
				+ " | 전화번호 : " + member_phone + " | 주소 : " + member_address + " | 가입일시 : "
				+ member_indate;
	}
	
	
}