@main def init() ={
    def sumEven(n: Int): Int = {
        if (n <= 0) 0
        else if (n % 2 == 0) n + sumEven(n - 2)
        else sumEven(n - 1)
    }

    println(sumEven(10))
}