package logic;

import java.util.Observable;

public class GameHero extends GameCharacter {
	private int vida;

	public GameHero(int xPosition, int yPosition, int vida) {
		super(xPosition, yPosition);
		this.vida = vida;
	}
	public void setVida(int vida){
		this.vida = vida;
	}
	public int getVida(){
		return vida;
	}

	@Override
	public void run() {

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

	@Override
	public void update(Observable arg0, Object arg1) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update() {
		// TODO Auto-generated method stub
		
	}

}
