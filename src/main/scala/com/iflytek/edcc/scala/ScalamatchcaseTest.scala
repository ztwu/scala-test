package com.iflytek.edcc.scala

/**
  * created with idea
  * user:ztwu
  * date:2019/5/31
  * description
  */
object ScalamatchcaseTest {

  def main(args:Array[String])={

    //变量match case 值 =>
    "a" match {
      case "a" => println("这是a")
      case _ => println("这不是a")
    }

    val str = "ab"
    str match {
      case "a" => println("这是a")
      case _ if str.length == 2 => println("长度等于2")
      case _ => println("这不是a")

    }

    test1()

    test2()

  }

  def test1(): Unit ={
    val p1 = new P1()
    p1 match {
      case a:P1 => a.test1()
      case a:P2 => a.test1()
      case _ => "不存在对象"
    }
  }

  def test2(): Unit ={
    Array("1") match {
      case Array("1") => println("1")
      case Array("2") => println("2")
      case Array("3") => println("3")
      case _ => println("不存在")
    }
  }

}

class P1{

  def test1(): Unit ={
    println("p1")
  }

}

class P2{
  def test1(): Unit ={
    println("p2")
  }
}
