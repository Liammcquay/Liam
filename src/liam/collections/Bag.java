package liam.collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Random;

/**
 * This collection class is like a bag of items. This means
 * that values stored in this class will be fetched randomly 
 * (mirroring the nature of an actual bag).
 * 
 * 
 * @author Liam
 * 
 * @param <T> 
 * 			The type of items to be added.
 */
public class Bag<T> implements Collection<T> {

	/**
	 * This list will hold all the items.
	 */
	private ArrayList<T> items;

	/**
	 * This constructor will create an empty bag.
	 */
	public Bag() {
		items = new ArrayList<>();
	}

	/**
	 * This method will create a bag with a list
	 * of items.
	 * 
	 * @param items
	 * 			The items to put in the bag.
	 */
	public Bag(Collection<? extends T> items) {
		this();
		addAll(items);
	}
	
	/**
	 * This method will take an item out of the bag
	 * with replacement.
	 * 
	 * @return The item being taken.
	 */
	public T take() {
		return items.get(new Random().nextInt(items.size()));
	}
	
	/**
	 * This method will take an item out of the bag
	 * without replacement.
	 * 
	 * @return The item being taken out.
	 */
	public T takeOut() {
		return items.remove(new Random().nextInt(items.size()));
	}
	
	/**
	 * This method will return the {@link ArrayList} used to
	 * store all the items.
	 * 
	 * @return The items in an ArrayList.
	 */
	public ArrayList<T> toArrayList() {
		return items;
	}
	
	@Override
	public Iterator<T> iterator() {
		randomize();
		return items.iterator();
	}
	
	/**
	 * This method will randomize the items in the list.
	 */
	private void randomize() {
		ArrayList<T> random = new ArrayList<>();
		int size = items.size();

		for (int i = 0; i < size; i++)
			random.add(items.remove(new Random().nextInt(items.size())));

		items = random;
	}

	@Override
	public int size() {
		return items.size();
	}

	@Override
	public boolean isEmpty() {
		return items.isEmpty();
	}

	@Override
	public boolean contains(Object object) {
		return items.contains(object);
	}

	@Override
	public Object[] toArray() {
		return items.toArray();
	}

	@Override
	public <V> V[] toArray(V[] array) {
		return items.toArray(array);
	}

	@Override
	public boolean add(T item) {
		items.add(new Random().nextInt(items.size() + 1), item);
		return true;
	}

	/**
	 * @deprecated Use the {@link #takeOut()} method
	 * instead.
	 */
	@Override
	@Deprecated
	public boolean remove(Object object) {
		items.remove(object);
		return true;
	}

	@Override
	public boolean containsAll(Collection<?> items) {
		return this.items.containsAll(items);
	}

	@Override
	public boolean addAll(Collection<? extends T> items) {
		for (T item : items)
			add(item);
		return true;
	}

	/**
	 * @deprecated Use of this function ruins the purpose
	 * of the Bag class.
	 */
	@Override
	@Deprecated
	public boolean removeAll(Collection<?> items) {
		return this.items.removeAll(items);
	}

	/**
	 * @deprecated Use of this function ruins the purpose
	 * of the Bag class.
	 */
	@Override
	@Deprecated
	public boolean retainAll(Collection<?> items) {
		return this.items.retainAll(items);
	}

	@Override
	public void clear() {
		items.clear();
	}

	@Override
	public String toString() {
		randomize();
		return items.toString();
	}
	
}
