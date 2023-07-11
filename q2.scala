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

    def primeSeq(n: Int): Unit = {
        def printPrimes(curr: Int): Unit = {
            if (curr <= n) {
                if (isPrime(curr))
                    print(s"$curr ")
                printPrimes(curr + 1)
            }
        }

        printPrimes(2)
    }

    primeSeq(10)
}