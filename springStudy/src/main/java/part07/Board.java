package part07;


public class Board {

    private Write write;

    // 생성자 주입 스프링 4.3.1 버젼이상부터 가능하다. 
    public Board(Write write) {
		this.write = write;
	}
    
    public void boardWrite() {
        write.doWrite();
    }

}