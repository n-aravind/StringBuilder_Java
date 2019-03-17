public class Main {
    public static void main(String[] args) {

        StringBuilder stringBuilder = new StringBuilder("A String");

        StringBuilder newStringBuilder = new StringBuilder();
        System.out.println(newStringBuilder.capacity());
        System.out.println(newStringBuilder.length());
        newStringBuilder.setLength(10);
        System.out.println(newStringBuilder.capacity());
        System.out.println(newStringBuilder.length());
        newStringBuilder.append("String");
        System.out.println(newStringBuilder.capacity());
        System.out.println(newStringBuilder.length());

        StringBuilder sb = new StringBuilder();
        sb.append("This");
        sb.append(" is");
        sb.append(" a test String");

        System.out.println(sb);
        sb.setLength(14);
        System.out.println(sb);

        sb.reverse();
        System.out.println(sb);
        sb.replace(0,4,"Test");
        System.out.println(sb);

        sb.delete(5,8);
        System.out.println(sb);


    }
}
