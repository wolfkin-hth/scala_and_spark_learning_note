// 参数化
/*
val greetStrings = new Array[String](3)

greetStrings(0) = "Hello"
greetStrings(1) = ", "
greetStrings(2) = "scala!\n"

for (i <- 0 to 2)
	print(greetStrings(i)) */

//等同于
/*
val greetStrings = new Array[String](3)

greetStrings.update(0, "Hello")
greetStrings.update(1, ", ")
greetStrings.update(2, "scala!\n")

for (i <- 0 to 2)
	print(greetStrings(i)) */

//更精简和常用的方法
val greetStrings = Array("Hello", ", ", "scala!\n")
for (i <- 0 to 2)
	print(greetStrings(i))

