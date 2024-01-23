## Magneto Prueba
### Introduccion

Una automatizacion simple con la cual crea se hace una compra en la pagina de [Saucedemo](https://www.saucedemo.com)
tomando captura de pantalla en cada paso.

### Patrones
Este fue realizado con el patron POM (Page object Model) debido a la premura de la implementacion igual maneja el lenguaje gherkin para el orden dela automatizacion

### Ejecucion

Este es el comando de ejecucion completo:

`$ mvn test -Dwebdriver.driver=chrome serenity:aggregate`

el se divide en el comando principal de ejecucion `$ mvn test` , la opcion que escoge el driver de navegador o del dispositivo movil a trabajar  `-Dwebdriver.driver=chrome` en este caso chrome y el comando para agregara la evidencia `mvn serenity:aggregate`
Pera correr desde intelj o eclipse puede utilizar el runnerCucumber que esta en la carpeta ruuners


### Resultados

Para ver los resultados de la ejecucion dirigirnos a la carpeta de proyecto ***target/site/serenity*** dentro de esta buscar un archivo *index* este te llevara a una pagina que presentara la evidencia  de ejecucion de manera ordenada


### Precondiciones
##### Conexion a internet
##### En la carpeta driver tener el webdriver de su navegador correcto para esto:

1. Verificar la version del navegador ejecutar normalmente se encuentra en ayuda -> acerca de...
1. luego buscar webdriver de esta version en el caso de chromes es [chromedriver](https://chromedriver.chromium.org/downloads)
1. poner el driver en la carpeta de drivers ***\src\test\resources***

### Construido con
- Maven
- Junit
- SerenityBDD
- Selenium library

### Erratas
Se que la automatizacion tenia mas posibilidades de variables ejemplo lo del  Fistname lastName  Zipcode que fueron 
quemados en este caso,tambien diria que la manera como escojo el item por que podrian ser distinto pero dado que solo es
para mostrar las habilidades que tengo sobre esto pense hacerlo mejor con un ejercicio simplificado 

### Autor
Alejandro Vargas **haunter42@gmail.com**