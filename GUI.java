import java.awt.*;
import javax.swing.*;

public class GUI {

	public static void main(String[] args) {
		GUI g = new GUI();
		g.generateWindow(400, 400);

	}
	
	public void generateWindow(int xPixel, int yPixel) {
		JFrame frame = new JFrame("Voronoi Simulation");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel panel = new JPanel();
		//panel = generateGrid(xPixel, yPixel, panel);
		
		frame.add(panel);
		
		frame.setSize(xPixel, yPixel);		
		frame.setVisible(true);		
		
	}
	
	public JPanel generateGrid(int xPixel, int yPixel, JPanel panel){
		JButton[][] grid = new JButton[xPixel][yPixel];
		for(int i = 0; i < yPixel; i++) {
			for(int j = 0; j < xPixel; j++) {
				grid[j][i] = new JButton();
				grid[j][i].setBackground(Color.red);
				grid[j][i].setMaximumSize(new Dimension(1,1));
				panel.add(grid[j][i]);
			}
		}
		return panel;
	}
	
}
