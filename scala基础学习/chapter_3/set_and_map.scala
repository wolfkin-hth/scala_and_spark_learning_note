// 集合和映射
// 默认不可变集
var jetSet = Set("A", "B")
jetSet += "C"
println(jetSet.contains("D"))

// 可变集
import scala.collection.mutable
val movieSet = mutable.Set("Hitch", "Poltergeist")
movieSet += "Shrek"
println(movieSet)

// 不可变HashSet
import scala.collection.immutable.HashSet
val hashSet = HashSet("T", "C")
println(hashSet + "Coriander")

// 可变映射
import scala.collection.mutable
val treasureMap = mutable.Map[Int, String]()
treasureMap += (1 -> "Go to island.")
treasureMap += (2 -> "Find big X on ground.")
treasureMap += (3 -> "Dig.")
println(treasureMap)

// 默认不可变映射
val romanNumeral = Map(1 -> "I", 2 -> "II", 3->"III", 4 -> "IV", 5 -> "V")
println(romanNumeral(4))
