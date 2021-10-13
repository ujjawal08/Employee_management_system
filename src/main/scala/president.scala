class president extends Employee {
  override var empID: String = ""
  override var firstname: String = ""
  override var lastname: String  = ""
  override var salary:Double =80000
  override var prefID: String = _


  def president (EmpID:String, firstname:String, lastname: String,salary: Double): String={
    val prefix="POTC"
    val EmployeeId = SetEmpID(EmpID,prefix)



    SetFirstname(firstname)
    SetLastname(lastname)
    SetSalary(salary)
    EmployeeId
  }



}
