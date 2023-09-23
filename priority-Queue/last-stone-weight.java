class Solution {
    public int lastStoneWeight(int[] stones) {
        int x,y;
        PriorityQueue<Integer> minHeap = new PriorityQueue<>(stones.length,Collections.reverseOrder());

        for(int i=0;i<stones.length;i++){
            minHeap.offer(stones[i]);
        }
        while(minHeap.size()>1){
            y = minHeap.poll();
            x = minHeap.poll();

            if(x != y) minHeap.offer(y-x);
        }

        if(!minHeap.isEmpty()) return minHeap.peek();
        else return 0;
    }
}