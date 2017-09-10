package Student;

public class InvalidPhoneNumberException extends Exception{
  InvalidPhoneNumberException(){
    super("Phone no must be 10 digits");
  }
}
