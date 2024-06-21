package ec.com.linkedinlearning.objectorientedprogramming.C1_V1;

/**
 *
 * @author Steve
 */
public class Tree {

    double heightFt;
    double trunkDiameterInches;
    TreeType treeType;

    void grow() {
        this.heightFt += 10;
        this.trunkDiameterInches += 1;
    }
}
