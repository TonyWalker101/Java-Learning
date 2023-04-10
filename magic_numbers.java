// program to practice variable manipulation

public class Magic {
	public static void main(String[] args) {
    //original number is myNumber below
		int myNumber = 4;

    int magicNumber = myNumber * myNumber;

    magicNumber += myNumber;
    magicNumber /= myNumber;
    magicNumber += 17;
    magicNumber -= myNumber;
    magicNumber /= 6;

    //answer should always be 3
    System.out.println(magicNumber);

	}
}