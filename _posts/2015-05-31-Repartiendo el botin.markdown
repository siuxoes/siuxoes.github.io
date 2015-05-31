---
layout: post
title:  "Acepta el reto: Repartiendo el botin. 238" 
date:   2015-05-31
---

## Enunciado:

Al-Colleja y sus secuaces tienen que repartir el botín de su último golpe. No es una tarea fácil, porque todos quieren llevarse lo máximo posible, y todos están armados…

Para no entrar en discusiones que terminen en tragedia, Al-Colleja ha ideado un sencillo método en el que, en lugar de preocuparse de ser justos repartiendo en base a quién ha trabajado más en la consecución del golpe, se lo deja prácticamente todo al azar. Prefiere recibir menos beneficios pero mantener la banda intacta.

El procedimiento es sencillo. Coge todos los billetes conseguidos y los pone en un montón tras barajarlos. Después se coloca toda la banda en círculo y va dando un billete a cada uno, hasta que quedan todos repartidos. Eso sí, el primero que recibe billete es él, de esa forma se asegura de que si los billetes se terminan a mitad de una vuelta, él siempre habrá recibido uno adicional.

El componente de azar aparece porque los billetes están descolocados, así que puede tocar en el reparto desde el mísero billete de 10 hasta el deseado de 500...

### Entrada:
La entrada consta de una sucesión de casos de prueba o botines a repartir. Para cada botín aparece una primera línea que indica el numero de billetes que hay que repartir (como mucho 1.000) seguido del número de participantes en el golpe que deben recibir recompensa (no más de 10). Siempre habrá al menos un billete y al menos un villano. La segunda línea contiene tantos números como billetes, indicando su valor (todos los billetes tienen valor). El primer número expresa la cuantía del primer billete que se reparte.

La entrada termina con una línea con dos ceros que no debe procesarse.

### Salida:
Para cada caso de prueba se mostrará una línea por cada participante. Cada línea tendrá un primer número indicando la cantidad de dinero recibido seguido del carácter ':' y la lista de billetes que recibe esa persona separados por espacios.

Tras cada caso de prueba aparecerá una línea con tres guiones (---).

### Entrada de ejemplo:

{% highlight java %}
5 2
10 20 50 200 500
1 2
50
0 0
{% endhighlight %}

### Entrada de Salida:

{% highlight java %}
560: 10 50 500
220: 20 200
---
50: 50
0:
---
{% endhighlight %}

Aquí [tiene][Enlace] una propuesta de solución para el problema.Éste código es funcional, resuelve el problema, pero no es eficiente ni mucho menos,
probablemente existán mejores formas de resolver esto.

[Enlace]: https://github.com/siuxoes/siuxoes.github.io/blob/master/Java-code/RepartiendoElBotin.java
