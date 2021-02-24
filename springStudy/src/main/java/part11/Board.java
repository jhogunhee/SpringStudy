package part11;

import javax.annotation.Resource;
import javax.annotation.Resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Board {
	
	@Resource(name = "qnaWrite")
    private Write write;
    
    public void boardWrite() {
        write.doWrite("important Message");
    }

}