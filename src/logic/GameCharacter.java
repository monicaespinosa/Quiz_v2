package logic;

public abstract class GameCharacter extends GameObject implements Runnable{
	public abstract void move(char direction);
}
