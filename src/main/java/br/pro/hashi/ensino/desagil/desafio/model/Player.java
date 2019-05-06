package br.pro.hashi.ensino.desagil.desafio.model;

public abstract class Player extends Element {
    protected final Board board;
    private boolean doMove;

    protected Player(int row, int col, Board board) {
        super(row, col);
        this.board = board;
        doMove = true;
    }

    protected void setDoMove(boolean doMove){
        this.doMove = doMove;
    }

    protected void move(int rowShift, int colShift) {
        if (doMove){
            row += rowShift;
            col += colShift;

        }

        else{
            row += 0;
            col += 0;
        }
     }
}
