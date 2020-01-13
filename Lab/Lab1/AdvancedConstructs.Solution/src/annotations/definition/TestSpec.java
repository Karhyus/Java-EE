package annotations.definition;

import static java.lang.annotation.ElementType.METHOD;
import java.lang.annotation.Repeatable;
import java.lang.annotation.Retention;
import static java.lang.annotation.RetentionPolicy.RUNTIME;
import java.lang.annotation.Target;

/**
 *
 * @author Jean-Michel Busca
 */
@Target(METHOD)
@Retention(RUNTIME)
@Repeatable(TestSpecs.class) // for exercise 3.4
public @interface TestSpec {

  String test() default "";

  int order();

}
