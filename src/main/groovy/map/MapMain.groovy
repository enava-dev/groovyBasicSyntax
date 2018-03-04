package com.enh.learninggroovy.map

class MapMain{
  
  static void main(String[] args){
    
    println('### MapMain ###')
    MapImp map = new MapImp()
    def result = map.createMap()
    println("result: $result")
    println("result.Emmanuel: $result.Emmanuel")
    println("result.Hessell: $result.Hessell")
    println("result.algo: $result.algo")
    println("result.key: $result.key")
  }
  
}