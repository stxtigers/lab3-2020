//DO NOT MODIFY!  I will run your Main.java with
//an unmodified version of this file.  You may
//however examine this file to get a sense of how
//this Player class works (see API in Lab 3 also)

public class Player
{
  //Instance Vars
  String firstName;
  String lastName;
  String position;
  boolean isActive; //true if actively on a team roster
  int age;
  int stuID; //student ID number

  //Constructor Methods
  Player() //defaults
  {
    this.firstName = "NO ENTRY";
    this.lastName = "NO ENTRY";
    this.position = "NO ENTRY";
    this.isActive = false;
    this.age = 0;
    this.stuID = 0;
  }

  Player(String firstName, String lastName, String position, boolean isActive, int age, int stuID) //kitchen sink
  {
    this.firstName = firstName;
    this.lastName = lastName;
    this.position = position;
    this.isActive = isActive;
    this.age = age;
    this.stuID = stuID;
  }

  //Getter Methods
  public String getFirstName()
  {
    return firstName;
  }
  public String getLastName()
  {
    return lastName;
  }
  public int getAge()
  {
    return age;
  }
  public String getPlayerInfo()
  {
    return firstName+","+lastName+","+position+","+isActive+","+age+","+stuID;
  }

  //Setter Methods
  public void setFirstName(String fn)
  {
    firstName = fn;
  }
  public void setLastName(String ln)
  {
    firstName = ln;
  }
  public void setAge(int age)
  {
    this.age = age;
  }

  //Other Methods
  public void activate()
  {
    isActive = true;
  }
  public void deactivate()
  {
    isActive = false;
  }
}