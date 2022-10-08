package study011;

import java.util.ArrayList;
import java.util.List;

public class BoardDao {

	public List<Board> getBoardList() {
		Board bd1 = new Board("제목1","내용1");
		Board bd2 = new Board("제목2","내용2");
		Board bd3 = new Board("제목3","내용3");

		List<Board> list = new ArrayList<Board>();
		list.add(bd1);
		list.add(bd2);
		list.add(bd3);
		return list;
	}

}
