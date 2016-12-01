package logic;

import java.util.Observer;

import screen.GameCanvas;

public abstract class GameCharacter extends GameObject implements Runnable, Observer{
	protected int speed;
	public abstract void move(char direction);
	
	public GameCharacter(int xPosition, int yPosition) {
		super(xPosition, yPosition);
		// TODO Auto-generated constructor stub
	}
	protected boolean shouldUpdate;
	
	public void run() {
		// TODO Auto-generated method stub
		while(GameCanvas.isRunning()){
			if(shouldUpdate){
				update();
				shouldUpdate = false;
			}
		}
	}
	
	public abstract void update();
}
