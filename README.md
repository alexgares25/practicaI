# Aproximación de Pi con Montecarlo
## Índice
  1. [Introducción](#introducción)
  2. [Manual de Instalación](#manual-de-instalación)
  3. [Manual de Uso](#manual-de-uso)
  4. [Licencia](#licencia)

## Introducción
Bienvenido al programa de aproximación de Pi mediante el método de Montecarlo.Realizado por Alejandro Gómez Ares Este programa, implementado en Java, utiliza la generación de puntos aleatorios para estimar el valor de Pi. La lógica detrás del método se basa en la relación entre el área de un cuarto de círculo y el área de un cuadrado que lo contiene.

## Manual de Instalación
Sigue estos pasos para **instalar** y ejecutar el programa:

### 1.Primero descargarse el código fuente
Primero, **clona** el repositorio desde GitHub a tu máquina local usando Git:

      git clone https://github.com/alexgares25/practicaI.git

### 2.Accede al Directorio del Proyecto.

Navega al directorio del proyecto después de la descarga:

    cd practicaI

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

A continuación se describen las operaciones que puedes realizar con el programa.

### 1. **Generar una Aproximación de Pi:**

Para obtener una estimación de Pi, puedes ejecutar el siguiente comando en la línea de comandos:

    java -jar pi.jar <numero_de_pasos>

## Un ejemplo usando 100000 pasos

    java -jar pi.jar 100000

## Licencia
**Copyright** [2023] [alexgares25]

Este proyecto está licenciado bajo la [Licencia Apache 2.0](https://www.apache.org/licenses/LICENSE-2.0). Consulta el archivo [LICENSE](LICENSE.TXT) para más detalles.
