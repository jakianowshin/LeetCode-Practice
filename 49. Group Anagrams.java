import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Arrays;

class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
		List<List<String>> list = new ArrayList<List<String>>();
		Map<String, List<String>> map = new HashMap<String, List<String>>();
		String s;
		char[] c;
		String key;
		for (int i = 0; i < strs.length; i++) {
			s = strs[i];
			c = s.toCharArray();
			Arrays.sort(c);
			key = new String(c);
			if (map.containsKey(key)) {
				map.get(key).add(s);
			} else {
				List<String> glist = new ArrayList<String>();
				glist.add(s);
				map.put(key, glist);
			}
		}

		list.addAll(map.values());
		return list;      
    }


    public static void main(String[] args) {
        Solution s = new Solution ();

        String[] strs = {"eat","tea","tan","ate","nat","bat"};
        System.out.println(s.groupAnagrams(strs));
        
    }
}