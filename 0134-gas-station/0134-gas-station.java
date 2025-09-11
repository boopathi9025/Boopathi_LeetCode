class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int totalCost = 0; 
        int gasLeftInTank = 0;
        int startIndex = 0; 
        for (int i = 0; i < gas.length; i++) {
            int difference = gas[i] - cost[i];
            totalCost += difference;
            gasLeftInTank += difference;
            
            if (gasLeftInTank < 0) {
                startIndex = i + 1;
                gasLeftInTank = 0;
            }
        }
       
        return totalCost >= 0 ? startIndex : -1;
    }
}