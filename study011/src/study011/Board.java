package study011;

public class Board {
	private String title;
	private String content;

	//생성자
	public Board(String title, String content) {
		this.title =title;
		this.content = content;
	}
	//메소드
	public String getTitle() {
		return title;
	}
	public String getContent() {
		return content;
	}
}
