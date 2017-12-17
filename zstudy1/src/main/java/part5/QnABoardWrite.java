package part5;

public class QnABoardWrite implements Write {
	private String boardName;

	public QnABoardWrite() {
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
