import org.scalatest.flatspec.AnyFlatSpec

class managerTest extends AnyFlatSpec{

  val details= new manager
  //MANAGER TEST CASE//

  "manager" should "give" in{
    val information = details.manager("02","ujjawal","singh",40000)
    assert(information== "02MANA")
  }

}
