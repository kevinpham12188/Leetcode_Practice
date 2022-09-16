import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class lucky_number_in_a_matrix {
    public static void main(String[] args) {
        int[][] my2dArray = {{3,6}, {7,1}, {5,2}, {4,8}};

        System.out.println(luckyNumbers(my2dArray));
    }

    public static List<Integer> luckyNumbers (int[][]matrix) {
        List<Integer> minRows = new ArrayList<>();
        List<Integer> maxCol = new ArrayList<>();
        int row = matrix.length;
        int col = matrix[0].length;

        // Adding max number of each col in List maxCol
        for (int i = 0; i < col; i++) {
            int max = matrix[0][i];
            for (int j = 0; j < row; j++) {
                if (matrix[j][i] > max) {
                    max = matrix[j][i];
                }
            }
            maxCol.add(max);
        }

        // Adding min number of each row in List minRows
        for (int i = 0; i < row; i++) {
            int min = matrix[i][0];
            for (int j = 0; j < col; j++) {
                if (matrix[i][j] < min) {
                    min = matrix[i][j];
                }
            }
            minRows.add(min);
        }
        Map<Integer, Integer> myMap = new HashMap<>();
        // Adding maxcol elements to map
        for (int i = 0; i < maxCol.size(); i++) {
            if (!myMap.containsKey(maxCol.get(i))) {
                myMap.put(maxCol.get(i), 1);
            } else {
                myMap.put(maxCol.get(i), myMap.get(maxCol.get(i)) + 1);
            }
        }

        // Adding minrow elements to map
        for (int j = 0; j < minRows.size(); j++) {
            if(!myMap.containsKey(minRows.get(j))) {
                myMap.put(minRows.get(j), 1);
            } else {
                myMap.put(minRows.get(j), myMap.get(minRows.get(j)) + 1);
            }
        }

        int maxValueInMap = (Collections.max(myMap.values()));
        List<Integer> finalList = new ArrayList<>();
        if (maxValueInMap < 2) {
            return finalList;
        }
        for (java.util.Map.Entry<Integer, Integer> entry: myMap.entrySet()) {
            if (entry.getValue() == maxValueInMap) {
                finalList.add(entry.getKey());
            }
        }
        return finalList;
    }
}
