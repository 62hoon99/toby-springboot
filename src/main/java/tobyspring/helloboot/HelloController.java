package tobyspring.helloboot;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/hello")
    public String hello(String name) {
        return "Hello " + name;
    }

    @GetMapping("/hello/json")
    public ResponseEntity<String> helloJson(String name) {
        return ResponseEntity.ok("Hello " + name);
    }
}
