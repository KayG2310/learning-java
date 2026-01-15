public class vid6 {
    public static void main(String[] args) {
        int[] arr = new int[3];
        // array declaration. 

        // string
        String name = "Sanat";
        System.out.println(name.length());
        System.out.println(name.charAt(0));
        System.out.println("Kamakshi".compareTo("Kamakshi"));
        // returns bigger length (if s1>s2 negative value)
        StringBuilder sb = new StringBuilder("Sanat"); 
        // benefit is that when you add new characters to it, it doesnt reallocate new pointer to it
        // with this string becomes mutable 
        sb.setCharAt(0, 'k');
        System.out.println(sb);
        sb.delete(2,3);
        sb.append('k');
        System.out.println(sb);

    }
}
