/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app.nodes;

import app.utils.Position;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.StrokeType;

/**
 *
 * @author petrh
 */
public class Board extends GridPane {

    private static final int COLLUMS = 28;
    private static final int ROWS = 19;

    private BoardCell all_cells[][] = new BoardCell[COLLUMS][ROWS];
    private BoardCell valid_cells[] = new BoardCell[COLLUMS * ROWS];

    public Board() {

        super();

        for (int i = 0; i < COLLUMS; i++) {
            for (int j = 0; j < ROWS; j++) {
                BoardCell temp = new BoardCell();
                temp.setStrokeType(StrokeType.INSIDE);
                all_cells[i][j] = temp;
                this.add(temp, i, j);
            }
        }

        Position actual = new Position(12, 10, 0);
        valid_cells[actual.getBoardPos()] = all_cells[12][10];
        actual.incrementBoardPos();

        goLeft(actual, 2);
        goUp(actual, 3);

        int first = 10;
        int second = 4;

        for (int i = 1; i <= 8; i++) {

            goRight(actual, first++);
            goDown(actual, second++);
            goLeft(actual, first++);

            if (i != 8) {

                goUp(actual, second++);

            }
        }
        
        valid_cells[actual.getBoardPos()] = all_cells[1][18];
        actual.incrementBoardPos();
        
        goUp(actual,7);
        goLeft(actual,2);
        
        

        createBez();
        createKan();
        createKom();
        createPos();
        createUV();
        createPOL();
        createGEN();

    }

    public Position goUp(Position actual, int number) {

        for (int i = 1; i <= number; i++) {
            actual.setY(actual.getY() - 1);
            valid_cells[actual.getBoardPos()] = all_cells[actual.getX()][actual.getY()];
            actual.incrementBoardPos();
        }
        return actual;
    }

    public Position goDown(Position actual, int number) {

        for (int i = 1; i <= number; i++) {
            actual.setY(actual.getY() + 1);
            valid_cells[actual.getBoardPos()] = all_cells[actual.getX()][actual.getY()];
            actual.incrementBoardPos();
        }
        return actual;
    }

    public Position goLeft(Position actual, int number) {

        for (int i = 1; i <= number; i++) {
            actual.setX(actual.getX() - 1);
            valid_cells[actual.getBoardPos()] = all_cells[actual.getX()][actual.getY()];
            actual.incrementBoardPos();
        }
        return actual;
    }

    public Position goRight(Position actual, int number) {

        for (int i = 1; i <= number; i++) {
            actual.setX(actual.getX() + 1);
            valid_cells[actual.getBoardPos()] = all_cells[actual.getX()][actual.getY()];
            actual.incrementBoardPos();
        }
        return actual;
    }

    public void createBez() {

        for (int i = 0; i < 108; i++) {

            if (valid_cells[i] == null) {
                break;
            }

            valid_cells[i].setFill(Color.WHITE);
            valid_cells[i].setStroke(Color.BLACK);

        }
    }
    
     public void createKan() {

        for (int i = 108; i < 126; i++) {

            if (valid_cells[i] == null) {
                break;
            }

            valid_cells[i].setFill(Color.PINK);
            valid_cells[i].setStroke(Color.BLACK);

        }
    }
     
     public void createKom() {

        for (int i = 126; i < 178; i++) {

            if (valid_cells[i] == null) {
                break;
            }

            valid_cells[i].setFill(Color.RED);
            valid_cells[i].setStroke(Color.BLACK);

        }
    }
     
     public void createPos() {

        for (int i = 178; i < 238 ; i++) {

            if (valid_cells[i] == null) {
                break;
            }

            valid_cells[i].setFill(Color.GREEN);
            valid_cells[i].setStroke(Color.BLACK);

        }
    }
     
    public void createUV() {

        for (int i = 238; i < 297 ; i++) {

            if (valid_cells[i] == null) {
                break;
            }

            valid_cells[i].setFill(Color.YELLOW);
            valid_cells[i].setStroke(Color.BLACK);

        }
    }
      
    public void createPOL() {

        for (int i = 297; i < 373 ; i++) {

            if (valid_cells[i] == null) {
                break;
            }

            valid_cells[i].setFill(Color.BLUE);
            valid_cells[i].setStroke(Color.BLACK);

        }
    }
    
    public void createGEN() {

        for (int i = 373; i < 461; i++) {

            valid_cells[i].setFill(Color.BROWN);
            valid_cells[i].setStroke(Color.BLACK);

        }
    }
      
      




}
