package Day10;

import java.util.Date;

class Student {
    private int studentId;
    private String studentName;
    private Double studentFees;
    private Date dateOfAdmission;
	public Student(int studentId, String studentName, Double studentFees, Date dateOfAdmission) {
		super();
		this.studentId = studentId;
		this.studentName = studentName;
		this.studentFees = studentFees;
		this.dateOfAdmission = dateOfAdmission;
	}
    
	public Student getStudentObject() {
	    return new Student(studentId, studentName, studentFees, dateOfAdmission);
	}

}
