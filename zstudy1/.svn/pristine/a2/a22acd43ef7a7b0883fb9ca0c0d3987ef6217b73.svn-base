package part9;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component("qnaWrite")
public class QnABoardWrite implements Write {
	private String boardName;

	public QnABoardWrite() {
		this.init();
	}
	
	public void init() {
		this.setBoardName("Q&A Board");
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