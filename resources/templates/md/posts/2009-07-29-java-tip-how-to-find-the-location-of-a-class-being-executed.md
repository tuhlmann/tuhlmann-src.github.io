{
  :title "Java Tip: How to find the location of a class being executed"
  :layout :post
  :banner "/img/home-bg.jpg"
  :hide-disqus? true
  :tags ["english" "programming"]
}

Today I wanted to find the location of a class file to make sure the class is really called from a specific jar file (old project with historically grown piles of archaeologically valuable code). Turns out this is pretty easy. For instance within the class you log the result of the following statement:

    URI uri = this.getClass().getProtectionDomain().getCodeSource().getLocation().toURI()

This will give you the exact place from witch the class was loaded.
