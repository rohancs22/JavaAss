
public class Emp {
	
	int empid;
	String ename;
	
	public void setEmpid(int empid) {
		this.empid = empid;
	}
	
	public void setEname(String ename) throws InvalidNameException {
		if(ename == null)
			throw new InvalidNameException("Employee Name cannot be null!!");
		this.ename = ename;
	}
	
	@Override
	public String toString() {
		return "Emp [empid=" + empid + ", ename=" + ename + "]";
	}
	
}
