class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> list = new ArrayList<>();
        Arrays.sort(candidates);
        findCombination(result, list, candidates, target, 0);
        return result;
    }
    public void findCombination (List<List<Integer>> result, List<Integer> list, int[] candidate, int target, int current) {
        if (target < 0) {
            return;
        }
        if (target == 0) {
            //Collections.sort(list);
            if (!result.contains(list)) {
                result.add(new ArrayList(list));
                return;
            }
            // result.add(new ArrayList(list));
            
        }
        for (int i = current; i < candidate.length; i++) {
            list.add(candidate[i]);
            findCombination(result, list, candidate, target-candidate[i], i+1);
            list.remove(list.size()-1);
        }
    }
}