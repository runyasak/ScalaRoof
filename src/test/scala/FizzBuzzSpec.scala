import org.scalatest.funsuite._

class FizzBuzzSpec extends AnyFunSuite {
  test("Hello should start with H") {
    assert("Hello".startsWith("H"))
  }

  test("it should count 1 when input is 1") {
    var fizzBuzz = new FizzBuzz()
    assert("1" == fizzBuzz.count(1))
  }

  test("it should count 2 when input is 2") {
    var fizzBuzz = new FizzBuzz()
    assert("2" == fizzBuzz.count(2))
  }

  test("it should count Fizz when input is 3") {
    var fizzBuzz = new FizzBuzz()
    assert("Fizz" == fizzBuzz.count(3))
  }

  test("it should count Buzz when input is 5") {
    var fizzBuzz = new FizzBuzz()
    assert("Buzz" == fizzBuzz.count(5))
  }

  test("it should count FizzBuzz when input is 15") {
    var fizzBuzz = new FizzBuzz()
    assert("FizzBuzz" == fizzBuzz.count(15))
  }
}
