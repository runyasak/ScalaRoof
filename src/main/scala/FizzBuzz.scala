class FizzBuzz {
  def count(input: Int): String = {
    if (input % 3 == 0 && input % 5 == 0) "FizzBuzz"
    else if (input % 3 == 0) "Fizz"
    else if (input % 5 == 0) "Buzz"
    else input.toString()
  }
}
