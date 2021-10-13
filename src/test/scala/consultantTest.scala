import org.scalatest.flatspec.AnyFlatSpec

class consultantTest extends AnyFlatSpec{




  val details= new consultant
  //CONSULTANT TEST CASE//

  "consultant" should "give" in {
    val information = details.consultant("01","ujjawal","singh",30000)
    assert(information== "01CONS")

  }




}
