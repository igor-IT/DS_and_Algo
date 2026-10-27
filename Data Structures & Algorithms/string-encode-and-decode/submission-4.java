class Solution {

    public String encode(List<String> strs) {
        StringBuilder str = new StringBuilder();
        for(String s: strs){
            str.append(s.length()).append("#").append(s);
        }
        return str.toString();
    }

    public List<String> decode(String str) {
        int pointer = 0;
        List<String> res = new LinkedList<>();

        while(pointer < str.length()){
        int spliterator = str.indexOf("#", pointer);
        int size = Integer.parseInt(str.substring(pointer,spliterator));
        int start = spliterator +1;
        int end = start + size;
        res.add(str.substring(start,end));
        pointer = end; 
        }
        return res;
    }
}
