public class RandomStudents {
    public static void main(String[] agrs){
        String[] name ={"Vi Minh Hien","Le Vu Hieu","Do Hoang Anh","Ha Xuan Huy","Tran Xuan Bao","Luu Quang Linh" };
        int n = name.length;
        int r = (int) (Math.random() * n);
        System.out.println(name[r]);
    }

}
