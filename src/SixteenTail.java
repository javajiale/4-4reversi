import java.util.Scanner;

/**
 * Created by sjj on 2015/11/17.
 */
public class SixteenTail {

    public static void main(String[] args) {

        System.out.print("Enter an initial sixteen coin H's and T's:");
        Scanner input = new Scanner(System.in);
        String s = input.nextLine();
        char[] initialNode = s.toCharArray();

        SixteenTailModel model = new SixteenTailModel();
        int x = SixteenTailModel.getIndex(initialNode);
        java.util.List<Integer> path = model.getShortestPath(x);

        System.out.println("The steps to filp the coins are ");
        for(int i = 0; i < path.size(); i++)
            SixteenTailModel.printNode(SixteenTailModel.getNode(path.get(i).intValue()));
    }
}
