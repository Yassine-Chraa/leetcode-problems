public class Solution extends GuessGame {
    public int guessNumber(int n) {
        int start=1,end=n,m=start+(end-start)/2;
        while(start<end){
            switch(guess(m)){
                case -1:
                    end = m-1;
                    m=start+(end-start)/2;
                    break;
                case 1:
                    start = m+1;
                    m=start+(end-start)/2;
                    break;
                case 0:
                    return m;
                default:
                    break;
            }
        }
        return m;
    }
}