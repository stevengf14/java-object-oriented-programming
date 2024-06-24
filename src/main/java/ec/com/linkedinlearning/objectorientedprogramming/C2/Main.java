package ec.com.linkedinlearning.objectorientedprogramming.C2;

/**
 *
 * @author Steve
 */
public class Main {

    public static void main(String[] args) {
        /*Tree myFavoriteMapleTree = new Tree(90, 30, TreeType.MAPLE);

        System.out.println(myFavoriteMapleTree.getTreeType());
        System.out.println(myFavoriteMapleTree.getHeightFt());
        System.out.println(myFavoriteMapleTree.getTrunkDiameterInches());

        // myFavoriteMapleTree.heightFt = 180;
        myFavoriteMapleTree.grow();
        
        String name = "Kathryn";
        name.length();*/

        // Challenge!
        BankAccount ba = new BankAccount("Steven", 200);
        ba.withdraw(100);

        System.out.println("Balance: " + ba.getBalance());

    }
}
