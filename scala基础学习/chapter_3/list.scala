// 使用list
val oneTwo = List(1, 2)
val threeFour = List(3, 4)
val oneTwoThreeFour = oneTwo ::: threeFour
println(oneTwoThreeFour)

val twoThreeFour = 1 :: threeFour
println(twoThreeFour)

// ::为右操作元，必须在最后加Nil表示空列表
val oneTwoThree = 1 :: 2 :: 3 :: Nil
println(oneTwoThree)

println(oneTwoThreeFour.count(s => s > 2))  //按条件计数

/*
List.drop(2)  // 去掉头两个元素
List.dropRight(2)  // 去掉后两个元素 
List.exists(s => s > 2)  // 按条件判断是否存在
List.filter(s => s > 2)  // 按条件筛选
List.head  // 列表首元素
List.last  // 列表最后一个元素
List.init  // 列表除最后一个元素外组成的列表
List.tail  // 列表除首个元素外组成的列表
List.isEmpty  // 判断是否为空
List.length  // 列表元素个数
List.reverse // 列表反转
......
*/
