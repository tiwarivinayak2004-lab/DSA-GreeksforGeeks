class Solution {
    public ArrayList<ArrayList<String>> anagrams(String[] arr) {
        // code here
        Map<String,List<String>> map=new HashMap<>();
        for(String str: arr){
            char[] chars=str.toCharArray();
            Arrays.sort(chars);
            String key=new String(chars);
            map.putIfAbsent(key,new ArrayList<>());
            map.get(key).add(str);
        }
        ArrayList<ArrayList<String>> result = new ArrayList<>();
        for (List<String> list : map.values()) {
            result.add(new ArrayList<>(list));
        }
        return result;
    }
}