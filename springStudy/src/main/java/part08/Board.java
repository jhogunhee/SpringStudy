package part08;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Board {

	@Autowired
	@Qualifier("freeBoardWrite") 
    private Write write;
    
    public void boardWrite() {
        write.doWrite();
    }

}