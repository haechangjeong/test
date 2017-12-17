package part14;

import org.springframework.stereotype.Component;

@Component("freeWrite")
public class FreeBoardWrite implements Write {
	private String boardName;

	public FreeBoardWrite() {
		this.init();
	}
	
	public void init() {
		this.setBoardName("Free Board");
	}
	
	public void doWrite() {
		System.out.println(this.getBoardName() + " Write down!!");
	}
	
	public String getBoardName() {
		return boardName;
	}

	public void setBoardName(String boardName) {
		this.boardName = boardName;
	}

	
}
