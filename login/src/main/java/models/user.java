package models;

public class user {
         private String firstname;
         private String lastname;
         private String email;
         private String password;
         private int age;
         private String gender;
		public String getFirstname() {
			return firstname;
		}
		public void setFirstname(String firstname) {
			this.firstname = firstname;
		}
		public String getLastname() {
			return lastname;
		}
		public void setLastname(String lastname) {
			this.lastname = lastname;
		}
		public String getEmail() {
			return email;
		}
		public void setEmail(String email) {
			this.email = email;
		}
		public String getPassword() {
			return password;
		}
		public void setPassword(String password) {
			this.password = password;
		}
		public int getAge() {
			return age;
		}
		public void setAge(int age) {
			this.age = age;
		}
		public String getGender() {
			return gender;
		}
		public void setGender(String gender) {
			this.gender = gender;
		}
		public user() {
			super();
			// TODO Auto-generated constructor stub
		}
		public user(String firstname, String lastname, String email, String password, int age, String gender) {
			super();
			this.firstname = firstname;
			this.lastname = lastname;
			this.email = email;
			this.password = password;
			this.age = age;
			this.gender = gender;
		}
}