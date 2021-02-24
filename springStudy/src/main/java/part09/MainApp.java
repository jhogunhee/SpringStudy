package part09;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class MainApp {

    public static void main(String[] args) {
    	
       // src/main/resources안에 있는 내용을 확인
       ApplicationContext ac = new GenericXmlApplicationContext("spring/context09.xml");
       
       // 1. bean을 가져와 형변환하여 사용하거나 
       // Board board = (Board) ac.getBean("board");
       
       // 2. 이름, class를 표시하여 가져오기
       Board board = ac.getBean("board", Board.class);
      
       board.boardWrite();
    }
}