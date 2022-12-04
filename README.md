# Demo arquitectura hexagonal con Java
Este proyecto es un ejemplo de desarrollo de una API REST aplicando Arquitectura Hexagonal.

⚙️ Instalación del proyecto

Clonar el repositorio en tu equipo:

> git clone https://github.com/AmadorBF/demo.git

Importar el proyecto mediante IntelliJ IDEA

> Import Project y seleccionar la carpeta del proyecto.

Marcar Create Project from external model, elegir Maven.

🔧 Configuración

No es necesario disponer de ningún gesto de base de datos, incluye H2

Puerto necesario para servicio rest 8080

🚀 Ejecución

Mediante mvn (situado en la carpeta principal del proyecto):

> mvnw clean install
>  
> mvnw spring-boot:run 

Ejecución jar:

> java -jar target/demo-0.0.1-SNAPSHOT.jar

✔️ Testing

Ejecutar tests unitarios: 

> mvnw test

Ejecutar test unitario individual: 

> mvn test -Dtest="nombreClaseTest#metodoTest"

🚀 Ejecución Rest

> http://localhost:8080/api/v1/products/price
> 
> Parámetros tipo query:
> 
> brandId=rama
> 
> productId=código de producto
> 
> fechaAplicacion=yyyy-MM-dd HH:mm:ss

![ image](https://user-images.githubusercontent.com/17526730/205511984-d9735384-54cb-445c-a99c-41eacddc24ec.png)
