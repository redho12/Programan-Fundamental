class OperatorPrecedence {
    public static void main(String[] args) {
        int x = 6;
        int y = 12;
        boolean hasil = x + x++ < y && y - x > 2;
        int a = x++;
        int nilai = x + a;
        System.out.println(hasil);
        
    }
}