@main def init() ={
    def printFibonacci(n: Int): Unit = {
        def fibonacci(n: Int): Int = {
            if (n <= 1) n
            else fibonacci(n - 1) + fibonacci(n - 2)
        }

        for (i <- 0 until n)
            print(fibonacci(i) + " ")
    }

    printFibonacci(10)
}