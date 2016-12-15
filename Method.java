// Home page mathod

public class HomePage extends Fragment implements ActionListener {..}

// product

public class Product extends JPanel implements ActionListener 
	{
		public Product create(String p_id,String pname,int p_price,String UM,String producer)
		public Product findByPrimaryKey(String p_id) ;
		public String getProductID();
		public String getP_Name(); 
		public int getP_Price();
	}

// User Account 

 public User(String id, String first, String last, double size, double height )
     {
		UniqueID =id;
        firstName = first;
        lastName = last;
		CustomerSize = size;
		CustomerHeight = height;
     } 
	 
public Username( String name, String pass)
     {
        username = name;
        password = pass;
	 }
//Create a new item 
 
public Item (String itemName, double itemPrice, int totalQuantity)
    {
      name = itemName;
      price = itemPrice;
      quantity = totalQuantity;
    }
	
// order
public order(String id, String itemName, String date, double itemPrice, int totalQuantity){} 

//  Adds an item to the shopping cart.
public void addToCart(String itemName, double price, int quantity){...}

// display the history of user
public void history(String Username){...}
	
