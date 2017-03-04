package orders;

public class Woman extends Human {
	private boolean isLove = false;

	public Woman(String name, int age, int money) {
		super(name, age, money);
	}

	public boolean isLove() {
		return isLove;
	}

	public void setLove(boolean isLove) {
		this.isLove = isLove;
	}

}
