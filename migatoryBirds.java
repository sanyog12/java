    public static int migratoryBirds(List<Integer> arr) {
    // Write your code here
    HashMap<Integer,Integer> hm=new HashMap<>();
    for(int i=0;i<arr.size();i++){
        if(hm.containsKey(arr.get(i))){
            int val=hm.get(arr.get(i));
            hm.put(arr.get(i),val+1);
        }
        else{
            hm.put(arr.get(i),1);
        }
    }
    int max=0;
    int value=0;
    for(Integer a :hm.keySet()){
        if(max<=hm.get(a)){
            max=hm.get(a);
            value=a;
        }
    }
return value;
    }

}