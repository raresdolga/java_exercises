import java.util.*;

public class List1<E> implements List<E> {
	private ListElement<E> head;  
	private static class ListElement<T> {
		 public ListElement<T> next;
		 public T value;
		 public ListElement(ListElement<T> next, T value) {
		 this.next = next;
		 this.value = value;
		 }
		 public ListElement<T> copy() {
		 return new ListElement<T>(next == null ? null : next.copy(), value);
		 }
		 public ListElement<T> next() { return next; }
		 public T value() { return value ; }
		
	}
	public List1() {
		 head = null;
		 }
		 private List1(ListElement<E> e) {
		 head = e;
		 }
		 public void insertHead(E val) {
		 head = new ListElement<E>(head, val);
		 } 
		 public E getHead() {
			 return (head == null) ? null : head.value();
			 }
			 public List<E> getTail() {
			 if ((head == null) || (head.next() == null)) {
			 return new List1<E>();
			 }
			 return new List1<E>(head.next().copy());
			 }
			public boolean isEmpty() {
			 return head == null;
			}
			 private class LinkedListIterator<T>
			 implements Iterator<E> {
			 private ListElement<E> dummy =
			 new ListElement<E>(head,null);
			 private ListElement<E> current =
			 dummy;
			 public boolean hasNext() {
			 return current.next() != null;
			 }
			 public E next() {
			 if (current != null) {
			 current = current.next();
			 return current.value();
			 }
			 return null;
			 }
			 public Iterator<E> iterator() {
				 return new LinkedListIterator<E>();
			 }
			 }
			 private class LinkedListInsertIterator<T>
			 extends LinkedListIterator<T>
			 {
				 private ListElement<E> dummy =
						 new ListElement<E>(head,null);
				 ListElement<E> current=dummy;
			 public void insert(E value) {
			 if ((head == null) || (current == dummy)){
			 insertHead(value);
			 current = new ListElement<E>(head,null);
			 return;
			 }
			 current.next = new ListElement<E>(current.next(),value);
			 } 
			 }
		public Iterator<E> iterator()
		{
			return new LinkedListIterator<E>();
		}
			 
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	@Override
	public boolean add(E arg0) {
		// TODO Auto-generated method stub
		return false;
	}
	@Override
	public void add(int arg0, E arg1) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public boolean addAll(Collection<? extends E> arg0) {
		// TODO Auto-generated method stub
		return false;
	}
	@Override
	public boolean addAll(int arg0, Collection<? extends E> arg1) {
		// TODO Auto-generated method stub
		return false;
	}
	@Override
	public void clear() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public boolean contains(Object arg0) {
		// TODO Auto-generated method stub
		return false;
	}
	@Override
	public boolean containsAll(Collection<?> arg0) {
		// TODO Auto-generated method stub
		return false;
	}
	@Override
	public E get(int arg0) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public int indexOf(Object arg0) {
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	public int lastIndexOf(Object arg0) {
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	public ListIterator<E> listIterator() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public ListIterator<E> listIterator(int arg0) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public boolean remove(Object arg0) {
		// TODO Auto-generated method stub
		return false;
	}
	@Override
	public E remove(int arg0) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public boolean removeAll(Collection<?> arg0) {
		// TODO Auto-generated method stub
		return false;
	}
	@Override
	public boolean retainAll(Collection<?> arg0) {
		// TODO Auto-generated method stub
		return false;
	}
	@Override
	public E set(int arg0, E arg1) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public int size() {
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	public List<E> subList(int arg0, int arg1) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public Object[] toArray() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public <T> T[] toArray(T[] arg0) {
		// TODO Auto-generated method stub
		return null;
	}
			 }


