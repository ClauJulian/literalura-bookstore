# Literalura BookStore


🟥 🔸🔸🔸🔸🔸🔸🔸🔸🔸🔸🔸🔸🔸🔸🔸🔸🔸🔸🔸🔸🔸🔸🔸🔸🔸🔸🔸🔸🔸🔸🔸 🟥

Proyecto Java para ONE Alura Latam. 
El aplicativo permite almacenar en una Base de Datos local gran variedad de libros en diferentes idiomas, consultar los libros registrados y sus autores. Buscar los Top 10 por idiomas y almacenarlos y también permite al usuario buscar los libros registrados por idioma. Todos los resultados se muestran por consola.

🟥 🔸🔸🔸🔸🔸🔸🔸🔸🔸🔸🔸🔸🔸🔸🔸🔸🔸🔸🔸🔸🔸🔸🔸🔸🔸🔸🔸🔸🔸🔸🔸 🟥

## ** Herramientas **

🔧 Lenguaje de Programación: Java JDK 17

🔧 Entorno de Desarrollo: IntelliJ

🔧 API de libros: Gutendex

🔧 Manejo de Json: Jackson

🔧 Base de Datos: PostgreSQL

## ** Metodología **

Como base en la POO, el proyecto se estructuró en paquetes para organizar modelos, repositorios, servicios y utils.
Para acceder a los datos de la API Gutendex se utilizaron herramientas HttpClient, HttpRequest y HttpResponse.
Se crearon records que permitan leer correctamente la información que trae el json incorporando la dependecia Jackson para lograr dicho objetivo. 
Utilizando ObjectMapper se completó la conversión de dichos datos.
Para trabajar con la Base de Datos se utilizó PostgreSQL mapeando las Entidades en la carpeta modelo y creando los repositorios necesarios para acceder a la base de datos.



## ** Instalación del proyecto Literalura Bookstore **

🔑 Crea una carpeta en tu entorno local
🔑 En la terminal deslízate hacia la carpeta y clona el proyecto "Literalura Bookstore":
https://github.com/ClauJulian/literalura-bookstore.git

🔑 Instala en tu entorno local Java, IntelliJ e instala en el pom del proyecto las dependencias de Postgres y Jackson

🔑 Crea la Base de datos en tu Postgres con el nombre 'literalura'

## ** Desarrolador **
Claudia Edith Julian Full Stack PHP - React Licenciada en Administración de Empresas https://www.linkedin.com/in/claudiaedithjulian/