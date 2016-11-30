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
			setYPosition(getYPosition()+1);
			return;
		case 'D':
			setYPosition(getYPosition()-1);
			return;
		case 'R':
			setXPosition(getXPosition()+1);
			return;
		case 'L':
			setXPosition(getXPosition()-1);
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
