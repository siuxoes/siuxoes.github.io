---
layout: post
title:  "Acepta el reto: Repartiendo el botin. 238" 
date:   2015-05-31
---

## Enunciado:

Al-Colleja y sus secuaces tienen que repartir el bot�n de su �ltimo golpe. No es una tarea f�cil, porque todos quieren llevarse lo m�ximo posible, y todos est�n armados�

Para no entrar en discusiones que terminen en tragedia, Al-Colleja ha ideado un sencillo m�todo en el que, en lugar de preocuparse de ser justos repartiendo en base a qui�n ha trabajado m�s en la consecuci�n del golpe, se lo deja pr�cticamente todo al azar. Prefiere recibir menos beneficios pero mantener la banda intacta.

El procedimiento es sencillo. Coge todos los billetes conseguidos y los pone en un mont�n tras barajarlos. Despu�s se coloca toda la banda en c�rculo y va dando un billete a cada uno, hasta que quedan todos repartidos. Eso s�, el primero que recibe billete es �l, de esa forma se asegura de que si los billetes se terminan a mitad de una vuelta, �l siempre habr� recibido uno adicional.

El componente de azar aparece porque los billetes est�n descolocados, as� que puede tocar en el reparto desde el m�sero billete de 10 hasta el deseado de 500...

### Entrada:
<blockquote>La entrada consta de una sucesi�n de casos de prueba o botines a repartir. Para cada bot�n aparece una primera l�nea que indica el numero de billetes que hay que repartir (como mucho 1.000) seguido del n�mero de participantes en el golpe que deben recibir recompensa (no m�s de 10). Siempre habr� al menos un billete y al menos un villano. La segunda l�nea contiene tantos n�meros como billetes, indicando su valor (todos los billetes tienen valor). El primer n�mero expresa la cuant�a del primer billete que se reparte.

La entrada termina con una l�nea con dos ceros que no debe procesarse.</blockquote>

### Salida:

<blockquote>Para cada caso de prueba se mostrar� una l�nea por cada participante. Cada l�nea tendr� un primer n�mero indicando la cantidad de dinero recibido seguido del car�cter ':' y la lista de billetes que recibe esa persona separados por espacios.

Tras cada caso de prueba aparecer� una l�nea con tres guiones (---).</blockquote>

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

<p class="intro"><span class="dropcap">A</span>qu� [tiene][Enlace] una propuesta de soluci�n para el problema.�ste c�digo es funcional, resuelve el problema, pero no es eficiente ni mucho menos,
probablemente exist�n mejores formas de resolver esto.</p>
[Enlace]: https://github.com/siuxoes/siuxoes.github.io/blob/master/Java-code/RepartiendoElBotin.java