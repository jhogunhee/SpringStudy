package part03;

import lombok.Setter;

public class Board {
	
	/*
	 * @Autowired
	 * public void setWrite(Write write) {
	 *   this.write = write; 와 같은 코드가 만들어진다.
	 * }
	 */
	@Setter(onMethod_ = {@Autowired})
    private Write write;

    public Board() {
        this.setWrite(Factory.getFreeBoardWriteInstance());
    }

    public void setWrite(Write write) {
        this.write = write;
    }

    public void boardWrite() {
        write.doWrite();
    }

}