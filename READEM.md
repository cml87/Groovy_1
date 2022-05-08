```text
groovy:000> 2+2
===> 4
groovy:000> Sytem.out.println("Feeling Groovy?")
Feeling Groogy
===> null
```

```text
groovy:000> age = 35
===> 35
groovy:000> println "You are " + age + " years old"
You are 35 years old
===> null
```

```text
groovy:000> :show variables
Variables:
  _ = null
  age = 35
===> [_:null, age:35]
```

```text
groovy:000> :help
For information about Groovy, visit:
    http://groovy-lang.org 
Available commands:
  :help      (:h ) Display this help message
  ?          (:? ) Alias to: :help
  :exit      (:x ) Exit the shell
  :quit      (:q ) Alias to: :exit
  import     (:i ) Import a class into the namespace
  :display   (:d ) Display the current buffer
  :clear     (:c ) Clear the buffer and reset the prompt counter
  :show      (:S ) Show variables, classes or imports
  :inspect   (:n ) Inspect a variable or the last result with the GUI object browser
  :purge     (:p ) Purge variables, classes, imports or preferences
  :edit      (:e ) Edit the current buffer
  :load      (:l ) Load a file or URL into the buffer
  .          (:. ) Alias to: :load
  :save      (:s ) Save the current buffer to a file
  :record    (:r ) Record the current session to a file
  :history   (:H ) Display, manage and recall edit-line history
  :alias     (:a ) Create an alias
  :set       (:= ) Set (or list) preferences
  :grab      (:g ) Add a dependency to the shell environment
  :register  (:rc) Register a new command with the shell
  :doc       (:D ) Open a browser window displaying the doc for the argument
For help on a specific command type:
    :help command 

groovy:000> :show variables
Variables:
  _ = null
  age = 35
===> [_:null, age:35]
groovy:000> 
groovy:000> :help :show
usage: :show [<variables|classes|imports|preferences|all>]

Show variables, classes, imports or preferences.
```


## Arithmetic operators

```text
groovy:000> 3**2
===> 9
groovy:000> 3**2.1
===> 10.04510856630514
groovy:000> 3**2.45
===> 14.75526705082986
groovy:000> 3.44**2.45
===> 20.633275846296637
```

```text
groovy:000> 1+"2"
===> 12
groovy:000> "a"+"b"
===> ab
```


## Groovy scripts

```groovy
println "Hello Groovy!" // Hello Groovy!

def x=5
y=x+4
println "The value of y is " + y + ". This is string concatenation (the interger in y promoted to string before concatenation)." 
println "The value of y is $y. This is string interpolation without brackets."
println "The value of y is ${y+1}. This is string interpolation with brackets, so we can include expressions to be evaluated."
println y  // 9. the value of y isn not incremented in the previous statement

y=22
y+=x
println y
```