package part10;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class QnABoardWrite implements Write {
	private String boardName;
	
	@PostConstruct	
	public void init() {
		System.out.println("init()---");
		this.setBoardName("Free Board");
	}
	
	@PreDestroy
	public void close() {
		System.out.println("close()---");
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
