package ranges

class RangeMain{

  static void main(String[] args){

    println('### RangeMain ###')
    RangeImp range = new RangeImp()
    def r1 = range.createRangeFrom1to10()
    println("r1: $r1")
    def r2 = range.createCustomRange(17, 25)
    println("r2: $r2")
    def r3 = range.createCustomRange(66, 72)
    println("r3: $r3")

  }
}