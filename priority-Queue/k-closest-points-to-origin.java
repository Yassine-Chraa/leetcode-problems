
class Solution {
    public int[][] kClosest(int[][] points, int k) {
        PriorityQueue<int[]> maxHeap = new PriorityQueue<int[]>(
            (a,b)-> (b[0] * b[0] + b[1] * b[1])-(a[0] * a[0] + a[1] * a[1])
        );
        int n=0,i=0,distance;
        int[][] ret = new int[k][];
        
        for(int[] point: points){
            if(maxHeap.size()==k){
                int [] peek = maxHeap.peek();
                double pointD = Math.sqrt(Math.pow(point[0],2)+Math.pow(point[1],2));
                double peekD = Math.sqrt(Math.pow(peek[0],2)+Math.pow(peek[1],2));
                if(pointD<peekD){
                    maxHeap.poll();
                    maxHeap.offer(point); 
                }    
            }else{
                maxHeap.offer(point); 
            }
        }

        while(!maxHeap.isEmpty()){
            ret[i++] = maxHeap.poll();
        }

        return ret;
    }

}