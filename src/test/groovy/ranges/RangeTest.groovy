import spock.lang.Specification
import ranges.RangeImp

class RangeTest extends Specification{

  def "RangeImp.createRangeFrom1to10"(){
    setup:
      RangeImp range = new RangeImp()
    when:
      def result = range.createRangeFrom1to10()
    then:
      result.get(0) == 1
      result.get(1) == 2
      result.get(2) == 3
      result.get(3) == 4
      result.get(4) == 5
      result.get(5) == 6
      result.get(6) == 7
      result.get(7) == 8
      result.get(8) == 9
      result.get(9) == 10
  }

  def "RangeImp.createCustomRange"(){
    setup:
      RangeImp range = new RangeImp()
    when:
      List<Integer> result = range.createCustomRange(3, 6)
    then:
      result.get(0) == 3
      result.get(1) == 4
      result.get(2) == 5
      result.get(3) == 6
  }

}