fun add(a: LinkedList<Int>, b: LinkedList<Int>): Int {

val size = maxOf(a.size, b.size) //one may be bigger than the other. if so, add zero and the bigger number

var sum = 0

repeat(size) { i ->

val x = a.pollFirst() ?: 0 //pollFirst() runs in O(1) and incurs no resize

val y = b.pollFirst() ?: 0

sum += (x + y) * Math.pow(10.0, i.toDouble()).toInt() //10^i, to correct for decimal places

}

return sum

}

