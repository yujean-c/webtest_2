package student;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CMSu studentManagement = new SMSu();
		studentManagement.addStudent("John", 80);
		studentManagement.addStudent("Amy", 78);
		studentManagement.addStudent("Alice", 55);
		studentManagement.addStudent("Jenny", 100);
		studentManagement.addStudent("David", 0);
		
		System.out.println();
		
		System.out.println("getStudentScore 메소드 사용");
		int score = studentManagement.getStudentScore("Alice");
		System.out.println("Alice의 점수: " +score);
		
		System.out.println();
	
	}

}

