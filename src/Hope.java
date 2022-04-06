public class Hope {
    public static void main(String[] args) {
        String hope = "Hope!";
        System.out.println("hope = " + hope);
        System.out.println("hope.toUpperCase() = " + hope.toUpperCase());

        int n = 10;

        boolean value = true;
        int n2 = 5;
        var n3 = "25";
        if (value) {
            n = 25;
            System.out.println("n = " + n);
            n3 = "15";
        }
        System.out.println("n2 = " + n2);
        System.out.println("n3 = " + n3);

        String name;

        name = "Dee";
        if(n>10){
            name = "Sam";
        }
        System.out.println("n = " + n);
        System.out.println("Name = " + name);

        System.out.println();
    }
}
