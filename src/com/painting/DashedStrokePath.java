/**
 * 
 */
package com.painting;

/**
 * @author Usuario
 *
 */
import java.awt.*;  
import java.awt.geom.*;  
import javax.swing.*;  
  
public class DashedStrokePath extends JComponent{  
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Dimension preferredSize = new Dimension(800,800);  
    public void paintComponent(Graphics g){  
        Graphics2D g2 = (Graphics2D)g;  
        Path2D.Double path = new Path2D.Double();  
        path.moveTo(300, 300);  
        path.lineTo(301, 301);  
        path.lineTo(302, 302);  
        path.lineTo(310, 310);  
        path.lineTo(400, 400);  
        path.closePath();  
        g2.setStroke(new BasicStroke(2.0f, BasicStroke.CAP_ROUND, BasicStroke.JOIN_ROUND, 10, new float[]{4,2}, 0));  
        g2.drawRect(200, 200, 24, 24);  
        g2.draw(path);  
        g2.setColor(Color.RED);  
        g2.drawLine(300, 400, 400, 500);  
    }  
    public Dimension getPreferredSize(){  
        return preferredSize;  
    }  
    public static void main(String[] ARGS) {  
        JFrame frame = new JFrame("Dashed Stroke Path");  
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  
        frame.getContentPane().add(new DashedStrokePath());  
        frame.pack();  
        frame.setVisible(true);  
    }  
} 