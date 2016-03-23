{
  :title "Announce: Dopus 0.9.16 released"
  :layout :post
  :banner "/img/home-bg.jpg"
  :show-disqus? false
  :tags ["docbook" "dopus" "english" "programming"]
}

Dear Dopus users, I just release version 0.9.16 of Dopus. This is a bugfix release, with the following enhancements:
-   Fixed bug with the new document.type mechanism. There was an oversight for documents that contain sub documents of a different document type than the main document. In localbuild.properties you can now add additional entries of the for document.&lt;file name&gt;.type=article|book|... Now when you process your sub document and an entry for this document is found it overwrites the document.type setting. This also is possible for the master document. So you might set document.type to the default document type and overwrite only those that differ from that one.

Dopus can be downloaded from the [usual place](http://cms.agynamix.de/downloads/cat_view-2.html). Enjoy!
