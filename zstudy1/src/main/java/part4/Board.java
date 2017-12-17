package part4;

public class Board {
	private Write write;
	
	public Board() {
		this.setWrite(new QnABoardWrite());
	}
	public void setWrite(Write write) {
		this.write = write;
	}
	
	public void boardWrite() {
		write.doWrite();
	}
}