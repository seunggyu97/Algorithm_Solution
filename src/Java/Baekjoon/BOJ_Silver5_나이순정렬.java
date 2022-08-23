package Java.Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

class SortAge {
    public static class Person{
        int age;
        String name;

        public Person(int age, String name){
            this.age = age;
            this.name = name;
        }

        @Override
        public String toString() {
            return age + " " + name + "\n";
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());

        Person[] p = new Person[N];

        for(int i = 0; i<N; i++){
            st = new StringTokenizer(br.readLine());
            p[i] = new Person(Integer.parseInt(st.nextToken()), st.nextToken());
        }

        Arrays.sort(p, new Comparator<Person>(){
            @Override
            public int compare(Person p1, Person p2){
                return p1.age - p2.age;
            }
        });

        StringBuilder sb = new StringBuilder();

        for(Person s : p){
            sb.append(s);
        }

        System.out.println(sb);
    }
}
