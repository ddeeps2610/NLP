/**
 * 
 */
package text;

/**
 * @author Deepak Awari
 *
 */
public class Tokenizer 
{
	/**
	 * @author Deepak Awari
	 * @param paragraph - Paragraph to be tokenized into sentences.
	 * @return String[] - Returns array of sentences
	 */
	public String[] tokenizeParagraph(String paragraph)
	{
		if((paragraph != null) && (!paragraph.isEmpty()))
			return paragraph.split(RegEx.SENTENCETOKENIZER);
		else return null;
	}
	
	/**
	 * @author Deepak Awari
	 * @param sentence - Sentence to be tokenized into words.
	 * @return String[] - Returns array of words
	 */
	public String[] tokenizeSentence(String sentence) 
	{
		if((sentence != null) && (!sentence.isEmpty()))
			return sentence.split(RegEx.WORDTOKENIZER);
		else return null;
	}

}
