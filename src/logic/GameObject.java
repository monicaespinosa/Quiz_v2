package logic;

public abstract class GameObject {
	protected int xPosition;
	protected int yPosition;
	
	public int getXPosition(){
		return xPosition;
	}
	public int getyPosition(){
		return yPosition;
	}
	public abstract void collision(GameObject other);
	public abstract boolean isColliding();
}
