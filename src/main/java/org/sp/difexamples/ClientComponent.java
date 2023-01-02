package org.sp.difexamples;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(value = ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class ClientComponent {
    private final TransientComponent tc;
    private final SingletonComponent sc;
    @Autowired
    public ClientComponent(TransientComponent tc, SingletonComponent
            sc) {
        this.tc = tc;
        this.sc = sc;
        System.out.println("ClientComponent::ClientComponent = " +

                this);
        System.out.println(" o SingletonComponent = " + sc);
        System.out.println(" o TransientComponent = " + tc);
    }
    public void operation() {
        System.out.println("Invoked ClientComponent::operation() on " +
                this);
        System.out.println(" o SingletonComponent = " + sc);
        System.out.println(" o TransientComponent = " + tc);
    }
}
