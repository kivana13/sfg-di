package guru.springframework.sfgdi.controllers;

import guru.springframework.sfgdi.services.ConstructorGreetingServiceImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class SetterInjectedControllerTest {

    SetterInjectedController setterInjectedController;

    @BeforeEach
    void setUp() {

        setterInjectedController = new SetterInjectedController();
    }

    @Test
    void getGreeting() {

        setterInjectedController.setGreetingService(new ConstructorGreetingServiceImpl());
        System.out.println(setterInjectedController.getGreeting());
    }
}