package mypc;

import java.io.Serializable;

public class Student extends Human implements Serializable {
	private static final long serialVersionUID = 1L;
	private long zachetka;
	private String group;

	public Student(int age, String name, String lastname, boolean sex, long zachetka, String group) {
		super(age, name, lastname, sex);
		this.zachetka = zachetka;
		this.group = group;
	}

	public Student(int age, String name, String lastname, boolean sex) {
		super(age, name, lastname, sex);
	}

	public long getZachetka() {
		return zachetka;
	}

	public void setZachetka(long zachetka) {
		this.zachetka = zachetka;
	}

	public String getGroup() {
		return group;
	}

	public void setGroup(String group) {
		this.group = group;
	}

	@Override
	public String toString() {
		return "Student [zachetka=" + zachetka + ", group=" + group + "]" + super.toString();
	}

}
