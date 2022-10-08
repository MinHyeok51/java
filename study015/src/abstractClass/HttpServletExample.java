package abstractClass;

abstract class HttpServlet{
	public abstract void service();
}

class LoginServlet extends HttpServlet{
	public  void service() {
		System.out.println("로그인합니다.");
	}
}
class FileDownloadServlet extends HttpServlet{
	public  void service() {
		System.out.println("파일 다운로드합니다.");
	}
}
public class HttpServletExample {

	public static void main(String[] args) {
		method(new LoginServlet());
		method(new FileDownloadServlet());


	}
	public static void method(HttpServlet servlet) {
		servlet.service();
	}
}
