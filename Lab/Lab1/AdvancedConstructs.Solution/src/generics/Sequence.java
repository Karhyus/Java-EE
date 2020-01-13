package generics;

/**
 * A simplistic generic sequence.
 *
 * @author Jean-Michel Busca
 * @param <E> the type of the elements in this sequence
 *
 */
public class Sequence<E extends Comparable<E>> {

  private final Object[] elements;
  private int size;

  public Sequence() {
    elements = new Object[100];
    size = 0;
  }

  public int getSize() {
    return size;
  }

  public void add(E element) {
    if (size >= elements.length) {
      throw new IllegalStateException();
    }
    elements[size] = element;
    size += 1;
  }

  public boolean remove(Object element) {
    int i = 0;
    while (i < size && !elements[i].equals(element)) {
      i += 1;
    }
    if (i >= size) {
      return false;
    }
    size -= 1;
    while (i < size) {
      elements[i] = elements[i + 1];
    }
    return true;
  }

  public E get(int index) {
    if (index < 0 || index >= size) {
      throw new IllegalArgumentException();
    }
    return (E) elements[index];
  }

  public E max() {
    if (size == 0) {
      throw new IllegalStateException();
    }
    E max = (E) elements[0];
    for (int i = 1; i < size; i++) {
      if (max.compareTo((E) elements[i]) < 0) {
        // etudier pourquoi pas de warnin unchecked
        max = (E) elements[i];
      }
    }
    return max;
  }

  public boolean removeAll(Sequence<?> other) {
    boolean isModified = false;
    for (int i = 0; i < other.size; i++) {
      if (remove(other.get(i))) {
        isModified = true;
      }
    }
    return isModified;
  }

}
