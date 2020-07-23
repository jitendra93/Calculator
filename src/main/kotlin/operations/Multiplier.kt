package operations

class Multiplier(val a : Int, val b: Int) :Operation{
    override fun perform(): Int {
        return a * b
    }
}