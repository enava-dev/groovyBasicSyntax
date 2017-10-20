package range;

class SimpleRange{

    void runMethods(){
        println('SimpleRange.runMethods ...')
        test1()
        test2()
    }

    void test1(){
        println('SimpleRange.test1 ...')
        def range = 1..10
        for(def x in range){
            println("x: $x")
        }
    }

    void test2(){
        println('SimpleRange.test2')
        int[] range = 1..10
        for(def x in range){
            println("x: $x")
        }
    }
}