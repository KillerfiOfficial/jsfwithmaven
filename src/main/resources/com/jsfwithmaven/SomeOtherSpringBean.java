package com.jsfwithmaven;

import java.util.logging.Logger;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
public class SomeOtherSpringBean {

    private static final Logger LOG = Logger.getLogger(SomeOtherSpringBean.class.getName());

    @Bean
    public AnotherBean createAnotherBean() {
        return new AnotherBean();
    }

    public void doSomethingElse() {
        LOG.info("Tasto schiaccito con successo!");
    }
}
