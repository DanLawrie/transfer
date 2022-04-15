package edu.monmouth.employee;

public class SalesEmployee implements Employee {
	private int commission;
	private int yearlyBase;
	
	
	public SalesEmployee(int yearlyBase) {
		this.yearlyBase = yearlyBase;
	}
	
	@Override
	public String toString() {
		return "SalesEmployee, commission=" + commission + ", yearlyBase=" + yearlyBase;
	}
	public int getMonthlyPay(){
		return yearlyBase/12;
	}
	public void setCommission(int commission) {
		this.commission = commission;
	}

		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			SalesEmployee other = (SalesEmployee) obj;
			if (commission != other.commission)
				return false;
			if (yearlyBase != other.yearlyBase)
				return false;
			return true;
		}
		
}
