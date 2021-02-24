package part09;

public class FreeBoardWrite implements Write {

    private String boardName;

    public FreeBoardWrite() {
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