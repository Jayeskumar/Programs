package Wipro;

public class findresultafteraaddandsubtractonn {
    public int AddSub(int input1,int input2){
		// Read only region end
		int N = input1;
		int result = N;
		int var = 0;
		
		if (input2 == 1) var = 1;
		else var = 0;
		
		for (int i = N - 1, j = 0; i >= 1; i--, j++) {
			if (j % 2 == var) result += i;
			else result -= i;
			
		}
		
		return result;
	}
    
}
