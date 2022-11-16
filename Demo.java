/*
 * An application that can tell you what chords are in a given key
 */
import java.util.Scanner;
import java.util.ArrayList;

public class Demo {
	public Demo() {
		
	}
	static int x = 5;
	public static void main(String[] args) {
		int[] CHROMATIC = {1,2,3,4,5,6,7,8,9,10,11,12};
		
		
		

		Scanner keyboard = new Scanner(System.in);
		System.out.println("Enter the notes in a Scale seperated by a space:");
		String userInput = keyboard.nextLine();

		//System.out.println("The current key is: C Major.");
		String[] userScale = new String[7];
		userScale = userInput.split(" "); 
		displayScale(userScale);
		displayScale(convertToSemi(userScale));
		
		System.out.println("Major Chords allowed in the scale:");
		System.out.println(Chords.major(convertToSemi(userScale)));
		
		System.out.println("Minor Chords allowed in the scale:");
		System.out.println(Chords.minor(convertToSemi(userScale)));
		
		System.out.println("Diminished Chords allowed in the scale:");
		System.out.println(Chords.diminished(convertToSemi(userScale)));
		
		System.out.println("Augmented Chords allowed in the scale:");
		System.out.println(Chords.augmented(convertToSemi(userScale)));

		
		
	}

	public static void displayScale(String[] scale) {
		for (String val: scale)
			System.out.print(val + " ");
		System.out.print("\n");
		
	}
	public static void displayScale(int[] scale) {
		for (int val: scale)
			System.out.print(val+ " ");
		System.out.print("\n");
		
	}
	
	public static int[] convertToSemi(String[] scale) {
		int[] scaleSemi = new int[scale.length];
		for(int i =0; i < scale.length; i++) {
			switch (scale[i]) {
				case "C": scaleSemi[i] = 0;
					break;
				case "C#": scaleSemi[i] = 1;
					break;
				case "Db": scaleSemi[i] = 1;
					break;
				case "D": scaleSemi[i] = 2;
					break;
				case "D#": scaleSemi[i] = 3;
					break;
				case "Eb": scaleSemi[i] = 3;
					break;
				case "E": scaleSemi[i] = 4;
					break;
				case "F": scaleSemi[i] = 5;
					break;
				case "F#": scaleSemi[i] = 6;
					break;
				case "Gb": scaleSemi[i] = 6;
					break;
				case "G": scaleSemi[i] = 7;
					break;
				case "G#": scaleSemi[i] = 8;
					break;
				case "Ab": scaleSemi[i] = 8;
					break;
				case "A": scaleSemi[i] = 9;
					break;
				case "A#": scaleSemi[i] = 10;
					break;
				case "Bb": scaleSemi[i] = 10;
					break;
				case "B": scaleSemi[i] = 11;
					break;
				default:
					break;

			}
		}
		return scaleSemi;
	}

}
