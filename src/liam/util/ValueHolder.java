package liam.util;

/**
 * This class is meant to be used to deal with using local variables with
 * anonymous classes. This class can store a value which needs to be set within
 * the body of an anonymous class without having to be final or effectively
 * final.
 * 
 * For example:
 * 
 * <pre>
 * {@code
 * 	String name = "Peter";
 * 	Runnable runnable = () -> {
 * 		name = "Rohan"; // Error: local variable must be (effectively) final!
 * 	};
 * }
 * </pre>
 * 
 * However, using the {@link ValueHolder} class, this problem can be avoided:
 * 
 * <pre>
 * {@code
 * 	String name = "Peter";
 * 	ValueHolder<String> nameHolder = new ValueHolder<>();
 * 	nameHolder.set(name);
 * 	Runnable runnable = () -> {
 * 		nameHolder.set("Rohan"); // Works!
 * 	};
 * 	name = nameHolder.get();
 * }
 * </pre>
 * 
 * Generic type parameters are used for type safety.
 * 
 * @author Liam
 * @param <T>
 *            The type for the value held.
 */

public final class ValueHolder<T> {

	/**
	 * The generic value object.
	 */
	private T value;

	/**
	 * This contructor is used if no initial value is to be specified upon
	 * instantiation.
	 */
	public ValueHolder() {
	}

	/**
	 * This constructor is used if an initial value is to be specified upon
	 * instantiation.
	 * 
	 * @param value
	 *            The initial value to set.
	 */
	public ValueHolder(T value) {
		set(value);
	}

	/**
	 * This is used to check whether there is a value set.
	 * 
	 * @return Whether value is not null.
	 */
	public boolean hasValue() {
		return value != null;
	}

	/**
	 * This is called if the value is to be set or changed.
	 * 
	 * @param value
	 *            The value to set.
	 */
	public void set(T value) {
		this.value = value;
	}

	/**
	 * This is called if the value is to be accessed.
	 * 
	 * @return The present value.
	 */
	public T get() {
		return value;
	}

}
