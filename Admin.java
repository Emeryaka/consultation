package model;
// Generated 5 juin 2023, 00:50:19 by Hibernate Tools 4.3.6.Final

/**
 * Admin generated by hbm2java
 */
public class Admin implements java.io.Serializable {

	private Integer id;
	private String role;
	private String password;

	public Admin() {
	}

	public Admin(String role, String password) {
		this.role = role;
		this.password = password;
	}

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getRole() {
		return this.role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

}