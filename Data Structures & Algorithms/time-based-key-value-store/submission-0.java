class TimeMap {
    Map<String, List<Pair>> map;

    public TimeMap() {
        map = new HashMap<>();
    }
    
    public void set(String key, String value, int timestamp) {
      map.computeIfAbsent(key, k -> new ArrayList<>()).add(new Pair(timestamp, value));
    }
    
    public String get(String key, int timestamp) {
        String res = "";
        if(map.containsKey(key)){
            List<Pair> list = map.get(key);
            int l = 0;
            int r = list.size()-1;

            while(l <= r){
                int mid = l + (r-l) / 2;
                Pair midP = list.get(mid);
                if(midP.getKey() <= timestamp){
                    res = midP.getValue();
                    l = mid +1;
                }else {
                    r = mid -1;
                }
            }
        }
        return res;
    }
}
class Pair {
   private int timestamp;
   private String value;
    public Pair(int timestamp, String value) {
        this.timestamp = timestamp;
        this.value = value;
    }
    public int getKey() {
            return timestamp;
    }

    public String getValue() {
            return value;
    }
}