public class WordGames
{
    private String word;
    
    public WordGames(String text)
    {
        word = text;
    }
    
    public String scramble()
    {
        // switch first half
        // and second half
        int half = word.length() / 2;
        String half1 = word.substring(0, half);
        String half2 = word.substring(half, word.length());
        String fin1 = half2 + half1;
        return fin1;
    }
    
    
    public String bananaSplit(int insertIdx, String insertText)
    {
        // Insert insertText at the position
        // insertIdx
        String x = word.substring(0, insertIdx);
        String y = word.substring(insertIdx, word.length());
        String z = x + insertText + y;
        return z;
    }
    
    
    public String bananaSplit(String insertChar, String insertText)
    {
        // Insert insertText after the first
        // occurence of the insertChar
        int location = 0;
        for (int i=0; i < word.length(); i++){
            if (word.charAt(i) == insertChar.charAt(0)){
                location = i;
                break;
            }
        }
        String i = word.substring(0, location);
        String j = word.substring(location, word.length());
        String k = i + insertText + j;
        return k;
    }
    
    
    public String toString()
    {
        // Games[word]
        return "[" + word + "]";
    }
    
    
}
