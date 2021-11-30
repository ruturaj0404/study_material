package game;

public abstract class  player {
	String name;
    int mo_no;
    int score;
    abstract int play( ) ;
    
	public player() {
		super();
	}

	public player(String name, int mo_no, int score) {
		super();
		this.name = name;
		this.mo_no = mo_no;
		this.score = score;
	}

    
}
