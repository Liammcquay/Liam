package liam.util;

import java.text.DecimalFormat;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

/**
 * The <code>class</code> class simplifies code for ease of learning,
 * programming and debugging.<br>
 * 
 * @author Liam<br>
 * @version 1.0
 */
public class ConsoleProgram {

	/**
	 * This Scanner object is used to get input.
	 */
	private static Scanner scan = new Scanner(System.in);

	/**
	 * Prints a line to the console.
	 * 
	 * @param text
	 *            The text to print
	 * @param <T>
	 *            The generic type
	 */
	public static <T> void print(T text) {
		System.out.print(text);
	}

	/**
	 * Moves console caret to next line.
	 */
	public static void println() {
		System.out.println();
	}

	/**
	 * Prints a line and moves caret to next line.
	 * 
	 * @param text
	 *            The text to print
	 * @param <T>
	 *            The generic type
	 */
	public static <T> void println(T text) {
		System.out.println(text);
	}

	/**
	 * Reads String input from console.
	 * 
	 * @return The String input
	 */
	public static String readLine() {
		String s = scan.nextLine();
		return s;
	}

	/**
	 * Reads String input from console with prompt.
	 * 
	 * @param prompt
	 *            The prompt text
	 * @param <T>
	 *            The generic type
	 * @return The String input
	 */
	public static <T> String readLine(T prompt) {
		System.out.print(prompt);
		String s = scan.nextLine();
		return s;
	}

	/**
	 * Reads byte input from console.
	 * 
	 * @return The byte input or 0 if input invalid
	 */
	public static byte readByte() {
		try {
			byte b = scan.nextByte();
			scan.nextLine();

			return b;
		} catch (InputMismatchException e) {
			System.out.println("Caught: " + e + " Value has been set to 0 by default.");
			return 0;
		}
	}

	/**
	 * Reads byte input from console with radix.
	 * 
	 * @param radix
	 *            The radix used
	 * @return The byte input or 0 if input invalid
	 */
	public static byte readByte(int radix) {
		try {
			byte b = scan.nextByte(radix);
			scan.nextLine();

			return b;
		} catch (InputMismatchException e) {
			System.out.println("Caught: " + e + " Value has been set to 0 by default.");
			return 0;
		}
	}

	/**
	 * Reads byte input from console with prompt.
	 * 
	 * @param prompt
	 *            The prompt
	 * @param <T>
	 *            The generic type
	 * @return The byte input or 0 if input invalid
	 */
	public static <T> byte readByte(T prompt) {
		try {
			System.out.print(prompt);

			byte b = scan.nextByte();
			scan.nextLine();

			return b;
		} catch (InputMismatchException e) {
			System.out.println("Caught: " + e + " Value has been set to 0 by default.");
			return 0;
		}
	}

	/**
	 * Reads byte input from console with prompt and radix.
	 * 
	 * @param prompt
	 *            The prompt
	 * @param radix
	 *            The radix used
	 * @param <T>
	 *            The generic type
	 * @return The byte input or 0 if input invalid
	 */
	public static <T> byte readByte(T prompt, int radix) {
		try {
			System.out.print(prompt);

			byte b = scan.nextByte(radix);
			scan.nextLine();

			return b;
		} catch (InputMismatchException e) {
			System.out.println("Caught: " + e + " Value has been set to 0 by default.");
			return 0;
		}
	}

	/**
	 * Reads short input from console.
	 * 
	 * @return The short input or 0 if input invalid
	 */
	public static short readShort() {
		try {
			short s = scan.nextShort();
			scan.nextLine();

			return s;
		} catch (InputMismatchException e) {
			System.out.println("Caught: " + e + " Value has been set to 0 by default.");
			return 0;
		}
	}

	/**
	 * Reads short input from console with radix.
	 * 
	 * @param radix
	 *            The radix used
	 * @return The short input or 0 if input invalid
	 */
	public static short readShort(int radix) {
		try {
			short s = scan.nextShort(radix);
			scan.nextLine();

			return s;
		} catch (InputMismatchException e) {
			System.out.println("Caught: " + e + " Value has been set to 0 by default.");
			return 0;
		}
	}

	/**
	 * Reads short input from console with prompt.
	 * 
	 * @param prompt
	 *            The prompt text
	 * @param <T>
	 *            The generic type
	 * @return The short input or 0 if input invalid
	 */
	public static <T> short readShort(T prompt) {
		try {
			System.out.print(prompt);

			short s = scan.nextShort();
			scan.nextLine();

			return s;
		} catch (InputMismatchException e) {
			System.out.println("Caught: " + e + " Value has been set to 0 by default.");
			return 0;
		}
	}

	/**
	 * Reads short input from console with prompt and radix.
	 * 
	 * @param prompt
	 *            The prompt text
	 * @param radix
	 *            The radix used
	 * @param <T>
	 *            The generic type
	 * @return The short input or 0 if input invalid
	 */
	public static <T> short readShort(T prompt, int radix) {
		try {
			System.out.print(prompt);

			short s = scan.nextShort(radix);
			scan.nextLine();

			return s;
		} catch (InputMismatchException e) {
			System.out.println("Caught: " + e + " Value has been set to 0 by default.");
			return 0;
		}
	}

	/**
	 * Reads int input from console.
	 * 
	 * @return The int input or 0 if input invalid
	 */
	public static int readInt() {
		try {
			int i = scan.nextInt();
			scan.nextLine();

			return i;
		} catch (InputMismatchException e) {
			System.out.println("Caught: " + e + " Value has been set to 0 by default.");
			return 0;
		}
	}

	/**
	 * Reads int input from console with radix.
	 * 
	 * @param radix
	 *            The radix used
	 * @return The int input or 0 if input invalid
	 */
	public static int readInt(int radix) {
		try {
			int i = scan.nextInt(radix);
			scan.nextLine();

			return i;
		} catch (InputMismatchException e) {
			System.out.println("Caught: " + e + " Value has been set to 0 by default.");
			return 0;
		}
	}

	/**
	 * Reads int input from console with prompt.
	 * 
	 * @param prompt
	 *            The prompt text
	 * @param <T>
	 *            The generic type
	 * @return The int input or 0 if input invalid
	 */
	public static <T> int readInt(T prompt) {
		try {
			System.out.print(prompt);

			int i = scan.nextInt();
			scan.nextLine();

			return i;
		} catch (InputMismatchException e) {
			System.out.println("Caught: " + e + " Value has been set to 0 by default.");
			return 0;
		}
	}

	/**
	 * Reads int input from console with prompt and radix.
	 * 
	 * @param prompt
	 *            The prompt text
	 * @param radix
	 *            The radix used
	 * @param <T>
	 *            The generic type
	 * @return The int input or 0 if input invalid
	 */
	public static <T> int readInt(T prompt, int radix) {
		try {
			System.out.print(prompt);

			int i = scan.nextInt(radix);
			scan.nextLine();

			return i;
		} catch (InputMismatchException e) {
			System.out.println("Caught: " + e + " Value has been set to 0 by default.");
			return 0;
		}
	}

	/**
	 * Reads long input from console.
	 * 
	 * @return The long input or 0 if input invalid
	 */
	public static long readLong() {
		try {
			long l = scan.nextLong();
			scan.nextLine();

			return l;
		} catch (InputMismatchException e) {
			System.out.println("Caught: " + e + " Value has been set to 0 by default.");
			return 0;
		}
	}

	/**
	 * Reads long input from console.
	 * 
	 * @param radix
	 *            The radix used
	 * @return The long input or 0 if input invalid
	 */
	public static long readLong(int radix) {
		try {
			long l = scan.nextLong(radix);
			scan.nextLine();

			return l;
		} catch (InputMismatchException e) {
			System.out.println("Caught: " + e + " Value has been set to 0 by default.");
			return 0;
		}
	}

	/**
	 * Reads long input from console with prompt.
	 * 
	 * @param prompt
	 *            The prompt text.
	 * @param <T>
	 *            The generic type
	 * @return The long input or 0 if input invalid
	 */
	public static <T> long readLong(T prompt) {
		try {
			System.out.print(prompt);

			long l = scan.nextLong();
			scan.nextLine();

			return l;
		} catch (InputMismatchException e) {
			System.out.println("Caught: " + e + " Value has been set to 0 by default.");
			return 0;
		}
	}

	/**
	 * Reads long input from console with prompt.
	 * 
	 * @param prompt
	 *            The prompt text.
	 * @param radix
	 *            The radix used
	 * @param <T>
	 *            The generic type
	 * @return The long input or 0 if input invalid
	 */
	public static <T> long readLong(T prompt, int radix) {

		try {
			System.out.print(prompt);

			long l = scan.nextLong(radix);
			scan.nextLine();

			return l;
		} catch (InputMismatchException e) {
			System.out.println("Caught: " + e + " Value has been set to 0 by default.");
			return 0;
		}
	}

	/**
	 * Reads float input from console.
	 * 
	 * @return The float input or 0.0f if input invalid
	 */
	public static float readFloat() {
		try {
			float f = scan.nextFloat();
			scan.nextLine();

			return f;
		} catch (InputMismatchException e) {
			System.out.println("Caught: " + e + " Value has been set to 0 by default.");
			return 0.0f;
		}
	}

	/**
	 * Reads float input from console with prompt.
	 * 
	 * @param prompt
	 *            The prompt text
	 * @param <T>
	 *            The generic type
	 * @return The float input or 0.0f if input invalid
	 */
	public static <T> float readFloat(T prompt) {
		try {
			System.out.print(prompt);

			float f = scan.nextFloat();
			scan.nextLine();

			return f;
		} catch (InputMismatchException e) {
			System.out.println("Caught: " + e + " Value has been set to 0 by default.");
			return 0.0f;
		}
	}

	/**
	 * Reads double input from console.
	 * 
	 * @return The double input or 0.0 if input invalid
	 */
	public static double readDouble() {
		try {
			double d = scan.nextDouble();
			scan.nextLine();

			return d;
		} catch (InputMismatchException e) {
			System.out.println("Caught: " + e + " Value has been set to 0 by default.");
			return 0;
		}
	}

	/**
	 * Reads double input from console with prompt.
	 * 
	 * @param prompt
	 *            The prompt text
	 * @param <T>
	 *            The generic type
	 * @return The double input or 0.0 if input invalid
	 */
	public static <T> double readDouble(T prompt) {
		try {
			System.out.print(prompt);

			double d = scan.nextDouble();
			scan.nextLine();

			return d;
		} catch (InputMismatchException e) {
			System.out.println("Caught: " + e + " Value has been set to 0 by default.");
			return 0;
		}
	}

	/**
	 * Reads char input from console.
	 * 
	 * @return The char input or 0 if input invalid
	 */
	public static char readChar() {
		try {
			char c = scan.nextLine().charAt(0);
			return c;
		} catch (InputMismatchException e) {
			System.out.println("Caught: " + e + " Value has been set to null by default.");
			return 0;
		}
	}

	/**
	 * Reads char input from console with prompt.
	 * 
	 * @param prompt
	 *            The prompt text
	 * @param <T>
	 *            The generic type
	 * @return The char input or 0 if input invalid
	 */
	public static <T> char readChar(T prompt) {
		try {
			System.out.print(prompt);
			char c = scan.nextLine().charAt(0);
			return c;
		} catch (InputMismatchException e) {
			System.out.println("Caught: " + e + " Value has been set to null by default.");
			return 0;
		}
	}

	/**
	 * Reads boolean input from console.
	 * 
	 * @return The boolean input or false if input invalid
	 */
	public static boolean readBoolean() {
		try {
			boolean b = scan.nextBoolean();
			scan.nextLine();

			return b;
		} catch (InputMismatchException e) {
			System.out.println("Caught: " + e + " Value has been set to false by default.");
			return false;
		}
	}

	/**
	 * Reads boolean input from console with prompt.
	 * 
	 * @param prompt
	 *            The prompt text.
	 * @param <T>
	 *            The generic type
	 * @return The boolean input or false if input invalid
	 */
	public static <T> boolean readBoolean(T prompt) {
		try {
			System.out.print(prompt);

			boolean b = scan.nextBoolean();
			scan.nextLine();

			return b;
		} catch (InputMismatchException e) {
			System.out.println("Caught: " + e + " Value has been set to false by default.");
			return false;
		}
	}

	/**
	 * Pauses current thread.
	 * 
	 * @param time
	 *            The pause time in miliseconds.
	 */
	public static void pause(long time) {
		try {
			Thread.sleep(time);
		} catch (InterruptedException e) {
			Thread.currentThread().interrupt();
		}
	}

	/**
	 * @return The current date in the format dd/MM/uuuu
	 */
	public static String currentDate() {
		return LocalDate.now().format(DateTimeFormatter.ofPattern("dd/MM/uuuu"));
	}

	/**
	 * @return The current time in the format HH:mm
	 */
	public static String currentTime() {
		return LocalTime.now().format(DateTimeFormatter.ofPattern("HH:mm"));
	}

	/**
	 * Generates a random number within a specified range.
	 * 
	 * @param s
	 *            The smallest value
	 * @param l
	 *            The largest value
	 * @return The generated number or 0 if s is greater than l
	 */
	public static int getRandomNum(int s, int l) {
		if (s > l)
			return 0;

		Random rand = new Random();

		if (s == 0)
			return rand.nextInt(l + 1);

		if (s < 0)
			return s + rand.nextInt(l + 1 + Math.abs(s));

		if (s > 0)
			return s + rand.nextInt(l + 1 - s);

		else
			return 0;
	}
	
	/**
	 * Returns the String representation of a rounded float.
	 * 
	 * @param num The number to round
	 * @param dp The decimal places to round the number to.
	 * @return The rounded number as a String.
	 */
	public static String rounded(float num, int dp) {
		String fmt = "";
		
		if (dp < 0)
			return num + "";
		else if (dp == 0)
			fmt = "0";
		else
			fmt = "0.";
		
		for (int i = 0; i < dp; i++)
			fmt += "0";

		return new DecimalFormat(fmt).format(num);
	}
	
	/**
	 * Returns the String representation of a rounded double.
	 * 
	 * @param num The number to round
	 * @param dp The decimal places to round the number to.
	 * @return The rounded number as a String.
	 */
	public static String rounded(double num, int dp) {
		String fmt = "";
		
		if (dp < 0)
			return num + "";
		else if (dp == 0)
			fmt = "0";
		else
			fmt = "0.";
		
		for (int i = 0; i < dp; i++)
			fmt += "0";
		
		return new DecimalFormat(fmt).format(num);
	}

	/**
	 * Ends program.
	 */
	public static void endProgram() {
		System.exit(0);
	}

}