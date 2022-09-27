package Java.Programmers.Lv2;

class BinaryGame {
    public String binaryGame(int n, int t, int m, int p){
        StringBuilder convertNum = new StringBuilder();
        StringBuilder answer = new StringBuilder();

        for(int i = 0; convertNum.length() <= t * m; i++){
            convertNum.append(Integer.toString(i, n));
        }

        for(int i = p - 1; answer.length() < t; i += m){
            answer.append(Character.toUpperCase(convertNum.charAt(i)));
        }
        return answer.toString();
    }

    public static void main(String[] args){
        int n = 2;
        int t = 4;
        int m = 2;
        int p = 1;

        BinaryGame sol = new BinaryGame();
        System.out.println(sol.binaryGame(n, t, m, p));
    }
}
