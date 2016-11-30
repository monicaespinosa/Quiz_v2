package logic;

public abstract class GameObject {
	protected int xPosition;
	protected int yPosition;
	
	public int getXPosition(){
		return xPosition;
	}
	public int getYPosition(){
		return yPosition;
	}
	public void setXPosition(int xPosition){
		this.xPosition = xPosition;
	}
	public void setYPosition(int yPosition){
		this.yPosition = yPosition;
	}
	public abstract void collision(GameObject other);
	public abstract boolean isColliding();
}
