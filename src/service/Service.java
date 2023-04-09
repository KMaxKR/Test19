package service;

import FirstEx.First;
import SecondEx.Second;
import interfaces.Joiner;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Service<R> {
    ///////////////////////////////////////////////////////////////////
    First first = new First();
    public void getText(String firstText, String secondText){
        System.out.println(first.join(firstText, secondText));
    }

    //////////////////////////////////////////////////////////////////////
    Second<R> second = new Second();


    private ArrayList<String> listString = new ArrayList<>();
    public List<String> addToList(String element){
        try{
            listString.add(element);
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
        return listString;
    }




    private ArrayList<Integer> listInt = new ArrayList<>();
    public List<Integer> addToList(int element){
        try{
            listInt.add(element);
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
        return listInt;
    }




    public void foldInt(){
        System.out.println(second.foldInt(listInt));
    }


    public void foldString(){
        System.out.println(second.foldString(listString));
    }

}
