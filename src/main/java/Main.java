public class Main {

    public static void main(String[] args) {
        System.out.println("Hello There!");

        String [] words = {"hello", "world"};

        StringBuilder sb = new StringBuilder();
        sb.append("<ul>\n");
        for (String word : words) {
            sb.append(String.format("  <li>%s</li>\n", word));
        }
        sb.append("</ul>");
        System.out.println(sb);
    }
}
