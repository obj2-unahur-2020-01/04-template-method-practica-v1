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

## Ejercicio 3 - Restaurante

Para el desarrollo de un sistema para la gestion de una nueva cadena de restaurantes se solicita modelar en objetos siguiente problema.
La cadena apunta a atraer a comensales VIP que siempre eligen de un menú el plato más caro y la bebida más cara.
Se desea saber cuanto sería el gasto que debe pagar el comensal según el menú que se elija.

### Menús

Todos los menús ofrecen como bebidas: vino, cerveza, agua y gaseosa.

Con respecto a las comidas, los platos que se puede elegir son:
- Menú Parrilla: Asado, Vacío, Choripan.
- Menú Minutas: Milanesa, Hamburguesa y Papas Fritas.

Los precios son:
- Agua: 10 
- Vino: 100
- Cerveza: 50
- Gaseosa: 40
- Asado: 100
- Vacio: 120
- Choripán: 50
- Milanesa: 80
- Hamburguesa: 60
- Papas Fritas: 30

### Menú Gourmet
Un menú gourmet agrega como bebidas jugo y licuado (sigue ofreciendo también vino, cerveza, agua y gaseosa).
Los platos que ofrece son: Conejo, Ensalada Waldorf y Sushi. 

Los precios son:
- Licuado: 80
- Jugo:	40
- Sushi: 140
- Conejo: 160
- Ensalada Waldorf: 80

Agregar al modelo el menu gourmet.

### Comensales
Ante la crisis que afecta al pais, se decide contemplar otro tipo de comensales, los `Gasolares` .
Este tipo de comensal elije siempre los platos y bebidas más baratas del menú.

Modificar el modelo para que soporte ambos tipos de comensales.

### Propina

Todos los comensales dejan una propina que se calcula como un porcentaje sobre la cuenta: plato + bebida.
Ese porcentaje es configurable para cada comensal, pero un buen valor por defecto es el 20%.
Modificar el cálculo del gasto para que incluya la propina.

### Gasolero Plus

El departamento comercial de la cadena de restaurantes detecto que suelen venir al restaurant un tipo especial de comensal, el `Gasolero plus`.  Es un gasolero que solo deja propina si la cuenta supera los $80. 

Modificar el modelo para que soporte los gasoleros plus.

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

## Ejercicio 6 - Lavarropas

Si no bastaba con lavar la ropa de casa ahora la empresa `Drean` nos contrató para rediseñar
el software de sus productos.

En un principio vamos a contar con la clase `Lavarropas` que lo único que sabe hacer es lavar ropa, sin más
(nuestro colega no estaba inspirado ese día).

La empresa desea que agreguemos diferentes programas de lavado así como la posibilidad de contar con un periodo de
enjuague y secado.

Todos los lavados cumplen con el siguiente ciclo:

* `prepararLavado():` Indica por pantalla que comenzó la carga de agua.

* `iniciarLavado():` Indica por pantalla lo establecido en el **TipoDeLavado**.
 
* `comenzarEnjuague():` Indica por pantalla que el enjuague comenzó.
      
* `centrifugar():` Indica por pantalla que el enjuague terminó y que comenzara el ciclo de centrifugado indicado en 
el _**TipoDeLavado**_. En caso de no tener centrifugado _**no mostrará nada**_.

### Tipos de lavado

* `LavadoNormal:` Indica por pantalla _**"Iniciando ciclo de lavado Normal Duracion 30 minutos"**_ y 
tendrá un ciclo de centrifugado `suave`.

* `LavadoRapido:` Indica por paltalla _**"Iniciando ciclo de lavado Rapido Duracion 15 minutos"**_ y 
será `sin centrifugado`.

* `LavadoExremo:` Indica por paltalla _**"Iniciando ciclo de lavado Rapido Duracion 45 minutos"**_ y 
será con centrifugado `extremo`. Este lavado a diferencia de los demas a mitad de ciclo va a 
`comenzarEnjuague()` y `prepararLavado()`. Luego continúa el ciclo normalmente.

