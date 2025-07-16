public class Solution {
  public bool isAnagram(string s, string t){

    if (s.Length != t.Length) {
      return false;
    }

    var countFrequency = new Dictionary<char, int>();

    for (int i = 0; i < s.Length; i++) {
      countFrequency.TryAdd(s[i], 0);
      countFrequency.TryAdd(t[i], 0);

      countFrequency[s[i]]++;
      countFrequency[t[i]]--;
    }

    return countFrequency.Values.All(frequence => frequence == 0);


  }
}


