package util;

/**
 * This class implements a generic ArrayList 
 * @author Madeline Downs
 * @param <E> the element
 *
 */
public class ArrayList<E> {

	/** Initial list size. */
	private static final int INIT_SIZE = 10;
	/** Array of type E. */
	private E[] list;
	/** Size of the list. */
	private int size;
	/** Capacity **/
	private int capacity;
	
	
	/**
	 * Constructs the ArrayList with generic objects
	 */
	@SuppressWarnings("unchecked")
	public ArrayList() {
	    list = (E[])(new Object[INIT_SIZE]);
	    capacity = INIT_SIZE;
	    size = 0;
	}
	
	/** 
	 * Gets the element at the index
	 * @param index the index of the element to get
	 * @return E the element at the index
	 */
	public E get(int index) {
		if (index < 0 || index >= size()) {
			throw new IndexOutOfBoundsException();
		}
		return list[index];
	}

	/** 
	 * Returns the size of the ArrayList.
	 * @return size size of ArrayList
	 */
	public int size() {
		return size;
	}

	/**
	 * Adds an element to the given index
	 * @param idx the index within the ArrayList
	 * @param element the element to be added to the ArrayList
	 * @throws IndexOutOfBoundsException if the index is out of bounds
	 * @throws NullPointerException if the element to add is null
	 * @throws IllegalArgumentException if the element is a duplicate
	 */
	public void add(int idx, E element) {
		//null check
		if (element == null) {
			throw new NullPointerException();
		}
		//duplicate check
		for (int j = 0; j < size; j++) {
			if (list[j].equals(element)) {
				throw new IllegalArgumentException();
			}
		}
		//index out of range check
		if (idx < 0 || idx > size) {
			throw new IndexOutOfBoundsException();
		}
		if (size == capacity) {
			growArray();
		}
		size++;
		//adding to null list
		if (size == 1) {
			list[0] = element;
		} else if (idx == size && size != 1) {
		//adding to end
			list[idx] = element;
		} else {
		    //right-shift
		    for (int i = size - 2; i > idx - 1; i--) {
			    list[i + 1] = list[i];
		    }
		    list[idx] = element;
		}
		
	}
	
	/**
	 * Doubles the size of the capacity of this list
	 */
	private void growArray() {
		@SuppressWarnings("unchecked")
		E[] temp = (E[])(new Object[2 * capacity]);
		for (int i = 0; i < size; i++) {
			temp[i] = list[i];
		}
		list = temp;
	}
	
	/**
	 * removes the element at a certain index
	 * @param idx the integer index to remove
	 * @return E the element at the removed index
	 * @throws IndexOutOfBoundsException if the index is out of bounds
	 */
	public E remove(int idx) {
		if (idx < 0 || idx >= size) {
			throw new IndexOutOfBoundsException();
		}
		E removedElement = list[idx];
		for (int i = idx; i < size - 1; i++) {
			list[i] = list[i + 1];
		} 
		list [size - 1] = null;
		size--;
		return removedElement;
	}
	
}
