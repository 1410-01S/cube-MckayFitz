import java.util.Scanner;

public class Cube {

	public static class RubiksCube {

		char[][] Red;

		char[][] Blue;

		char[][] White;

		char[][] Green;

		char[][] Orange;

		char[][] Yellow;

		public RubiksCube() {

			Red = new char[][]{

				{'r', 'r', 'r'},

				{'r', 'r', 'r'},

				{'r', 'r', 'r'}};

				Orange = new char[][]{

					{'o', 'o', 'o'},

					{'o', 'o', 'o'},

					{'o', 'o', 'o'}};

					Blue = new char[][]{

						{'b', 'b', 'b'},

						{'b', 'b', 'b'},

						{'b', 'b', 'b'}};

						Green = new char[][]{

							{'g', 'g', 'g'},

							{'g', 'g', 'g'},

							{'g', 'g', 'g'}};

							Yellow = new char[][]{

								{'y', 'y', 'y'},

								{'y', 'y', 'y'},

								{'y', 'y', 'y'}};

								White = new char[][]{

									{'w', 'w', 'w'},

									{'w', 'w', 'w'},

									{'w', 'w', 'w'}};

		}

		public void show() {

			for (int i = 0; i < 3; i++) {

				for (int j = 0; j < 3; j++) {

					System.out.print(Red[i][j]);
					if(j < 2)
						System.out.print("|");
				}



				System.out.println();

			}
		}

		public void show1() {

			for (int i = 0; i < 3; i++) {

				for (int j = 0; j < 3; j++) {

					System.out.print(Blue[i][j]);
					if(j < 2)
						System.out.print("|");
				}



				System.out.println();

			}
		}

		public void show2() {

			for (int i = 0; i < 3; i++) {

				for (int j = 0; j < 3; j++) {

					System.out.print(Orange[i][j]);
					if(j < 2)
						System.out.print("|");
				}



				System.out.println();

			}
		}


		public void show3() {

			for (int i = 0; i < 3; i++) {

				for (int j = 0; j < 3; j++) {

					System.out.print(Green[i][j]);
					if(j < 2)
						System.out.print("|");
				}



				System.out.println();

			}
		}
		public void show4() {

			for (int i = 0; i < 3; i++) {

				for (int j = 0; j < 3; j++) {

					System.out.print(Yellow[i][j]);
					if(j < 2)
						System.out.print("|");
				}



				System.out.println();

			}
		}
		public void show5() {

			for (int i = 0; i < 3; i++) {

				for (int j = 0; j < 3; j++) {

					System.out.print(White[i][j]);
					if(j < 2)
						System.out.print("|");
				}



				System.out.println();

			}
		}

		public void rotateRedClockwise() {

			char[] temp = new char[3];

			for (int i = 0; i < 3; i++) {

				temp[i] = White[0][i];

			}

			White[0][2] = Green[0][2];

			White[1][2] = Green[1][2];

			White[2][2] = Green[2][2];

			Green[0][2] = Yellow[0][2];

			Green[1][2] = Yellow[1][2];

			Green[2][2] = Yellow[2][2];

			Yellow[0][2] = Blue[0][2];

			Yellow[1][2] = Blue[1][2];

			Yellow[2][2] = Blue[2][2];

			Blue[0][2] = temp[2];

			Blue[1][2] = temp[1];

			Blue[2][2] = temp[0];

			char tempCube;

			tempCube = Red[1][0];

			Red[1][0] = Red[2][1];

			Red[2][1] = Red[1][2];

			Red[1][2] = Red[0][1];

			Red[0][1] = tempCube;

			tempCube = Red[0][0];

			Red[0][0] = Red[2][0];

			Red[2][0] = Red[2][2];

			Red[2][2] = Red[0][2];

			Red[0][2] = tempCube;

		}

		public void rotateRedCounterClockwise() {

			char[] temp = new char[3];

			for (int i = 0; i < 3; i++) {

				temp[i] = White[0][i];

			}

			White[0][2] = Blue[0][2];

			White[1][2] = Blue[1][2];

			White[2][2] = Blue[2][2];

			Blue[0][2] = Yellow[0][2];

			Blue[1][2] = Yellow[1][2];

			Blue[2][2] = Yellow[2][2];

			Yellow[0][2] = Green[0][2];

			Yellow[1][2] = Green[1][2];

			Yellow[2][2] = Green[2][2];

			Green[0][2] = temp[2];

			Green[1][2] = temp[1];

			Green[2][2] = temp[0];

			char tempCube;

			tempCube = Red[1][0];

			Red[1][0] = Red[0][1];

			Red[0][1] = Red[1][2];

			Red[1][2] = Red[2][1];

			Red[2][1] = tempCube;

			tempCube = Red[0][0];

			Red[0][0] = Red[2][0];

			Red[2][0] = Red[2][2];

			Red[2][2] = Red[2][0];

			Red[2][0] = tempCube;

		}

		public void rotateYellowClockwise() {

			char[] temp = new char[3];

			for (int i = 0; i < 3; i++) {

				temp[i] = Blue[0][i];

			}

			Blue[0][0] = Red[0][0];

			Blue[0][1] = Red[0][1];

			Blue[0][2] = Red[0][2];

			Red[0][0] = Green[0][0];

			Red[0][1] = Green[0][1];

			Red[0][2] = Green[0][2];

			Green[0][0] = Orange[0][0];

			Green[0][1] = Orange[0][1];

			Green[0][2] = Orange[0][2];

			Orange[0][0] = temp[2];

			Orange[0][1] = temp[1];

			Orange[0][2] = temp[0];

			char tempCube;

			tempCube = Yellow[1][0];

			Yellow[1][0] = Yellow[2][1];

			Yellow[2][1] = Yellow[1][2];

			Yellow[1][2] = Yellow[0][1];

			Yellow[0][1] = tempCube;

			tempCube = Yellow[0][0];

			Yellow[0][0] = Yellow[2][0];

			Yellow[2][0] = Yellow[2][2];

			Yellow[2][2] = Yellow[0][2];

			Yellow[0][2] = tempCube;

		}

		public void rotateYellowCounterClockwise() {

			char[] temp = new char[3];

			for (int i = 0; i < 3; i++) {

				temp[i] = Blue[0][i];

			}

			Blue[0][0] = Orange[0][0];

			Blue[0][1] = Orange[0][1];

			Blue[0][2] = Orange[0][2];

			Orange[0][0] = Green[0][0];

			Orange[0][1] = Green[0][1];

			Orange[0][2] = Green[0][2];

			Green[0][0] = Red[0][0];

			Green[0][1] = Red[0][1];

			Green[0][2] = Red[0][2];

			Red[0][0] = temp[2];

			Red[0][1] = temp[1];

			Red[0][2] = temp[0];

			char tempCube;

			tempCube = Yellow[1][0];

			Yellow[1][0] = Yellow[0][1];

			Yellow[0][1] = Yellow[1][2];

			Yellow[1][2] = Yellow[2][1];

			Yellow[2][1] = tempCube;

			tempCube = Yellow[0][0];

			Yellow[0][0] = Yellow[2][0];

			Yellow[2][0] = Yellow[2][2];

			Yellow[2][2] = Yellow[2][0];

			Yellow[2][0] = tempCube;

		}

		public void rotateWhiteClockwise() {

			char[] temp = new char[3];

			for (int i = 0; i < 3; i++) {

				temp[i] = Red[0][i];

			}

			Red[2][0] = Blue[2][0];

			Red[2][1] = Blue[2][1];

			Red[2][2] = Blue[2][2];

			Blue[2][0] = Orange[2][0];

			Blue[2][1] = Orange[2][1];

			Blue[2][2] = Orange[2][2];

			Orange[2][0] = Green[2][0];

			Orange[2][1] = Green[2][1];

			Orange[2][2] = Green[2][2];

			Green[2][0] = temp[2];

			Green[2][1] = temp[1];

			Green[2][2] = temp[0];

			char tempCube;

			tempCube = White[1][0];

			White[1][0] = White[2][1];

			White[2][1] = White[1][2];

			White[1][2] = White[0][1];

			White[0][1] = tempCube;

			tempCube = White[0][0];

			White[0][0] = White[2][0];

			White[2][0] = White[2][2];

			White[2][2] = White[0][2];

			White[0][2] = tempCube;

		}

		public void rotateWhiteCounterClockwise() {

			char[] temp = new char[3];

			for (int i = 0; i < 3; i++) {

				temp[i] = Red[0][i];

			}

			Red[2][0] = Green[2][0];

			Red[2][1] = Green[2][1];

			Red[2][2] = Green[2][2];

			Green[2][0] = Orange[2][0];

			Green[2][1] = Orange[2][1];

			Green[2][2] = Orange[2][2];

			Orange[2][0] = Blue[2][0];

			Orange[2][1] = Blue[2][1];

			Orange[2][2] = Blue[2][2];

			Blue[2][0] = temp[2];

			Blue[2][1] = temp[1];

			Blue[2][2] = temp[0];

			char tempCube;

			tempCube = White[1][0];

			White[1][0] = White[0][1];

			White[0][1] = White[1][2];

			White[1][2] = White[2][1];

			White[2][1] = tempCube;

			tempCube = White[0][0];

			White[0][0] = White[2][0];

			White[2][0] = White[2][2];

			White[2][2] = White[2][0];

			White[2][0] = tempCube;

		}

		public void rotateGreenClockwise() {

			char[] temp = new char[3];

			for (int i = 0; i < 3; i++) {

				temp[i] = Yellow[i][0];

			}

			Yellow[0][2] = Red[0][2];

			Yellow[1][2] = Red[1][2];

			Yellow[2][2] = Red[2][2];

			Red[0][2] = White[0][2];

			Red[1][2] = White[1][2];

			Red[2][2] = White[2][2];

			White[0][2] = Orange[0][2];

			White[1][2] = Orange[1][2];

			White[2][2] = Orange[2][2];

			Orange[0][2] = temp[2];

			Orange[1][2] = temp[1];

			Orange[2][2] = temp[0];

			char tempCube;

			tempCube = Green[0][1];

			Green[1][0] = Green[2][1];

			Green[2][1] = Green[1][2];

			Green[1][2] = Green[0][1];

			Green[0][1] = tempCube;

			tempCube = Green[0][0];

			Green[0][0] = Green[2][0];

			Green[2][0] = Green[2][2];

			Green[2][2] = Green[0][2];

			Green[0][2] = tempCube;

		}

		public void rotateGreenCounterClockwise() {

			char[] temp = new char[3];

			for (int i = 0; i < 3; i++) {

				temp[i] = Yellow[i][0];

			}

			Yellow[0][2] = Orange[0][2];

			Yellow[1][2] = Orange[1][2];

			Yellow[2][2] = Orange[2][2];

			Orange[0][2] = White[0][2];

			Orange[1][2] = White[1][2];

			Orange[2][2] = White[2][2];

			White[0][2] = Red[0][2];

			White[1][2] = Red[1][2];

			White[2][2] = Red[2][2];

			Red[0][2] = temp[2];

			Red[1][2] = temp[1];

			Red[2][2] = temp[0];

			char tempCube;

			tempCube = Green[0][1];

			Green[1][0] = Green[0][1];

			Green[0][1] = Green[1][2];

			Green[1][2] = Green[2][1];

			Green[2][1] = tempCube;

			tempCube = Green[0][0];

			Green[0][0] = Green[2][0];

			Green[2][0] = Green[2][2];

			Green[2][2] = Green[2][0];

			Green[2][0] = tempCube;

		}

		public void rotateBlueClockwise() {

			char[] temp = new char[3];

			for (int i = 0; i < 3; i++) {

				temp[i] = Yellow[i][0];

			}

			Yellow[0][0] = Orange[0][0];

			Yellow[1][0] = Orange[1][0];

			Yellow[2][0] = Orange[2][0];

			Orange[0][0] = White[0][0];

			Orange[1][0] = White[1][0];

			Orange[2][0] = White[2][0];

			White[0][0] = Red[0][0];

			White[1][0] = Red[1][0];

			White[2][0] = Red[2][0];

			Red[0][0] = temp[2];

			Red[1][0] = temp[1];

			Red[2][0] = temp[0];

			char tempCube;

			tempCube = Blue[1][0];

			Blue[1][0] = Blue[2][1];

			Blue[2][1] = Blue[1][2];

			Blue[1][2] = Blue[0][1];

			Blue[0][1] = tempCube;

			tempCube = Blue[0][0];

			Blue[0][0] = Blue[2][0];

			Blue[2][0] = Blue[2][2];

			Blue[2][2] = Blue[0][2];

			Blue[0][2] = tempCube;

		}

		public void rotateBlueCounterClockwise() {

			char[] temp = new char[3];

			for (int i = 0; i < 3; i++) {

				temp[i] = Yellow[i][0];

			}

			Yellow[0][0] = Red[0][0];

			Yellow[1][0] = Red[1][0];

			Yellow[2][0] = Red[2][0];

			Red[0][0] = White[0][0];

			Red[1][0] = White[1][0];

			Red[2][0] = White[2][0];

			White[0][0] = Orange[0][0];

			White[1][0] = Orange[1][0];

			White[2][0] = Orange[2][0];

			Orange[0][0] = temp[2];

			Orange[1][0] = temp[1];

			Orange[2][0] = temp[0];

			char tempCube;

			tempCube = Blue[0][1];

			Blue[1][0] = Blue[0][1];

			Blue[0][1] = Blue[1][2];

			Blue[1][2] = Blue[2][1];

			Blue[2][1] = tempCube;

			tempCube = Blue[0][0];

			Blue[0][0] = Blue[2][0];

			Blue[2][0] = Blue[2][2];

			Blue[2][2] = Blue[2][0];

			Blue[2][0] = tempCube;

		}

		public void rotateOrangeClockwise() {

			char[] temp = new char[3];

			for (int i = 0; i < 3; i++) {

				temp[i] = White[0][i];

			}

			White[0][0] = Blue[0][0];

			White[1][0] = Blue[1][0];

			White[2][0] = Blue[2][0];

			Blue[0][0] = Yellow[0][0];

			Blue[1][0] = Yellow[1][0];

			Blue[2][0] = Yellow[2][0];

			Yellow[0][0] = Green[0][0];

			Yellow[1][0] = Green[1][0];

			Yellow[2][0] = Green[2][0];

			Green[0][0] = temp[2];

			Green[1][0] = temp[1];

			Green[2][0] = temp[0];

			char tempCube;

			tempCube = Orange[0][1];

			Orange[1][0] = Orange[2][1];

			Orange[2][1] = Orange[1][2];

			Orange[1][2] = Orange[0][1];

			Orange[0][1] = tempCube;

			tempCube = Orange[0][0];

			Orange[0][0] = Orange[2][0];

			Orange[2][0] = Orange[2][2];

			Orange[2][2] = Orange[0][2];

			Orange[0][2] = tempCube;

		}

		public void rotateOrangeCounterClockwise() {

			char[] temp = new char[3];

			for (int i = 0; i < 3; i++) {

				temp[i] = White[0][i];

			}

			White[0][0] = Green[0][0];

			White[1][0] = Green[1][0];

			White[2][0] = Green[2][0];

			Green[0][0] = Yellow[0][0];

			Green[1][0] = Yellow[1][0];

			Green[2][0] = Yellow[2][0];

			Yellow[0][0] = Blue[0][0];

			Yellow[1][0] = Blue[1][0];

			Yellow[2][0] = Blue[2][0];

			Blue[0][0] = temp[2];

			Blue[1][0] = temp[1];

			Blue[2][0] = temp[0];

			char tempCube;

			tempCube = Orange[0][1];

			Orange[1][0] = Orange[0][1];

			Orange[0][1] = Orange[1][2];

			Orange[1][2] = Orange[2][1];

			Orange[2][1] = tempCube;

			tempCube = Orange[0][0];

			Orange[0][0] = Orange[2][0];

			Orange[2][0] = Orange[2][2];

			Orange[2][2] = Orange[2][0];

			Orange[2][0] = tempCube;

		}

	}

	public static void main(String[] args){
		RubiksCube cube = new RubiksCube();
		Scanner in = new Scanner(System.in);

		cube.show();
		System.out.println();
		cube.show1();
		System.out.println();
		cube.show2();
		System.out.println();
		cube.show3();
		System.out.println();
		cube.show4();
		System.out.println();
		cube.show5();
		System.out.println();
		System.out.println("Make a Move:");

		String x = in.nextLine();
		String[] rot = x.split(" ");
		for (String word : rot) {
			switch (word.toLowerCase()) {
			case "u":
				cube.rotateYellowClockwise();
				break;
			case "u'":
				cube.rotateYellowCounterClockwise();
				break;
			case "d":
				cube.rotateWhiteClockwise();
				break;
			case "d'":
				cube.rotateWhiteCounterClockwise();
				break;
			case "r":
				cube.rotateRedClockwise();
				break;
			case "r'":
				cube.rotateRedCounterClockwise();
				break;
			case "l":
				cube.rotateOrangeClockwise();
				break;
			case "l'":
				cube.rotateOrangeCounterClockwise();
				break;
			case "f":
				cube.rotateBlueClockwise();
				break;
			case "f'":
				cube.rotateBlueCounterClockwise();
				break;
			case "b":
				cube.rotateGreenClockwise();
				break;
			case "b'":
				cube.rotateGreenCounterClockwise();
				break;
			default:
				System.out.println("Please enter a correct rotation:");
			}
		}
		cube.show();
		System.out.println();
		cube.show1();
		System.out.println();
		cube.show2();
		System.out.println();
		cube.show3();
		System.out.println();
		cube.show4();
		System.out.println();
		cube.show5();
		System.out.println();

		String[] chars = x.split(" ");

		for (int i = 0; i < chars.length / 2; i++) {
			String temp = chars[i];
			chars[i] = chars[chars.length - 1 - i];
			chars[chars.length - 1 - i] = temp;
		}

		for (int i = 0; i < chars.length; i++) {
			String c = chars[i];
			if (c.endsWith("'")) {
				chars[i] = c.substring(0, c.length() - 1);
			} else {
				chars[i] = c + "'";
			}
		}

		String output = String.join(" ", chars);

		System.out.println("Moves to solve: " + output);
		in.close();
	}

}
