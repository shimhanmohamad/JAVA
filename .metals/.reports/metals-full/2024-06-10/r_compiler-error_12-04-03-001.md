file:///C:/Users/Lenovo/Desktop/java/mutiarray.java
### java.util.NoSuchElementException: next on empty iterator

occurred in the presentation compiler.

presentation compiler configuration:
Scala version: 3.3.3
Classpath:
<HOME>\AppData\Local\Coursier\cache\v1\https\repo1.maven.org\maven2\org\scala-lang\scala3-library_3\3.3.3\scala3-library_3-3.3.3.jar [exists ], <HOME>\AppData\Local\Coursier\cache\v1\https\repo1.maven.org\maven2\org\scala-lang\scala-library\2.13.12\scala-library-2.13.12.jar [exists ]
Options:



action parameters:
offset: 433
uri: file:///C:/Users/Lenovo/Desktop/java/mutiarray.java
text:
```scala
public class mutiarray {
    public static void main(String[] args) {
        Double num[][] = new Double[2][3];
        for(int i=0;i<2;i++){
            for(int j=0;j<3;j++){
                num[i][j] = (Math.random() * 100);
                System.out.print(num[i][j] +" ");
            }
            System.out.println();
        }

        System.out.println();
        for(Double n[] : num){
            for(Double@@ m : n){
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
	scala.meta.internal.pc.SignatureHelpProvider$.signatureHelp(SignatureHelpProvider.scala:40)
	scala.meta.internal.pc.ScalaPresentationCompiler.signatureHelp$$anonfun$1(ScalaPresentationCompiler.scala:412)
```
#### Short summary: 

java.util.NoSuchElementException: next on empty iterator