package Practica4;

import java.util.Arrays;

public class Catalogs {
    private String catalogName;
    private String[] productsArr;
    private Catalogs[] searchIn;
    private String searchFor;
    public Catalogs(String catalogName, String[] productsArr){
        this.catalogName=catalogName;
        this.productsArr = productsArr;
    }
    public String getCatalogName() {
        return catalogName;
    }
    public String[] getProductsArr() {
        return productsArr;
    }
}
