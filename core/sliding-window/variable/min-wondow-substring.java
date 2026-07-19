class Solution {
    public String minWindow(String s, String t) {
        if(t.length() > s.length()){
            return "";
        }
        int i=0;
        int j=0;
        int minWindow=Integer.MAX_VALUE;
        int startIdx=-1;
        int need=t.length();
        HashMap<Character,Integer> map=new HashMap<>();
        for(char c: t.toCharArray()){
            map.put(c,map.getOrDefault(c,0)+1);
        }
        while(j<s.length()){
            char curr=s.charAt(j);
            if(map.containsKey(curr)){
                if(map.get(curr) > 0){
                    need--;
                }
            }
            map.put(curr,map.getOrDefault(curr,0)-1);
            while(need==0){
                int currWindow=j-i+1;
                if(currWindow<minWindow){
                    minWindow=currWindow;
                    startIdx=i;
                }
                char start=s.charAt(i);
                map.put(start,map.getOrDefault(start,0)+1);
                if(map.get(start)>0){
                    need++;
                }
                i++;
            }
            j++;
        }
        return minWindow==Integer.MAX_VALUE ? "" : s.substring(startIdx,startIdx+minWindow);
    }
}
