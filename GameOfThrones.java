https://www.hackerrank.com/challenges/game-of-thrones/problem?isFullScreen=true


public static String gameOfThrones(String s) {
    // Write your code here
    HashMap<Character,Integer> hm = new HashMap<>();
    
    for(int i = 0; i < s.length();i++){
        
        if(hm.containsKey(s.charAt(i))){
            int value = hm.get(s.charAt(i));
            hm.put(s.charAt(i),value+1);
        }
        else{
            hm.put(s.charAt(i),1);
        }
    }
    int cnt = 0;
    for(Character a:hm.keySet()){
        if(hm.get(a)%2 == 1){
            cnt++;
        }
       if(cnt>1)return "NO"; 
    }
    
    
     
    return "YES";
    }
    
}