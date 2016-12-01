package logic;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;

public class Tile extends GameObject {
	public Tile(int xPosition, int yPosition) {
		super(xPosition, yPosition);
	}

	public void dibujar(Graphics g){
	       g.setColor(Color.white);
	       g.fillRect(xPosition, yPosition, 20, 20);
	}
	
	@Override
	public void collision(GameObject other){
		/**
		 * la casilla no colisiona contra nada, 
		 * sin embargo sabe si hay una colision en ella.
		 */
	}

	@Override
	public boolean isColliding() {
		// TODO Auto-generated method stub
		return false;
	}

}
