package hello.com;

import org.springframework.stereotype.Component;

@Component
public class GreetingComponent {
 
    public String getMessage() {
        return "Hello from GreetingComponent";
    }
}