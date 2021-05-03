package com.eucalyptus.deeplinknavigation

class Item(private var productName:String, private var image: Int) {
    fun getName(): String { return productName  }
    fun getImage(): Int { return image  }
}