package Java.Programmers.Lv2;

/** 풀이 간소화 가능 : firstNumber 제거 -> 숫자가 앞에 오면 뒤에 오는 문자는 무조건 소문자로 변경되어야 함 **/
class JadenCase{
    public String jadenCase(String s){
        boolean newWord = true, firstNumber = false;
        StringBuilder sb = new StringBuilder();

        for(int i = 0; i<s.length(); i++){
            char ch = s.charAt(i);
            if(ch == ' '){
                newWord = true;
                firstNumber = false;
                sb.append(ch);
                continue;
            }
            if(ch >= '0' && ch <= '9') {
                firstNumber = true;
                newWord = false;
                sb.append(ch);
                continue;
            }
            if(firstNumber){
                sb.append(Character.toLowerCase(ch));
                continue;
            }
            if(newWord){
                sb.append(Character.toUpperCase(ch));
                newWord = false;
            }else{
                sb.append(Character.toLowerCase(ch));
            }
        }
        return sb.toString();
    }
    public static void main(String[] args){
        String s = "3people unFollowed me";
        JadenCase sol = new JadenCase();

        System.out.println(sol.jadenCase(s));
    }
}
