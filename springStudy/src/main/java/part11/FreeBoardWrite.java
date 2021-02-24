package part11;

import org.springframework.stereotype.Component;

@Component
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

    public void doWrite(String msg) {
        System.out.println(this.getBoardName() + " Write down!!");
    }
}