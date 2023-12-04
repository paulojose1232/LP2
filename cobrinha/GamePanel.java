package cobrinha;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.Random;

import javax.swing.JPanel;

public class GamePanel extends JPanel implements ActionListener{

	static final int SCREEN_WIDTH = 600;
	static final int SCREEN_HEIGHT = 600;
	static final int UNIT_SIZE = 25; //quanto maior o número, maior o "conteúdo" do jogo
	static final int GAME_UNITS = (SCREEN_WIDTH*SCREEN_HEIGHT)/UNIT_SIZE;
	static final int DELAY = 75; //quanto maior o delay, mais lento é o jogo
	final int x[] = new int[GAME_UNITS];
	final int y[] = new int[GAME_UNITS];
	int bodyParts = 6; //cobra começa com 6 pedaços
	int applesEaten;
	int appleX;
	int appleY;
	char direction = 'R'; // cobra começa indo pra direita
	boolean running = false;
	Timer timer;
	Random random;
	
	GamePanel() { //Construtor
		random = new Random();
		this.setPreferredSize(new Dimension(SCREEN_WIDTH,SCREEN_HEIGHT));
		this.setBackground(Color.black);
		this.setFocusable(true);
		this.addKeyListener(new MyKeyAdapter());
		startGame();
	}
	public void startGame() {
		newApple();
		running = true;
		timer = new Timer(DELAY,this);
		timer.start();
	}
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		draw(g);
	}
	public void draw(Graphics g) {
		
		if(running) { //se o jogo tiver rodando
			/*
			// coloca linhas de grade (gridlines) no jogo
			for(int i=0;i<SCREEN_HEIGHT/UNIT_SIZE;i++) {
				g.drawLine(i*UNIT_SIZE, 0, i*UNIT_SIZE, SCREEN_HEIGHT);
				g.drawLine(0, i*UNIT_SIZE, SCREEN_WIDTH, i*UNIT_SIZE);
	
			}
			*/
			g.setColor(Color.red);
			g.fillOval(appleX, appleY, UNIT_SIZE, UNIT_SIZE);
			
			for(int i = 0;i<bodyParts;i++) {
				if(i == 0) {
					g.setColor(Color.green);
					g.fillRect(x[i], y[i], UNIT_SIZE, UNIT_SIZE);
				}
				else {
					// cobra de cor verde
					g.setColor(new Color(45,180,0));
					// cobra de cor arco íris aleatório
					//g.setColor(new Color(random.nextInt(255),random.nextInt(255),random.nextInt(255)));
					g.fillRect(x[i], y[i], UNIT_SIZE, UNIT_SIZE);
				}
			}
			g.setColor(Color.red);
			g.setFont( new Font("Comic Sans MS",Font.BOLD, 40));
			FontMetrics metrics = getFontMetrics(g.getFont());
			g.drawString("Pontuação: "+applesEaten, (SCREEN_WIDTH - metrics.stringWidth("Pontuação: "+applesEaten))/2, g.getFont().getSize());
		}
		else {
			gameOver(g);//se o jogo não tiver rodando, então é pq o jogo acabou
		}
	}
	public void newApple() {
		appleX = random.nextInt((int)(SCREEN_WIDTH/UNIT_SIZE))*UNIT_SIZE;
		appleY = random.nextInt((int)(SCREEN_HEIGHT/UNIT_SIZE))*UNIT_SIZE;
	}
	public void move() {
		for(int i = bodyParts;i>0;i--) {
			x[i] = x[i-1];
			y[i] = y[i-1];
		}
		
		switch(direction) {
		case 'U':
			y[0] = y[0] - UNIT_SIZE;
			break;
		case 'D':
			y[0] = y[0] + UNIT_SIZE;
			break;
		case 'L':
			x[0] = x[0] - UNIT_SIZE;
			break;
		case 'R':
			x[0] = x[0] + UNIT_SIZE;
			break;
		}
		
	}
	public void checkApple() {
		if((x[0] == appleX) && (y[0] == appleY)) {
			bodyParts++;
			applesEaten++;
			newApple();
		}
	}
	public void checkCollisions() {
		// checa se a cabeça colidiu com o corpo
		for(int i = bodyParts;i>0;i--) {
			if((x[0] == x[i]) && (y[0] == y[i])) { // cabeça da cobra se encontrou com o corpo, logo ela colidiu, fim de jogo
				running = false; // termina o jogo
			}
		}
		// checa se a cabeça colide com a parede na esquerda
		if(x[0] < 0) {
			running = false;
		}
		// checa se a cabeça colide com a parede na direita
		if(x[0] > SCREEN_WIDTH) {
			running = false;
		}
		// checa se a cabeça colide com a parede em cima
		if(y[0] < 0) {
			running = false;
		}
		// checa se a cabeça colide com a parede em baixo
		if(y[0] > SCREEN_HEIGHT) {
			running = false;
		}
		
		if(!running) {
			// se a cobra parou de andar, running vira falso e o contador para
			timer.stop();
		}
	}
	public void gameOver(Graphics g) {
		// fazer a pontuação aparecer na tela de game over
		g.setColor(Color.red);
		g.setFont( new Font("Comic Sans MS",Font.BOLD, 40));
		FontMetrics metrics1 = getFontMetrics(g.getFont());
		g.drawString("Pontuação: "+applesEaten, (SCREEN_WIDTH - metrics1.stringWidth("Pontuação: "+applesEaten))/2, g.getFont().getSize());
		//Texto de game over
		g.setColor(Color.red);
		g.setFont( new Font("Comic Sans MS",Font.BOLD, 75));
		FontMetrics metrics2 = getFontMetrics(g.getFont());
		g.drawString("Fim de jogo", (SCREEN_WIDTH - metrics2.stringWidth("Fim de jogo"))/2, SCREEN_HEIGHT/2);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		if(running) {
			move();
			checkApple();
			checkCollisions();
		}
		repaint();
		
	}
	
	public class MyKeyAdapter extends KeyAdapter {
		@Override
		public void keyPressed(KeyEvent e) {
			switch(e.getKeyCode()) {
			case KeyEvent.VK_LEFT: // input do teclado setinha esquerda detectado
				if(direction != 'R') { 
					direction = 'L'; // não permite a cobra mudar de direção contrária, tipo da esquerda pra direita, 180º
					// se a cobrinha não estiver indo para a direita, ela está habilitada a receber 
					// o input de ir pra esquerda. se não fizesse isso, ela iria se chocar ao trocar a direção
					// da direita para esquerda e acabaria o jogo
				}
				break;
			case KeyEvent.VK_RIGHT:
				if(direction != 'L') {
					direction = 'R';
				}
				break;
			case KeyEvent.VK_UP:
				if(direction != 'D') {
					direction = 'U';
				}
				break;
			case KeyEvent.VK_DOWN:
				if(direction != 'U') {
					direction = 'D';
				}
				break;
				
			}
		}
	}

}
