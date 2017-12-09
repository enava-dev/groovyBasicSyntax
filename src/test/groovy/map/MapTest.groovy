import spock.lang.Specification
import com.enh.learninggroovy.map.MapImp

class MapTest extends Specification{

  def "MapImp.main"(){
    setup:
      MapImp map = new MapImp()
    when:
      def result = map
    then:
      result != null
  }
}