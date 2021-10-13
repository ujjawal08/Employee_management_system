trait Employee {
  var empID: String
  var firstname: String
  var lastname: String
  var salary:Double
  var prefID:String

  def SetEmpID(EmpID:String,prefix:String): String = {
    this.empID = EmpID+prefix
    empID
  }
  def SetFirstname(Firstname:String): Unit={
    this.firstname=Firstname
  }
  def SetLastname(Lastname:String): Unit={
    this.lastname=Lastname
  }
  def SetSalary(Salary:Double): Unit={
    this.salary=Salary
  }
  def SetPrefix(Prefix:String): Unit= {
    this.prefID = Prefix
  }

  }
