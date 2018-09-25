package liam.collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

/**
 * This class acts like a deck of cards (not to be confused 
 * with the {@link java.util.Deque} class which is a double-ended 
 * queue). The items stored in this class can be placed on and
 * fetched from the top, the middle randomly or the bottom. The
 * items can also be shuffled.
 * 
 * @author Liam
 *
 * @param <T>
 * 			The type of items to be added.
 */
public class Deck<T> implements Collection<T> {

	/**
	 * This list will hold all the items.
	 */
	private ArrayList<T> items;

	/**
	 * This constructor will create an empty deck.
	 */
	public Deck() {
		items = new ArrayList<>();
	}

	/**
	 * This constructor will create a deck with initial items.
	 * 
	 * @param items
	 * 			The items to add to the deck.
	 */
	public Deck(List<? extends T> items) {
		this();
		placeBottom(items);
	}

	/**
	 * This method will place an item on the top of the deck.
	 * 
	 * @param item
	 * 			The item to add to the top.
	 */
	public void placeTop(T item) {
		items.add(0, item);
	}

	/**
	 * This method will place a list of items on the top of 
	 * the deck.
	 * 
	 * @param items
	 * 			The items to add to the top.
	 */
	public void placeTop(Collection<? extends T> items) {
		List<T> list = new ArrayList<>();
		for (T item : items)
			list.add(0, item);
		for (T item : list)
			placeTop(item);
	}

	/**
	 * This method will place an item on the bottom of the deck.
	 * 
	 * @param item
	 * 			The item to add to the bottom.
	 */
	public void placeBottom(T item) {
		items.add(item);
	}

	/**
	 * This method will place a list of items on the bottom of 
	 * the deck.
	 * 
	 * @param items
	 * 			The items to add to the bottom.
	 */
	public void placeBottom(Collection<? extends T> items) {
		for (T item : items)
			placeBottom(item);
	}

	/**
	 * This method will place an item somewhere in the middle of the deck.
	 * 
	 * @param item
	 * 			The item to add to the bottom.
	 */
	public void placeMiddle(T item) {
		if (items.size() < 2)
			items.add(item);
		else
			items.add(1 + new Random().nextInt(items.size() - 2), item);
	}

	/**
	 * This method will place a list of items somewhere in the middle of 
	 * the deck. If isTogether is true, the items will be added somewhere
	 * in the middle of the deck with the order intact. If it is false, the
	 * items will be added to the middle of the deck randomly.
	 * 
	 * @param items
	 * 			The items to add to the middle.
	 * @param isTogether
	 * 			Whether the items added will be together.
	 */
	public void placeMiddle(Collection<? extends T> items, boolean isTogether) {
		if (isTogether) {
			int random = 1 + new Random().nextInt(this.items.size() - 1);
			this.items.addAll(random, items);
		} else
			for (T item : items)
				placeMiddle(item);
	}
	
	/**
	 * This method will take the top item of the Deck.
	 * 
	 * @return The top item.
	 */
	public T takeTop() {
		return items.remove(0);
	}
	
	/**
	 * This method will take the bottom item of the Deck.
	 * 
	 * @return The bottom item.
	 */
	public T takeBottom() {
		return items.remove(items.size() - 1);
	}
	
	/**
	 * This method will take the middle item of the Deck.
	 * 
	 * @return The middle item.
	 */
	public T takeMiddle() {
		return items.remove(1 + new Random().nextInt(items.size() - 2));
	}
	
	/**
	 * This method will peek at the top item of the Deck.
	 * 
	 * @return A peek of the top item.
	 */
	public T peekTop() {
		return items.get(0);
	}
	
	/**
	 * This method will peek at the bottom item of the Deck.
	 * 
	 * @return A peek of the bottom item.
	 */
	public T peekBottom() {
		return items.get(0);
	}

	/**
	 * This method will shuffle the deck so that the items will
	 * be in a random order.
	 */
	public void shuffle() {
		ArrayList<T> random = new ArrayList<>();
		int size = items.size();

		for (int i = 0; i < size; i++)
			random.add(items.remove(new Random().nextInt(items.size())));

		items = random;
	}

	@Override
	public Iterator<T> iterator() {
		return items.iterator();
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

	/**
	 * @deprecated Use the {@link #placeBottom(Object)} method
	 * instead.
	 */
	@Override
	@Deprecated
	public boolean add(T item) {
		placeBottom(item);
		return true;
	}

	@Override
	public boolean remove(Object object) {
		return items.remove(object);
	}

	@Override
	public boolean containsAll(Collection<?> items) {
		return items.contains(items);
	}

	/**
	 * @deprecated Use the {@link #placeBottom(Collection)} method
	 * instead.
	 */
	@Override
	@Deprecated
	public boolean addAll(Collection<? extends T> items) {
		placeBottom(items);
		return true;
	}

	@Override
	public boolean removeAll(Collection<?> items) {
		return this.items.removeAll(items);
	}

	@Override
	public boolean retainAll(Collection<?> items) {
		return this.items.retainAll(items);
	}

	@Override
	public void clear() {
		items.clear();
	}

	@Override
	public String toString() {
		return items.toString();
	}

}
