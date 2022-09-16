package FormacionBackend5.CommandLineRunner;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
public class ClaseSecundaria {
    @PostConstruct
    private void saludar() {

        System.out.println("Hola desde la clase secundaria");
    }

}
