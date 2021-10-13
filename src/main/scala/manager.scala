class manager extends Employee {
  override var empID: String = ""
  override var firstname: String = ""
  override var lastname: String  = ""
  override var salary:Double =50000
  override var prefID: String = _


  def manager (EmpID:String, firstname:String, lastname: String,salary: Double): String= {
    val prefix = "MANA"
    val EmployeeId = SetEmpID(EmpID, prefix)


    SetFirstname(firstname)
    SetLastname(lastname)
    SetSalary(salary)
    EmployeeId
  }

}
