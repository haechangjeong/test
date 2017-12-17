package part10;

import org.springframework.beans.factory.annotation.Autowired;

public class Board {
	
	private Write write;
	
	@Autowired
	public void setWrite(Write write) {
		this.write = write;
	}
	
	public void boardWrite() {
		write.doWrite();
	}
}