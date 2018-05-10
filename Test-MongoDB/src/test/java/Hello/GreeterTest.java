package Hello;

import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.containsString;

import org.junit.Test;

public class GreeterTest {
    private Greeter greeter = new Greeter();

    @Test
    public void greeterSaysHello() {
        assertThat(greeter.sayHello(), containsString("Hello"));
    }
}
