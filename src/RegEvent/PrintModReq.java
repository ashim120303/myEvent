package RegEvent;

public class PrintModReq {
    public PrintModReq(){
        for (int i = 0; i < BufEv.endReq; i++ ) {
            System.out.println(BufEv.textReq[i]);
        }
    }
}
