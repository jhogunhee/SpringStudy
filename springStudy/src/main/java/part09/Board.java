package part09;

import javax.annotation.Resource;
import javax.annotation.Resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Board {
	// java에서 제공해주는것으로
	// @autowired + @qualifier
	@Resource(name = "freeBoardWrite")
    private Write write;
    
    public void boardWrite() {
        write.doWrite();
    }

}