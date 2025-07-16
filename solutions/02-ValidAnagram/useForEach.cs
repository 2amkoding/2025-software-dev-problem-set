public class Solution {
  public bool IsAnagram(string s, string t) {
    if(s.Length != t.Length) return false;

    int [] fre = new int[26];

    foreach(char c1 in s){
      fre[c1-'a']++;
    }

    foreach(char c2 in t){
      if(fre[c2-'a'] == 0) return false;
        fre[c2-'a']--;
    }

    return true;
  }
}
