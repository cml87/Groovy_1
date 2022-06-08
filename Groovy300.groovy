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

def llist = ['* kdjfl','dfsd ', 'dfsd']
println llist
llist.removeAll{it.startsWith('*')}
println llist

String[] remoteBranches = new String[]{"* (HEAD detached at origin/master)    d9cbe69 Merge branch 'release/2.6.0' into 'master'",
"  remotes/origin/develop              c4dccaa Merge branch 'feature/add_something' into develop",
"  remotes/origin/feature/fix_checkout 05f4884 comment",
"  remotes/origin/master               d9cbe69 Merge branch 'release/2.6.0' into 'master'",
"  remotes/origin/release/2.6.0        6edd377 Update applicationConfig-Best.properties"}

remoteBranchesList = []
for (int i = 0; i<remoteBranches.size(); i++){
    remoteBranchesList.add("${remoteBranches[i]}".trim())
}

println "original: " + remoteBranchesList
remoteBranchesList.removeAll{it.startsWith('*')}
println "after remove*: " + remoteBranchesList


println "_______"
for (int i = 0; i<remoteBranchesList.size(); i++){
    remoteBranchesList[i] = remoteBranchesList.get(i).split().getAt(0).replace("remotes/","")
    // println elem
    //remoteBranchesList[i] = remoteBranchesList.get(i).split().get(0)
}

println '--------'
String dd = "remotes/origin/develop              c4dccaa Merge branch 'feature/add_something' into develop"
println dd.split()




