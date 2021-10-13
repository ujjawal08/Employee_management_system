import org.scalatest.flatspec.AnyFlatSpec

class presidentTest extends AnyFlatSpec{
  val details= new president
  //MANAGER TEST CASE//

  "president" should "give" in{
    val information = details.president("04","ujjawal","singh",80000)
    assert(information== "04POTC")
  }

}
