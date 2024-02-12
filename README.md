
# Reserva de Vuelos
## Índice
  1. [Introducción](#introducción)
  2. [Manual de Instalación](#manual-de-instalación)
  3. [Manual de Uso](#manual-de-uso)
  4. [Diagrama UML](#diagrama-UML)
  5. [Licencia](#licencia)






## Introducción
Bienvenido al sistema de gestión de Vuelos realizado por Alejandro(alexgares),una aplicacion diseñada con Java la cual consiste en añadir vuelos mostrar los vuelos disponibles,modificar vuelos disponibles y borrar vuelos.Este sistema podria ser usado por ejemplo por una AeroLinea.

En este sistema puedes añadir un vuelo indicando el número de vuelo el Origen de vuelo y el Destino de vuelo con su respectivo precio.


## Manual de Instalación
Sigue estos pasos para **instalar** el programa:

### 1.Primero descargarse el código fuente
Primero, **clona** el repositorio desde GitHub a tu máquina local usando Git:

      git clone https://github.com/alexgares25/reservas_vuelos.git

### 2.Accede al Directorio del Proyecto.

Navega al directorio del proyecto después de la descarga:

    cd reservas_vuelos

### 3.Compilar el Código Fuente
Compila el **código fuente** usando el siguiente comando. Esto asegurará que los archivos .class se generen en el directorio bin/:

    make compilar
  
### 4.Creamos el archivo .jar.
Crea un **archivo ejecutable JAR** para facilitar la ejecución del programa:

     make jar
  
### 5.Crear el javadoc.
Si deseas generar documentación Javadoc para el código, puedes hacerlo con el siguiente comando:


    make javadoc

Esto **generará archivos de documentación** en el directorio html/.


## Manual de Uso
Aquí hay algunas operaciones comunes que puedes realizar con el programa:

### -Añadir un nuevo Vuelo:

    java -jar reservavuelos.jar añadir numerovuelo Origen Destino Precio

Ejemplo para **añadir** un nuevo vuelo: 

    java -jar reservavuelos.jar añadir 7889 Valencia Madrid 150

Este comando crea un nuevo vuelo con los datos: ID=1, Número de Vuelo = 7889, Origen = Valencia, Destino = Madrid, Precio = 150€.

### -Mostrar Vuelos disponibles:

    java -jar reservavuelos.jar mostrar
    
  Este es el **resultado** al ejecutar el comando:
  
  ```ID : 1 -Numero de vuelo:#7889 -Origen:Valencia -Destino:Madrid -Precio:150€```

### -Para Borrar vuelos:
    java -jar reservavuelos.jar borrar id

Este es un ejemplo si quiero **borrar** el vuelo con ID 1
    
    java -jar reservavuelos.jar borrar 1

### -Para Modificar un Vuelo:

    java -jar reservavuelos.jar modificar id numerovuelo Origen Destino Precio
   
Ejemplo para **modificar** un nuevo vuelo: 

    java -jar reservavuelos.jar modificar 1 7888 Valencia Galicia 150

Este comando modificara el vuelo existente asociado a la ID:1  con los datos: ID=1, Número de Vuelo = 7888, Origen = Valencia, Destino = Galicia, Precio = 150€.
    
### -Para obtener ayuda ejecuta este comando:

    java -jar reservavuelos.jar ayuda


## Diagrama UML
Aqui se muestra el Diagrama UML en formato de imagen
![Diagrama UML.](Diagrama.png)

## Licencia
**Copyright** [2023] [alexgares25]

Este proyecto está licenciado bajo la [Licencia Apache 2.0](https://www.apache.org/licenses/LICENSE-2.0). Consulta el archivo [LICENSE](LICENSE.TXT) para más detalles.
