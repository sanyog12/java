  
//https://www.hackerrank.com/challenges/array-left-rotation/problem?isFullScreen=true

public static List<Integer> rotateLeft(int d, List<Integer> arr) {
    // Write your code here
    List<Integer> array = new ArrayList<>();
    for(int i = d; i< arr.size(); i++){
        array.add(arr.get(i));
    }
  
    for(int i = 0; i < d; i++){
        array.add(arr.get(i));
    }
    return array;
    }

}