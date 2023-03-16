class InvalidAgeException extends Exception {
  InvalidAgeException(String str) {
    super(str);
  }
}
class VoteEligibility {
  static void validateAge(int age) throws InvalidAgeException {
    if (age < 18) {
      throw new InvalidAgeException("Invalid age");
    } else {
      System.out.println("eligible");
    }
  }
}
class Exception7 {
  public static void main(String args[]) {
    try {
      VoteEligibility.validateAge(21);
    } catch (InvalidAgeException s) {
      System.out.println(s);
    }
  }
}
