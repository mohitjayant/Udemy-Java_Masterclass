package Abstract_Class_Challange;

public class BinarySearchTree implements NodeList {
    private ListItem root=null;

    public BinarySearchTree(ListItem root) {
        this.root = root;
    }

    @Override
    public ListItem getRoot() {
        return this.root;
    }

    @Override
    public boolean addItem(ListItem item) {
        if (this.root==null) {
            this.root=item;
            return true;
        }

        ListItem currentItem=this.root;
        while (currentItem!=null) {
            int comparision=(currentItem.compareTo(item));
            if(comparision < 0) {
                //item is greater than currentItem,move it to right subtree
                if (currentItem.next()!=null) {
                    currentItem=currentItem.next();
                }
                else {
                    currentItem.setNext(item);
                    return true;
                }
            }
            else if (comparision > 0) {
                //item is less than currentItem, move it to left
                if (currentItem.previous()!=null) {
                    currentItem=currentItem.previous();
                }
                else {
                    currentItem.setPrevious(item);
                    return true;
                }
            }
            else {
                //item is equal to currentItem, don't add
                System.out.println(item.getValue()+" already present");
                return false;
            }
        }
        return false;
    }

    @Override
    public boolean removeItem(ListItem item) {
        return false;
    }

    @Override
    public void traverse(ListItem root) {
        if (root!=null) {
            traverse(root.previous());
            System.out.println(root.getValue());
            traverse(root.next());
        }
    }
}
