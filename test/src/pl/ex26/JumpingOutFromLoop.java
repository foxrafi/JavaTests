package pl.ex26;

public class JumpingOutFromLoop {

	public JumpingOutFromLoop() {
	}

	public static void main(String[] args) {
		int i,j;
		
		outer : for(i = 1; i<3; i++)
		for(j=1; j<3; j++){
			if (j==2) continue outer;
			System.out.println("i=" + i + ", j=" + j);
		}
	}

}
