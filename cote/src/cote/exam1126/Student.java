package cote.exam1126;

public class Student {
	String studentId;
	String name;
	String email;
	
	public Student(String studentId, String name, String email) {
		this.studentId = studentId;
		this.name = name;
		this.email = email;
	}
	
	@Override
	public boolean equals(Object object) {
		if (object instanceof Student) {
			Student s = (Student) object;
			if (name.equals(s.name) && studentId.equals(s.studentId)) {
				return true;
			}
		}
		return false;
	}
	
	public String toString() {
		String str ="studentId:" + studentId + " name:" + name + " email:" + email;
		return str;
	}
}
