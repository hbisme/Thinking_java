package page6;

class ConnectionManager{
    static Connection [] connections = {Connection.get()};
    static Connection get(){
        if(connections.length == 0){
            return null;
        }else {
            return connections[0];
        }
    }
}
class Connection{
    private Connection(){
    }
    static Connection get(){
        return new Connection();
    }
}

public class Test8 {
    public static void main(String[] args) {
        System.out.println(ConnectionManager.get());
    }
}
