package annotations.definition;

import static java.lang.annotation.ElementType.METHOD;
import java.lang.annotation.Retention;
import static java.lang.annotation.RetentionPolicy.RUNTIME;
import java.lang.annotation.Target;

/**
 *
 * @author Jean-Michel Busca
 */
// for exercise 3.4
@Target(METHOD)
@Retention(RUNTIME)
public @interface TestSpecs {

  TestSpec[] value();
}
