package logic;
import java.util.ArrayList;

public class Maze implements Runnable{
	private int puntaje = 0;
	private Tile [][] map;
	private ArrayList<GameEnemy> enemies;
	private ArrayList<Obstacle> obstacles;
	private ArrayList<Objective> objectives;
	private GameHero hero;
		
	public Maze(ArrayList<GameEnemy> enemies, ArrayList<Obstacle> obstacles, ArrayList<Objective> objectives,
			GameHero hero, Tile [][] map) {
		this.enemies = enemies;
		this.obstacles = obstacles;
		this.objectives = objectives;
		this.hero = hero;
		this.map = map;
	}

	@Override
	public void run(){
	}
	
}
