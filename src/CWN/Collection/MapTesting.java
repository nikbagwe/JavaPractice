package CWN.Collection;

import javax.swing.*;
import java.util.HashMap;

public class MapTesting {

    public static void main(String[] args) {

        //collection -> <key,value> pair
        //ChildClass =>  HashMap (Class) -> Map (Interface) Parent
        //hashmap is not order based collection like ArrayList
        //one null key is allowed, it wnt give u error bt when u get the hashmap it will print the latest null value added
        //multiple null values are allowed
        //hashmap is not order based collection like ArrayList but
        //<null,value> -> it will be stored at first location
        //no duplicate keys can be added, if key is repeated then it will override the earlier value


        HashMap<String,Integer> map = new HashMap<String,Integer>();

        //to add values in hashmap
        map.put("chrome",10); //we have to hashmap in pair of String int as we added while crrateing object
        map.put("firefox",20);
        map.put("safari",30);

        //another example

        HashMap<String,Object> empData = new HashMap<String,Object>();

        empData.put("Name","Nikhil");
        empData.put("Age", 34);
        empData.put("City","Mumbai");
        empData.put(null, 'f');
        empData.put(null, "India");
        empData.put("Phone",null);
        empData.put("Salary",null);
        empData.put("Address", "");
        empData.put("", "44");
        empData.put("Age",56);


        //to get the values
        System.out.println(empData.get("name")); // it will give as a mentioned name instead of Name
        System.out.println(empData.get("Name"));
        System.out.println(empData.get("Age"));
        System.out.println(empData.get(null)); // u can get value for null key as mentioned above
        //if we add multiple nulls in the put method then you will get latest null value added,
        //that is India in our case

        //we can have multiple null values and it will give correct data
        System.out.println(empData.get("Phone"));
        System.out.println(empData.get("Salary"));

        //Blank value
        System.out.println(empData.get("Address")); // it will give blank value

        //blank key
        System.out.println(empData.get("")); // it will give value against blank key updated

        //duplicate value added against age key , it will print latest value added in age that is 56

        //printing hashmap -> it will give data in key value pair
        System.out.println(empData); //it does not maintain the order but 1st key preference is given to null key

       //Example 3 -> working of Hashmap (internal mechanism)  ***** VeryIMP

       HashMap<String, Integer> empAge = new HashMap<String, Integer>();

        empAge.put("Aparna",34);
        empAge.put("Amit",31);
        empAge.put("AAi",65);
        empAge.put("Pappa",70);
        empAge.put(null,19);
        empAge.put(null,89);
        empAge.put("Aparna",34);

        System.out.println(empAge);
        System.out.println(empAge.size());
        empAge.remove(null);
        System.out.println(empAge);
        System.out.println(empAge.size());

        //default Virtual capacity for hashmap is 15 (0-14 indexes)
        //every index is called Node
        //Node is divided into 3 parts

        //before storing the data Java will calculate hashcode for each key for example "Aparna" here
        //hashcode(key) -> hashcode(Aparna) -> 9873483(random hashcode is generated based on some predefined formula)
        //Note: hashcode can be duplicate for the differnt keys (aparna and amit may have same hashcode)

        //then based on hashcode java will calculate int index of that hashcode by doing some mod opeeation
        // int index -> mode(9873483) -> it will give one index, lets say it gives index as 4
        // int index is 4 for 'Aparna' key

        //Now java will store that key value pair at 4 index in hashmap virtual caparcity at 4 index
        //1. hashcode   (9873483)
        //1. key         Aparna
        //2. value      34

        //in this way key values will be stored in Hashmap
        //Suppose if Aparna and Amot gets the same hashcode , then index value will also be same for both
        //it wont override the aparna key
        //Amit will go to same index i.e. 4 , it is called collision in hashmap
        //it will create new segment node at 4th location , this additional node is called linked list node***

        //these both segments will be connected i.e. aparna and amit node will be connected
        //collision may happen mutliple times, it will again link to index 4 and linked list node will be added

        //there is threshold value till which linked list can be extended for collision happening
        // Upto JDK 1.7 it was allowing unlimited linked list extension
        //it was slowing down the get method for retrieving the data
        //get method also hashcode is calculated, and it will check for key value again and
        // java will look for key unless it is found in the linked list nodes
        //So to overcome this after JDK 1.7 thershhold value of 8 was introduced for linked list node creation
        //8 th node onwards , java will convert this LL to Binary tree
        //it will keep creeating binary tree from 1st value in index 4 i.e fpr aparna

        //Linked list is Linear search - time complexity is more o(n)
        //BT is Binary search  - time complexity is less o(log n)
        //-------------------------------------------

        //if user adds null key while entering hashmap data then it will always adds the data on 0th position
        //reseved for null so when we add multiple null keys it will override existing null key value





    }
}