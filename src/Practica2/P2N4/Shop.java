package Practica2.P2N4;
import java.util.ArrayList;
import java.util.List;

public class Shop {
    private List<String> computersList= new ArrayList<String>();
    public void addComputer(String computer){
        String[] words = computer.split(" ");
        for (int i=0; i< words.length; i++)
        {
            computersList.add(words[i]);
        }
    }
    public void deleteComputer(String name){
        for (int i = 0; i < computersList.size(); i++){
            if(computersList.get(i).equals(name)){
                computersList.remove(i);
                System.out.println("Computer deleted.");
                break;
            }
            if (!computersList.contains(name)) {
                System.out.println("Computer not found");
                break;
            }
        }
    }
    public void searchComputer(String name){
        if(computersList.contains(name))
            System.out.println("This computer is in the shop");
        else
            System.out.println("This computer is not in the shop");
    }
    public void printList(){
        for(int i = 0; i < computersList.size(); i++){
            System.out.format("%s) %s\n", i+1, computersList.get(i));
        }
    }
}