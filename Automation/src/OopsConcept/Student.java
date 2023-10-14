package OopsConcept;

public class Student {
 private String name;
 private String college;
 private long rollNumber;
 private String Branch;
 /* Java bean class
  ->The private variables created in one class cannot be accessed in other class directly but they can be accessed through method.
  1)getMethod is used for returning the value of private variable.
  2)setMethod is used for setting the value for private variable.
  */
 
 public String getName() {
	  return name;
  }
 public void setName(String name) {
	 this.name = name;
 }
 public String getCollege() {
	  return college;
 }
 public void setCollege(String college) {
	 this.college = college;
 }
 public long  getRollNumber() {
	  return rollNumber;
}
 public void setRollNumber(long rollNumber) {
	 if(rollNumber>100000000 && rollNumber<999999999) {
	 this.rollNumber = rollNumber;}
 }
 public void setRollNumber(String rollNumber) {
	 if(rollNumber.length()>=10) {
	 this.rollNumber = Integer.valueOf(rollNumber);}
 }
 
 
 
}
