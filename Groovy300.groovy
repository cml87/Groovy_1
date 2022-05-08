int[] xList = [1, 2, 3] // This is original groovy syntax

int[] xList2 = new int[] {1,2,3} // Java like syntax in Grooby 3.0.0

for (int x in xList2)
    println x

// The it variable is implicitly defined in the each method to give access to the object currently being iterated over
xList.each{ println " printing ${it}" }  // the block inside {..} is a clojure ?


// lambda expressions, Java style, Groovy 3.0.0
xList.each( (x) -> {print "$x "}  )

println ""
xList.each( (x) -> {
    if (x == 3)
        println "There is a x value of 3"
})