import org.scalatest.flatspec.AnyFlatSpec

class attendanceTest extends AnyFlatSpec{
  val details= new attendance
  // ATTENDANCE TEST CASE//

  "attendance" should "give" in{
    val information = details.getAttendance("ujjawal singh",9.45,18.45)

    assert(information == 9.0)

  }


}
