class Solution {

    public String encode(List<String> strs) {
        StringBuilder h= new StringBuilder();
        for(String i:strs){
            h.append(i.length()).append('#').append(i);
        }
        return h.toString();
    }

    public List<String> decode(String str) {
        List<String> dd=new ArrayList<>();
        
        int i=0;
        while(i<str.length()){
            int j=i;
            while(str.charAt(j)!='#') j++;

            int lenn=Integer.parseInt(str.substring(i,j));
            String wo=str.substring(j+1,j+1+lenn);

            dd.add(wo);

            i=j+1+lenn;
        }
        return dd;
    }
}
