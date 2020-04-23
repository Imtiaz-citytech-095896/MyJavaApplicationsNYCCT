package edu.citytech.cst;

public enum EGPA {
	A(new GPA(4.0f, "A","Excellent")),
	A_MINUS(new GPA(3.7f, "A-","Almost Excellent")),
	B_PLUS(new GPA(3.3f, "B+","Very Good")),
	B(new GPA(3.0f, "B","Good")),
	B_MINUS(new GPA(2.7f, "B-","Preety Good")),
	C_PLUS(new GPA(2.3f, "C+","Avobe Average")),
	C(new GPA(2.0f, "C"," Average")),
	C_MINUS(new GPA(1.8f, "C-","Have to retake")),
	D(new GPA(1.0f, "D","Almost passing")),
	F(new GPA(0.0f, "F","Failing"));
	
	
	private GPA gpa = null;
	
	
	EGPA(GPA gpa){
		this.gpa = gpa;
		}
	
	public GPA getdescription() {
		return this.gpa;
	}
	
}
