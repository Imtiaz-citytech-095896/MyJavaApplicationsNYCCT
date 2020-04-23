package edu.citytech.cst;

public class _DriverEnum {

	public static void main(String[] args) {
		
		EGPA gpa = EGPA.A;
		System.out.println(gpa);
		
		for (EGPA x : EGPA.values()) {
			GPA qpa = x.getdescription();
			System.out.println(qpa);
			
			
		}

	}

}
