import org.scalatest.funsuite._

class FizzBuzzSpec extends AnyFunSuite {
  test("Hello should start with H") {
    assert("Hello".startsWith("H"))
  }

  test("it should count 1 when input is 1") {
    var fizzBuzz = new FizzBuzz()
    assert("1" == fizzBuzz.count(1))
  }
}
