package oop.Week4;

class HandPhone {
        boolean hidup;
        public void hidupkan(){
            hidup = true;
            System.out.println("HP dihidupkan");  
        }
        
        String noHP;
        public void lakukanPanggilan(String noHP){
            this.noHP = noHP;
            System.out.println("Memanggil nomor : "+ noHP);
        }
        
        String SMS;
        public void kirimSMS(String SMS){
            this.SMS = SMS;
            System.out.println("Pesan : "+ SMS);
        }
        
        
        boolean mati;
        public void matikan(){
            mati = true;
            System.out.println("HP dimatikan");  
        }
}
