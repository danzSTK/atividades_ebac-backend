package main.java.br.com.maxjdev.anotacao;

import java.lang.annotation.*;

/**
 * @author maxjdev
 */
@Documented
@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
public @interface TipoChave {

    String value();
}