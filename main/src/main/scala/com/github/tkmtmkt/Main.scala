package com.github.tkmtmkt

import com.tangosol.net.CacheFactory;
import com.tangosol.net.NamedCache;

object Main extends App
{
  val hoge = CacheFactory.getCache("hoge")

  println("Hello, workld")
}
