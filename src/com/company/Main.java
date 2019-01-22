package com.company;

public class Main {

    public static void main(String[] args) {
	    int prevNum = 0;
	    int nxtNum = 1;
	    int resultNum = 0;
	    int max = Integer.MAX_VALUE;
	    int stopNum = 4000000;
	    int sum = 0;

		//loop for fibonacci sequence set to stop under MAX_VALUE
	    for(int count = 0; count < max; count++){
			resultNum = prevNum + nxtNum; //Fn = F1 + F2
			prevNum = nxtNum;
			nxtNum = resultNum;

			//determines if the resultNum is even or not
			if(resultNum % 2 == 0){
				System.out.println(resultNum);//prints out even numbers
				sum += resultNum; //adds even resultNums
			}
			//if resultNum is greater than or equal to stopNum (4000000) break from loop
			if (resultNum >= stopNum){
				break;
			}
		} System.out.println("The sum is: " + sum); //prints out the sum
    }
}
