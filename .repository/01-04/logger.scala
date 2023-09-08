package e01

// Excercise 01: Inline defs
// Try to change the log method in such a way that it only adds the overheade to the execution when loggingEnabled is true.
// To check the generated bytecode you can use the following commands:
//    scala-cli compile 01-inline-defs -d out
//    javap -v out.e01.logger\$package\$

val loggingEnabled: false = false

inline def log(msg: String): Unit =
  inline if loggingEnabled then println(msg)

def square(x: Int): Int =
  log(s"square($x)")
  val res = x * x
  log(s"square($x) = $res")
  res