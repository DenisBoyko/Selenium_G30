package arrays;

public class Exceptions {
    public static void main(String[] args) throws Exception {
        int [] mayArray = new int[10];

        try {
            for (int i = 0; i < mayArray.length; i++){
                System.out.println(mayArray[20]);
            }

        } catch (Exception e){
            System.out.println("Exception in method: " + e.getMessage());
            throw new Exception();

        } finally {
            System.out.println("Finalll");
        }

    }
}
