class Solution {
    public List<String> letterCasePermutation(String S) {
        LinkedList<String> result = new LinkedList<>();
        int size = S.length();
        result.add(S);
        for(int i = size-1; i >= 0; --i) {
            Character c = S.charAt(i);
            if(Character.isLetter(c)) {
                int resultSize = result.size();
                while(resultSize > 0) {
                    String current = result.poll();
                    result.add(current.substring(0, i) + Character.toLowerCase(c) + current.substring(i+1, current.length()));
                    result.add(current.substring(0, i) + Character.toUpperCase(c) + current.substring(i+1, current.length()));
                    resultSize--;
                }
            }
        }
        return result;
    }
}