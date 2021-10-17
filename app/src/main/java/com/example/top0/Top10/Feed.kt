package com.example.top0.Top10

import com.example.top0.Top10.Entries.Entry
import org.simpleframework.xml.ElementList
import org.simpleframework.xml.Namespace
import org.simpleframework.xml.Root
import java.io.Serializable


@Root(name = "feed", strict = false)
//@xmlns:im:http://itunes.apple.com/rss
@Namespace(prefix = "im", reference = "http://itunes.apple.com/rss")
class Feed constructor() : Serializable {

    @field:ElementList(inline = true, name = "entry")
    var entry: List<Entry>? = null

}


//   @field:Element( name = "entry")
//   var entry: Entry?=null