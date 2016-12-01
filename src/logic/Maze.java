package logic;
import java.util.ArrayList;
import java.util.Random;

public class Maze implements Runnable{
	public final static char derrota = 'D';
	public final static char victoria = 'V';
	public final static char enJuego = 'J';
	
	private Random rand = new Random();
	private int dir = rand.nextInt(getMap().length);
	private int cant = (rand.nextInt(getMap().length)/4)+1;
	
	private int puntaje = 0;
	private char estado;
	private Tile [][] map;
	private ArrayList<GameEnemy> enemies;
	private ArrayList<Obstacle> obstacles;
	private ArrayList<Objective> objectives;
	private GameHero hero;
		
	public Maze(GameHero hero, Tile [][] map) {
		this.enemies = new ArrayList<GameEnemy>();
		setEnemies(getEnemies());
		this.obstacles = new ArrayList<Obstacle>();
		setObstacles(getObstacles());
		this.objectives = new ArrayList<Objective>();
		setObjectives(getObjectives());
		this.hero = hero;
		setHero(getHero());
		this.map = map;
	}
	
	public int getPuntaje() {
		return puntaje;
	}
	public void setPuntaje(int puntaje) {
		this.puntaje = puntaje;
	}
	public Tile[][] getMap() {
		return map;
	}
	public void setMap(Tile[][] map) {
		this.map = map;
	}
	public ArrayList<GameEnemy> getEnemies() {
		return enemies;
	}
	public void setEnemies(ArrayList<GameEnemy> enemies) {
		for(int i = 0; i<cant; i++){
			this.enemies.add(new GameEnemy(dir, dir)); 
		}
	}
	public ArrayList<Obstacle> getObstacles() {
		return obstacles;
	}
	public void setObstacles(ArrayList<Obstacle> obstacles) {
		for(int i = 0; i<cant; i++){
			this.obstacles.add(new Obstacle(dir, dir)); 
		}
	}
	public ArrayList<Objective> getObjectives() {
		return objectives;
	}
	public void setObjectives(ArrayList<Objective> objectives) {
		for(int i = 0; i<cant; i++){
			this.objectives.add(new Objective(dir, dir)); 
		}
	}
	public GameHero getHero() {
		return hero;
	}
	public void setHero(GameHero hero) {
		this.hero = new GameHero(dir, dir, 1);
	}
	public char getEstado() {
		return estado;
	}
	public void setEstado(){
		if (hero.getVida()<0){
    		estado = derrota;
    	}else if (getObjectives().size() == 0){
    		estado = victoria;
    	}else{
    		estado = enJuego;
    	}
	}

	@Override
	public void run(){
    	for(int i = 0; i <getMap().length; i++){
    		/**
    		 * inicializar heroes, enemigos, objetivos y obstaculos
    		 */
    	}
    	while(estado == enJuego){
    		try {
				Thread.sleep(34);
				setEstado();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
    	}
    }
	
}
