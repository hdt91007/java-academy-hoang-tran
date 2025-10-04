package com.pluralsight;

public class CellPhone {
// properties
    int SerialNumber;
    private String model;
    private String Carrier;
    private String phonNumber;
    private String owner;
    private String newNumber;



    //Construct parameter

   public CellPhone(String _para_model,int _para_SerialNumber, String _para_Carrier,String _para_phonNumber, String _para_owner) {
       this.SerialNumber = _para_SerialNumber;
       this.model = _para_model;
       this.Carrier = _para_Carrier;
       this.phonNumber = _para_phonNumber;
       this.owner = _para_owner;
       String para_newNumber;
}
    public CellPhone(String _para_Carrier,String _para_phonNumber, String _para_owner) {
       this.Carrier = _para_Carrier;
        this.phonNumber = _para_phonNumber;
        this.owner = _para_owner;
        String para_newNumber;


    }

    public int getSerialNumber() {
        return SerialNumber;
    }

    public String getModel() {
        return model;
    }

    public String getCarrier() {
        return Carrier;
    }

    public String getPhonNumber() {
        return phonNumber;
    }

    public String getOwner() {
        return owner;
    }


    public void setSerialNumber(int para_SerialNumber) {
        SerialNumber = para_SerialNumber;
    }

    public void setModel(String para_model) {
        model = para_model;
    }

    public void setCarrier(String para_carrier) {
        Carrier = para_carrier;
    }

    public void setphonNumber(String para_phonNumber) {
        phonNumber = para_phonNumber;
    }

    public void setOwner(String para_owner) {
        this.owner = para_owner;
    }
    public  void dial (CellPhone phone){
        System.out.println(this.getOwner()+ " is calling "+ phone.getPhonNumber());

    }
    public void dial (String para_newNumber){
        System.out.println(this.getOwner()+ " is calling "+ para_newNumber);
    }
//    }
//
//    public Overload(int para_SerialNumber, String para_model, String para_Carrier,String para_phonNumber, String para_owner) {

    }

