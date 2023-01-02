package org.sp.difexamples;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor(onConstructor_ = @Autowired)
public class HelloController {
    ClientComponent client;

    public HelloController(ClientComponent client) {
        this.client = client;
    }

    @GetMapping("/")
    public String hello() {
        return "Hello from ClientComponent = " + client;
    }
}
