file:///C:/Users/Lenovo/Desktop/java/mutiarray.java
### java.util.NoSuchElementException: next on empty iterator

occurred in the presentation compiler.

presentation compiler configuration:
Scala version: 3.3.3
Classpath:
<HOME>\AppData\Local\Coursier\cache\v1\https\repo1.maven.org\maven2\org\scala-lang\scala3-library_3\3.3.3\scala3-library_3-3.3.3.jar [exists ], <HOME>\AppData\Local\Coursier\cache\v1\https\repo1.maven.org\maven2\org\scala-lang\scala-library\2.13.12\scala-library-2.13.12.jar [exists ]
Options:



action parameters:
offset: 206
uri: file:///C:/Users/Lenovo/Desktop/java/mutiarray.java
text:
```scala
public class mutiarray {
    public static void main(String[] args) {
        int num[][] = new int[2][3];
        for(int i=0;i<2;i++){
            for(int j=0;j<3;j++){
                num[i][j] = (i@@(Math.random() * 100);
                System.out.print(num[i][j] +" ");
            }
            System.out.println();
        }

        System.out.println();
        for(int n[] : num){
            for(int m : n){
                System.out.print(m + " " );
            }
            System.out.println();
        }

    }
}

```



#### Error stacktrace:

```
scala.collection.Iterator$$anon$19.next(Iterator.scala:973)
	scala.collection.Iterator$$anon$19.next(Iterator.scala:971)
	scala.collection.mutable.MutationTracker$CheckedIterator.next(MutationTracker.scala:76)
	scala.collection.IterableOps.head(Iterable.scala:222)
	scala.collection.IterableOps.head$(Iterable.scala:222)
	scala.collection.AbstractIterable.head(Iterable.scala:933)
	dotty.tools.dotc.interactive.InteractiveDriver.run(InteractiveDriver.scala:168)
	scala.meta.internal.pc.MetalsDriver.run(MetalsDriver.scala:45)
	scala.meta.internal.pc.completions.CompletionProvider.completions(CompletionProvider.scala:46)
	scala.meta.internal.pc.ScalaPresentationCompiler.complete$$anonfun$1(ScalaPresentationCompiler.scala:147)
```
#### Short summary: 

java.util.NoSuchElementException: next on empty iterator