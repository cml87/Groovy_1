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