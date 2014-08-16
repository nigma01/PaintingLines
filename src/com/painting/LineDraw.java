/**
 * 
 */
package com.painting;

import java.awt.*;
import java.awt.event.*;
import java.awt.geom.*;
import java.awt.geom.Path2D;

public class LineDraw extends Frame{
  

  /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
Line2D line1 = new Line2D.Double(0, 0, 60, 60);
  Line2D line2 = new Line2D.Double(60, 60, 100, 110);
  Line2D line3 = new Line2D.Double(100, 110, 160,150);
  Line2D line4 = new Line2D.Double(160, 150, 210,250);
  Path2D path = new Path2D.Double();
 // Point punto =  new Point();
  Stroke drawingStroke = new BasicStroke(2);
  

 public void paint(Graphics g) {
  Graphics2D graph = (Graphics2D)g;
  //graph.scale(100.0, 100.0);
  graph.setStroke(drawingStroke);
  graph.setPaint(Color.green);
  graph.draw(line1);
  graph.setPaint(Color.red);
  graph.draw(line2);
  graph.setPaint(Color.yellow);
  graph.draw(line3);
  graph.setPaint(Color.black);
  graph.draw(line4);
  
  path.moveTo(105, 105);
  path.setWindingRule(path.WIND_EVEN_ODD);
  //path.intersects(100, 150, 160,250);
  //path.curveTo(105, 105, 180, 250, 280, 175);  
  //path.quadTo(280, 175, 500, 580);
  path.lineTo(180, 250);
  path.lineTo(280,175);
  path.lineTo(500, 580);
  //path.quadTo(280, 175, 500, 580);
  /* Original
  Stroke s = new BasicStroke(4.0f,                      // Width
          BasicStroke.CAP_SQUARE,    // End cap
          BasicStroke.JOIN_MITER,    // Join style
          10.0f,                     // Miter limit
          new float[] {16.0f,20.0f}, // Dash pattern
          0.0f);                     // Dash phase
  */
  //modificado
  Stroke s = new BasicStroke(4.0f,                      // Width
          BasicStroke.CAP_SQUARE,    // End cap
          BasicStroke.JOIN_MITER,    // Join style
          10.0f,                     // Miter limit
          new float[] {16.0f,20.0f,2.0f,20.0f}, // Dash pattern
          0.0f);                     // Dash phase
  graph.setPaint(Color.blue);
  graph.setStroke(new BasicStroke(10.0f,BasicStroke.CAP_ROUND,BasicStroke.JOIN_ROUND,    // Join style
          25.0f,                     // Miter limit
          new float[] {15.0f,25.0f, 3.0f,25.0f}, // Dash pattern
          10.0f));
  
  graph.draw(path);
 }

  public static void main(String args[]) {
  Frame frame = new LineDraw();
  frame.addWindowListener(new WindowAdapter(){
  public void windowClosing(WindowEvent we){
  System.exit(0);
 }
  });
  frame.setSize(600, 600);
  frame.setVisible(true);
 }
  
  
}