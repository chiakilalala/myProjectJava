package yilin.com

fun  main(args:Array<String>){
    //list()
}

private fun list() {
    val list = listOf(5, 1, 2, 2, 7);
    println(list)
    val scores = listOf(68, 88, 77, 99, 50);

    for (score in scores) {
        println(score)
    }
    println(list.get(3)) //
    var mutableList = mutableListOf(5, 1, 2, 7) //motable 代表物件可以改變
    mutableList.add(6)
    println(mutableList)
}
