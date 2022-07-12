package Java.Programmers.Lv1;

class RecommendId{
    public boolean isValid(char ch){
        if(Character.isLetterOrDigit(ch)) return true;
        return ch == '.' || ch == '-' || ch == '_';
    }
    public String recommendId(String new_id){
        StringBuilder sb = new StringBuilder();
        boolean flag = false;
        for(char ch : new_id.toCharArray()){
            if(!isValid(ch)) continue;
            if(ch == '.'){
                if(sb.length() == 0 || flag) continue;
                flag = true;
            } else flag = false;

            sb.append(Character.toLowerCase(ch));
        }
        if(sb.length() >= 16) sb.setLength(15);
        if(sb.length() == 0) sb.append('a');
        if(sb.charAt(sb.length()-1) == '.') sb.deleteCharAt(sb.length()-1);
        while(sb.length()<3){
            sb.append(sb.charAt(sb.length()-1));
        }
        return sb.toString();
    }

    public static void main(String[] args){
        String new_id = "...!@BaT#*..y.abcdefghijklm";
        RecommendId sol = new RecommendId();
        System.out.println(sol.recommendId(new_id));
    }
}
