class Hello{
    public static void main(String[] args) {
        System.out.println("Long time no see, Java!");
        
        // for (String elem : args){
        //     System.out.println(elem);
        // }
        /* This is the code for printing command line arguments which are being sent to the main function's
        arguments i.e. String[] args */

        // Basic Variables for revising data-types
        String name = "Henry"; //String data-type
        System.out.println("Hello "+name+"!");

        int number = 8; //int data-type
        final int invincibleNumber = 10;
        // invincible = number;    //Once declared final, the value of that variable cannot be changed
        System.out.println(number);
        System.out.println(invincibleNumber);
        
        byte lol = 125;
        System.out.println("Byte Data: " + lol);
        short shorty = 32533;
        System.out.println("Short Data: " + shorty);
        char character = 'a';
        char asciiCharacter = 65;
        System.out.println("Character Data: " + character);
        System.out.println("ASCII value " + 65 + " converted into Character: " + asciiCharacter);

        int[] intArray = new int[5];
        //By-default, data stored in arrays is 0s. eg: intArray[1] = 0
        System.out.println("By default, the data stored in intArray[1] is: " + intArray[1]);    
    }
}