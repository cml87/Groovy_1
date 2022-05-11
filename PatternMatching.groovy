
repoTags = ["2.0.0", "2.1.0", "_2.2.0-SNAPSHOT.17", "_2.2.0-SNAPSHOT.30", "_2.2.0-SNAPSHOT.6", "_2.2.0-rc.1+14","_2.3.0-SNAPSHOT.16",
"_2.3.0-SNAPSHOT.17"]

String snapshotVersion = "_2.2.0-SNAPSHOT.17"

String str = snapshotVersion.substring(  snapshotVersion.indexOf("SNAPSHOT")+"SNAPSHOT".size()    )
println snapshotVersion.replace(str,"")

print "pppppp"
for (int i = 0; i < repoTags.size(); i++) {  // i will be a local varible to the loop
     println "${repoTags[i]}"
}

// def finder = ('groovy' =~ /gr.*/)
// println finder instanceof java.util.regex.Matcher
 
// def matcher = ('groovy' ==~ /gr.*/)
// println matcher instanceof Boolean


println "unmatching tags" 
for (int i = 0; i < repoTags.size(); i++) {  // i will be a local varible to the loop
    if (!(repoTags[i] ==~ /(\d+)\.(\d+)\.(\d+)/))
        println "${repoTags[i]}"
}
println "XXXXXXXXXXXXXXXXXXXXX"

//println ""
//printArray(repoTags) 
println "---"
repoTags = "2.0.0\n2.1.0\n_2.2.0-SNAPSHOT.17\n_2.2.0-SNAPSHOT.30"
println repoTags
String[] repoTagsArray = repoTags.split('\n')
println "xxxx"
for (String s: repoTagsArray)
    println s
println "xxxx"

/*
      String a = "Hello-World";
      String[] str;
      str = a.split('-');
      
      for( String values : str )
      println(values);
*/

// println !('Groovy rocks!' ==~ /Groovy/)  // ==~ looks for an exact match.
// println 'Groovy rocks!' ==~ /Groovy.*/
 
// Groovy matcher syntax can be used in other methods.
// println (['abc'] == ['def', 'abc', '123'].findAll { it =~ /abc/ })
// println ([false, false, true] == ['def', 'abc', '123'].collect { it ==~ /\d{4}/ })


private printArray(array) {
    for (int i = 0; i < array.size(); i++) {  // i will be a local varible to the loop
         println "${array[i]}"
    }
}


private String writeAnsibleVars(map) {
    def out = "--extra-vars \""
    map.each { k, value -> out += "${k}=${value} " };
    out += " \"";
    return out;
}

/**
 * return the release number from branch or tag if available
 * @param map
 * @return
 */
private String getReleaseVersion() {
    if (env.TAG_NAME != null)
        return env.TAG_NAME.substring(1)
    else if (env.BRANCH_NAME.contains('release')) {
        return env.TAG_NAME.substring(9) //Basically remove "release/v" from release/v1.0.1
    }
}