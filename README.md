# clobar

Get a Clojure repl in your JVM project.

## Usage

Depend on `so.dang.cool:clobar` from Maven Central or Clojars.

```java
import so.dang.cool.clobar.Clobar;
```

```java
// In some scope...
Clobar.pry(interestingVariable);
```

## FAQ

> Why not use a debugger?

Yes, use a debugger, this is not a debugger replacement. Sometimes it's more
productive to get an instance of something to directly manipulate, inspect,
call methods, etc.

## TODO

The experience is not polished. I have a number of open questions:

1. Can we get better handling for Java objects?
2. Can we load the full runtime context? (Example: Load all imports and
   variables in scope.)
3. Can we do this with other JVM shells? Especially `jshell`, but also the
   Kotlin/Scala/Groovy equivalents.

## Credits

A 2023 side quest of J.R. Hill
