package logic;
import java.util.ArrayList;

public class Maze implements Runnable{
	private ArrayList<GameEnemy> enemies;
	private ArrayList<Obstacle> obstacles;
	private ArrayList<Objective> objectives;
	private GameHero hero;
		
	public Maze(ArrayList<GameEnemy> enemies, ArrayList<Obstacle> obstacles, ArrayList<Objective> objectives,
			GameHero hero) {
		super();
		this.enemies = enemies;
		this.obstacles = obstacles;
		this.objectives = objectives;
		this.hero = hero;
	}

	@Override
	public void run(){
	}
	
}
