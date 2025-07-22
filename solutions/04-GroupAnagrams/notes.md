# Group Anagrams

```java
class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {

        Map<String, List<String>> ans = new HashMap<>();

        for (String s : strs) {
            char[] chars = s.toCharArray();
            Arrays.sort(chars);
            String key = new String(chars);
            if (!ans.containsKey(key)) {
                ans.put(key, new ArrayList<>());
            }
            ans.get(key).add(s);
        }

        return new ArrayList<>(ans.values());

    }
}

```

## Design Pattern: Hash Map Bucketing / Grouping Pattern

Group related items into "buckets" based on common key.

Input: ["eat", "tea", "tan", "ate", "nat", "bat"]

### step 1: Generate keys by sorting characters

"eat" → sort → "aet" (key)  
"tea" → sort → "aet" (key)  
"tan" → sort → "ant" (key)  
"ate" → sort → "aet" (key)  
"nat" → sort → "ant" (key)  
"bat" → sort → "abt" (key)

### step 2: Bucket by key

{  
 "aet": ["eat", "tea", "ate"],  
 "ant": ["tan", "nat"],  
 "abt": ["bat"]  
}

## Visual

### iteration 1: s= "eat"

1. char[] chars = "eat".toCharArray() -> ['e', 'a', 't']
2. Arrays.sort(chars) -> ['a', 'e', 't']
3. String key = new String(char) -> "aet"
4. ans.containsKey("aet") -> false
5. ans.put("aet"), new ArrayList<>()) -> creates empty list
6. ans.get("aet").add("eat") -> adds "eat" to list

ans = {  
 "aet": ["eat"]
}

### iteration 2: s = "tea"

1. char[] chars = "tea".toCharArray() -> ['t', 'e', 'a']
2. Arrays.sort(chars) -> ['a', 'e', 't']
3. String key = new String(chars) -> "aet"
4. ans.containsKey("aet") -> true (skip put)
5. ans.get("aet").add("tea") -> adds "tea" to existing list

ans = {  
 "aet": ["eat", "tea"]  
}

etc..

return new ArrayList<>(ans.values());

Result: [["eat", "tea", "ate"], ["tan", "nat"], ["bat"]]
