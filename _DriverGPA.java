package edu.citytech.cst;

public class _DriverGPA {

	public static void main(String[] args) {
		
		
		float qPA = 4.0f;
		String letterGrade = "A";
		String description = "Excellent";
		GPA gpa = new GPA(qPA, letterGrade, description);
		
		
		System.out.println(gpa);
		
		String desc = gpa.getDescription();
		System.out.println(desc);

	}

}
