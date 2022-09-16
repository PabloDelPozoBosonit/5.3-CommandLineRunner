package FormacionBackend5.CommandLineRunner;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
public class TerceraClase {
    @PostConstruct
    private void saludar() {

        System.out.println("Soy la tercera clase");
    }
}
