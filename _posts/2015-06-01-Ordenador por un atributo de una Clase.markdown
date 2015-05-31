---
layout: post
title:  "Ordenar por un atributo de una Clase" 
date:   2015-06-01
---

## Enunciado:

Si alguna vez ha sentido la necesidad de ordenar una lista, por los objetos de la misma habrá podido obsevar
que no se puede hacer direcamente **Collections.sort(Lista)**, primero debe introducir un criterio de ordenación
en la clase.


### Ejemplo:

Supongamos que tenemos la clase:

{% highlight java %}
public class Persona{

    private String nombre;
    private String apellidos;
	private String dni;
	
    public Persona(String nombre, String apellidos, String dni) {
        this.nombre = nombre;
        this.apellidos = apellidos;
		this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }
	
	public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

}
{% endhighlight %}

Y queremos poder ordenador por el apellido, y si éste por alguna razón es igual, lo ordenaremos por
el nombre. Para esto debemos implementar la clase **Comparable<Persona>**, <T> puede ser 
cualquier clase que queramos comparar.

Al hacer esto nos dirá que debemos incorporar el metodo **compareTo(T)**:

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
	public class OrdenarPorOtroCriterio implements Comparable<Persona>{
		public int compare(Persona o1, Persona o2) {
			return o1.getDni().compareToIgnoreCase(o2.getDni());
		}
		...
	}
{% endhighlight %}

Y finalmente, para utilizar estos criterios de ordenadoción deberemos utulizar:

{% highlight java %}
	LinkedList<Persona> lista = new LinkedList<>();
	Collections.sort(lista); // Ordena por apellido y si son iguales, por nombre
	Collections.sort(lista, new OrdenarPorOtroCriterio()); // Ordenada por dni
{% endhighlight %}


