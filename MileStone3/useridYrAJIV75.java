package Milestine3;

/*User ID Generation: Joseph's team has been assigned the task of creating user-ids for all participants
of an online gaming competition Joseph has designed a process for generating the user-d using the
participant's First_Name ,Last_Name, PIN code and a number N The process defined by Joseph is as
below –
Step1- Compare the lengths of First_Name and Last_Name of the participant. The one that is shorter
will be called “Smaller Name” and the one that is longer will be called the “longer Name” if both
First_Name and Last_Name are of equal Length ,then the name that appears earlier in alphabetical
order will be called “Smaller Name” and the name that appears later in alphabetical order will be
called the “Longer Name”
Step2 - The user-should be generated as below –
Last Letter of the smaller name + Entre word of the longer name + Digit at position N in the PIN when
traversing PIN from left to right +Digit at position N in the PIN when traversing the PIN from right to
left
Step3 - Toggle the alphabets of the user-id generated in step -2 i.e. upper-case alphabets should
become lower-case and lower-case alphabets should become upper-case.
Let us see a few examples
Example-1 - If the participant's details are as below
First Name = Ray
Last Name =Roy
PIN = 560037
N= 6
Step1 - Length of Last_Name is less than the Length of First_Name, so the Smaler Name is “Roy” and
the Longer Name is “Rajiv”
Step2 - The user id will be = Last Letter of the smaller name +Entre word in the longer name + Digit at
position N in the PIN when traversing the PIN from left to right +Digit at position N in the PIN when
traversing the PIN from right to left
=Last Letter of “Roy”+ Entre word in Rajiv+ 6th Digit of Pin from left + 6th Digit of PIN from right
=y+ Rajiv+7+5
Therefore, user-id=yRajiv75
Step3 -Toggle the alphabet in the user-id. So,user-id = YrAJIV75
*/
class UserId
{
public String userIdGeneration(String input1,String input2,int input3,int input4){
    int s1=input1.length();
    int s2=input2.length();
    String longer="";
    String smaller="";
    String output1="";
    if(s1==s2)
    {
    if(input1.compareTo(input2)>0)
    {
    longer=input1;
    smaller=input2;
    }
    else
    {
    longer=input2;
    smaller=input1;
    }
    }
    if(s1>s2){
    longer=input1;
    smaller=input2;
    }
    else if(s1<s2)
    {
    longer=input2;
    smaller=input1;
    }
    String pin=input3+"";
    String output=smaller.charAt(smaller.length()-1)+longer+pin.charAt
    (input4-1)+pin.charAt(pin.length()-input4);
    for(int i=0;i<output.length();i++)
    {
    if(Character.isLowerCase(output.charAt(i)))
    {
    output1+=Character.toUpperCase
    (output.charAt(i));
    }
    else
    {
    output1+=Character.toLowerCase
    (output.charAt(i));
    }
    }
    return output1;
} 

public static void main(String[] args) {
}
}