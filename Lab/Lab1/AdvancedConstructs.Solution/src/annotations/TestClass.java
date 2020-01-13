package annotations;

import annotations.definition.TestSpec;

/**
 *
 * @author Jean-Michel Busca
 */
// @TestSpec(order = 0) does not work
public class TestClass {

  //@TestSpec(order = 0) does not work
  private String attribute;
  private int att;

  // note: repeated annotations do not work until exercise 3.4
  @TestSpec(test = "test1", order = 1)
  @TestSpec(order = 3)
  public void foo() {
    System.out.println("foo");
  }

  @TestSpec(test = "test1", order = 2)
  @TestSpec(test = "test2", order = 2)
  @TestSpec(order = 2)
  public void bar() {
    System.out.println("bar");
  }

  @TestSpec(test = "test2", order = 1)
  @TestSpec(order = 1)
  public void baz() {
    System.out.println("baz");
  }
}