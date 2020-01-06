package reflection;
import generics.*;
/**
 *
 * @author Jean-Michel Busca
 */
public class ClassTester {

  public <T> void testClass(Class<T> clazz, String testName) {

  }

  public static void main(String[] args) {
      
      GenericsSequence<Integer> integerSeq = new GenericsSequence();
      GenericsSequence<String> stringSeq = new GenericsSequence();
      //GenericsSequence<Object> objectSeq = new GenericsSequence();
      String[] list = {"A","String"};
      
      
      
      integerSeq.add(23);
      integerSeq.add(33);
      integerSeq.add(12);
      integerSeq.add(54);
      integerSeq.add(45);
      integerSeq.getAll();
      
      System.out.println(integerSeq.remove(45));
      integerSeq.getAll();
      
      stringSeq.add("A");
      stringSeq.add("B");
      stringSeq.add("C");
      stringSeq.add("String");
      stringSeq.getAll();
      
      System.out.println(stringSeq.remove("A"));
      //stringSeq.removeAll(list);
      stringSeq.getAll();
      
      //System.out.println(integerSeq.max());
      //System.out.println(stringSeq.max());
      //System.out.println(objectSeq.get(0));
  }
}
