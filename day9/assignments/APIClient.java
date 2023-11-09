package week3.day9.assignments;

public class APIClient {
    public static void main(String[] args) {
        APIClient obj=new APIClient();
        obj.sendRequest("endpoint1");
        obj.sendRequest("endpoint12", "xml file",true);
    }


    public void sendRequest(String endpoint){
        System.out.println("End point is "+endpoint);
    }
    public void sendRequest(String endpoint, String reqBody, boolean status){
        System.out.println("Request body "+reqBody+" is sent to end point is "+endpoint+" and the status is "+status);
    }
}
