import org.scalatest.FunSuite
import dmp.CubeCalculator

class CubeCalculatorTest extends FunSuite{
  test("CubeCalculator.cube"){
    assert(CubeCalculator.cube(3) === 27)
    println(CubeCalculator.cube(3))
  }

}
