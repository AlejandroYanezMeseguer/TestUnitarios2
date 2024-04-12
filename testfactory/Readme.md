# Readme del programa

CREAMOS LAS CLASES QUE SERÁN LOS TRANSPORTES

1. Primero leemos el enunciado y nos pide que los objetos tienen que ser de tipo camión y bicicleta.
2. Creamos las clases camión y bicicleta.
3. Creamos la interfaz IComunTransporte en la que definimos los métodos que deben implementar las clases camión y bicicleta.

Interfaz IComunTransporte
Aquí creamos los métodos que serán comunes a las clases que las implementen.
1. El primer método calculará el coste en función del código postal.
2. El segundo nos dará el tipo de embalaje en función del peso.

Clase Camión
1. Creamos los atributos estáticos que serán el tipo de embalaje.
2. Recordemos que las clases deben implementar la interfaz IComunTransporte y luego implementar los métodos de la interfaz.
3. Implementamos los métodos y los modificamos según nuestras necesidades.

Clase Bicicleta
1. Creamos los atributos estáticos que serán el tipo de embalaje.
2. Recordemos que las clases deben implementar la interfaz IComunTransporte y luego implementar los métodos de la interfaz.
3. Implementamos los métodos y los modificamos según nuestras necesidades.

Clase FactoryTransport
1. Creamos los atributos estáticos finales que, según lo elegido en el método que vamos a describir luego, será un objeto de tipo camión o uno de tipo bicicleta.
2. Creamos el método getProducto que tiene un parámetro en el que vamos a definir si queremos que nos cree un objeto de tipo camión o de tipo bicicleta.
3. Si no elegimos nada, nos dará un nulo.

Clase Main
1. primero creamos una variable que será de tipo interfaz, que será la interfaz IComunTransporte
2. esa variable será igual a la factoria y sus metodos
3. metemos el tipo que queremos por parametro para que fabrique un camion o una bicicleta
4. llamamos a los metodos y lo sacamos por pantalla para comprobar que funciona
