class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()){
            return false;
        }
        HashMap<Character,Integer> countS=new HashMap<>();
        HashMap<Character,Integer> countT=new HashMap<>();
        char stu[]=s.toCharArray();
        char stu2[]=t.toCharArray();
        for(int i=0;i<s.length();i++){
            
                countS.put(stu[i],countS.getOrDefault(stu[i],0)+1);
            
            
                countT.put(stu2[i],countT.getOrDefault(stu2[i],0)+1);
            
        }
        return countS.equals(countT);
    }
}
