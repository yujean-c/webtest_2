package student;

public interface CMSu {
	void addStudent(String name, int score); 
	int getStudentScore(String name);
	void showStudents();
	void showAvgStu();
	void showStored();
	void showTop();
}
