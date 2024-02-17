package practice;

public class Transfer {
    public String transferType;
    public int transferAmount;
    public String transferDate;
    public String transferMsg;

    public Transfer() {
        this.transferType = transferType;
        this.transferAmount = transferAmount;
        this.transferDate = transferDate;
        this.transferMsg = transferMsg;
    }

    public int getTransferAmount(String transferType, int transferAmount){
        return transferAmount - 25;

    }
    public int getTransferAmount(String transferType, int transferAmount, String date){
        if (date == "01/01/2024"){
            return transferAmount -50;
        } else {
            return transferAmount -55;
        }
    }


    @Override
    public String toString() {
        return "Transfer{" +
                "transferType='" + transferType + '\'' +
                ", transferAmount=" + transferAmount +
                ", transferDate='" + transferDate + '\'' +
                ", transferMsg='" + transferMsg + '\'' +
                '}';
    }
}

