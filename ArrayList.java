public class ArrayList<T> implements List<T>{
  private int maxsize;
  private int size;
  private int current;
  private T[] nodes;

  //PRIMARY METHODS


  public ArrayList(int n) {
    maxsize = 0;
    size = 0;
    current = -1;
    nodes = (T[]) new Object[n];
  }

  @Override
  public void findFirst() {
    current = 0;
  }

  @Override
  public void findNext() {
    current++;
  }

  @Override
  public T retrieve() {
    return nodes[current];
  }

  @Override
  public void update(T val) {
    nodes[current] = val;
  }

  @Override
  public void insert(T val) {
    for(int i=size-1; i>current; --i) {
      nodes[i+1] = nodes[i];
    }
    current++;
    nodes[current] = val;
    size++;
  }

  @Override
  public void remove() {
    for(int i = current + 1; i<size; i++) {
      nodes[i-1] = nodes[i];
    }
    size--;
    if(size == 0) {
      current = -1;
    }else if(current == size) {
      current = 0;
    }
  }

  @Override
  public boolean full() {
    return size == maxsize;
  }

  @Override
  public boolean empty() {
    return size == 0;
  }

  @Override
  public boolean last() {
    return current == size - 1;
  }
  public static <T> int length(ArrayList<T> l) {
    int count = 0;
    if(l.empty() == false) {
      l.findFirst();
      while(!l.last()) {
        count++;
        l.findNext();
      }
      count++;
    }
    return count++;
  }


  //SECONDRY METHODS



  public static <T> boolean search(List<T> l,T key) {
    if(l.empty() == false) {
      l.findFirst();
      while(!l.last()) {
        if(l.retrieve().equals(key)) {
          return true;
        }
        l.findNext();
      }
      if(l.retrieve().equals(key)) {
        return true;
      }
    }
    return false;
  }
  
  


}
