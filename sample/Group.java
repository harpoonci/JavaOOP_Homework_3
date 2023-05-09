package sample;

public class Group {
	private String groupName;
	private Student[] students = new Student[10];
	
	public String getGroupName() {
		return groupName;
	}
	public void setGroupName(String groupName) {
		this.groupName = groupName;
	}
	public Student[] getStudents() {
		return students;
	}
	public void setStudents(Student[] students) {
		this.students = students;
	}
	
	public void addStudent(Student student) throws GroupOverflowException {
		for (int i = 0; i < students.length; i++) {
			if (i >= students.length) {
				throw new GroupOverflowException();
			}
			
		}
				
	}
	
	public Student searchStudentByLastName(String lastName) throws StudentNotFoundException {
		for (int i = 0; i < students.length; i++) {
			if (students[i].getLastName().equals(lastName)) {
				return students[i];
			} 
				
		}
		
		throw new StudentNotFoundException();
	}
	
	public boolean removeStudentById(int id) {
		for(int i = 0; i < students.length; i++) {
			if(students[i] != null) {
				if (students[i].getId() == id) {
					students[i] = null;
					return true;
			}
		}
		
	}
		return false;
}
	
}
