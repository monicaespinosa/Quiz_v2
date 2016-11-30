package logic;

public class GameHero extends GameCharacter {

	@Override
	public void run() {
		// TODO Auto-generated method stub

	}

	@Override
	public void move(char direction) {
		switch(direction){
		case 'U':
			return;
		case 'D':
			return;
		case 'R':
			return;
		case 'L':
			return;
		default:
			return;
		}
	}

	@Override
	public void collision(GameObject other) {
		// TODO Auto-generated method stub

	}

	@Override
	public boolean isColliding() {
		// TODO Auto-generated method stub
		return false;
	}

}
