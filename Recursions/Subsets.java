// print all the subsets of a set of first n natural numbers.

package recursion;

import java.util.ArrayList;

public class Subsets {
    public static void printSubset(ArrayList<Integer> subset){
        for (int i = 0; i < subset.size(); i++) {
            System.out.print(subset.get(i) + " ");
        }
        System.out.println();
    }
    public static void findSubsets(int n, ArrayList<Integer> subset){
        if(n == 0){
            printSubset(subset);
            return;
        }
        // will add
        subset.add(n);
        findSubsets(n - 1, subset);
        subset.remove(subset.size() - 1);

        // will not add
        findSubsets(n - 1, subset);
    }
    public static void main(String[] args) {
        int n = 3;
        ArrayList<Integer> subset = new ArrayList<>();
        findSubsets(n, subset);
    }
}
