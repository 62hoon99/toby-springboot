package tobyspring;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import tobyspring.helloboot.HelloDecorator;
import tobyspring.helloboot.SimpleHelloService;

public class HelloServiceTest {

    @Test
    void simpleHelloService() {
        //given
        SimpleHelloService helloService = new SimpleHelloService();

        //when
        String ret = helloService.sayHello("kihoon");

        //then
        Assertions.assertThat(ret).isEqualTo("Hello kihoon");
    }

    @Test
    void helloDecorator() {
        //given
        HelloDecorator helloDecorator = new HelloDecorator(name -> name);

        //when
        String ret = helloDecorator.sayHello("kihoon");

        //then
        Assertions.assertThat(ret).isEqualTo("*kihoon*");
    }
}
