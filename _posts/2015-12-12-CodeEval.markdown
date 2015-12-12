---
layout: post
title:  "CodeEval - Try to solve it" 
date:   2015-12-12
---

## Challenge Description:

The history of cryptography has about four thousand years. It dates back to the days of the Ancient Rome and continues up till our times.
Over the years, a countless number of methods and encryption algorithms have emerged. 
However, as hackers say, there is nothing impossible to hack or decipher. 
Try your hand at decoding the code below and see how quickly you will get it right!
So, you have to determine the encryption algorithm of the message below and print the decoded word.
If you find the task too difficult, get a hint at the bottom of the page. 


### Input sample:

The first argument is a path to a file. Each row includes a test case with an encoded word:

{% highlight java %}
mke
mh
lhsby
pm
{% endhighlight %}

### Output sample:

You have to print the decoded word. 
 
{% highlight java %}
try
to
solve
it
{% endhighlight %}

### Constraints:

	1. The word can include from 2 to 40 symbols.
    2. All letters are lowercase.
    3. If you need a hint, select the text at the bottom of the page.
    4. The number of test cases is 40.

### Hint:

>!a | b | c | d | e | f | g | h | i | j | k | l | m
>!u | v | w | x | y | z | n | o | p | q | r | s | t 

{% highlight java %}
	public class Persona implements Comparable<Persona>{
		public int compareTo(Persona o) {
			return 0;
		}
		...
	}
{% endhighlight %}

Este es el cuerpo de método, dentro debemos indicar nuestro criterio de ordenación. Este método puede devolver:

- Un negativo si en nuestro orden, this va ANTES que persona
- Un positivo si en nuestro orden, this va DESPUÉS que persona (o dicho de otra manera, p debería ir ANTES que this)
- Un 0 si en nuestro orden, no nos importa cuál vaya delante o detrás... consideramos que ambas pueden ocupar la misma posición o son iguales

Por lo tanto rellenando nuestro método:

{% highlight java %}
    public int compareTo(Persona o) {
        if(this.getApellidos().compareToIgnoreCase(o.getApellidos())==0) {
            return this.getNombre().compareToIgnoreCase(o.getNombre());
        } else {
            return this.getApellidos().compareToIgnoreCase(o.getApellidos());
        }
    }
{% endhighlight %}

Pero si queremos poder ordenadar por otro criterio diferente al definido en la clase por defecto, deberemos crear una clase nueva y 
que ésta implemente la clase Comparator<T>, y deberemos definir el método **compare<T,T>**:

{% highlight java %}
	public class OrdenarPorOtroCriterio implements Comparator<Persona>{
		public int compare(Persona o1, Persona o2) {
			return o1.getDni().compareToIgnoreCase(o2.getDni());
		}
	}
{% endhighlight %}

Y finalmente, para utilizar estos criterios de ordenación deberemos utulizar:

{% highlight java %}
		LinkedList<Persona> lista = new LinkedList<>();
		Collections.sort(lista); // Ordena por apellido y si son iguales, por nombre
		Collections.sort(lista, new OrdenarPorOtroCriterio()); // Ordenada por dni
{% endhighlight %}


