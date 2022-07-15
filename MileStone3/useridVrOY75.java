/*Joseph’s team has been assigned the task of creating user-ids for all
participants of an online gaming competition. Joseph has designed a process for generating the
user-id using the participant's First_Name,Last_Name, PIN code and a number N. The process
defined by Joseph is as below -
Step1 - Compare the lengths of First_Name and Last_Name of the participant. The one that is
shorter will be called “Smaller Name” and the one that islonger will be called the “Longer
Name”. If both First_Name and Last_Name are of equal Length, then the name that appears
earlier in alphabetical order will be called “Smaller Name” and the name that appears later in
alphabetical order will be called the “Longer Name”.
Step2-The user-id should be generated as below –
Last Letter of the longer name + Entire word of the smaller name + Digit at position N in the
PIN when traversing the PIN from left to right + Digit at position N in the PIN when traversing
the PIN from right to left
Step 3 - Toggle the alphabets of the user-id generated in step-2 i.e. upper-case alphabets should
become lower-case and lower-case alphabets should become upper-case
Let us see a few examples
Example-1 - If the participants details are as below
First Name = Rajiv
Last Name = Roy
PIN = 560037
N = 6
Step1 - Length of Last Name is less than the Length of First Name, so the Smaller Name is
"Roy and the Longer Name is "Rajiv“
Step2 - The user-id will be = Last Letter of the longer name + Entire word of the smaller name
+ Digit at position N in the PIN when traversing the PIN from left to right + Digit at position N
in the PIN when traversing the PIN from right to left
= Last Letter of “Rajiv” + Entire word of “Roy” + 6
th Digit of pin from left + 6th Digit of pin
from right
= v + Roy + 7 + 5
Therefore, user-id = vRoy75
Step3 -Toggle the alphabets in the user-id = VrOY75*/
class UserIDGeneration {
    public String userIdGeneration(String input1,String input2,int input3,int input4){
    // Read only region end
    String firstName = input1;
    String lastName = input2;
    int pin = input3;
    int N = input4;
    String longerName;
    String smallerName;
    StringBuilder userId = new StringBuilder();
    if (firstName.length() >lastName.length()) {
    longerName = firstName;
    smallerName = lastName;
    } else if (firstName.length() <lastName.length()) {
    longerName = lastName;
    smallerName = firstName;
    }
    else
    {
    if (firstName.compareTo(lastName) <1 ) {
    longerName = lastName;
    smallerName = firstName;
    }
    else
    {
    longerName = firstName;
    smallerName = lastName;
    }
    }
    userId.append(longerName.charAt(longerName.length() - 1));
    userId.append(smallerName);
    for (int i = 0; i<userId.length(); i++)
    {
    if (Character.isUpperCase(userId.charAt(i)))
    userId.setCharAt(i, Character.toLowerCase(userId.charAt(i)));
    else
    userId.setCharAt(i, Character.toUpperCase(userId.charAt(i)));
    }
    userId.append(String.valueOf(pin).charAt(N - 1));
    userId.append(String.valueOf(pin).charAt(String.valueOf(pin).length() - N));
    return userId.toString();
    }
    }
