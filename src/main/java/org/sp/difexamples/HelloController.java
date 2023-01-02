package org.sp.difexamples;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
//@RequiredArgsConstructor(onConstructor_ = @Autowired)
public class HelloController implements ApplicationContextAware {
    private ApplicationContext applicationContext;

    @GetMapping("/")
    public String hello() {
        return "Hello from ClientComponent = " + applicationContext.getBean(ClientComponent.class);
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        this.applicationContext = applicationContext;
    }
}
