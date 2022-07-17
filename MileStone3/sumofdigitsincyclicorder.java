package MileStone3;
 class Main {
    public static int sumOfSumsOfDigits(int input1){
		// Read only region end
		String num = String.valueOf(input1);
		int sum = 0;
		
		for (int i = 0; i < num.length(); i++) {
			for (int j = i; j < num.length(); j++) {
                sum += Integer.parseInt(String.valueOf(num.charAt(j)));
			}
		}
		
		return sum;
	}
    public static void main(String[] args) {
        //Main m = new Main();
        System.out.println(sumOfSumsOfDigits(582109));
    }
    
}
