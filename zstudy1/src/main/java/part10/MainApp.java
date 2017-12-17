package part10;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class MainApp {

	public static void main(String[] args) {
		ConfigurableApplicationContext ac = new  ClassPathXmlApplicationContext("spring/context10.xml");
		Board board = ac.getBean("board", Board.class);
		board.boardWrite();
		ac.close();
	}

}
