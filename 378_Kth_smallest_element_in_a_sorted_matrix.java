378_Kth_smallest_element_in_a_sorted_matrix.java
public class Solution {
    public int kthSmallest(int[][] matrix, int k) {
        List<Integer> list = new ArrayList<Integer>();
        for(int i = 0; i < matrix.length; i++){
            for(int j = 0; j < matrix[i].length; j++){
                list.add(matrix[i][j]);
            }
        }
        int[] res = new int[list.size()];
        for(int i = 0; i < list.size(); i++){
            res[i] = list.get(i);
        }
        Arrays.sort(res);
        return res[k - 1];
    }
}