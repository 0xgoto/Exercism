import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class HelloWorldTest {

    @Test
    public void testThatHelloWorldReturnsTheCorrectGreeting() {
        assertThat(new HelloWorld().getHelloWorld()).isEqualTo("Hello, World!");
    }

}
