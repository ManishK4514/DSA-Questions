// Place Tiles of size 1 X M on a floor of size N X M.

package recursion;

public class PlaceTiles {
    public static int noOfWaysToPlaceTiles(int m, int n){
        if(m == n){
            return 2;
        }
        if(m < n){
            return 1;
        }
        // vertically
        int verticalPlacement = noOfWaysToPlaceTiles(m - n, n);
        // place horizontally
        int horioztalPlacement = noOfWaysToPlaceTiles(m - 1, n);
        return verticalPlacement + horioztalPlacement;
    }
    public static void main(String[] args) {
        int m = 4, n = 2;
        noOfWaysToPlaceTiles(m, n);
        System.out.println(noOfWaysToPlaceTiles(m, n));
    }
}
