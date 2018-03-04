import spock.lang.Specification
import com.enh.learninggroovy.map.MapImp

class MapTest extends Specification{

  def "MapImp.createMap"(){
    setup:
      MapImp map = new MapImp()
    when:
      def result = map.createMap()
    then:
      result.Emmanuel == 32
      result.Hessell == 26 
  }
}