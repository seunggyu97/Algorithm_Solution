package Java.Programmers.Lv2;

import java.util.*;

class OpenTalk{
    public String[] openTalk(String[] record){
        Map<String,String> hm = new HashMap<>();
        List<String> arrayList = new ArrayList<>();
        for(String str : record){
            StringTokenizer st = new StringTokenizer(str);
            String cmd = st.nextToken();

            if(cmd.equals("Enter") || cmd.equals("Change")){
                hm.put(st.nextToken(),st.nextToken());
            }
        }

        for(String str : record){
            StringTokenizer st = new StringTokenizer(str);
            String cmd = st.nextToken();
            if(cmd.equals("Enter")){
                arrayList.add(String.format("%s님이 들어왔습니다.",hm.get(st.nextToken())));
            }
            else if(cmd.equals("Leave")){
                arrayList.add(String.format("%s님이 나갔습니다.",hm.get(st.nextToken())));
            }
        }

        String[] answer = new String[arrayList.size()];

        return arrayList.toArray(answer);
    }

    public static void main(String[] args){
        String[] record = {"Enter uid1234 Muzi", "Enter uid4567 Prodo","Leave uid1234","Enter uid1234 Prodo","Change uid4567 Ryan"};
        OpenTalk sol = new OpenTalk();

        System.out.println(Arrays.toString(sol.openTalk(record)));
    }
}
