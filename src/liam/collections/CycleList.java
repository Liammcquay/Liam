package liam.collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

/**
 * The CycleList class allows the user to store a list
 * of values and retrieve the next value in a cycle.
 * This may come in handy when writing a program like this,
 * for example:<br>
 * 
 * <pre>
 * {@code
 * 
 * ArrayList<String> people = new ArrayList<>();
 * 	
 * people.add("Saksham");
 * people.add("Beatrice");			 
 * people.add("Kieran");
 * people.add("Matt");
 * people.add("Rohan");
 * people.add("Ariq");
 * people.add("Alice");
 * people.add("Suyash");
 * people.add("Koko");
 * people.add("Zahra");
 * people.add("Ben");
 * people.add("Kristine");
 * 
 * CycleList<String> teams = new CycleList<>();
 * 
 * teams.add("North");
 * teams.add("East");
 * teams.add("West");
 * teams.add("South");
 * 
 * System.out.printf("%-20s%s%n", "Name:", "Team:");
 * 
 * for (String person : people)
 * 
 *     System.out.printf("%-20s%s%n", person, teams.next());
 * 
 * }
 * </pre>
 * The program above prints each name in the people list as well
 * as the team they are in. When {@code teams.next()} is called, the
 * next value in the teams list is fetched.
 * 
 * @author Liam
 */

public class CycleList<T> implements Collection<T> {

	/**
	 * We'll store elements in an {@link ArrayList} class.
	 */

	private ArrayList<T> elements;

	/**
	 * The index of the next value to be fetched. It is
	 * initially set to 0.
	 */

	private int nextIndex;

	/**
	 * A constructor for the CycleList with no params. 
	 * This constructor will initialize the elements
	 * {@link ArrayList} and set nextIndex to 0.
	 */

	public CycleList() {
		elements = new ArrayList<>();
		nextIndex = 0;
	}

	/**
	 * A constructor for the CycleList with a varargs param. 
	 * This constructor will call the no-param constructor
	 * then add the varargs into the {@link ArrayList}.<br><br>
	 * 
	 * @param values The values to be added.
	 */

	public CycleList(List<? extends T> values) {
		this();
		for (T value : values)
			elements.add(value);
	}

	/**
	 * This method will add a value at a specified
	 * position into the {@link ArrayList}.
	 * 
	 * @param index The position at which the
	 * value will be added.
	 * 
	 * @param value The value to be added.
	 */

	public void add(int index, T value) {
		elements.add(index, value);
	}

	/**
	 * This method will add a list of values to
	 * the end of the {@link ArrayList}.<br><br>
	 * 
	 * @param values The values to be added.
	 */

	public void addAll(List<? extends T> values) {
		for (T value : values)
			elements.add(value);
	}

	/**
	 * This method will add a list of values at a 
	 * specified position into the {@link ArrayList}.<br><br>
	 * 
	 * @param index The position at which the
	 * value will be added.
	 * 
	 * @param values The values to be added.
	 */

	public void addAll(int index, List<? extends T> values) {
		for (T value : values) {
			elements.add(index, value);
			index++;
		}
	}

	/**
	 * This method removes the value at a
	 * specified index in the {@link ArrayList}.
	 * 
	 * @param index The index at which the value
	 * to be removed is located.
	 */

	public void remove(int index) {
		elements.remove(index);
	}

	/**
	 * This method will return the value at the
	 * nextIndex position of the {@link ArrayList}
	 * and then increment it.
	 * 
	 * @return The next value in the list.
	 */

	public T next() {
		T t = elements.get(nextIndex);
		incrementNext();

		return t;
	}

	/**
	 * This method will return the value at the
	 * nextIndex position of the {@link ArrayList}
	 * without incrementing it.
	 * 
	 * @return The next value in the list.
	 */

	public T peekNext() {
		return elements.get(nextIndex);
	}

	/**
	 * This method will set the value of nextIndex
	 * to 0 so it points to the first value of the
	 * {@link ArrayList}.
	 */

	public void resetNext() {
		nextIndex = 0;
	}

	/**
	 * This method will set the value of nextIndex
	 * to a specified number. An {@link IndexOutOfBoundsException}
	 * is thrown if the index specified is out of range
	 * {@code (index < 0 || index >= elements.size())}. 
	 * 
	 * @param index The new index to be set.
	 */

	public void setNext(int index) {
		if (index < 0 || index >= elements.size())
			throw new IndexOutOfBoundsException();
		else
			nextIndex = index;
	}

	/**
	 * This method will randomize the order in which
	 * the elements are stored.
	 */

	public void randomize() {
		ArrayList<T> random = new ArrayList<>();
		int size = elements.size();

		for (int i = 0; i < size; i++)
			random.add(elements.remove(new Random().nextInt(elements.size())));

		elements = random;
	}

	/**
	 * This method will return the number of elements in the list.
	 * 
	 * @return Number of elements in the {@link ArrayList}.
	 */

	public int size() {
		return elements.size();
	}

	/**
	 * This method will return the {@link ArrayList} used to
	 * store all the values.
	 * 
	 * @return The values in an ArrayList.
	 */

	public ArrayList<T> toArrayList() {
		return elements;
	}

	/**
	 * This method will increment nextIndex. If nextIndex 
	 * is equal to the last index of the {@link ArrayList} 
	 * ({@code nextIndex == elements.size() - 1}), 
	 * then it will be set to 0 so it points to the first 
	 * element in the list.
	 */

	private void incrementNext() {
		if (nextIndex == elements.size() - 1)
			nextIndex = 0;
		else
			nextIndex++;
	}

	@Override
	public Iterator<T> iterator() {
		return elements.iterator();
	}

	@Override
	public boolean isEmpty() {
		return elements.isEmpty();
	}

	@Override
	public boolean contains(Object object) {
		return elements.contains(object);
	}

	@Override
	public Object[] toArray() {
		return elements.toArray();
	}

	@Override
	public <V> V[] toArray(V[] array) {
		return elements.toArray(array);
	}

	@Override
	public boolean add(T value) {
		return elements.add(value);
	}

	@Override
	public boolean remove(Object object) {
		return elements.remove(object);
	}

	@Override
	public boolean containsAll(Collection<?> elements) {
		return this.elements.contains(elements);
	}

	@Override
	public boolean addAll(Collection<? extends T> elements) {
		return this.elements.addAll(elements);
	}

	@Override
	public boolean removeAll(Collection<?> elements) {
		return this.elements.removeAll(elements);
	}

	@Override
	public boolean retainAll(Collection<?> elements) {
		return this.elements.retainAll(elements);
	}

	@Override
	public void clear() {
		elements.clear();
	}

	@Override
	public String toString() {
		return elements.toString();
	}

}
