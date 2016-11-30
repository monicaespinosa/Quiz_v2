package screen;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.image.BufferStrategy;
import java.awt.image.BufferedImage;
import java.awt.image.DataBufferInt;
import java.awt.BorderLayout;

import javax.swing.JFrame;

public class GameCanvas extends Canvas implements Runnable {

	private final static long serialVersionUID = 1L;
	
	public final static int WIDTH = 160;
	public final static int HEIGHT = WIDTH/12*9;
	public final static int SCALE = 3;
	public final static String NAME = "Maze";
	
	private JFrame frame;
	private InputHandler input;
	
	private boolean running;
	private double FPS;
	private BufferedImage image = new BufferedImage(WIDTH, HEIGHT, BufferedImage.TYPE_INT_RGB);
	private int[] pixels = ((DataBufferInt)image.getRaster().getDataBuffer()).getData();
	
	public GameCanvas() {
		setMinimumSize(new Dimension(WIDTH*SCALE, HEIGHT*SCALE));
		setMaximumSize(new Dimension(WIDTH*SCALE, HEIGHT*SCALE));
		setPreferredSize(new Dimension(WIDTH*SCALE, HEIGHT*SCALE));
		
		frame = new JFrame(NAME);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(new BorderLayout());
		
		frame.add(this, BorderLayout.CENTER);
		frame.pack();
		
		frame.setResizable(false);
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
		
		FPS = 60;
		
		input = new InputHandler(this);
	}
	
	public synchronized void start(){
		running = true;
		new Thread(this).start();
	}
	
	public synchronized void stop(){
		running = false;
	}
	
	@Override
	public void run() {
		long lastTime = System.nanoTime();
		double nsPerTick = 1000000000/FPS;
		
		int ticks = 0;
		int frames = 0;
		
		long lastTimer = System.currentTimeMillis();
		double delta = 0;
		boolean shouldRender = false;
		
		while(running){
			long now = System.nanoTime();
			delta += (now - lastTime)/nsPerTick;
			lastTime = now;
			
			while( delta >=1){
				ticks++;
				tick();
				delta -=1;
				shouldRender = true;
			}
			
			if(shouldRender){
				frames++;
				render();
			}
			
			if(System.currentTimeMillis() - lastTimer >=1000){
				//System.out.println(ticks+", "+frames);
				lastTimer += 1000;
				ticks = 0;
				frames = 0;
			}
		}
	}
	
	public void tick(){
		for(int i=0; i<pixels.length; i++){
			pixels[i]= i * (int)System.currentTimeMillis();
		}
		System.out.println(input.getHorizontalAxis()+ ", "+input.getVerticalAxis());
	}
	
	public void render(){
		BufferStrategy bs = getBufferStrategy();
		if(bs == null){
			createBufferStrategy(3);
			return;
		}
		
		Graphics g = bs.getDrawGraphics();
		
		g.setColor(Color.BLACK);
		g.fillRect(0, 0, getWidth(), getHeight());
		
		g.drawImage(image, 0, 0, getWidth(), getHeight(), null);
		
		g.dispose();
		bs.show();
	}
	
	public static void main(String[] args){
		new GameCanvas().start();
	}

}
