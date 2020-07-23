import operations.Adder
import operations.Divider

fun main(){
    val adder = Adder(2,2)

    print(adder.perform())
    print(adder.perform())
    print(Divider(3,14))
}