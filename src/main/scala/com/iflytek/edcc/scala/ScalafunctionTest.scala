package com.iflytek.edcc.scala

/**
  * created with idea
  * user:ztwu
  * date:2019/2/21
  * description
  */
object ScalafunctionTest {

  def main(args:Array[String]):Unit = {
    val f = (x:Int,y:Int) => {x+y}

    //按值传参
    test2(2,2)

    //按名传参
    //自定义
    test(f,2,2)

    //scala语法中常见
    Array(1,2).foreach((x:Int) => {println(x)})
    List(1,2,"a").foreach({case (x) => {println(x)}})

  }

  //按名传参
  // (Int,Int)=>Int表示一个函数类型，指定入参，出参类型
  def test(f : (Int,Int)=>Int, a : Int, b : Int): Unit = {
    val r = f(a,b)
    println("按名传参",r)
  }

  //按值传参
  def test2(x:Int,y:Int): Unit = {
    val r = x+y
    println("按值传参",r)
  }

}
