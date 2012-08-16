package oppgaver;

public class Oppgave1 {

	// if m[i][j] > 0
	// you can move from pos i to pos m[i][j]
	private int[][] m = {
	/* 1 */{ 2, 4, 0, 0, 0 },
	/* 2 */{ 1, 3, 5, 0, 0 },
	/* 3 */{ 2, 6, 0, 0, 0 },
	/* 4 */{ 1, 5, 7, 0, 0 },
	/* 5 */{ 2, 4, 6, 8, 0 },
	/* 6 */{ 3, 5, 9, 0, 0 },
	/* 7 */{ 4, 9, 0, 0, 0 },
	/* 8 */{ 5, 7, 9, 0, 0 },
	/* 9 */{ 6, 8, 0, 0, 0 }, };

	public int finnMinstAntallTrekk(int[] utgangspos) {
		int moves = 0;

		boolean done = false;
		while (!done) {
			for (int i : utgangspos) {
				if (i == 9) {

				}
			}
		}

		return moves;
	}

}
