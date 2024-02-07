import java.util.Scanner;
import java.util.Vector;
public class AccessLevel {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Vector<Integer> nums = new Vector<Integer>();
        System.out.println("Enter a list of numbers separated by comas for the rights:");
        String test = scan.nextLine();
        System.out.println("Enter the minimum requirements");
        int min = scan.nextInt();
        scan.close();
        scan = new Scanner(test);
        scan.useDelimiter(",");
        while (scan.hasNext()){
            nums.add(scan.nextInt());
        }
        scan.close();

        System.out.println(Access(nums.toArray(new Integer[]{}), min));
        

    }
    public static String Access(Integer[] rights, int minPermission){
        String permission = "";
        for(int i = 0; i < rights.length; i++){
            if(rights[i] < minPermission)
                permission += "D";
            else 
                permission += "A";
        }
        return permission;
    }
}
