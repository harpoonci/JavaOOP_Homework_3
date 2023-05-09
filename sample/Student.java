package sample;

	public class Student extends Human {
		// TODO Auto-generated constructor stub
		private int id;
		private String groupName;
		
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public String getGroupName() {
			return groupName;
		}
		public void setGroupName(String groupName) {
			this.groupName = groupName;
		}
		public Student(String name, String lastName, Gender gender, int id, String groupName) {
			super(name, lastName, gender);
			this.id = id;
			this.groupName = groupName;
		}
		
		@Override
		public String toString() {
			return "Student [id=" + id + ", groupName=" + groupName + "]";
		}
		
		public class GroupOverflowException extends Exception {
			
			public GroupOverFlowException () {
				super 
			}
		}
	
	

}
