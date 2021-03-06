package part13;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


@Component("board")
public class Board {

	@Resource(name="freeWrite")
	private Write write;
	
	public void boardWrite() {
		write.doWrite();
	}
	public void boardWrite(String name) {
		write.setBoardName(name);
		write.doWrite();
	}
}