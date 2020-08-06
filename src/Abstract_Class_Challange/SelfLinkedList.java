package Abstract_Class_Challange;

public class SelfLinkedList implements NodeList {
    private ListItem root=null;

    public SelfLinkedList(ListItem root) {
        this.root = root;
    }

    @Override
    public ListItem getRoot() {
        return this.root;
    }

    @Override
    public boolean addItem(ListItem newItem) {
        if(this.root==null) {
            //LinkedList is empty
            this.root=newItem;
            return true;
        }

        ListItem currentItem=this.root;
        while (currentItem!=null) {
            int comparision=currentItem.compareTo(newItem);
            if (comparision<0) {
                //currentItem is smaller than newItem,than move right
                if(currentItem.next()!=null) {
                    currentItem=currentItem.next();
                }
                else {
                    currentItem.setNext(newItem);
                    newItem.setPrevious(currentItem);
                    return true;
                }
            }
            else if (comparision>0) {
                if (currentItem.previous()!=null) {
                    currentItem.previous().setNext(newItem);
                    newItem.setPrevious(currentItem.previous());
                    newItem.setNext(currentItem);
                    currentItem.setNext(newItem);
                }
                else {
                    //previous to currentItem is root
                    newItem.setNext(this.root);
                    this.root.setPrevious(newItem);
                    this.root=newItem;
                }
                return true;
            }
            else {
                System.out.println(newItem.getValue()+ " already present, can't added");
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
        if (root==null) {
            System.out.println("the List is empty");
        }
        else {
            while (root!=null) {
                System.out.println(root.getValue());
                root=root.next();
            }
        }
    }
}