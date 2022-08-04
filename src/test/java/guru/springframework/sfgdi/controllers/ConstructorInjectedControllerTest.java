package guru.springframework.sfgdi.controllers;

import guru.springframework.sfgdi.services.ConstructorGreetingServiceImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ConstructorInjectedControllerTest {

    private ConstructorInjectedController constructorInjectedController;

    @BeforeEach
    void setUp() {

        constructorInjectedController = new ConstructorInjectedController(new ConstructorGreetingServiceImpl());
    }

    @Test
    void getGreeting() {

        System.out.println(constructorInjectedController.getGreeting());
    }
}