package SortedCollections;

public class Main {

    private static StockList stockList=new StockList();

    public static void main(String[] args) {
        StockItem temp=new StockItem("Bread",0.86,100);
        stockList.addStock(temp);

        temp=new StockItem("Cake",4.5,5);
        stockList.addStock(temp);

        temp=new StockItem("Car",750.80,2);
        stockList.addStock(temp);

        temp=new StockItem("Chair",62.50,20);
        stockList.addStock(temp);
        temp=new StockItem("Chair",50.50,10);
        stockList.addStock(temp);

        temp=new StockItem("Cup",0.75,200);
        stockList.addStock(temp);

        temp=new StockItem("Door",90.25,7);
        stockList.addStock(temp);

        temp=new StockItem("Juice",3.0,15);
        stockList.addStock(temp);

        temp=new StockItem("Phone",120.12,6);
        stockList.addStock(temp);

        temp=new StockItem("Towel",1.75,80);
        stockList.addStock(temp);

        System.out.println(stockList);

        for (String s:stockList.items().keySet()){
            System.out.println(s);
        }

        Basket mohitBasket=new Basket("mohit");
        sellItem(mohitBasket,"Car",1);
        System.out.println(mohitBasket);

        sellItem(mohitBasket,"Car",1);
        System.out.println(mohitBasket);

        sellItem(mohitBasket,"Car",1);
        sellItem(mohitBasket,"Aeroplane",10);
        System.out.println(mohitBasket);

        sellItem(mohitBasket,"Juice",7);
        sellItem(mohitBasket,"Cup",3);
        sellItem(mohitBasket,"Bread",2);
        System.out.println(mohitBasket);

        System.out.println(stockList);
    }

    public static int sellItem(Basket basket,String item,int quantity){
        StockItem stockItem=stockList.get(item);
        if (stockItem==null){
            System.out.println("We don't sell " + item);
            return 0;
        }
        if (stockList.sellStock(item,quantity)!=0){
            basket.addToBasket(stockItem,quantity);
            return quantity;
        }
        return 0;
    }
}
