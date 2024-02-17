
https://www.hackerrank.com/challenges/plus-minus/problem


public static void plusMinus(List<Integer> arr) {
    int positive = 0, negative = 0, zero = 0;
// Write your code here
for(int i =0 ; i < arr.size(); i++){
    if(arr.get(i) < 0){
        negative += 1; 
    }
    else if(arr.get(i) >= 1){
        positive += 1;
    }
    else if(arr.get(i) == 0){
        zero += 1;
    }
}
System.out.println((double)positive/arr.size());
System.out.println((double)negative/arr.size());
System.out.println((double)zero/arr.size());
}