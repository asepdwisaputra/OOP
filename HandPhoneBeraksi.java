package oop.Week4;

public class HandPhoneBeraksi {
    public static void main(String[] args) {
        HandPhone Samsung= new HandPhone();
        
        Samsung.hidupkan();
        Samsung.lakukanPanggilan("021-8978891");
        Samsung.kirimSMS("Bisa angkat telepon saya?");
        
        Samsung.matikan();
    }
}
