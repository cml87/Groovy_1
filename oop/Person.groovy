class Person {
    String name
    Date birthDay

    def print() {
        println "name is: ${name}\nbirthDay is: ${birthDay}"
    }

    String getPersonInfo() {
        return "name is: ${name}\nbirthDay is: ${birthDay}"
    }

}