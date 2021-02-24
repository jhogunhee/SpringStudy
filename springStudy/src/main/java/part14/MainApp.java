package part14;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainApp {

    public static void main(String[] args) {
    	AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext();
    	ac.register(JavaConfig.class);
    	ac.refresh();
    	Board board = ac.getBean("board", Board.class);
    	board.boardWrite();
    }
}