package student;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map.Entry;

public class SMSu implements CMSu {
	private HashMap<String, Integer> student;

	public SMSu() {
		student = new HashMap<>();
	}

	@Override
	public void addStudent(String name, int score) {
		if (score < 0 || score > 100) {
			throw new IllegalArgumentException("점수를 다시 확인하시오.");
		}
		student.put(name, score);
		System.out.println(name + "님이 시스템에 추가되었습니다.");
	}

	@Override
	public int getStudentScore(String name) {
		return student.get(name);
	}

	@Override
	public void showStudents() {
		// 사실 아직도 뭐하는건지 정확히 이해가 안가요
		if (student.isEmpty()) {
			System.out.println("학생이 없습니다.");
		} else {
			System.out.println("등록되어있는 학생들의 이름과 점수:");
			for (Entry<String, Integer> entry : student.entrySet()) {
				System.out.println("이름: " + entry.getKey() + ", 점수: " + entry.getValue());
			}
		}

	}

	// 평균 계산 helper method
	private double getAvg(HashMap<String, Integer> student) {
		Collection<Integer> val = student.values();
		double sum = 0.0;
		if (val.isEmpty()) {
			return 0.0;
		} else {
			for (int v : val) {
				sum += v;
			}
		}
		return (double) sum / student.size();
	}

	@Override
	public void showAvgStu() {
		double sum = getAvg(student);
		for (Entry<String, Integer> s : student.entrySet()) {
			if (s.getValue() >= sum) {
				System.out.println(s.getKey() + ": " + s.getValue());
			}
		}
	}

	@Override
	public void showStored() {
		String students = "";
		if (student.isEmpty()) {
			System.out.println("학생이 없습니다.");
		} else {
			List<String> keys = new ArrayList<>(student.keySet());
			Collections.sort(keys);
			for (String name : keys) {
				students = students + name + " "; 
			}
			System.out.println(students);
		}

	}

	private static void insertionSort(ArrayList<Integer> list) {
		for (int i = 1; i < list.size(); i++) {
			int key = list.get(i);
			int j = i - 1;

			while (j >= 0 && list.get(j) < key) {
				list.set(j + 1, list.get(j));
				j--;
			}
			list.set(j + 1, key);
		}
	}
	
	@Override
	public void showTop() {
		Collection<Integer> scores = student.values();
		ArrayList<Integer> scoresList = new ArrayList<>(scores);
		insertionSort(scoresList);
		int count = 0;
		while (count < 3) {
			int score = scoresList.get(count);
				for (Entry<String, Integer> entry : student.entrySet()) {
					if (entry.getValue() == score) {
						System.out.println(entry.getKey());
						count ++;
					}
				}
			}

		}

	@Override
	public String toString() {
		String students = "";
		int count = 0;
		for (Entry<String, Integer> entry : student.entrySet()) {
			if (count < student.size()-1) {
			students = students + "(" + entry.getKey() + ", " + entry.getValue() + ")" + ", ";
			count ++;
		} else {
			students = students + "(" + entry.getKey() + ", " + entry.getValue() + ")" ;
		}	
		}
		return "[" + students + "]";
	}
	}



