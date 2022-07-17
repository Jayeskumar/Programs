package MileStone3;

class Main{
    static int countPrime(int input1){
    int temp = input1, count = 0;
    while (temp != 0) {
        int d = temp % 10;
 
        temp /= 10;
        if (d == 2 || d == 3
            || d == 5 || d == 7)
            count++;
    }
 
    return count;
}
public static void main(String[] args){
    System.out.println(countPrime(1873));
}
}