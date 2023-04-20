import java.util.*;

class Employee{
  String e_id;
  String e_name;
  String e_address;
  String e_profession;
  String e_salary;

  Employee(  String e_id,String e_name,String e_address,String e_profession,String e_salary){
    this.e_id=e_id;
    this.e_name=e_name;
    this.e_address=e_address;
    this.e_profession=e_profession;
    this.e_salary=e_salary;
  }

public String getE_id() {
	return e_id;
}

public void setE_id(String e_id) {
	this.e_id = e_id;
}

public String getE_name() {
	return e_name;
}

public void setE_name(String e_name) {
	this.e_name = e_name;
}

public String getE_address() {
	return e_address;
}

public void setE_address(String e_address) {
	this.e_address = e_address;
}

public String getE_profession() {
	return e_profession;
}

public void setE_profession(String e_profession) {
	this.e_profession = e_profession;
}

public String getE_salary() {
	return e_salary;
}

public void setE_salary(String e_salary) {
	this.e_salary = e_salary;
}
  
}