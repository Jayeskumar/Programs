/* Joseph's team has been assigned the task of creating user-ids for all participants
of an online gaming competition Joseph has designed a process for generating the user-d using the
participant's First_Name ,Last_Name, PIN code and a number N The process defined by Joseph is as
below –
Step1- Compare the lengths of First_Name and Last_Name of the participant. The one that is shorter
will be called “Smaller Name” and the one that is longer will be called the “longer Name” if both
First_Name and Last_Name are of equal Length ,then the name that appears earlier in alphabetical
order will be called “Smaller Name” and the name that appears later in alphabetical order will be
called the “Longer Name”
Step2 - The user-should be generated as below –
First Letter of the Longer name + Entire word of the Smaller name + Digit at position N in the PIN when
traversing PIN from left to right +Digit at position N in the PIN when traversing the PIN from right to
left
Step3 - Toggle the alphabets of the user-id generated in step -2 i.e. upper-case alphabets should
become lower-case and lower-case alphabets should become upper-case.
Let us see a few examples.
Example-1 - If the participant's details are as below -
First Name Rajiv
Last Name = Roy
PIN = 560037
N=6
Step 1 - Length of Last_Name is less than the Length of First_Name so the Smaller Name is “Roy” and
the Longer Name is “Rajiv”
Step 2 - The user-id will be= First Letter of the longer name + Entire word of the smaller name + Digit at
position N in the PIN when traversing the PIN from left to right +Digit at position N in the PIN when
traversing the PIN from right to left
=First Letter of “Rajiv” +Entire word of “Roy” + 6th Digit PIN from left + 6th Digit of PIN from right
=R+Roy + 7+5
Therefore, user-id =RRoy75
Step 3 - Toggle the alphabets in the user-id, user-id= rrOY75
ANSWER:*/
import java.util.*;
class UserId {
public String userIdGeneration(String input1,String input2,int input3,int input4)
{
String s="",small="",longer="";
if(input1.length()<input2.length()){
small=input1;
longer=input2;
}
else if(input1.length()>input2.length())
{
small=input2;
longer=input1;
}
else
{
if((input1.compareTo(input2))<0)
{
small=input1;
longer=input2;
}
else
{
small=input2;
longer=input1;
}
}
s+=String.valueOf(longer.charAt(0))+small;
String pin=String.valueOf(input3);
String pinrev=String.valueOf(new StringBuilder(pin).reverse());
s+=String.valueOf(pin.charAt(input4-1))+String.valueOf(pinrev.charAt(input4-1));
String s1="";
for(int i=0;i<s.length()-2;i++){
if(Character.isUpperCase(s.charAt(i)))
s1+=String.valueOf(Character.toLowerCase(s.charAt(i)));
else
s1+=String.valueOf(Character.toUpperCase(s.charAt(i)));
}
s1+=s.substring(s.length()-2,s.length());
return s1;
}
} 