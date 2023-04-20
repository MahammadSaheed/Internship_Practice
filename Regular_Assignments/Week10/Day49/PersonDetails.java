class Address {
  int pincode;
  String city;

  Address(int pincode, String city) {
    this.pincode = pincode;
    this.city = city;
  }

  public int getPincode() {
    return pincode;
  }

  public void setPincode(int pincode) {
    this.pincode = pincode;
  }

  public String getCity() {
    return city;
  }

  public void setCity(String city) {
    this.city = city;
  }
}

class Person {
  String name;
  Address address;

  Person(String name, Address address) {
    this.name = name;
    this.address = address;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Address getAddress() {
    return address;
  }

  public void setAddress(Address address) {
    this.address = address;
  }

}

class PersonDetails {
  public static void main(String args[]) {
    Address address = new Address(574210, "puttur");
    Person person = new Person("biden", address);
    System.out.println("Name:-" + person.getName());
    System.out.println("Address:-" + person.getAddress().getPincode() + "," + person.getAddress().getCity());
  }
}