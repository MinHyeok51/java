import java.sql.Date;
import java.time.LocalDateTime;

public class Professor {
	int profno;
	String name;
	String id;
	String position;
	int pay;
	LocalDateTime hiredate;
	Date hiredate2;
	int deptno;
	@Override
	public String toString() {
		return "Professor [profno=" + profno + ", name=" + name + ", id=" + id + ", position=" + position + ", pay="
				+ pay + ", hiredate=" + hiredate + ", hiredate2=" + hiredate2 + ", deptno=" + deptno + "]";
	}
	
}
