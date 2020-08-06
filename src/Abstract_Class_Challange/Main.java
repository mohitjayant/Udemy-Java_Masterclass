package Abstract_Class_Challange;

public class Main {

    public static void main(String[] args) {
        /*SelfLinkedList selfList=new SelfLinkedList(null);
        selfList.traverse(selfList.getRoot());
        String stringData="0 5 8 7 9 2 4 3 1 6";
        String[] data=stringData.split(" ");
        for (String s:data) {
            selfList.addItem(new Node(s));
        }
        selfList.traverse(selfList.getRoot());
        selfList.removeItem(new Node("4"));
        selfList.removeItem(new Node("2"));
        selfList.removeItem(new Node("8"));
        selfList.removeItem(new Node("7"));
        selfList.removeItem(new Node("5"));
        selfList.removeItem(new Node("3"));
        selfList.removeItem(new Node("6"));
        selfList.traverse(selfList.getRoot());
        selfList.removeItem(new Node("9"));
        selfList.removeItem(new Node("0"));
        selfList.removeItem(selfList.getRoot());
        selfList.traverse(selfList.getRoot());*/

        BinarySearchTree tree=new BinarySearchTree(null);
        tree.traverse(tree.getRoot());
        String stringData="0 5 8 7 9 2 4 3 1 6";
        String[] data=stringData.split(" ");
        for (String s:data) {
            tree.addItem(new Node(s));
        }
        tree.traverse(tree.getRoot());
        tree.removeItem(new Node("5"));
    }


}
