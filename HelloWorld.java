
/**
 * Say Hello
 *
 * @author William Wheatley-Uhl
 * @version 2018.02.13
 */
public class HelloWorld
{
    /**
     * Say hello to the world
     */
    public void sayHello()
    {
        System.out.println("Hello, World!");
    }
    
    /**
     * Say hello to someone by name
     * @param name
     */
    public void sayHello(String name)
    {
        System.out.println("Hello, " + name + "!");
    }
    
    /**
     * Ask for Name, and Favorite Fruit, and display a message
     * Adjust the message if plural fruits are given
     * @param name
     * @param fruit
     */
    public void favoriteFruit(String name, String fruit)
    {
        int length = fruit.length();
        if(fruit.lastIndexOf("s") > 0 && fruit.lastIndexOf("s") == length - 1) {
            System.out.println("Hey, " + name + "-kun! Did you know the best " + fruit + " are grown in Kantaro?");
        }
        else if(fruit.lastIndexOf("s") != length -1) {
            System.out.println("Hey, " + name + "-kun! Did you know the best " + fruit + "s are grown in Kantaro?");
        }
    }
}
