package part7;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Board {

	@Autowired
//	@Qualifier("freeWrite")
	private Write write;
	
	public void boardWrite() {
		write.doWrite();
	}
}