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

 int x1=2
 int x2=33
 int x3=54
 int x4=7
 int xTotal=0

 List xList = [x1, x2, x3, x4]
 int counter = 0
 while (counter < xList.size()) {
     println "printing xList[${counter}] = ${xList[counter]}"
     xTotal += xList[counter]
     counter++
 }
 println "total is $xTotal"

  for (int i = 0; i < xList.size(); i++) {  // i will be a local varible to the loop
     println "printing xList[${counter}] = ${xList[i]}"
 }

  for (int xValue in xList) {  // i will be a local varible to the loop
     println "printing xValue: ${xValue}"
 }
println "_________"

String BRANCH_NAME = "hotfix/7.9";


private String getBranchType(String branchName) {
   if (branchName.equals("master"))
      return "master"
   else if (branchName.equals("develop"))
      return "develop"
   else if (branchName.startsWith("release/"))
      return "release"
   else if (branchName.startsWith("hotfix/"))
      return "hotfix"
   else
      return "not_a_gitflow_branch"
}


private String getVersion_tagRepo (String branchType){
    switch(branchType) {
     case "feature":
         return "fea"
         break
     case "master":
        return "master"
        break
     case "develop":
        return "deve"
        break
      case "release":
        return "rele"
        break
      case "hotfix":
        return "hotfi"
        break  
     default:
        return "unknown_banch type"
   }
}
String ss = getVersion_tagRepo("hotfix")
println ss


// private String getVersion_Nexus (String branchType) {


// }
