// 从hello开始学习一门新语言
println("Hello, scala!")
// args参数获取
// println("Hello, " + args(0) + "!")

// while
// print不换行
var i = 0
while (i < args.length){
	if (i != 0)
		print(" ")
	print(args(i))
	i +=1
}
println()

// foreach遍历
args.foreach(println)
// 函数字面量  (x: Int, y: Int) => x + y
// for遍历
for (arg<-args)
	println(arg)
