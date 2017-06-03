/*
 * Created on 12 sept. 2008
 *
 * TODO To change the template for this generated file go to
 * Window - Preferences - Java - Code Style - Code Templates
 */
package logogui;

import java.util.HashMap;
import java.util.Map;

import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

public class Traceur {
	private GraphicsContext gc;
	private double initx = 300, inity = 300;   // position initiale
	private double posx = initx, posy = inity; // position courante
	private int angle = 90;
	private double teta;
	private boolean write = true;
	private Map<Integer, Color> colors;
	private Color currentColor = Color.BLACK;
	
	public Traceur() {
		setTeta();
		colors = new HashMap<>();
		colors.put(0, Color.BLACK);
		colors.put(1, Color.RED);
		colors.put(2, Color.GREEN);
		colors.put(3, Color.YELLOW);
		colors.put(4, Color.BLUE);
		colors.put(5, Color.VIOLET);
		colors.put(6, Color.AQUAMARINE);
		colors.put(7, Color.WHITE);
	}

	public void setGraphics(Canvas g) {	
		gc = g.getGraphicsContext2D();
		gc.setStroke(currentColor);
		gc.setLineWidth(1.0);
	}
	
	private int toInt(double a) {
		return (int) Math.round(a);
	}
	
	public void avance(double r) {
		double a = posx + r * Math.cos(teta) ;
		double b = posy - r * Math.sin(teta) ;
		int x1 = toInt(posx);
		int y1 = toInt(posy);
		int x2 = toInt(a);
		int y2 = toInt(b);
		if(write) {
			gc.strokeLine(x1, y1, x2, y2);
		}
		posx = a;
		posy = b;
	}
	
	public void td(double r) {
		angle = (angle - toInt(r)) % 360;
		setTeta();
	}
	
	private void setTeta() {
		teta = Math.toRadians(angle);
	}

	public void tg(double r) {
		angle = (angle + toInt(r)) % 360;
		setTeta();
	}

	public void leve() {
		write = false;
	}

	public void pose() {
		write = true;
	}

	public void clear() {
		gc.clearRect(0, 0, 1000, 1000);
	}

	public void recule(double d) {
		tg(180);
		avance(d);
		tg(180);
	}

	public void couleur(double attValue) {
		int color = (int)attValue;
		if(color < 0 || color > 7) throw new IllegalArgumentException("Color out of bounds");
		currentColor = colors.get(color);
		gc.setStroke(currentColor);
	}

	public void pos(double x, double y) {
		posx = x;
		posy = y;
	}
}
