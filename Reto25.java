package mouredev;

public class Reto25 {
	
	//******************RETO JUEGO PIEDRA PAPEL O TIJERA**********************

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Caso practico
		Option Player1=Option.S;
		Option Player2=Option.P;
		
		GameMode game1 = new GameMode();
		
		int winner = game1.winner(Player1, Player2);
		
		switch(winner) {
		case 0:
			System.out.println("Tie");
			break;
		case 1:
			System.out.println("Player 1 win");
			break;
		case -1:
			System.out.println("Player 2 win");
			break;
		}

	}

	// Empezamos creando las opciones disponibles con una clase enum y un índice.

	public enum Option {

		R(0), P(1), S(2);

		private int index;

		private Option(int index) {
			this.index = index;
		}

		public int getIndex() {
			return index;
		}

	}

	/*
	 * Ahora vamos a crear un "tablero" donde la fila sera el Player 1 y la columna
	 * será el Player 2. Habrá 3 posibles resultados, siendo el 1 -> Fila gana, el
	 * -1 -> Columna gana y el 0 -> Empate (Tie) Por ejemplo, la posición [0,1]
	 * sería -1 (Columna gana)
	 */

	public static class GameMode {

		private int[][] table;

		public GameMode() {
			this.startTable();
		}

		private void startTable() {

			int[][] t = { { 0, -1, 1 }, { 1, 0, -1 }, { -1, 1, 0 } };

			this.table = t;
		}
		
		public int winner (Option Player1, Option Player2) {
			return this.table[Player1.getIndex()][Player2.getIndex()];
		}

	}
}
