class Solution {
    public String reverseWords(String s) {
        String ret = "";
        String word = "";
        List<String> arr = new ArrayList<String>();
        int length = s.length();
        for(int i=0;i<length;i++){
            char letter = s.charAt(i);
            if(letter != ' '){
                word += letter;
            }else{
                if(word != ""){
                    arr.add(word);
                    arr.add(" ");
                    word = "";
                }
                
            }   
            if(i == length-1 && word != "") arr.add(word);
        }
        int size = arr.size();
        for(int j=size-1;j>=0;j--){
            String ele = arr.get(j);
            if(j != 0 && j != size-1)ret += ele;
            else{
                if(ele != " "){
                    ret += ele;
                }
            }
        }
        return ret;
    }

}