package nested.ex1;

public class Network {

    public void sendMessage(String txt){
        NetworkMessage networkMessage = new NetworkMessage(txt);
        networkMessage.print();
    }
}
