package mypc;

import java.io.Serializable;
import java.util.Arrays;

import mypc.MyException;

public class Group implements Serializable {
	private static final long serialVersionUID = 1L;
	private Student[] studentArray = new Student[10];
	private String groupName;

	public Group(Student[] studentArray, String groupName) {
		super();
		this.studentArray = studentArray;
		this.groupName = groupName;
	}

	public Group() {
		super();
	}

	public Student[] getStudentArray() {
		return studentArray;
	}

	public void setStudentArray(Student[] studentArray) {
		this.studentArray = studentArray;
	}

	public String getGroupName() {
		return groupName;
	}

	public void setGroupName(String groupName) {
		this.groupName = groupName;
	}

	public void addStudent(Student student) throws MyException {
		if (student == null) {
			throw new IllegalArgumentException("Null student");
		} 
			for (int i = 0; i < studentArray.length; i++) {
				if (studentArray[i] == null) {
					studentArray[i] = student;
					return;
				}
			}
			throw new MyException();
		}
		
	public Student search (String lastname) {
		for (Student student : studentArray) {
			if (student!=null && student.getLastname().equals(lastname)) {
			return student;	
			}			
		}
		return null;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("Group: " + this.groupName).append(System.lineSeparator());
		int i = 0;
		for (Student student : studentArray) {
			if (student != null) {
				sb.append((++i) + ") ").append(student);
				sb.append(System.lineSeparator());
			}
		}
		return sb.toString();
	}
	
	}

