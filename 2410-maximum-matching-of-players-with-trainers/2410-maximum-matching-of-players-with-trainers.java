class Solution {
    public int matchPlayersAndTrainers(int[] players, int[] trainers) {
        Arrays.sort(players);
        Arrays.sort(trainers);
        int i=0;
        int j=0;
        int count =0;
        int max=0;
        while(i<players.length && j<trainers.length){
            if(players[i]<=trainers[j]){
                count++;
                i++;
                j++;
            }else if(players[i]>trainers[j]){
                j++;
            }else{
                i++;
            }
        }
        max=Math.max(count,max);
        return max;
    }
}