package ec.com.linkedinlearning.objectorientedprogramming.C1;

/**
 *
 * @author Steve
 */
public class Tree {

    double heightFt;
    double trunkDiameterInches;
    TreeType treeType;

    Tree(double heightFt, double trunkDiameterInches, TreeType treeType) {
        this.heightFt = heightFt;
        this.trunkDiameterInches = trunkDiameterInches;
        this.treeType = treeType;
    }

    void grow() {
        this.heightFt += 10;
        this.trunkDiameterInches += 1;
    }
}
