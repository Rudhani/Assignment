package Assignment9;

public class Students {
	
	public void getStudentInfo(int id) {
		System.out.println("Student Id Number : "+id);
	}

	public void getStudentInfo(String Name) {
		System.out.println("Student Name : "+Name);
	}
	
	public void getStudentInfo(String email , int phoneNumber) {
		System.out.println("Email: "+email);
		System.out.println("Phone number: "+phoneNumber);
	}
	
	public static void main(String[] args) {
		Students s=new Students();
		
		s.getStudentInfo(301);
		s.getStudentInfo("Anirudh");
		s.getStudentInfo("anirudh@gmail.com", 952450539);
	}

}
