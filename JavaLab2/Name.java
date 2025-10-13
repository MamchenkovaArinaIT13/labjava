public class Name {
  //поля класса
  private String firstname;
  private String lastname;
  private String surrname;

  // конструкторы
  public Name() {
    this.firstname = null;
    this.lastname = null;
    this.surrname = null;
  }

  public Name(String firstname) {
    this.firstname = firstname;
    this.lastname = null;
    this.surrname = null;
  }

  public Name(String lastname,String firstname) {
    this.lastname = lastname;
    this.firstname = firstname;
    this.surrname = null;
  }

  public Name(String lastname, String firstname, String surrname) {
    this.lastname = lastname;
    this.firstname = firstname;
    this.surrname = surrname;
  }
  
  // геттеры и сеттеры
  public String getFirstname() {
    return this.firstname;
  }

  public void setFirstname(String firstname){
    this.firstname = firstname;
  }

  public String getLastname(){
    return this.lastname;
  }

  public void setLastname(String lastname){
    this.lastname = lastname;
  }

  public String getSurrname(){
    return this.surrname;
  }

  public void setSurrname(String surrname){
    this.surrname = surrname;
  }

  @Override
  public String toString() {
    String res = "";
    if (this.lastname!= null && !this.lastname.isEmpty()) {
      res += this.lastname;
    }
    if ( this.firstname != null && !this.firstname.isEmpty() ) {
      if (res.isEmpty()) {
        res = this.firstname;
      } else {
        res += " " + this.firstname;
      }
    }
    if (this.surrname != null && !this.surrname.isEmpty()) {
      if (res.isEmpty()) {
        res = this.surrname;
      } else {
        res += " " + this.surrname;
      }
    }
    return res;
  }

  public String toStringNow() {
    String result = "";

    if (this.firstname != null && !this.firstname.isEmpty()) {
      result = this.firstname;
    }

    if (this.surrname != null && !this.surrname.isEmpty()) {
      if (result.isEmpty()) {
        result = this.surrname;
      } else {
        result += " " + this.surrname;
      }
    }

    if (this.lastname != null && !this.lastname.isEmpty()) {
      if (result.isEmpty()) {
        result = this.lastname;
      } else {
        result += " " + this.lastname;
      }
    }

    return result;
  }
}
