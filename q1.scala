@main def init() ={
    def isPrime(n: Int): Boolean = {
        def isDivisibleBy(d: Int): Boolean = {
            if (d <= 1) true
            else if (n % d == 0) false
            else isDivisibleBy(d - 1)
        }

        if (n <= 1) false
        else isDivisibleBy(n - 1)
    }

    println(isPrime(5))
    println(isPrime(8))
}