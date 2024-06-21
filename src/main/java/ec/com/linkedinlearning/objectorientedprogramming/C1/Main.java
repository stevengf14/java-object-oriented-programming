package ec.com.linkedinlearning.objectorientedprogramming.C1;

/**
 *
 * @author Steve
 */
public class Main {

    public static void main(String[] args) {
        Tree myFavoriteOakTree = new Tree(120, 12, TreeType.OAK);
        Tree myFavoriteMapleTree = new Tree(90, 30, TreeType.MAPLE);

        /*if (myFavoriteOakTree.heightFt > 100) {
            System.out.println("That's a tall " + myFavoriteOakTree.treeType + " tree!");
        }

        if (myFavoriteMapleTree.heightFt > 100) {
            System.out.println("That's a tall " + myFavoriteMapleTree.treeType + " tree!");
        }*/
        myFavoriteOakTree.announceTallTree();
        myFavoriteMapleTree.announceTallTree();

        System.out.println(Tree.TRUNK_COLOR);
        Tree.announceTree();

        /*-------------------------CHALLENGE-------------------------*/
        System.out.println("/*-------------------------CHALLENGE-------------------------*/");
        Employee employee1 = new Employee("Steven", 30, 5800.27, "USA");
        Employee employee2 = new Employee("Andres", 21, 3500.60, "Europe");

        employee1.raiseSalary(2000.33);

        System.out.println("salary 1: " + employee1.salary + "\nsalary 2: " + employee2.salary);
    }
}
