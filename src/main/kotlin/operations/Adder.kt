package operations

import operations.Operation

class Adder(val a : Int, val b : Int) : Operation {
    override fun perform(): Int {
        return a + b
    }
}
