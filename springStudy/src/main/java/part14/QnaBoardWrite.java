package part14;

import org.springframework.stereotype.Component;

@Component("qnaWrite")
public class QnaBoardWrite implements Write {

    private String boardName;

    public QnaBoardWrite() {
        this.init();
    }

    public void init() {
        this.setBoardName("Q&A Board");
    }

    public void doWrite(String msg) {
        System.out.println(this.getBoardName() + " Write down!!");
    }

    public String getBoardName() {
        return boardName;
    }

    public void setBoardName(String boardName) {
        this.boardName = boardName;
    }
}