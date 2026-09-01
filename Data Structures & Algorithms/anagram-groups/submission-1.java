class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String,List<String>> buffer = new HashMap<>();

        for(String s: strs){
            String key = getHash(s);
            buffer.putIfAbsent(key, new ArrayList<>());
            buffer.get(key).add(s);
        }
        return new ArrayList<>(buffer.values());
    }

    private String getHash(String s){
        int[] buff = new int[26];
        for(char c: s.toCharArray()){
            buff[c - 'a']++;
        }
        return Arrays.toString(buff);
    }
}
