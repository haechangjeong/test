package part1;

public class Board {
	private Write write;
	
	public Board() {
		this.setWrite(new Write());
	}

	public void setWrite(Write write) {
		this.write = write;
	}
	
	public void boardWrite() {
		write.doWrite();
	}
}
