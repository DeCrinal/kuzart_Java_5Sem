package lab1;

public class LinkedListNode<T> {
	private T mValue;
	LinkedListNode<T> mPrev;
	LinkedListNode<T> mNext;
	
	public final T getData() {
		return mValue;
	}
	
	public final LinkedListNode<T> getNext(){
		return mNext;
	}
	
	public final LinkedListNode<T> getPrevious(){
		return mPrev;
	}
	
	public void setData(T newValue) {
		this.mValue = newValue;
	}
	
	public void setPreviousNode(LinkedListNode<T> node) {
		mPrev = node;
	}

	public void setNextNode (LinkedListNode<T> node) {
		mNext = node;
	}

	
}
