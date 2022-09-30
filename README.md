En @SpringBootApplication sobreescribimos el método run e imprimimos "Hola desde la clase inicial".
Creamos otras dos clases mas.
En ClaseSecundaria, anotada con @Component y el metodo anotado con @PostConstruct, imprimimos "Hola desde la clase Secundaria"
En TerceraClase igual que SegundaClase pero imprimimos "Soy la tercera clase"

Al ejecutarlo vemos que se ejecutan en este orden, 3,2,1.
Primero se ejecutan los @PostConstruct y despues la la clase principal
