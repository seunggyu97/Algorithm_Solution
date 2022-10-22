package Java.Programmers.PCCP모의고사;


class Alphabet {
    public String alphabet(String input_string) {
        StringBuilder sb = new StringBuilder();
        int[] arr = new int[27];
        Character[] arrCharacter = new Character[27];
        char prevCh = '0';
        for (char ch : input_string.toCharArray()) {
            int chNum = ((int) ch) - 96;
            if (arr[chNum] >= 1 && ch != prevCh) {
                arrCharacter[chNum] = ch;
            }
            arr[chNum] = 1;
            prevCh = ch;
        }

        for(Character ch : arrCharacter){
            if(ch != null) sb.append(ch);
        }

        if(sb.toString().length() == 0){
            return "N";
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        String input_string = "zbzbz";

        Alphabet sol = new Alphabet();
        System.out.println(sol.alphabet(input_string));
    }
}
