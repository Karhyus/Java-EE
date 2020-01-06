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

      
      stringSeq.add("A");
      stringSeq.add("B");
      stringSeq.add("C");
      stringSeq.add("String");
      stringSeq.getAll();
      stringSeq.removeAll(list);
      stringSeq.getAll();

  }
}
