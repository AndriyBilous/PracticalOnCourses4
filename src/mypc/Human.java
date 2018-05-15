package mypc;

import java.io.Serializable;

public class Human implements Serializable {
	private static final long serialVersionUID = 1L;
	private int age;
	private String name;
	private String lastname;
	private boolean sex;

	public Human(int age, String name, String lastname, boolean sex) {
		super();
		this.age = age;
		this.name = name;
		this.lastname = lastname;
		this.sex = sex;
	}

	public Human() {
		super();
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public boolean isSex() {
		return sex;
	}

	public void setSex(boolean sex) {
		this.sex = sex;
	}


	@Override
	public String toString() {
		return "Human [age=" + age + ", name=" + name + ", lastname=" + lastname + ", sex=" + sex + "]";
	}

}
