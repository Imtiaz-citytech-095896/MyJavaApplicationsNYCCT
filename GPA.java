package edu.citytech.cst;

public class GPA {
	private float QPA;
	private String letterGrade;
	private String description;

	public GPA(float qPA, String letterGrade, String description) {
		QPA = qPA;
		this.letterGrade = letterGrade;
		this.description = description;
	}

	public float getQPA() {
		return QPA;
	}

	public String getLetterGrade() {
		return letterGrade;
	}

	public String getDescription() {
		return description;
	}

	@Override
	public String toString() {
		return "GPA [QPA=" + QPA + ", letterGrade=" + letterGrade + ", description=" + description + "]";
	}

}
