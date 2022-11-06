import java.time.LocalDateTime;

public class EmpInfo {
	int empno;
	String ename;
	LocalDateTime hiredate;
	
	@Override
	public String toString() {
		return "EmpInfo [empno=" + empno + ", ename=" + ename + ", hiredate=" + hiredate + "]";
	}
}
