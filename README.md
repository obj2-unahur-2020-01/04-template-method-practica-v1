## Ejercicio 1 - Infusiones

Todo el mundo disfruta por la mañana de tomar su bebida con cafeína, las opciones mas populares son Café, Mate y Té.
Una popular cadena de cafeterias está creando un Robot Barista, el  `Roborista`, para que atienda en sus distintos locales.


### Parte 1

Se pide diseñar el software que va a controlar al `Roborista` partiendo de las siguientes recetas para preparar las distintas infusiones que se sirven en esa cadena:

#### Café
* Calentar el agua
* Pasar el agua a presión sobre el grano de cafe molido
* Servir en una tasa
* Agregar azucar y/o leche opcionalmente

#### Té
* Calentar el agua
* Agregar la hojas de te al agua caliente
* Servir en una tasa
* Agregar azucar, Leche/Limón adicionalmente

### Parte 2

Se sabe que para el café el habla tiene que estar a 95 grados y tiempo de infusion es de 4 minutos. Para el té depende del tipo:

* `Té Verde`,  Para preparar exquisitos tés verdes la temperatura ideal del agua debe ser de: 65 °C. El tiempo de infusión: 1½ minutos.

* `Té Negro`, Para confeccionar té negro se recomienda una  temperatura del agua de 95 °C y un tiempo de infusión de 6 minutos.

* `Té Blanco`, En el caso del té blanco, lo mejor sería conseguir una temperatura del agua de 85 °C. El tiempo de infusión recomendado debería ser de 4 minutos.

## Ejercicio 2 - Horno de pan
_Olga_, una famosa fábrica de hornos automáticos de pan quiere actualizar su sistema para mejorar su producto y nos pidió que 
le hagamos una propuesta
*¿Qué mejora le harías?*

## Ejercicio 4 - EnviosYa
La aplicación `EnviosYa` ofrece envíos calculando costos por tipo de envio y tipo de paquete para ofrecerle la mejor opción a sus usuarios. 
En la última reunión de socios se informó que se consiguieron inversores por lo que se van a agregar muchos tipos de envío y de paquetes. 
A partir de esa noticia, los analistas vieron que hoy en día su sistema no está en condiciones de agregarlos de manera prolija/elegante.

*¿Cómo se puede mejorar?

## Ejercicio 5 - Paquetes de Viajes

Una agencia de viajes esta desarrollando su propio sistema de gestión y está teniendo problemas en el diseño de su solución. Para resolverlo nos ha contratado y quiere que revisemos el diseño. Para eso nos pasaron el diseño actual que cuenta con las siguientes clases:

![](/ejercicio1.png)

El primer problema que se visualiza es que `AgenciaDeViajes` no está trabajando polimorficamente con los distintos paquetes de viajes. Esto nos trae varios problemas a la hora de querer agregar nuevos paquetes.

```java
    public void catalogoDePaquetes() {
        paqueteCuyo.imprimirItinerario();
        paqueteNOA.itinerario();
        paquetePatagonia.getItinerario();
    }
```

El segundo problema está relacionado con el primero, si bien todos los paquetes son de 3 días con traslados de ida y vuelta, en el diseño no hay nada que nos asegure que todos los paquetes van a tener un itinerario con esa estructura.

Se solicita realizar las modificaciones necesarias para resolver los problemas de diseño encontrados.
