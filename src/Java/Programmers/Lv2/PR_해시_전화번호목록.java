package Java.Programmers.Lv2;

import java.util.Arrays;

class PhoneNumberList {
    public boolean phoneNumberList(String[] phone_book){
        Arrays.sort(phone_book);
        // String 배열이기 때문에 사전순으로 정렬됨
        // ex) {"1234", "123", "1000"} -> {"1000", "123", "1234"}

        for(int i = 0; i< phone_book.length-1; i++){
            if(phone_book[i+1].startsWith(phone_book[i])) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args){
        String[] phone_book = {"119", "97674223", "1195524421"};
        PhoneNumberList pnl = new PhoneNumberList();

        System.out.println(pnl.phoneNumberList(phone_book));
    }
}
