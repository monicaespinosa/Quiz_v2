package screen;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class InputHandler implements KeyListener {

	private double verticalAxis;
	private double horizontalAxis;
	
	public InputHandler(GameCanvas canvas){
		verticalAxis=0;
		horizontalAxis=0;
		canvas.addKeyListener(this);
	}
	
	public double getVerticalAxis(){
		return verticalAxis;
	}
	
	public double getHorizontalAxis(){
		return horizontalAxis;
	}
	
	@Override
	public void keyPressed(KeyEvent arg0) {
		setDirection(arg0.getKeyCode(), true);
	}

	@Override
	public void keyReleased(KeyEvent e) {
		setDirection(e.getKeyCode(), false);
	}

	@Override
	public void keyTyped(KeyEvent e) {
		
	}
	
	public void setDirection(int keyCode, boolean pressed){
		switch(keyCode){
		case KeyEvent.VK_UP:
			verticalAxis = (pressed)? 1.0 : 0;
			return;
		case KeyEvent.VK_DOWN:
			verticalAxis = (pressed)? -1.0 : 0;
			return;
		case KeyEvent.VK_RIGHT:
			horizontalAxis = (pressed)? 1.0 : 0;
			return;
		case KeyEvent.VK_LEFT:
			horizontalAxis = (pressed)? -1.0 : 0;
			return;
		default:
			return;
		}
	}

}
