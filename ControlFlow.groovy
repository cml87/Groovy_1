 def x = 34 // x will be a reference to an object, so it will be able to hold anything

 if (x < 10) {
    println "x is lower than 10"
 } else if (x>=10 && x<15) {
    println "x is greater or equal to ten, and less than 15"
 } else {
     println "x is greater then 15"
 }
 
 int y = 8 // better to use this, a type, the compiler can then help with type checking 
 switch(y) {
     case 0..8:
        println "y is in the range [0,8]"
        break
     case 9..15:
        println "y is in the range [9,15]"
        break
     default:
        println "y is in the range [16,inf)"
 }

 