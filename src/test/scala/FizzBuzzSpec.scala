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
}
