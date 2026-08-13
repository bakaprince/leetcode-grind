class Solution {
    public int finalValueAfterOperations(String[] operations) {
        int x=0;
        for(String op:operations){
            switch (op) {
                case "++X":
                case "X++":
                    x++;
                    break;

                case "--X":
                case "X--":
                    x--;
                    break;
            }
        }
        return x;
    }
}