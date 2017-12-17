package part6;

import org.springframework.beans.factory.annotation.Autowired;

public class Board {
	@Autowired
	private Write write;
	
	public void boardWrite() {
		write.doWrite();
	}
}