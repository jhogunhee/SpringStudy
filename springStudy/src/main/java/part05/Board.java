package part05;

import org.springframework.beans.factory.annotation.Autowired;

public class Board {

    private Write write;

    /* 
     * setter 주입방식
     * Board 클래스가 인스턴스로 생성되면서 @Autowired가 등록된 메서드가 호출되어
     * Write자료형인 write를 인자로 setWrite() 메서드가 ㅎ호출이 되는데 스프링 컨테이너에서 
     * id가 write인 bean을 찾는다. 
    */
    @Autowired
    public void setWrite(Write write) {
        this.write = write;
    }

    public void boardWrite() {
        write.doWrite();
    }

}