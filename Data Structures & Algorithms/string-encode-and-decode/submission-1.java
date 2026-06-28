class Solution {

    public String encode(List<String> strs) {
        StringBuilder encodedString = new StringBuilder();

        for (String s : strs) {
            encodedString.append(s.length()).append('#').append(s);
        }

        return encodedString.toString();
    }

    public List<String> decode(String str) {
        List<String> decoded = new ArrayList<>();
        int i = 0;

        while (i < str.length()) {
            int length = 0;

            while (str.charAt(i) != '#') {
                length = length * 10 + (str.charAt(i) - '0');
                i++;
            }

            i++;
            String currentString = str.substring(i, i + length);
            decoded.add(currentString);

            i = i + length;
        }

        return decoded;

    }
}
