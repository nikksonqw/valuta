package com.example.valuta;

public class DataFlags {

    private int flagID;
    private int nameID;
    private int abbreviationID;

    private int cityID;

    public DataFlags (int _flagID, int _nameID, int _abbreviationID, int _cityID){
        flagID = _flagID;
        nameID = _nameID;
        abbreviationID = _abbreviationID;
        cityID = _cityID;
    }

    public int getFlagID(){
        return flagID;
    }

    public int getNameID(){
        return nameID;
    }

    public int getAbbreviationID() {
        return abbreviationID;
    }

    public int getCityID(){
        return cityID;
    }
}