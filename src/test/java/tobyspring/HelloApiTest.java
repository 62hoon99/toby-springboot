package tobyspring;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;

import java.net.URISyntaxException;

public class HelloApiTest {

    @Test
    void helloApi() throws URISyntaxException {
        // http localhost:8080/hello?name=Spring
        TestRestTemplate rest = new TestRestTemplate();

        ResponseEntity<String> res =
                rest.getForEntity("http://localhost:8080/hello?name={name}", String.class, "spring");

        // status 200
        Assertions.assertThat(res.getStatusCode()).isEqualTo(HttpStatus.OK);

        // header(content-type) text/plain
        System.out.println(res.getHeaders().getContentType());
        Assertions.assertThat(res.getHeaders().getContentType().getType().split(";")[0])
                .isEqualTo(MediaType.TEXT_PLAIN.getType());

        // body Hello Spring
        Assertions.assertThat(res.getBody()).isEqualTo("Hello spring");
    }
}
