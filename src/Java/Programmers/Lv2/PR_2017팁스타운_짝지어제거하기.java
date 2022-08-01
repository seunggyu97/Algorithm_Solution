package Java.Programmers.Lv2;

class RemoveCouple {
    public int removecouple(String s) {
        while(s.length() > 0){
            int flag = 0;
            for(int i = 0; i<s.length()-1; i++){
                char a = s.charAt(i);
                char b = s.charAt(i+1);
                if(a == b){
                    StringBuilder sb = new StringBuilder(s);
                    sb.deleteCharAt(i);
                    sb.deleteCharAt(i);
                    s = sb.toString();
                    flag = 1;
                    break;
                }
            }
            if(flag == 0) return 0;
        }
        return 1;
    }

    public static void main(String[] args) {
        String s = "cdcd";

        RemoveCouple sol = new RemoveCouple();
        System.out.println(sol.removecouple(s));
    }
}