public class User {
	private int id;
	private String name,email;
	public User() {
		super();
		this.id=id;
		this.name=name;
		this.email=email;
	}
	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", email=" + email + "]";
	}

}
