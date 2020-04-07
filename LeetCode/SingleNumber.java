class Solution {
    public int singleNumber(int[] nums) {
    
    List<Integer> abc = new ArrayList<>();

    for (int i : nums) {
      if (!abc.contains(i)) {
        abc.add(i);
      } else {
        abc.remove(new Integer(i));
      }
    }
    return abc.get(0);
  }
}