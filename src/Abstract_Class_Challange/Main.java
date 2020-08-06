package Abstract_Class_Challange;

public class Main {

    public static void main(String[] args) {
        SelfLinkedList selfList=new SelfLinkedList(null);
        selfList.traverse(selfList.getRoot());
        String stringData="Delhi Mumbai Pune Noida Bangalore Hyderabad Chennai Gurugram Jaipur Delhi";
        String[] data=stringData.split(" ");
        for (String s:data) {
            selfList.addItem(new Node(s));
        }
        selfList.traverse(selfList.getRoot());
    }

}
