package objectquee;

public class User {
	private int id;
	private User user;
	private String name;
	User(int id,  String name) {
		super();
		this.id = id;
		this.user = null;
		this.name = name;
	}
	User() {
		super();
		this.id = 0;
		this.user = null;
		this.name = null;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
}
