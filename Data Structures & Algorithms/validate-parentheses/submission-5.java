class Solution {
    public boolean isValid(String s) {
        HashMap<Character, Character>brack=new HashMap<>();
        brack.put(')','(');
        brack.put(']','[');
        brack.put('}','{');

        Stack<Character> stuck=new Stack<>();
        for(int i=0;i<s.length();i++){

            if(brack.containsKey(s.charAt(i))){
                if(!stuck.isEmpty()&&stuck.peek()==brack.get(s.charAt(i))){
                stuck.pop();
                }
                else{
                    return false;
                }
            }
            else{
            stuck.push(s.charAt(i));
            }
        }
        return stuck.isEmpty();
    }
}
