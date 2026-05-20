class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        HashMap<Character, Integer> map = new HashMap<>();

        for (int i = 0; i < magazine.length(); i++) {
            char a = magazine.charAt(i);

            if (map.containsKey(a)) {
                map.put(a, map.get(a) + 1);
            } else {
                map.put(a, 1);
            }
        }

        for (int i = 0; i < ransomNote.length(); i++) {
            char a = ransomNote.charAt(i);

            if (map.containsKey(a) && map.get(a) > 0) {
            map.put(a, map.get(a) - 1);
                }
            else {
                return false;
            }
        }

        return true;
    }
}