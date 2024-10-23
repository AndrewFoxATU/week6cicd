package ie.atu.week6;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service

public class ProductService {
    private List<Product> myList = new ArrayList<>();
    public List<Product> addProduct(Product product)
    {
        //imagine we have a connection to a database
        myList.add(product);
        return myList;
    }
    public List<Product> getProduct(Product product){
        return myList;
    }

    public List<Product> putProduct(Product product){
        for(int i = 0; i < myList.size(); i++){
            if(product.getId()==myList.get(i).getId()){
                product = myList.set(i, product);
            }
        }
        return myList;
    }

    public List<Product> deleteProduct(Product product){
        for(int i = 0; i < myList.size(); i++){
            if(product.getId()==myList.get(i).getId()){
                product = myList.remove(i);
            }
        }
        return myList;
    }

}


