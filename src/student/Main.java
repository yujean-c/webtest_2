package student;

public class Main {

	public static void main(String[] args) {
		CMSu studentManagement = new SMSu();
		studentManagement.addStudent("John", 80);
		studentManagement.addStudent("Amy", 78);
		studentManagement.addStudent("Alice", 55);
		studentManagement.addStudent("Jenny", 100);
		studentManagement.addStudent("David", 0);
		
		System.out.println();
		
		//특정 학생의 점수 조회 
		System.out.println("getStudentScore 메소드 사용");
		int score = studentManagement.getStudentScore("Alice");
		System.out.println("Alice의 점수: " + score);
		
		System.out.println();
		
		// 등록되어있는 학생들 이름 및 점수 출력 
		studentManagement.showStudents();
		System.out.println();
		
		// 전체 학생 이름순으로 프린트 
		System.out.println("등록되어있는 학생들: ");
		studentManagement.showStored();
		
		System.out.println();
		
		//평균 점수 이상을 받은 학생 조회
		System.out.println("평균보다 높은 점수 받은 학생들과 점수");
		studentManagement.showAvgStu();
		System.out.println();
		
		//상위 3명 
		System.out.println("Top 3명");
		studentManagement.showTop();
		
		//toString 
		System.out.println();
		System.out.println(studentManagement.toString());
	
	}

}

