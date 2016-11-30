package logic;
import java.util.Random;

public class GameEnemy extends GameCharacter {
	private Random rand = new Random();
	private int dir = rand.nextInt(4);
	
	@Override
	public void run() {
		// TODO Auto-generated method stub

	}

	@Override
	public void move(char direction) {
		if(dir == 1){
			//arriba
			setYPosition(getYPosition()+1);
			return;
		}else if (dir == 2){
			//abajo
			setYPosition(getYPosition()-1);
			return;
		}else if (dir == 3){
			//derecha
			setXPosition(getXPosition()+1);
			return;
		}else if (dir == 4){
			//izquierda
			setXPosition(getXPosition()-1);
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
