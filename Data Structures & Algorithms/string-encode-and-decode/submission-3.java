class Solution {

    public String encode(List<String> strs) {
        StringBuffer buff= new StringBuffer();

        for(String s: strs){
            buff.append(s.length()).append("#").append(s);
        }
        return buff.toString();
    }

    public List<String> decode(String str) {
        List<String> res = new LinkedList<>();

        int pointer = 0;

        while(pointer < str.length()){
            int slashPos = str.indexOf("#", pointer);
            int lengthWord = Integer.parseInt(str.substring(pointer, slashPos));
            int contentStart = slashPos + 1;
            int contentEnd = contentStart + lengthWord;
            res.add(str.substring(contentStart, contentEnd));

            pointer = contentEnd;
        }

        return res;
    }
}
