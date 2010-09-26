package com.acme.service;

import org.springframework.flex.remoting.RemotingDestination;
import org.springframework.stereotype.Service;

/**
 * @author <a href="mailto:michaelschuetz83@gmail.com">Michael Schuetz</a>
 */
@Service("helloWorldService")
@RemotingDestination
public class HelloWorldService {
    public String say(String name) {
        return "Hello4 " + name;
    }
}
