package Java.Programmers.Lv2;

class Square{
    public long square(long w, long h){
        return w * h - (w + h - gcd(w, h));
    }

    public long gcd(long a, long b){
        return b % a == 0 ? a : gcd((b%a), a);
    }
    public static void main(String[] args){
        int w = 8;
        int h = 12;

        Square sol = new Square();
        System.out.println(sol.square(w, h));
    }
}