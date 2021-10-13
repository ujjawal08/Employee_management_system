class consultant extends Employee {
  override var empID: String = ""
  override var firstname: String = ""
  override var lastname: String  = ""
  override var salary:Double =30000
  override var prefID: String = _


  def consultant (EmpID:String, firstname:String, lastname: String,salary: Double): String={
    val prefix="CONS"
    val EmployeeId: String = SetEmpID(EmpID,prefix)


    SetFirstname(firstname)
    SetLastname(lastname)
    SetSalary(salary)
    EmployeeId
  }

}
