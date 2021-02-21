class Solution {
    public String minRemoveToMakeValid(String s) {
        char[] chars = s.toCharArray();
        int count = 0;
        for(int i = 0; i < chars.length; ++i) {
            if(chars[i] == '(') 
                ++count;
            else if (chars[i] == ')') {
                if(count > 0)
                    --count;
                else
                    chars[i] = 0;
            }
        }
        
        count = 0;
        for(int i = chars.length - 1; i >= 0; --i) {
            if(chars[i] == ')') 
                ++count;
            else if (chars[i] == '(') {
                if(count > 0)
                    --count;
                else
                    chars[i] = 0;
            }
        }
        StringBuilder builder = new StringBuilder();
        for(char c: chars) {
            if(c != 0)
                builder.append(c);
        }
        return builder.toString();
    }
}