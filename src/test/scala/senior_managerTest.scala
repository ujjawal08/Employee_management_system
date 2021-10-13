import org.scalatest.flatspec.AnyFlatSpec

class senior_managerTest extends AnyFlatSpec{

  val details= new senior_manager
  //MANAGER TEST CASE//

  "senior_manager" should "give" in{
    val information = details.manager("03","ujjawal","singh",60000)
    assert(information== "03SRMA")
  }

}
