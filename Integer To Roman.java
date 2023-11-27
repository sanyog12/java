https://leetcode.com/problems/integer-to-roman/




class Solution {
    public String intToRoman(int num) {
            Map<String,Integer> hs = new LinkedHashMap();
        StringBuilder sb= new StringBuilder();
        hs.put("M",1000);
        hs.put("CM",900);
        hs.put("D",500);
        hs.put("CD",400);
        hs.put("C",100);
        hs.put("XC",90);
        hs.put("L",50);
        hs.put("XL",40);
        hs.put("X",10);
        hs.put("IX",9);
        hs.put("V",5);
         hs.put("IV",4);
        hs.put("I",1);
        
    for(Map.Entry<String,Integer> entry :hs.entrySet()){
        while(num>=entry.getValue()){
            num = num - entry.getValue();
            sb.append(entry.getKey());
        }
    }
    return sb.toString();
}

}




