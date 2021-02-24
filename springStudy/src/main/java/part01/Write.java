package part01;

public class Write {

	// private 사용 이유
	// getter sette로만 접근이 가능하도록하여 캡슐화
    private String boardName;

    public Write() {
        this.init();
    }

    public void init() {
        this.setBoardName("Free Board");
    }

    public String getBoardName() {
        return boardName;
    }

    public void setBoardName(String boardName) {
        this.boardName = boardName;
    }

    public void doWrite() {
        System.out.println(this.getBoardName() + " Write down!!");
    }

}