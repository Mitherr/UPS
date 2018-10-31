/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app.nodes;

import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;

/**
 *
 * @author petrh
 */
public class BoardCell extends Rectangle {
    
    	private static final int SIDE = 30;
    
    public BoardCell() {
		super(SIDE, SIDE);
		this.setFill(Color.CYAN);
	}
    
}
