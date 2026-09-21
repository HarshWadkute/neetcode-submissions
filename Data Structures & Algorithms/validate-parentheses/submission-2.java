class Solution {
    public boolean isValid(String s) {
       Stack<Character> stuck=new Stack<>();
       HashMap<Character,Character>brackair=new HashMap<>();
       brackair.put(')','(');
       brackair.put(']','[');
       brackair.put('}','{');

       for (char c : s.toCharArray()){
        if (brackair.containsKey(c)){

            if(!stuck.isEmpty()&&stuck.peek()==brackair.get(c)){
                stuck.pop();
            }
            else{
                return false;
            }
        }


        else{
            stuck.push(c);
        }
       }
       return stuck.isEmpty();
    }
}














