---
layout: post
title:  "CodeEval - Try to solve it JAVA" 
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

a | b | c | d | e | f | g | h | i | j | k | l | m

u | v | w | x | y | z | n | o | p | q | r | s | t 

### My solution:

According to the hint, I created to lists of Strings(It could have been of chars), you may name as you want:

{% highlight java %}
    private ArrayList<String> listaP;
    private ArrayList<String> listaS;
{% endhighlight %}

Now we need to define a method to fill this two lists, in my case I've used a for loop to fill the first one and
two for loops two fill the second one, like this:

{% highlight java %}
    public void llenarListas() {
       char letra;
       listaP = new ArrayList<>();
       for (letra = 'a'; letra <= 'm'; letra++) {
           listaP.add(Character.toString(letra));
       }
       listaS = new ArrayList<>();
       for (letra = 'u'; letra <= 'z'; letra++) {
           listaS.add(Character.toString(letra));
       }
       for (letra = 'n'; letra <= 't'; letra++) {
           listaS.add(Character.toString(letra));
       }
    }
{% endhighlight %}

As you see the first loop goes from **A** to **M** and this is all we need for our first list. And for the second
list we need two loops, one from **U** to **Z** and another from **N** to **t**.

Now that we have our lists ready, we need to define a method to work with this lists and the input to obtain
an output.

The first thing you need to notice is that there is a "direct mapping" for every char of the string "mke" to
its solution "try":

	* The index of 'm' is 12, if you get the value on that index on the second list the result is 't'
	* The index of 'k' is 10, if you get the value on that index on the second list the result is 'r'
	* The index of 'e' is 4, if you get the value on that index on the second list the result is 'y'

All of this works until you get to the third lane "lhsby", here you need to notice that the char 'y' is not
in our firt list but it is on second list, so we need to "map" from the second to the first as well:

	* The index of 'y' is 4, if you get the value on that index on the first list the result is 'e'

So now we are able to define our method:

{% highlight java %}
	public String resolver(String res) {
        String resultado = "";
        for (int i = 0; i < res.length(); i++) {
            int index = listaP.indexOf("" + res.charAt(i));
            if(index != -1){
                resultado += listaS.get(index);
            }else{
                index = listaS.indexOf("" + res.charAt(i));
                resultado += listaP.get(index);
            }
        }
        return resultado;
    }
{% endhighlight %}

So basically the method iterates all the chars in a String and search for the index of the char in the first list
and the gets the char from the second list on that index. But if the result is -1 (The char is not in our list), it does
the opposite thing.

And after its done, it returns the output.

So now we can make our main method from the template CodeEval provides us:

{% highlight java %}
	 public static void main(String[] args) throws IOException {
        Main it = new Main();
        it.llenarListas();
        File file = new File(args[0]);
        BufferedReader buffer = new BufferedReader(new FileReader(file));
        String line;
        while ((line = buffer.readLine()) != null) {
            line = line.trim();
            if (line.length() != 0) {
                System.out.println(it.resolver(line));
            }
        }
    }
{% endhighlight %}

So basically our method read from a file given as argument, and reads line by line (when is not an "\n"),
and outputs the result.

I hope it helps you!


PS: Please keep in mind that this code is not optimized, and there are better ways of doing this.


