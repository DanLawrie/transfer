package edu.monmouth.employee;

public class SalaryEmployee implements Employee{
	private int yearlySalary;
	
	public SalaryEmployee(int yearlySalary){
		this.yearlySalary =yearlySalary;
	}
	
	public int getMonthlyPay(){
		return yearlySalary/12;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		SalaryEmployee other = (SalaryEmployee) obj;
		if (yearlySalary != other.yearlySalary)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "SalaryEmployee, yearlySalary=" + yearlySalary;
	}
	
}
