public class AccessLevel {
    public static String Access(int[] rights, int minPermission){
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
