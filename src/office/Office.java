package office;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Office {
    private List<Employee> employees;

    // 기본 생성자
    public Office() {
        employees = new ArrayList<>();
    }

    public void addEmployee(Employee employee) {
        employees.add(employee);
    }
	
//	부서별 평균 연봉을 계산한 후, 평균 연봉이 높은 부서부터 출력하는 showAvgDepart 메소드
//	- 나이와 연봉으로 직원 목록 분류해서 출력하는 showAgeSalary 메소드
//	- 부서별 직원수와 총 연봉 출력하는 showDept 메소드
	
    
    // 각 직원 순회하면서 department 이 key 로 추가 되어있지않으면 추가 
    //그 후, 그 department 마다 entry iterate 하면서 그 부서 인사람이라면, 값에 +월급 
    // 월급 비교해서 department 월급 큰 순으로 출력 
    
	HashMap<String, Double > getAvgSalary() {
		Map<String, Double> dep = new HashMap<>();
		
		for(Employee e : employees) {
			if(dep.isEmpty()) {
				dep.put(e.getDepartment(), 0.0);
			} else {
				for (Entry<String, Double> d : dep.entrySet())
					if() {
						// 여기서 그 각 employee 순회하면서 Map 에 이미 그 departmnt 포함되었으면 그냥 넘어가고, 
						// 아니면 그 department 를 dep 에추가하고싶어. value 는 0.0 으로 
			}
				
			}
		}
	}
	
	void showAvgDepart() {
		
	}
	
	

}
