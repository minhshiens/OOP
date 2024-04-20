public class introduce {
    static void in4(){
        String name, ID, Class, username, Email;
        name = "Vi Minh Hiển";
        ID = "23020363";
        Class = "AI1";
        username = "minhshiens";
        Email = "Viminhhien1109@gmail.com";
        System.out.println(name+'\t'+ID+'\t'+Class+'\t'+username+'\t'+Email+'\t');

    }
    public static void main(String[] agrs){
        in4();
        for(int i=9;i>1;--i){
            System.out.println(i + " bottles of beer on the wall, " + i + " bottles of beer.");
            System.out.println("Take one down, pass it around,");
        }
        System.out.println("1 bottle of beer in the wall, 1 bottle of beer.\n No more bottles of beer on the wall.");

    }
}
