package liam.io;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.nio.file.Path;

/**
 * The ObjectIO class provides functions to
 * easily read and write object files.
 * 
 * @author Liam
 */
public class ObjectIO {

	/**
	 * This method will read an object file in a
	 * location and return the object.
	 * 
	 * @param path The File to read.
	 * @return The object read.
	 */
	public static Object read(File path) {
		try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(path))) {
			return ois.readObject();
		} catch (IOException | ClassNotFoundException ex) {
			ex.printStackTrace();
			return null;
		}
	}

	/**
	 * This method overloads the read(File) method,
	 * with a String param for the path.
	 * 
	 * @param path The path to the file to read.
	 * @return The object read.
	 */
	public static Object read(String path) {
		return read(new File(path));
	}

	/**
	 * This method will read an object file in a
	 * location and return the object, using a Path
	 * object.
	 * 
	 * @param path The Path to read.
	 * @return The object read.
	 */
	public static Object read(Path path) {
		try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(path.toFile()))) {
			return ois.readObject();
		} catch (IOException | ClassNotFoundException ex) {
			ex.printStackTrace();
			return null;
		}
	}

	/**
	 * This method will write an object to a
	 * location.
	 * 
	 * @param object The object to be written.
	 * @param path The File to be written.
	 */
	public static void write(Object object, File path) {
		if (!(object instanceof Serializable)) {
			System.err.println("Error: object is not serializable.");
			return;
		}

		try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(path))) {
			oos.writeObject(object);
		} catch (IOException ex) {
			ex.printStackTrace();
		}
	}

	/**
	 * This method overloads the write(Object, File)
	 * method, with a String param for the path.
	 * 
	 * @param object The object to be written.
	 * @param path The path of the file to be written.
	 */
	public static void write(Object object, String path) {
		write(object, new File(path));
	}

	/**
	 * This method will write an object to a
	 * location, using a Path object.
	 * 
	 * @param object The object to be written.
	 * @param path The Path to be written.
	 */
	public static void write(Object object, Path path) {
		if (!(object instanceof Serializable)) {
			System.err.println("Error: object is not serializable.");
			return;
		}

		try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(path.toFile()))) {
			oos.writeObject(object);
		} catch (IOException ex) {
			ex.printStackTrace();
		}
	}

}
