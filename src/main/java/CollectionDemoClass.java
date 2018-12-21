import bean.User;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CollectionDemoClass {

//private int mapkey;

    public Map<Integer,User> returnList() {
        //List<User> lu = new ArrayList<User>();
        Map<Integer,User> useDtls= new HashMap<Integer,User>();

       for (int i=0; i <=10; i++)
       {
           User usr = new User("ankiredd"+ i, "23423", "aadsfe", "23423", "23423");
           useDtls.put(i,usr);
       }
        System.out.println("list of users"+useDtls);
        return useDtls;
    }

    public void printUsers(Map<Integer,User> userList){
        for (int i=0; i < userList.size() ; i++){
            System.out.println(userList.get(i).getSalary());
            System.out.println(userList.get(i).getEmailId());
            System.out.println(userList.get(i).getAddress());
            System.out.println(userList.get(i).getPhoneNo());
            System.out.println(userList.get(i).getSalary());
            System.out.println("This is hte end of the "+ i +"user details");
        }
        System.out.println("userList "+userList);

    }

    public boolean checkIFUserExists(Map<Integer,User> userList, int Id){

        if(userList.containsKey(Id)){
                return true;
            }
        return false;

    }

    public static void main(String args[]) {

        CollectionDemoClass cdc = new CollectionDemoClass();
        //User user = new User("ankiredd", "23423", "aadsfe", "23423", "23423");
        Map<Integer,User> lsr= cdc.returnList();
        //cdc.printUsers(lsr);
        System.out.println(cdc.checkIFUserExists(lsr,11));
    }
}
