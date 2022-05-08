class Person {
    String name
    Date birthDay

    def print() {
        println "name is: ${name}\nbirthDay is: ${birthDay}"
    }

    String getPersonInfo() {
        return "name is: ${name}\nbirthDay is: ${birthDay}"
        // the return keyword can be omitted. Groovy will take the last line in the method body as the return statement
    }

}