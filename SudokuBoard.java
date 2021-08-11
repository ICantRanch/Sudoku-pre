package Sudoku;

public class SudokuBoard {

	Block[][] board;
	
	public SudokuBoard(int[][] startingBoard){
		
		board = new Block[startingBoard.length][startingBoard[0].length];
		
		
		for (int i = 0; i < startingBoard.length; i++) {
			for (int j = 0; j < startingBoard[0].length; j++) {
				
				if(startingBoard[i][j] != 0) {
					board[i][j] = new Block(startingBoard[i][j]);
				}else {
					board[i][j] = new Block();
				}
			}
		}
	}
	
	
}
