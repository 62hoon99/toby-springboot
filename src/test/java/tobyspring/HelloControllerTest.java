package tobyspring;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import tobyspring.helloboot.HelloController;

public class HelloControllerTest {

    @Test
    void helloController() {
        //given
        HelloController helloController = new HelloController(name -> name);

        //when
        String ret = helloController.hello("test");

        //then
        Assertions.assertThat(ret).isEqualTo("test");
    }

    @Test
    void failsHelloController() {
        //given
        HelloController helloController = new HelloController(name -> name);

        //then
        Assertions.assertThatThrownBy(() -> helloController.hello(null))
                .isInstanceOf(IllegalArgumentException.class);

        Assertions.assertThatThrownBy(() -> helloController.hello(""))
                .isInstanceOf(IllegalArgumentException.class);
    }
}
