package com.iflytek.scala.tjml

object Scalasorttest {
  def main(args: Array[String]): Unit = {
    val data = (1,2).productIterator.toList.sortBy(x=>x.toString.toInt).reverse.foreach(println)
    val data1 = List(2,1,3,4).sortBy(x=>x).foreach(println)
    val data2 = List(2,1,3,4).sortWith({
      case (a,b) => {
        if(a>b)
          true
        else
          false
      }
    }).foreach(println)
    List(2,1,3,4).sorted.foreach(println)

  }
}
