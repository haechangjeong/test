package part14;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;


@Configuration
@EnableAspectJAutoProxy
@ComponentScan(basePackages={"part14"})
public class MainApp {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext();
		try {
			ac.register(MainApp.class);
	        ac.refresh();
			Board board = ac.getBean("board", Board.class);
			board.boardWrite();
		}
		finally {
			ac.close();
		}
	}
}
