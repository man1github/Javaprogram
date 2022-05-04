package class4;

public class Employee {
	
	private int empNo;
	private String empName;
	private String empDesg;
	private String empLocation;
	
	
	public Employee(int empNo, String empName, String empDesg, String empLocation) {
		super();
		this.empNo = empNo;
		this.empName = empName;
		this.empDesg = empDesg;
		this.empLocation = empLocation;
	}
	
	
	
	public int getEmpNo() {
		return empNo;
	}
	
	public void setEmpNo(int empNo) {
		this.empNo = empNo;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public String getEmpDesg() {
		return empDesg;
	}
	public void setEmpDesg(String empDesg) {
		this.empDesg = empDesg;
	}
	public String getEmpLocation() {
		return empLocation;
	}
	public void setEmpLocation(String empLocation) {
		this.empLocation = empLocation;
	}



	@Override
	public String toString() {
		return "Employee [empNo=" + empNo + ", empName=" + empName + ", empDesg=" + empDesg + ", empLocation="
				+ empLocation + "]";
	}



	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((empDesg == null) ? 0 : empDesg.hashCode());
		return result;
	}



	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		if (empDesg == null) {
			if (other.empDesg != null)
				return false;
		} else if (!empDesg.equals(other.empDesg))
			return false;
		return true;
	}



	
	
	
	
	
	

}
