/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app.utils;

/**
 *
 * @author petrh
 */
public class Position {
    
   private int x;
   private int y;
   private int boardPos;
   
   public Position(int x,int y, int boardPos){
       this.x = x;
       this.y = y;
       this.boardPos = boardPos;
   }

    public int getBoardPos() {
        return boardPos;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void setBoardPos(int boardPos) {
        this.boardPos = boardPos;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }
    
    public void incrementBoardPos(){
        this.boardPos++;
    }
    
}
