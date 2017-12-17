package part3;

public class Factory {
	public static Write getWriteIntance() {
		return new QnABoardWrite();
	}
	
}
