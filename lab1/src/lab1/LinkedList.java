package lab1;
import lab1.LinkedListNode;
import java.util.Iterator;
import java.util.NoSuchElementException;

public class LinkedList<T>  implements Iterable<T>{
	private int mSize;
	private LinkedListNode<T> mHead;
	private LinkedListNode<T> mTail;

	public LinkedList() {
		mSize = 0;
		//Creating block-nodes;
		mHead = new LinkedListNode<T>();
		mTail = new LinkedListNode<T>();
		mTail.setPreviousNode(mHead);
		mHead.setNextNode(mTail);
	}
	
	public final int size() {
		return mSize;
	}
	
	public void add(T value) {
		LinkedListNode<T> newNode = new LinkedListNode<T>();
		newNode.setData(value);
		LinkedListNode<T> preValue = mTail.getPrevious();
		preValue.setNextNode(newNode);
		newNode.setPreviousNode(preValue);
		newNode.setNextNode(mTail);
		mTail.setPreviousNode(newNode);
		mSize++;
	}
	
	@Override
	public Iterator<T> iterator() {
		return new ListIterator();
	}
	
	public void remove(T value){
		Iterator<T> iter = this.iterator();
		while(iter.hasNext()) {
			if(iter.next() == value) {
				iter.remove();
				mSize--;
			}
		}
	}
	/**
	 * Class ListIterator implements Iterator interface with it's
	 * default methods*/
 	public class ListIterator implements Iterator<T>{
		private LinkedListNode<T> mCurrentNode;
		ListIterator() {
			if(mHead == null) {
				throw new NoSuchElementException("Exception of accessing null element");
			}
			mCurrentNode = mHead.getNext();
		}

		public final T value() {
			return mCurrentNode.getData();
		}
		@Override
		public final boolean hasNext() {
			return mCurrentNode != mTail;
		}

		public final boolean hasPrevious() {
			return mCurrentNode != mHead;
		}
		
		@Override
		public T next() {
			if(mCurrentNode.getNext() == mTail) {
				throw new NoSuchElementException("Exception of accessing null element");
			}
			mCurrentNode = mCurrentNode.getNext();
			return mCurrentNode.getData();
		}
		
		public T previous() {
			if(mCurrentNode.getPrevious() == mHead) {
				throw new NoSuchElementException("Exception of accessing null element");
			}
			mCurrentNode = mCurrentNode.getPrevious();
			return mCurrentNode.getData();
		}
	}

	
}
