package ec.com.linkedinlearning.objectorientedprogramming.C5;

/**
 *
 * @author Steve
 */
public class DigitsOnlyFileReader extends AbstractFileReader {

    public DigitsOnlyFileReader(String filePath) {
        super(filePath);
    }

    @Override
    protected String parseLine(String line) {
        return line.replaceAll("[^0-9]", "");
    }

}
