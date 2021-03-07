fun main() {
/*    val table = OpenHashSet<Int>(10)
    for(i in 9 downTo 0){
        table.add(i)
    }
    for(i in 0..9){
        println(table.elements[i])
    }*/
    val table = OpenHashSet<String>(3)
    println("Empty: ${table.isEmpty()}")
    println(table.add("Hello"))
    println("Empty: ${table.isEmpty()}")
    println(table.add("Hello"))
    println(table.add("It's work"))
    println(table.add("Bye"))
    println(table.add("Something one"))

    val table1 = OpenHashSet<String>(3)
    println(table1.add("Hello"))
    println(table1.add("It's work"))
    println("Equals: ${table.equals(table1)}")
    println(table1.add("Bye"))
    println(table1.add("Something two"))
    println("Equals: ${table.equals(table1)}")
}