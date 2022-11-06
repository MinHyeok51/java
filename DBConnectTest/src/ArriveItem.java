import java.time.LocalDateTime;

public class ArriveItem {
	public String name;
	public LocalDateTime arivDate;
	public LocalDateTime arivTs;
	
	public String toString() {
		return name + "-" + arivDate + "-" + arivTs ;
	}
}

//자바에서 활용할 데이터타입 <------->SQL DB insert, delete, update