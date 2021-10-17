package com.example.top0.Top10.Entries

import org.simpleframework.xml.Element
import org.simpleframework.xml.Root
import java.io.Serializable


@Root(name = "entry", strict = false)
class Entry @JvmOverloads constructor(

    @field:Element(name = "name")
    @param:Element(name = "name")
    var name: String? = null

    ) : Serializable {}


// @field:ElementList(inline=true,name = "item")
//    @param:ElementList(name = "item")
//    val item: List<ClipData.Item>? = null