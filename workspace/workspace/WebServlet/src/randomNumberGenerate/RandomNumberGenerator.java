package randomNumberGenerate;

import java.util.Random;

public class RandomNumberGenerator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public static int returnRandomNumber(int length){
		return new Random().nextInt(length);
	}

}
