//package myarraylist;

import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.ConcurrentModificationException;

public class MyArrayList<T> implements Iterable<T>
{
   private T[] list;
   private int count;
	
   public MyArrayList() {
      this(10);
   }
	
   @SuppressWarnings("unchecked")
   public MyArrayList(int initSize) {
      list = (T[])new Object[initSize];
   }
	
   public void add(T value)
   {
      if(list[list.length - 1] != null){
         resizeArray();
      }
      for(int i = 0; i < list.length; i++){
         if(list[i] == null){
            list[i] = value;
            break;
         }
      }
      // for(int i = 0; i < list.length; i++){
      //    System.out.println(list[i]);
      // }
   }
	
   public void add(int index, T value)
   {
      if(list[list.length - 1] != null){
         resizeArray();
      }
      for(int i = list.length - 1; i > index; i--){
         list[i] = list[i - 1];
      }
      list[index] = value;
      // for(int x = 0; x < list.length; x++){
      //       System.out.println(list[x]);
      //    }
   }
	
   public void clear()
   {
      for(int i = 0; i < list.length; i++){
         list[i] = null;
      }
   }
	
   public T get(int index){
      return list[index];
   }
	
   public int indexOf(T value)
   {
      for(int i = 0; i < list.length; i++){
         if(list[i].equals(value)){
            return i;
         }
      }
      return -1;
   }
	
   public boolean remove(T value)
   {
      int index = indexOf(value);
      if(index == - 1 ){
         return false;
      }
      else{
         for(int i = index; i < list.length - 1; i++){
            list[i] = list[i + 1];
         }
         list[list.length - 1] = null;
         return true;
      }
      
   }
	
   public boolean isEmpty() {
      for(int i = 0; i < list.length; i++){
         if(list[i] != null){
            return false;
         }
      }
      return true;
   }
	
   public T removeAt(int index)
   {
      T output = list[index];
      for(int i = index; i < list.length; i++){
         list[i] = list[i + 1];
      }
      list[list.length - 1] = null;
      return output;
   }
	
   public T set(int index, T element) {
      T old = list[index];
      list[index] = element;
      // for(int x = 0; x < list.length; x++){
      //    System.out.println(list[x]);
      // }
      return old;
   }
	
   public int size() {
      for(int i = 0; i < list.length; i++){
         if(list[i] == null){
            return i;
         }
      }
      return list.length;
   }
	
   public int capacity() {
      for(int i = 0; i < list.length; i++){
         if(list[i] == null){
            return list.length - i;
         }
      }
      return 0;
   }
	
   public Object[] toArray() {
      Object[] output = new Object[size()];
      for(int i = 0; i < output.length; i++){
         output[i] = list[i];
      }
      return output;
   }
	
   @Override
   public String toString()
   {
      String output = "[";
      for(int x = 0; x < list.length && list[x] != null; x++){
         output += list[x];
         if(x < list.length - 1 && list[x + 1] != null){
            output += ", ";
         }
      }
      output += "]";
      return output;
   }
	
   public Iterator<T> iterator() {
      return new LinkedListIterator();
   }
	
   private class LinkedListIterator implements Iterator<T>
   {
      private int expectedCount;
      private int last;
      private int next;
   	
      public LinkedListIterator() {
         next = 0;
      }
   	
      public boolean hasNext() {
         return list.length > next && list[next] != null;
      }
   	
      public T next() {
         checkForComodification();
         last = next;
         next++;
         return list[last];
      }
   	
      public void remove() {
         for(int i = last; i < list.length - 1; i++){
            list[i] = list[i + 1];
         }
         list[list.length - 1] = null;
         next = last;
         last--;
      }
   	
      private void checkForComodification() {
      
      }
   }
	
	// ****************** Private Helper Methods ********************
	
   @SuppressWarnings("unchecked")
   private void resizeArray()
   {
      T[] temp = (T[]) new Object[list.length + 10];
      for (int index = 0; index < list.length; index++)
         temp[index] = list[index];
      list = temp;
   }
	
}