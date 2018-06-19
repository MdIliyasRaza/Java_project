class CountString{
    public static int countStringOccurrences(String text, String pattern) {
        int count = 0;
        int i = 0;
        // Keep calling indexOf for the pattern.
        while ((i = text.indexOf(pattern, i)) != -1) {
            i += pattern.length();           
            count++;
        }
        return count;
    }
    public static void main(String[] args) {
       String value = "cat dog dog bird";
        int count = countStringOccurrences(value, "dog");
        System.out.println("dog occurs: " + count);
        System.out.println("dirt occurs: "
                + countStringOccurrences(value, "dirt"));
        System.out.println("bird occurs: "
                + countStringOccurrences(value, "bird"));
        System.out.println("[ d] occurs: "
                + countStringOccurrences(value, " d"));
    }
}